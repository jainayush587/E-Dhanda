package com.example.e_dhanda.chefFoodPanel;

public class Chef {

    private String ConfirmPassword, Emailid, Fname, Lname, Mobile, Password;

    // Press Alt+Insert


    public Chef(String confirmPassword, String emailid, String fname, String lname, String mobile, String password) {
        ConfirmPassword = confirmPassword;
        Emailid = emailid;
        Fname = fname;
        Lname = lname;
        Mobile = mobile;
        Password = password;
    }
    public Chef() {
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public String getEmailid() {
        return Emailid;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getPassword() {
        return Password;
    }
}
