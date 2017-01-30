/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

public class Car  implements Vrhicle{
    //รถเป็นซับเซตของยานพาหนะ  เวลาที่ implements จะต้องประกาศ method ที่สร้างไว้ใน interface ด้วย
     int yearModel; // ปีที่สร้าง
    String make; //สร้างโดยใคร
     int speed; //ความเร็ว

    public Car(int yrModel, String carMake,int speed) {
        this.yearModel = yrModel;
        this.make = carMake;
        this.speed = speed;
    }

    public void AccelerateSpeed(int speed) {
        speed = speed + 5;
    }

    public void BrakeSpeed(int speed) {
        speed = speed - 5;
    }

    @Override// ผลจาก interface
    public String getSystemdriver(String system) {
        return system;
    }

    @Override
    public String getBodyCar(String namebody) {
        return namebody;
    }
    public void p()// ไว้แสดงข้อมูล
    {
        System.out.println("yearModel="+this.yearModel);
        System.out.println("make="+this.make);
        System.out.println("speed="+this.speed);
       
    }
}
