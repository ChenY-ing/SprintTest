package com.bdqn.util;

public class Car {
    private  String name;
    private String type;
    private double speed;

    public void init(){
        System.out.println("Car Init()");
    }

    public  void destroy(){
        System.out.println("Car destroy()");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Car() {
        System.out.println("Car 被构造了");
    }

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
