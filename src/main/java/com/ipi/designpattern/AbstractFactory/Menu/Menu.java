package com.ipi.designpattern.AbstractFactory.Menu;

import javax.swing.*;

public abstract class Menu {
    protected String text;
    public abstract JMenu toSwingMenu();
}
