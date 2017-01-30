/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author ArmmyUpBandwitdh
 */
public class Taxi extends  Car implements printf {
    private  String  IDTaxi;// เลขประจำเท็กซี่
    private  int meter; // มิตเตอร์ที่กด

    public Taxi(int yrModel, String carMake, int speed,String IDTaxi,int meter) {
        super(yrModel, carMake, speed);
        this.IDTaxi=IDTaxi;
        this.meter=meter;
    }
    

    @Override //ผลจาก interface
    public void printinfo() {
        p(); //method อันนี้แสดงจาก class Car 
        System.out.println("IDTaxi="+IDTaxi);
        System.out.println("meter="+meter);
    }
    
   
    
}
