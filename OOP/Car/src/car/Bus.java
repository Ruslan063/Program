/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;


class Bus extends Car  implements  printf{ // implement  printf
    // รถบัสเป็นซับเซตของรถ 
    private int Wheels;
    private int Seats;

    public Bus(int Wheels, int yrModel, String carMake, int speed,int Seats) {
        super(yrModel, carMake, speed);
        this.Wheels = Wheels;
        this.Seats=Seats;
    }
    
    @Override
    public void printinfo()
    {
        p();
        System.out.println("Wheels="+ Wheels);
        System.out.println("Seats="+ Seats);
    }
    
    
    
    

}
