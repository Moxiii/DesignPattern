package com.ipi.designpattern.Prototype;

import java.util.Random;

public class MobileAgent extends IntellingentAgent{
    @Override
    public String  processRequest(){
        String[] computers = {"Computer1", "Computer2", "Computer3", "Computer4", "Computer5",
                "Computer6", "Computer7", "Computer8", "Computer9", "Computer10"};
        int index = new Random().nextInt(computers.length);
        return computers[index];
    }
}
