package org.example.exceptions.passes;

import java.time.YearMonth;

public class RegularPass extends MetroPass{
    private int amountOfMoney;

    public RegularPass() {
        amountOfMoney = 8;
    }

    public RegularPass(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
