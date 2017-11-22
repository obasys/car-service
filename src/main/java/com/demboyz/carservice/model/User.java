package com.demboyz.carservice.model;

public class User {


    private long id;
    private String firstName;
    private String lastName;
    private long profilePictureId;
    private long infoId;
    private Info info;
    private int flag;
    private long lastEditTime;
    private long creationTime;




    public User() {
        this.id = -1;
        this.firstName = "";
        this.lastName = "";
        this.profilePictureId = -1;
        this.infoId = -1;
        this.flag = -1;
        this.lastEditTime = 0;
        this.creationTime = 0;
    }




    public User(long id, String firstName, String lastName, long profilePictureId,
                long infoId, int flags, long lastEditTime, long creationTime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePictureId = profilePictureId;
        this.infoId = infoId;
        this.flag = flags;
        this.lastEditTime = lastEditTime;
        this.creationTime = creationTime;
    }




    public void setId(long id) {
        this.id = id;
    }




    public long getId() {
        return id;
    }




    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




    public String getFirstName() {
        return firstName;
    }




    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public String getLastName() {
        return lastName;
    }




    public void setProfilePictureId(long profilePictureId) {
        this.profilePictureId = profilePictureId;
    }




    public long getProfilePictureId() {
        return profilePictureId;
    }




    public void setInfoId(long infoId) {
        this.infoId = infoId;
    }




    public long getInfoId() {
        return infoId;
    }




    public void setInfo(Info info) {
        this.info = info;
    }




    public Info getInfo() {
        return this.info;
    }




    public void setFlag(int flag) {
        this.flag = flag;
    }




    public int getFlag() {
        return flag;
    }




    public void setLastEditTime(long lastEditTime) {
        this.lastEditTime = lastEditTime;
    }




    public long getLastEditTime() {
        return lastEditTime;
    }




    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }




    public long getCreationTime() {
        return creationTime;
    }




}
