package com.ipi.designpattern.AbstractFactory.Factory;

import com.ipi.designpattern.AbstractFactory.Button.Button;
import com.ipi.designpattern.AbstractFactory.Button.WindowsButton;
import com.ipi.designpattern.AbstractFactory.GraphicalComponentFactory;
import com.ipi.designpattern.AbstractFactory.Menu.Menu;
import com.ipi.designpattern.AbstractFactory.Menu.WindowsMenu;

public class WindowsFactory implements GraphicalComponentFactory {

    @Override
    public Button createButton() {
        return new WindowsButton("Windows Button");
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu("Windows Menu");
    }
}