package com.java.trangile.factory;

public class FacebookAuthenticationServiceImpl implements AuthenticationService {


    //private final FacebookConnectionFactory facebookConnectionFactory;

    public FacebookAuthenticationServiceImpl() {
       // this.jwtTokenProvider = jwtTokenProvider;
        //this.facebookConnectionFactory = facebookConnectionFactory;
    }

    @Override
    public UserProfile authenticate(AuthRequest authRequest) {

        return new UserProfile();
    }

}
