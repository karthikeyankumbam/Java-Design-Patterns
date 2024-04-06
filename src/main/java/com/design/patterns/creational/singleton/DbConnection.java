package com.design.patterns.creational.singleton;

public class DbConnection {
    /** But this pattern is not suitable for multiple threads */
    private DbConnection(){
        /** No other should create an object for this that is why it is private */
    }
    private static DbConnection dbConnection=null;
    public  static DbConnection getDbConnection(){
        if(dbConnection==null){
            dbConnection= new DbConnection();
        }
        return dbConnection;
    }
}
