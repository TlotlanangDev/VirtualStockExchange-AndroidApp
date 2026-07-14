package com.example.vsefrontendapplication.Model;

import com.google.gson.annotations.SerializedName;

public class login {

    @SerializedName("emailAddress")
    String emailAddress;

    @SerializedName("passWord")
    String passWord;


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
