package org.example.exceptions;

import org.example.exceptions.passes.MetroPass;
import org.example.exceptions.passes.PassType;
import org.example.exceptions.passes.RegularPass;
import org.example.exceptions.passes.SchoolPass;

import java.time.YearMonth;

public class PassTest {
    public static void main(String[] args){
        Turnstile turnstile = new Turnstile();
        var pass = KyivSmartCard.createPass(PassType.SCHOOL_PASS);
        SchoolPass schoolPass = (SchoolPass) pass;
        schoolPass.setMonth(YearMonth.of(2022,5));
        try {
            turnstile.validateEntryPermission(schoolPass);
        } catch (SchoolPassOverdueException| SchoolPassTripFinishedException|
                StudentPassOverdueException|RegularPassNotEnoughMoneyException e) {
            e.printStackTrace();
        }

    }
}
