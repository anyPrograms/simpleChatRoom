package com.simpleChatRoom.Module;
import java.util.Date;

/**
 * 聊天记录单一消息的实体
 * date(unix时间) : 1537548601
 * account : a123456
 * message : 你好啊小李
 */

public class ChatHistoryBean {
    private Date date;
    private String acount;
    private String message;

    public Date getDate() {
        return date;
    }

    public String getAcount() {
        return acount;
    }

    public String getMessage() {
        return message;
    }

    public void setDate(long date) {
        this.date = new Date(date);
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
