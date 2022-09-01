package org.example.exceptions.passes;

import java.time.LocalDate;
import java.time.YearMonth;

public class SchoolPass extends MetroPass{
    private int countOfTrip;
    private YearMonth month;

    public SchoolPass(int countOfTrip) {
        this.countOfTrip = countOfTrip;
        month = YearMonth.now();
    }

    public SchoolPass(int countOfTrip, YearMonth month) {
        this.countOfTrip = countOfTrip;
        this.month = month;
    }
    public int getCountOfTrip() {
        return countOfTrip;
    }
    public void setCountOfTrip(int countOfTrip) {
        this.countOfTrip = countOfTrip;
    }
    public YearMonth getMonth() {
        return month;
    }
    public void setMonth(YearMonth month) {
        this.month = month;
    }

}
