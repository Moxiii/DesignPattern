package com.ipi.designpattern.ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        AuthorizationHandler authChain = new AdminHandler();
        authChain.setNext(new SearcherHandler()).setNext(new BasicHandler());

        String role = "admin";
        String page = "research";
        boolean accessGranted = authChain.handleRequest(role, page);
        System.out.println("Access granted: " + accessGranted);
    }
}
