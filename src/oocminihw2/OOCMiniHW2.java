/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;
import IOUtils.*;
/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        IOUtils input = new IOUtils(); //Ken's input tool
        
        int choice; //choice for menu
        do{
                choice = input.getUserInt("Choose:\n"
                    + "1. Boat\n"
                    + "2. Car\n"
                    + "3. Airplane\n"
                    + "4. CEASE CHOOSEMENT");
                switch(choice)
            {
                case 1: Boat();
                break;
                case 2: Car();
                break;
                case 3: Airplane();
                break;
                case 4: break; //if input is 4 shut the menu
            }
        }while(choice != 4);
        System.out.println("See ya");
        
    }
    
    public static void Boat() {
        
        Boat AbramovichYacht = new Boat("Eclipse", "Yacht"); //initialize boat class
        AbramovichYacht.hoistSail();
        System.out.println("Is sail hoisted? " + AbramovichYacht.isSailHoisted());
        AbramovichYacht.lowerSail();
        System.out.println("Is sail hoisted after lowering? " + AbramovichYacht.isSailHoisted());
        AbramovichYacht.landHo();
        
    } //boat code
        
    public static void Car() {
        
        Car myCar = new Car("Toyota", "Sedan", 4); //initialize car class
        myCar.accelerate(60);
        System.out.println("Speed: " + myCar.getSpeed() + " km/ph");
        System.out.println("Direction: " + myCar.getDirection() + " degrees");
        myCar.turn(30);
        System.out.println("Direction after turning: " + myCar.getDirection() + " degrees");
        myCar.brake();
        System.out.println("Speed after braking: " + myCar.getSpeed() + " km/ph.\n"
                + " All " + myCar.numPassengers + " of car occupants leaned forward");
        
    } //car code
        
    public static void Airplane() {
        
        Airplane myAirplane = new Airplane("Boeing", "Passenger"); //initialize airplane class
        myAirplane.accelerate(400);
        System.out.println("Speed: " + myAirplane.getSpeed() + " km/ph");
        System.out.println("Direction: " + myAirplane.getDirection() + " degrees");
        myAirplane.turn(45);
        System.out.println("Direction after turning: " + myAirplane.getDirection() + " degrees");
        myAirplane.changeAltitude(3000);
        System.out.println("Altitude: " + myAirplane.getAltitude() + " meters");
        myAirplane.brake();
        System.out.println("Speed after braking: " + myAirplane.getSpeed() + " km/ph");
    
    } //airplane code
    
}
