package org.example.exceptions;

import org.example.exceptions.passes.*;

import java.time.YearMonth;
import java.util.ArrayList;

public class KyivSmartCard {
    public static final int COUNT_OF_SCHOOL_TRIP_PER_MOONTH=52;
    public  static final int FARE = 8;
    private static ArrayList<MetroPass> internalCardStorage;
    private static int countOfPermissions;
    private static int countOfProhibitions;
    public static MetroPass createPass(PassType passType){
        return switch (passType){
            case SCHOOL_PASS -> new SchoolPass(COUNT_OF_SCHOOL_TRIP_PER_MOONTH);
            case STUDENT_PASS -> new StudentPass();
            default -> throw new IllegalStateException("Unexpected value: " + passType);
        };
    }
    public static MetroPass createPass( int amountOfMoney){
        return new RegularPass(amountOfMoney);
    }
    public static void addPermition(){
        countOfPermissions++;
    }
    public static void addProhibition(){
        countOfProhibitions++;
    }
    public static int getCountOfPermissions() {
        return countOfPermissions;
    }
    public static int getCountOfProhibitions() {
        return countOfProhibitions;
    }
    public static void addFounds(RegularPass pass,int amountOfMoney){
        pass.setAmountOfMoney(pass.getAmountOfMoney()+amountOfMoney);
    }
    public static void substractFair(RegularPass pass){
        pass.setAmountOfMoney(pass.getAmountOfMoney()-FARE);
    }
}
