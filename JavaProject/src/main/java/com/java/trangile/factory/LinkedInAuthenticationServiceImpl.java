package com.java.trangile.factory;

public class LinkedInAuthenticationServiceImpl implements AuthenticationService {


    @Override
    public UserProfile authenticate(AuthRequest authRequest)
    {
        return new UserProfile();
    }

}
