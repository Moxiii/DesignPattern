package com.ipi.designpattern.Prototype;

import java.util.Random;

public class InterfaceAgent extends IntellingentAgent{
    @Override
    public String processRequest(){
        String[] components = {"Button", "TextField", "Checkbox", "RadioButton", "Dropdown",
                "Label", "Slider", "Panel", "List", "Table"};
        Random random = new Random();
        String response = components[random.nextInt(components.length)] + ", " +
                components[random.nextInt(components.length)] + ", " +
                components[random.nextInt(components.length)];
        return response;
    }
}
