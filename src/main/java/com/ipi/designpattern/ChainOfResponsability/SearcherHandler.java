package com.ipi.designpattern.ChainOfResponsability;
import java.util.List;
public class SearcherHandler extends AuthorizationHandler{
    private List<String> accessiblePages = List.of("home", "profile", "personal", "research");

    @Override
    public boolean handleRequest(String role, String page) {
        if (role.equals("searcher") && accessiblePages.contains(page)) {
            return true;
        }
        if (next != null) {
            return next.handleRequest(role, page);
        }
        return false;
    }
}
