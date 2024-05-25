package com.ipi.designpattern.Prototype;

public abstract class IntellingentAgent implements Cloneable{
    @Override
    public IntellingentAgent clone() {
        try {
            return (IntellingentAgent) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract String processRequest();
}
