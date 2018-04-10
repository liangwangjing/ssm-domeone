package com.jk.model;

import java.io.Serializable;

/**
 * Created by 我？ on 2018/4/3.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 762282485555709167L;
    private String userid;
    private String username;
    private Integer userpass;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserpass() {
        return userpass;
    }

    public void setUserpass(Integer userpass) {
        this.userpass = userpass;
    }


    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", userpass=" + userpass +
                '}';
    }
}
