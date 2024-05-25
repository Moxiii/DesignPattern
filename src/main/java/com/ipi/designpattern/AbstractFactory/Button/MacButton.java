package com.ipi.designpattern.AbstractFactory.Button;
import com.ipi.designpattern.AbstractFactory.Button.Button;

import javax.swing.*;

public class MacButton extends Button {

    public MacButton(String text) {
        this.text = text;
    }
    @Override
    public JButton toSwingButton(){
        JButton button = new JButton(text);
        return button;
    }
}
