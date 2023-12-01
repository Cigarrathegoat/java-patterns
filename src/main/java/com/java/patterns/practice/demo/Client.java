package com.java.patterns.practice.demo;

import com.java.patterns.practice.demo.factory.BikeSampleFactory;
import com.java.patterns.practice.demo.model.Bike;

public class Client {

    public static void main (String[] args) {
        System.out.println("Here goes a mountain bike!");
        Bike bike = BikeSampleFactory.orderBike("MountainBike");
        System.out.println(bike);
    }
}
