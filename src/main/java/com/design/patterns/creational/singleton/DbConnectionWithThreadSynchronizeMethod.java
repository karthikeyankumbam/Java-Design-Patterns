package com.design.patterns.creational.singleton;

public class DbConnectionWithThreadSynchronizeMethod {

    private DbConnectionWithThreadSynchronizeMethod() {
        /** No other should create an object for this that is why it is private */
    }

    private static DbConnectionWithThreadSynchronizeMethod dbConnection = null;

    public static DbConnectionWithThreadSynchronizeMethod getDbConnection() {
        if (dbConnection == null) {
            synchronized (DbConnectionWithThreadSynchronizeMethod.class) {
                dbConnection = new DbConnectionWithThreadSynchronizeMethod();
            }
        }
        return dbConnection;
    }
}
