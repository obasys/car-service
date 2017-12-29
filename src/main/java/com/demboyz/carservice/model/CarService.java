package com.demboyz.carservice.model;

public class CarService {


    private long id;
    private String title;
    private String description;
    private long addressId;
    private long infoId;
    private long lastEditTime;
    private long creationTime;




    public CarService() {
        this.id = -1;
        this.title = "";
        this.description = "";
        this.addressId = -1;
        this.infoId = -1;
        this.lastEditTime = 0;
        this.creationTime = 0;
    }




    public CarService(long id, String title, long addressId, String description, long infoId, long lastEditTime, long creationTime) {
        this.id = id;
        this.title = title;
        this.addressId = addressId;
        this.description = description;
        this.infoId = infoId;
        this.lastEditTime = lastEditTime;
        this.creationTime = creationTime;
    }




    public void setId(long id) {
        this.id = id;
    }




    public long getId() {
        return this.id;
    }




    public void setTitle(String title) {
        this.title = title;
    }




    public String getTitle() {
        return this.title;
    }




    public void setDescription(String description) {
        this.description = description;
    }




    public String getDescription() {
        return this.description;
    }




    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }




    public long getAddressId() {
        return this.addressId;
    }




    public void setInfoId(long infoId) {
        this.infoId = infoId;
    }




    public long getInfoId() {
        return this.infoId;
    }




    public void setLastEditTime(long lastEditTime) {
        this.lastEditTime = lastEditTime;
    }




    public long getLastEditTime() {
        return this.lastEditTime;
    }




    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }




    public long getCreationTime() {
        return this.creationTime;
    }




    @Override
    public String toString() {
        return "CarSercice[id = " + id + ", title = " + title + ", description = " + description +
                ", addressId = " + addressId + ", infoId = " + infoId + ", lastEditTime = " + lastEditTime +
                ", creationTime = " + creationTime + "]";
    }




}
