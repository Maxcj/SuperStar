package cn.maxcj.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


public class User implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private Integer role;
    private String db_source;

    public User() {
        super();
    }

    public User(Integer uid, String username, String password, Integer role, String db_source) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.role = role;
        this.db_source = db_source;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }
}
