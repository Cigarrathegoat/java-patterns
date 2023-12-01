package com.java.patterns.practice.demo.dbexercise.models;

public class Oracle implements BaseDataBase{
    @Override
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Oracle");

    }

    @Override
    public void update(String sql) {
        System.out.println("Update query " + sql + " in Oracle");

    }
}
