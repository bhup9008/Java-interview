package com.java.trangile.factory;

public class GoogleAuthenticationServiceImpl implements AuthenticationService {


    public GoogleAuthenticationServiceImpl() {
    }

    @Override
    public UserProfile authenticate(AuthRequest authRequest) {

        return new UserProfile();
    }
}
