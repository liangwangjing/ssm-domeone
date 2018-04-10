package com.jk.model;

import java.io.Serializable;

public class T_Type implements Serializable {
    private static final long serialVersionUID = 8022384051100851621L;
    private String typeid;

    private String typename;

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    @Override
    public String toString() {
        return "T_Type{" +
                "typeid='" + typeid + '\'' +
                ", typename='" + typename + '\'' +
                '}';
    }
}