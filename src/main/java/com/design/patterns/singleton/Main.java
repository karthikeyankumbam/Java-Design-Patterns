package com.design.patterns.singleton;

import static com.design.patterns.singleton.DbConnection.getDbConnection;

public class Main {
    public static void main(String[] args) {
        /**  Getting the object which is created only  */
        DbConnection x = getDbConnection();
        System.out.println(x);
        getDbConnection();
    }
}
