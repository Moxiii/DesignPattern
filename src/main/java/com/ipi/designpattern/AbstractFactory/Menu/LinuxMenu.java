package com.ipi.designpattern.AbstractFactory.Menu;
import javax.swing.*;

public class LinuxMenu extends Menu{
    public LinuxMenu(String text){
        this.text=text;
    }
    @Override
    public JMenu toSwingMenu() {
        JMenu menu = new JMenu(text);
        return menu;
    }
}
