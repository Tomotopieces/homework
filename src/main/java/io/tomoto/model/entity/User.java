package io.tomoto.model.entity;

import java.util.Objects;

/**
 * @author Tomoto
 * <p>
 * 2020/11/24 15:44
 */
public class User {
    private Integer userId;
    private String userAccount;
    private String userPassword;
    private String userIntroduction;

    public User() {
    }

    public User(Integer userId, String userAccount, String userPassword, String userIntroduction) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userIntroduction = userIntroduction;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userIntroduction='" + userIntroduction + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(userAccount, user.userAccount) &&
                Objects.equals(userPassword, user.userPassword) &&
                Objects.equals(userIntroduction, user.userIntroduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userAccount, userPassword, userIntroduction);
    }

    public Integer getUserId() {
        return userId;
    }

    public User setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public User setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public User setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public User setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
        return this;
    }
}
