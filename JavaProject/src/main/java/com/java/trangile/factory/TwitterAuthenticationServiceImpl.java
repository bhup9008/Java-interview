package com.java.trangile.factory;

public class TwitterAuthenticationServiceImpl implements AuthenticationService {



    @Override
    public UserProfile authenticate(AuthRequest authRequest) {

        return new UserProfile();
    }


}
