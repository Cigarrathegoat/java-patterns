package com.java.patterns.practice.demo.dbexercise.models;

public class Mongo implements BaseDataBase{
    @Override
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Mongo");
    }

    @Override
    public void update(String sql) {
        System.out.println("Update query " + sql + " in Mongo");

    }
}
