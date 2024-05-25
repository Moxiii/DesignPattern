package com.ipi.designpattern.AbstractFactory.Menu;
import javax.swing.*;
public class WindowsMenu extends Menu{
    public WindowsMenu(String text){
        this.text=text;
    }
    @Override
    public JMenu toSwingMenu() {
        JMenu menu = new JMenu(text);
        return menu;
    }
}
