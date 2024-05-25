package com.ipi.designpattern.Decorator;

public class DecoratorOAuth extends AuthDecorator{
    public DecoratorOAuth(Authenticator authenticator){
    super(authenticator);
    }
    @Override
    public boolean authenticate() {
        String token = generateOAuthToken();
        return token != null && super.authenticate();
    }
    private String generateOAuthToken() {
        return "kQhWFFmEOLePPZM";
    }
}
