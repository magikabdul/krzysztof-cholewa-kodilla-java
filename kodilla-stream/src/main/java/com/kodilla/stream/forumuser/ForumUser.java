package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numbersOfPosts;

    public ForumUser(int userID, String userName, char sex, LocalDate dateOfBirth, int numbersOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numbersOfPosts = numbersOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numbersOfPosts=" + numbersOfPosts +
                '}';
    }
}
