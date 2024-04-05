package com.design.patterns.singleton;

public class DbConnection {
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
