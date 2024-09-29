package com.java.trangile.factory;

public class UserProfile {
    private String providerId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String profilePictureUrl;
    private Boolean isPrivateEmail;

    public UserProfile(){}

    public UserProfile(String providerId, String firstName, String middleName, String lastName, String email) {
        this.providerId = providerId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public Boolean getPrivateEmail() {
        return isPrivateEmail;
    }

    public void setPrivateEmail(Boolean privateEmail) {
        isPrivateEmail = privateEmail;
    }
}
