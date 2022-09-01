package org.example.exceptions;

import org.example.exceptions.passes.MetroPass;
import org.example.exceptions.passes.RegularPass;
import org.example.exceptions.passes.SchoolPass;
import org.example.exceptions.passes.StudentPass;

import java.time.LocalDate;
import java.time.YearMonth;

public class Turnstile {
    public void validateEntryPermission(MetroPass pass)throws SchoolPassOverdueException, SchoolPassTripFinishedException,
            StudentPassOverdueException,RegularPassNotEnoughMoneyException {
        if (pass instanceof SchoolPass){
            checkSchool(pass);
        }
        if (pass instanceof StudentPass){
            checkStudent(pass);
        }
        if (pass instanceof RegularPass){
            checkRegular(pass);
        }
    }
    void checkSchool(MetroPass pass)throws SchoolPassOverdueException,SchoolPassTripFinishedException{
        if(pass instanceof SchoolPass sp){
            if (sp.getMonth().isBefore(YearMonth.now())){
                KyivSmartCard.addProhibition();
                throw new SchoolPassOverdueException(sp);
            }
            if (sp.getCountOfTrip()==0){
                KyivSmartCard.addProhibition();
                throw new SchoolPassTripFinishedException(sp);
            }else{
                sp.setCountOfTrip(sp.getCountOfTrip()-1);
                KyivSmartCard.addPermition();
            }
        }
    }
    void checkStudent(MetroPass pass)throws StudentPassOverdueException{
        if (pass instanceof StudentPass st)
        if (st.getMonth().isBefore(YearMonth.now())){
            KyivSmartCard.addProhibition();
            throw new StudentPassOverdueException(st);
        }
        else {
            KyivSmartCard.addPermition();
        }
    }
    void checkRegular(MetroPass pass)throws RegularPassNotEnoughMoneyException{
        if (pass instanceof RegularPass rp){
            if (rp.getAmountOfMoney()<KyivSmartCard.FARE){
                KyivSmartCard.addProhibition();
                throw new RegularPassNotEnoughMoneyException(rp);
            }
            else {
                KyivSmartCard.addPermition();
                rp.setAmountOfMoney(rp.getAmountOfMoney()-KyivSmartCard.FARE);
            }
        }
    }
}
