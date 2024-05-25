package com.ipi.designpattern.ChainOfResponsability;
import java.util.List;
public class BasicHandler extends AuthorizationHandler{
    private List<String> accessiblePages = List.of("home", "profile", "personal");

    @Override
    public boolean handleRequest(String role, String page) {
        if (role.equals("basic") && accessiblePages.contains(page)) {
            return true;
        }
        if (next != null) {
            return next.handleRequest(role, page);
        }
        return false;
    }
}
