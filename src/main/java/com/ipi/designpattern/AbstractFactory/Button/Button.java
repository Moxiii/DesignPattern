package com.ipi.designpattern.AbstractFactory.Button;

import javax.swing.*;

public abstract class Button {
    protected String text;
    public abstract JButton toSwingButton();
}
