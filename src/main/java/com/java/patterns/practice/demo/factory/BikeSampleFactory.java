package com.java.patterns.practice.demo.factory;

import com.java.patterns.practice.demo.model.*;

public class BikeSampleFactory {
    public static Bike orderBike(String bikeType) {
        Bike bikeInQuestion = null;
        if ("BmxBike".equals(bikeType)) {
            bikeInQuestion = new BmxBike();
        } else if ("CityBike".equals(bikeInQuestion)) {
            bikeInQuestion = new CityBike();
        } else if ("MountainBike".equals(bikeInQuestion)) {
            bikeInQuestion = new MountainBike();
        } else {
            bikeInQuestion = new NoBikeChosen();
        }

        bikeInQuestion.getHardware();
        bikeInQuestion.certificates();
        bikeInQuestion.assemble();
        bikeInQuestion.pack();

        return bikeInQuestion;
    }
}
