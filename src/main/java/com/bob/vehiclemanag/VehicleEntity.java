package com.bob.vehiclemanag;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author LiuHaoiang
 * @date 2018/5/13 20:18
 */
@Entity
public class VehicleEntity {
    @Id
    @GeneratedValue
    private Integer id;

    private String vehicleNum;

    private String vehicleWeight;

    private String vehicleCheckInTime;

    private boolean isChecked;

    private String vehicleCheckOutTime;

    public VehicleEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public String getVehicleWeight() {
        return vehicleWeight;
    }

    public void setVehicleWeight(String vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public String getVehicleCheckInTime() {
        return vehicleCheckInTime;
    }

    public void setVehicleCheckInTime(String vehicleCheckInTime) {
        this.vehicleCheckInTime = vehicleCheckInTime;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getVehicleCheckOutTime() {
        return vehicleCheckOutTime;
    }

    public void setVehicleCheckOutTime(String vehicleCheckOutTime) {
        this.vehicleCheckOutTime = vehicleCheckOutTime;
    }
}
