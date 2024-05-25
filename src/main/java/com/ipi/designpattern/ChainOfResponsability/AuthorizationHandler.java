package com.ipi.designpattern.ChainOfResponsability;

public  abstract class AuthorizationHandler {
    protected AuthorizationHandler next;

    public AuthorizationHandler setNext(AuthorizationHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handleRequest(String role, String page);
}
