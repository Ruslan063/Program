/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       /* Bus b=new Bus(4, 1994, "sport", 500,24);
        b.printinfo();*/
        
        /*result:
        yearModel=1994
        make=sport
        speed=500
        Wheels=4
        Seats=24
        */
        
        // จริงๆเรียกสั้นๆแบบนี้ก็ได้
        
        new Taxi(1998 ,"ferrary", 1500, "14448",98).printinfo();
        
        /*result:
            yearModel=1998
            make=ferrary
            speed=1500
            IDTaxi=14448
            meter=98
        */

    }

}
