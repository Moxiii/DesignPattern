package com.ipi.designpattern.Decorator;

public class Api extends AuthDecorator{
    public Api(Authenticator auth){
        super(auth);
    }
    @Override
    public boolean authenticate(){
        String apiKey = generateApiKeys();
        return apiKey != null && super.authenticate();
    }
    private String generateApiKeys() {
        return "e88c562a7355c727f55c0a2ac6353ad8672704c56b672d98a3050f0f0633dfac";
    }
}
