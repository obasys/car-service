package com.demboyz.carservice.model;

public class Info {


    private long id;
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
