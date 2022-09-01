package org.example.exceptions.passes;

import java.time.LocalDate;
import java.time.YearMonth;

public class StudentPass extends MetroPass{
    private YearMonth month;

    public StudentPass() {
        month = YearMonth.now();
    }
    public StudentPass(YearMonth month) {
        this.month = month;
    }
    public YearMonth getMonth() {
        return month;
    }
    public void setMonth(YearMonth month) {
        this.month = month;
    }

}
