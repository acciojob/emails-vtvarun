package com.driver;

import java.text.ParseException;
import java.util.*;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        // the space should not be considered in a password
        boolean oneUpperCase = false;
        boolean oneLowerCase = false;
        boolean oneDigit = false;
        boolean oneSpecialCharacter = false;

        for(int i=0; i < newPassword.length() ; i++){
            char curr = newPassword.charAt(i);
            if(curr >= '0' && curr <= '9'){
                oneDigit = true;
            } else if(curr >='a' && curr <='z'){
                oneLowerCase = true;
            } else if(curr >= 'A' && curr <='Z'){
                oneUpperCase = true;
            } else if(curr != ' '){
                oneSpecialCharacter = true;
            }
        }

        if(newPassword.length() >= 8 && oneUpperCase && oneLowerCase && oneDigit && oneSpecialCharacter && oldPassword.equals(password)){
            this.password = newPassword;
        }
    }
}
