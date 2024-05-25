package com.ipi.designpattern.AbstractFactory;
import com.ipi.designpattern.AbstractFactory.Factory.*;
import javax.swing.*;
public class Library {
    private GraphicalComponentFactory factory;

    public Library(GraphicalComponentFactory factory) {
        this.factory = factory;
    }
    public void render() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Abstract Factory Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            frame.getContentPane().add(factory.createButton().toSwingButton());
            frame.setJMenuBar(new javax.swing.JMenuBar() {{
                add(factory.createMenu().toSwingMenu());
            }});

            frame.setVisible(true);
        });
    }

    public static void main(String[] args) {
        GraphicalComponentFactory factory;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else if (os.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new LinuxFactory();
        }

        Library library = new Library(factory);
        library.render();
    }
}
