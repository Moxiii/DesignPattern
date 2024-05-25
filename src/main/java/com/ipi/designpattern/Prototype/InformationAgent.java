package com.ipi.designpattern.Prototype;

public class InformationAgent extends IntellingentAgent {
    @Override
    public String processRequest() {
        return "Sources: Database, API, Filesystem";
    }
}