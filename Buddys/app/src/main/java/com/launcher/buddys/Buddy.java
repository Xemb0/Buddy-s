package com.launcher.buddys;

public class Buddy {
    private int ProfileIcon;
    private int ProfileImage;
    private  String title;
    private  String location;


    public int getProfileIcon() {
        return ProfileIcon;
    }

    public void setProfileIcon(int profileIcon) {
        ProfileIcon = profileIcon;
    }

    public int getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(int profileImage) {
        ProfileImage = profileImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getlocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Buddy(int profileIcon, int profileImage, String title, String location) {
        ProfileIcon = profileIcon;
        ProfileImage = profileImage;
        this.title = title;
        this.location = location;
    }


}
