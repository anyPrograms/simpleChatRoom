package com.simpleChatRoom.Module;

/**
 * 用户实体，存储用户基本信息
 * account : a12345
 * nickname : 小明
 * password : asdf1234
 */
public class userBean {
    private String account;
    private String nickname;
    private String password;

    public String getAccount() {
        return account;
    }
    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
