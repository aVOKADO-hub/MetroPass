package org.example.exceptions;

import org.example.exceptions.passes.SchoolPass;
import org.example.exceptions.passes.StudentPass;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;

public class SchoolPassOverdueException extends Exception{
    private SchoolPass pass;

    public SchoolPassOverdueException(SchoolPass pass) {
        this.pass = pass;
    }
    public int calculateTermOfOverdue(){
        YearMonth time = YearMonth.now();
        return time.getMonthValue()-pass.getMonth().getMonthValue();
    }

    @Override
    public String toString() {
        return "StudentPassOverdueException: the pass have been overdue "+calculateTermOfOverdue()+" months ago";
    }
}
