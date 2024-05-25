package com.ipi.designpattern.AbstractFactory.Menu;
import com.ipi.designpattern.AbstractFactory.Menu.Menu;

import javax.swing.*;

public class MacMenu extends Menu {
    public MacMenu(String text){
        this.text=text;
    }
    @Override
    public JMenu toSwingMenu() {
        JMenu menu = new JMenu(text);
        return menu;
    }
}
