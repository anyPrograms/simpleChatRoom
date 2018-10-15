package com.simpleChatRoom.Module;

/**
 * 用户实体，存储用户基本信息
 * id : 1
 * account : a12345
 * nickName : 小明
 * password : asdf1234
 */
public class UserBean {
	private int id;
    private String account;
    private String nickName;
    private String password;

    public int getId() {
    	return id;
    }
    public String getAccount() {
        return account;
    }
    public String getnickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
    	this.id = id;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public void setnickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
