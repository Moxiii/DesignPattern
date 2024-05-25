package com.ipi.designpattern.Decorator;

public  abstract class  AuthDecorator implements Authenticator {
    protected Authenticator decoratedAuth;
    public AuthDecorator(Authenticator auth){
        this.decoratedAuth = auth;
    }
@Override
    public boolean authenticate(){
        return decoratedAuth.authenticate();
}
}
