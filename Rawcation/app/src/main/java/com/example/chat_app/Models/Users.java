package com.example.chat_app.Models;

public class Users {

    String profilePic,userName,email,passcode,userId,lastMessage,status;

    public Users()
    {

    }

    public Users(String profilePic, String userName, String email, String passcode, String userId, String lastMessage, String status) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.email = email;
        this.passcode = passcode;
        this.userId = userId;
        this.lastMessage = lastMessage;
        this.status = status;
    }

    public Users(String userName, String email, String passcode) {
        this.userName = userName;
        this.email = email;
        this.passcode = passcode;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

