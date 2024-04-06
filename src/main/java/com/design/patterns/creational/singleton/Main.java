package com.design.patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        /**  Getting the object which is created only  */
        DbConnection x = DbConnection.getDbConnection();
        System.out.println(x);
        DbConnection.getDbConnection();
    }
}
