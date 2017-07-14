package com.newtouch.fbf.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TUserReportCount {
	private String username;
    private String id;

    private String idCard;

    private Integer count;
    @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")  
   	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date lastTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

	public synchronized String getUsername() {
		return username;
	}

	public synchronized void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "TUserReportCount [username=" + username + ", id=" + id + ", idCard=" + idCard + ", count=" + count
				+ ", lastTime=" + lastTime + "]";
	}
	
}