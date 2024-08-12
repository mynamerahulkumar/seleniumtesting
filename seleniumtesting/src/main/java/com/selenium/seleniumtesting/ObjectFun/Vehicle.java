package com.selenium.seleniumtesting.ObjectFun;

public class Vehicle {

    int wheels;
    int doors;
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public static void main(String[] args) {
        Vehicle rahul=new Vehicle();
        rahul.setWheels(12);
        rahul.setDoors(4);
        Vehicle pragya=new Vehicle();
        pragya.setWheels(4);
        pragya.setDoors(4);
    }

}
