package com.demboyz.carservice.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "email")
    private String email;

    // Will discuss this later
    //private long[] phone_number;
    //private long facebook_uuid;
    //private long instagram_uuid;
    //private long twitter_uuid;

    public Info() {
        this.id = -1;
        this.email = "";
        //
    }

    public Info(long id, String email) {
        this.id = id;
        this.email = email;
        //
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

}
