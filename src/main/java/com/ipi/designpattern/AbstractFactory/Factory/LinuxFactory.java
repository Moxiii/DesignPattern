package com.ipi.designpattern.AbstractFactory.Factory;

import com.ipi.designpattern.AbstractFactory.Button.Button;
import com.ipi.designpattern.AbstractFactory.Button.LinuxButton;
import com.ipi.designpattern.AbstractFactory.GraphicalComponentFactory;
import com.ipi.designpattern.AbstractFactory.Menu.Menu;
import com.ipi.designpattern.AbstractFactory.Menu.LinuxMenu;

public class LinuxFactory implements GraphicalComponentFactory {

    @Override
    public Button createButton() {
        return new LinuxButton("Linux Button");
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu("Linux Menu");
    }
}