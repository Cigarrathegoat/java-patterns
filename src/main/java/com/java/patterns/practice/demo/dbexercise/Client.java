package com.java.patterns.practice.demo.dbexercise;

import com.java.patterns.practice.demo.dbexercise.factories.DbFactory;
import com.java.patterns.practice.demo.dbexercise.models.BaseDataBase;

public class Client {

    public static void main(String[] args) {
        System.out.println("This is going to be a Mongo database");
        BaseDataBase thisDataBase = DbFactory.chooseDataBase("Mongo", "pretend there's" +
                "an sql here");
        System.out.println(thisDataBase);
    }
}
