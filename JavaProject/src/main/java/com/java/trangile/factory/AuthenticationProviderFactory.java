package com.java.trangile.factory;

public class AuthenticationProviderFactory {

    public static AuthenticationService get(AuthProvider authProvider) {
        AuthenticationService authenticationService = null;
        switch (authProvider) {
            case TWITTER:
                authenticationService = new TwitterAuthenticationServiceImpl();
                break;
            case FACEBOOK:
                authenticationService = new FacebookAuthenticationServiceImpl();
                break;
            case GOOGLE:
                authenticationService = new GoogleAuthenticationServiceImpl();
                break;
            case LINKEDIN:
                authenticationService = new LinkedInAuthenticationServiceImpl();
                break;
        }
        return authenticationService;
    }
}
