package com.ecp.sbjwt.entity;

import javax.persistence.*;

@Entity
@Table(name = "system_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer user_oid;

    private String userName;
    private String password;
    private String email;

    // INSERT INTO sb_jwt.system_user VALUES (1,'demo@email.com','pass1','easycodepro');

    public Integer getUser_oid() {
        return user_oid;
    }

    public void setUser_oid(Integer user_oid) {
        this.user_oid = user_oid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
