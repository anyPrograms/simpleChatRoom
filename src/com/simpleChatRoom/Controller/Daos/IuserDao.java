package com.simpleChatRoom.Controller.Daos;

import com.simpleChatRoom.Module.userBean;

import java.sql.SQLException;

public interface IuserDao {
    public userBean login(String account,String password) throws SQLException;
    /**
     * 用户登录
     *
     * @param account,password account为账号，password密码
     * @return 成功则返回该用户的对象实体，否则返回null
     * @throws Exception SQL执行异常
     */
}
