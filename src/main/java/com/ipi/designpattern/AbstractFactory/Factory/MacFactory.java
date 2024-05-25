package com.ipi.designpattern.AbstractFactory.Factory;

import com.ipi.designpattern.AbstractFactory.Button.Button;
import com.ipi.designpattern.AbstractFactory.Button.MacButton;
import com.ipi.designpattern.AbstractFactory.GraphicalComponentFactory;
import com.ipi.designpattern.AbstractFactory.Menu.Menu;
import com.ipi.designpattern.AbstractFactory.Menu.MacMenu;

public class MacFactory implements GraphicalComponentFactory {

    @Override
    public Button createButton() {
        return new MacButton("Mac Button");
    }

    @Override
    public Menu createMenu() {
        return new MacMenu("Mac Menu");
    }
}