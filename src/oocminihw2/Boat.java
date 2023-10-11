/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author 4istik
 */
public class Boat extends Vehicle implements Sailable {  //Instantiating a boat
    //Boolean for sail
    private boolean sailHoisted = false;
    //Constructor for our boat
    public Boat(String make, String type) {
        this.make = make;
        this.type = type;
        this.numSails = 1;
    }
    //Overridden methods
    @Override
    public void hoistSail() {
        sailHoisted = true;
    }

    @Override
    public void lowerSail() {
        sailHoisted = false;
    }

    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    @Override
    public void landHo() {
        System.out.println("We have reached the shore!");
    }

    public float getDirection() {
        return this.direction;
    }

    public float getSpeed() {
        return this.speed;
    }

    public String getMake() {
        return this.make;
    }

    public String getType() {
        return this.type;
    }
}
