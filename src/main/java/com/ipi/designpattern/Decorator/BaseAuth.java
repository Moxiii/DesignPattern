package com.ipi.designpattern.Decorator;

public class BaseAuth implements Authenticator{
    private User user;
    public BaseAuth(User user){
        this.user = user ;
    }
    @Override
    public boolean authenticate() {
        String login = user.getLogin();
        String password = user.getPassword();
        return login != null && login.length() == 8 &&
                password != null && password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).+$");
    }
    }
}
