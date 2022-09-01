package org.example.exceptions;

import org.example.exceptions.passes.RegularPass;

public class RegularPassNotEnoughMoneyException extends Exception{
    private RegularPass pass;

    public RegularPassNotEnoughMoneyException(RegularPass pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "RegularPassNotEnoughMoneyException{" +
                "pass: you doesn`t have enough money";
    }
}
