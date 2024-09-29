package com.java.trangile.factory;


import java.io.IOException;
import java.security.GeneralSecurityException;

public interface AuthenticationService {

    String BLANK_CHAR = "";

    UserProfile authenticate(AuthRequest authRequest) throws IOException, GeneralSecurityException;

}
