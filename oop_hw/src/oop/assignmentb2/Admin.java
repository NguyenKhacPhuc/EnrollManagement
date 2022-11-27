package oop.assignmentb2;

import java.util.regex.Pattern;

public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String password){
        //at least 8 characters long
        Pattern pLength = Pattern.compile("^.{8,}$");
        //at least 2 uppercase
        Pattern pUP = Pattern.compile("^.*[A-Z]{2,}.*$");
        //at least 4 lowercase
        Pattern pLow = Pattern.compile("^.*[a-z]{4,}.*$");
        //at least 3 digits
        Pattern pDigit = Pattern.compile("^.*[0-9]{3,}.*$");
        //at least 1 special character @#$
        Pattern pSpecial = Pattern.compile("^.*[@#$]+.*$");

        if (pUP.matcher(password).find() && pLow.matcher(password).find() && pDigit.matcher(password).find() &&
                pSpecial.matcher(password).find() && pLength.matcher(password).find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkUsername(String username){
        //at least 6 characters long
        Pattern pLength = Pattern.compile("^.{6,}$");

        if(pLength.matcher(username).find()){
            return true;
        } else {
            return false;
        }
    }

}
