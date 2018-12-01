package com.simpleChatRoom.Module;

import java.io.Serializable;

/**
 * 用户实体，存储用户基本信息
 * id : 1
 * account : a12345
 * nickName : 小明
 * password : asdf1234
 */
<<<<<<< HEAD:src/com/simpleChatRoom/Module/userBean.java
public class userBean implements Serializable {
    private static final long serialVersionUID = -5369234593836802569L;
=======
public class UserBean {
	private int id;
>>>>>>> 365b1e60372a6852feae8b7fcb5df5b41b5ea5cf:src/com/simpleChatRoom/Module/UserBean.java
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

    public userBean(String account,String nickname,String password){
        super();
        this.account=account;
        this.nickname=nickname;
        this.password=password;
    }

    public userBean(){
        super();
    }
}
