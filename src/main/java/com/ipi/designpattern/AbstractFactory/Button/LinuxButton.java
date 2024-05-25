package com.ipi.designpattern.AbstractFactory.Button;
import com.ipi.designpattern.AbstractFactory.Button.Button;

import javax.swing.*;

public class LinuxButton extends Button {

    public LinuxButton(String text) {
        this.text = text;
    }
    @Override
    public JButton toSwingButton(){
        JButton button = new JButton(text);
        return button;
    }
}
