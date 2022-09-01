package org.example.exceptions.passes;

public class MetroPass {
    private static int idHolder;
    private int uid;
    public MetroPass() {
        uid = ++idHolder;
    }
    public int getUid(){
        return uid;
    }
}
