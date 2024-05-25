package com.ipi.designpattern.Prototype;

import java.util.Random;

public class CollaborativeAgent extends IntellingentAgent{
    @Override
    public String processRequest() {
        String[] contributors = {"Alice", "Bob", "Charlie", "Dave", "Eve",
                "Frank", "Grace", "Heidi", "Ivan", "Judy"};
        Random random = new Random();
        String response = contributors[random.nextInt(contributors.length)] + " and " +
                contributors[random.nextInt(contributors.length)];
        return response;
    }

}
