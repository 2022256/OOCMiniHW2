/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author 4istik
 */
public class Car extends Vehicle implements Drivable {  //Instantiating a car
    //Constructor for our car
    public Car(String make, String type, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numWheels = 4;
        this.numPassengers = 4;
    }
    
    //Current speed to change
    private float currentSpeed = 0;
    //Overridden 
    @Override
    public void accelerate(float speed) {
        this.currentSpeed += speed;
    }

    @Override
    public void brake() {
        this.currentSpeed = 0;
    }

    @Override
    public void turn(float angle) {
        // Turn the car by a specific angle
        this.direction += angle;
    }

    @Override
    public float getDirection() {
        return this.direction;
    }

    @Override
    public float getSpeed() {
        return this.currentSpeed;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
