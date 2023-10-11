/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author 4istik
 */
public class Airplane extends Vehicle implements Flyable { //Instantiating an Airplane
    //Current altitude to change
    private float currentAltitude = 0;
    //Constructor
    public Airplane(String make, String type) {
        this.make = make;
        this.type = type;
        this.numWings = 2; 
    }

    private float currentSpeed = 0;
    //Overridden methods
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
        // Turn the airplane by a specific angle
        this.direction += angle;
    }

    @Override
    public void changeAltitude(float change) {
        this.currentAltitude += change;
    }

    @Override
    public float getAltitude() {
        return this.currentAltitude;
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
