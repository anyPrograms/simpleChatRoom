package com.simpleChatRoom.Controller.Daos.impl;

import com.simpleChatRoom.Controller.Daos.IuserDao;
import com.simpleChatRoom.Module.userBean;
import com.simpleChatRoom.Utils.dBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.simpleChatRoom.Utils.dBUtil.getConn;

public class userDaoImpl implements IuserDao {
    @Override
    public userBean login(String account,String password){
        userBean user=null;
        Connection conn= getConn();
        PreparedStatement stat=null;
        ResultSet res=null;

        try{

            String sql = "select account,nickname,password from user where account= ? and password= ?";
            stat=conn.prepareStatement(sql);
            stat.setString(1,account);
            stat.setString(2,password);
            res=stat.executeQuery();
            while(res.next()){
                user=new userBean(res.getString("account"),res.getString("nickname"),null);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return user;
    }
}
