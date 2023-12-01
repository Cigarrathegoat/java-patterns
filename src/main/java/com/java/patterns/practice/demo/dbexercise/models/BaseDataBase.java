package com.java.patterns.practice.demo.dbexercise.models;

public interface BaseDataBase {

    void query(String sql);

    void update(String sql);
}
