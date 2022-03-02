package com.ug4.soal1;

import java.util.ArrayList;

public class Bus {
    String name;
    Driver driver;
    int Capacity;
    final ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    int usedCapacity;
    double fares;
    double profit;
    String Route;

    public Bus(String name, Driver driver){
        this.name = name;
        this.driver = driver;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getCapacity() {
        return Capacity;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getUsedCapacity(){
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public double getFares() {
        return fares;
    }

    public double getProfit() {
        return profit;
    }

    public String getROUTE() {
        return ROUTE;
    }

    public boolean CheckPassengerBalance(Passenger){

    }
    public void topUpBalance(double, Passenger){

    }
    public void takePassenger(Passenger){

    }
    public void dropPassenger(String, Passenger){

    }
    public void proceedOrder(String, Passenger){

    }
    public cancelOrder(Passenger){

    }
}
