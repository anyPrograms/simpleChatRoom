package com.simpleChatRoom.Utils;

import org.apache.log4j.Logger;
import java.sql.*;
import static com.simpleChatRoom.Utils.loadDBConfig.*;


public class dBUtil {

    private static final Logger log = Logger.getLogger(dBUtil.class);

    private static Connection conn=null;
    //单例模式返回数据库连接
    public static Connection getConn(){

        try{
            //加载驱动
            Class.forName(getDBValue("driverclass"));
            String url=getDBValue("url");
            String user=getDBValue("user");
            String password=getDBValue("password");

            if(conn==null){
                conn= DriverManager.getConnection(url,user,password);
            }
        }catch (Exception e){
            e.printStackTrace();
            log.error("connect database error::" + e);
        }
        return conn;
    }

    /**
     * 关闭数据库连接
     *
     * @param rs
     * @param stat
     * @param conn
     */
    public static void closeConn(ResultSet rs, Statement stat,Connection conn){
        try{
            if(rs!=null){
                rs.close();
            }
            if(stat!=null){
                stat.close();
            }
            if(conn!=null){
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
            log.error("Failed to close database connection");
        }
    }

    /**
     * 关闭数据库连接
     *
     * @param stat
     * @param conn
     */
    public static void closeConn(Statement stat, Connection conn) {
        try {
            if (stat != null) {
                stat.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            log.error("Failed to close database connection");
        }
    }

}
