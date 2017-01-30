
package car;


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
