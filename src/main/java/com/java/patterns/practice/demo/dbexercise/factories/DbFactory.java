package com.java.patterns.practice.demo.dbexercise.factories;

import com.java.patterns.practice.demo.dbexercise.models.BaseDataBase;
import com.java.patterns.practice.demo.dbexercise.models.Mongo;
import com.java.patterns.practice.demo.dbexercise.models.Oracle;
import com.java.patterns.practice.demo.dbexercise.models.Postgres;
import org.hibernate.dialect.HSQLDialect;

public class DbFactory {
    public static BaseDataBase chooseDataBase(String database, String sql) {

        BaseDataBase chosenDB = null;

        if ("Mongo".equals(database)) {
            chosenDB = new Mongo();
        } else if ("Oracle".equals(database)) {
            chosenDB = new Oracle();
        } else if ("Postgres".equals(database)) {
            chosenDB = new Postgres();
        }
        chosenDB.query(sql);
        chosenDB.update(sql);

        return chosenDB;
    }
}
