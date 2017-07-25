package org.jumutang.com.entity;

/**
 * @Auther: Tinny.liang
 * @Description:
 * @Date: Create in 15:43 2017/7/25
 * @Modified By:
 */
public class Car {
    private String carNo;
    private String size;
    private String speed;

    public Car(String carNo, String size, String speed) {
        this.carNo = carNo;
        this.size = size;
        this.speed = speed;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
