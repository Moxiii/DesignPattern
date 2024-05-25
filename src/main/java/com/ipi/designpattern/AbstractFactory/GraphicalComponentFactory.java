package com.ipi.designpattern.AbstractFactory;

import com.ipi.designpattern.AbstractFactory.Button.Button;
import com.ipi.designpattern.AbstractFactory.Menu.Menu;

public interface GraphicalComponentFactory {
    Button createButton();
    Menu createMenu();
}
