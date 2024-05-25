package com.ipi.designpattern.Decorator;

public class Jwt extends AuthDecorator{

        public Jwt(Authenticator decoratedAuth) {
            super(decoratedAuth);
        }

        @Override
        public boolean authenticate() {
            String token = generateJWTToken();
            return token != null && token.contains("{") && super.authenticate();
        }

        private String generateJWTToken() {
            return "{token:NvxkNXVVeocLpDg}";
        }
}
