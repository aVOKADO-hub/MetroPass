package org.example.exceptions;

import org.example.exceptions.passes.SchoolPass;

public class SchoolPassTripFinishedException extends Exception{
    private SchoolPass pass;

    public SchoolPassTripFinishedException(SchoolPass pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "SchoolPassTripFinishedException: your count of trip is 0";
    }
}
