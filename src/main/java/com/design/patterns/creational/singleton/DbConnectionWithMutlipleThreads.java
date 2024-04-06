package com.design.patterns.creational.singleton;

public class DbConnectionWithMutlipleThreads {
    /** This is suitable even if the multiple threads are running at a time */
    /** static variables are initialised as soon as the compiler loads  */
    private DbConnectionWithMutlipleThreads(){
        /** No other should create an object for this that is why it is private */
    }
    private static DbConnectionWithMutlipleThreads dbConnection=dbConnection= new DbConnectionWithMutlipleThreads();
    public  static DbConnectionWithMutlipleThreads getDbConnection(){
        return dbConnection;
    }
}
