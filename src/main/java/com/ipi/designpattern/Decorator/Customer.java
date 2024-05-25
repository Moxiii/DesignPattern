package com.ipi.designpattern.Decorator;

public class Customer {
    public static void main(String[] args) {
        User user = new User("user1234", "Password1!");
        Authenticator baseAuth = new BaseAuth(user);
        Authenticator authWithOAuth = new DecoratorOAuth(baseAuth);
        Authenticator authWithJWT = new Jwt(authWithOAuth);
        Authenticator authWithAPIKeys = new Api(authWithJWT);

        if (authWithAPIKeys.authenticate()) {
            System.out.println("User authenticated successfully.");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
