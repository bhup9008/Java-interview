package com.java.trangile.factory;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class AuthenticationProviderFactoryMain {
    public static void main(String[] args) throws GeneralSecurityException, IOException {
        AuthenticationService as=AuthenticationProviderFactory.get(AuthProvider.TWITTER);
        UserProfile userProfile=as.authenticate(new AuthRequest());

    }
}
