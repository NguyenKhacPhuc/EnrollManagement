package oop.assignmentb2;

import java.util.ArrayList;

public class User {
    private int userId;
    private String userName;
    private String userPhoneNumber;
    private String userGmail;

//    private ArrayList<Order> orderArrayList = new ArrayList<Order>();

    public User(int userId, String userName, String userPhoneNumber, String userGmail) {
        this.userId = userId;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userGmail = userGmail;
    }

    public User(String userName, String userPhoneNumber, String userGmail) {
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userGmail = userGmail;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserGmail() {
        return userGmail;
    }

    public void setUserGmail(String userGmail) {
        this.userGmail = userGmail;
    }


}
