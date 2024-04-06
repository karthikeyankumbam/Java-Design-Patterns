package com.design.patterns.creational.singleton;

/** Best Method  */
public class DCL {
    /** Double Check Locking **/
    /** But this pattern is  suitable for multiple threads also*/
    private DCL(){
        /** No other should create an object for this that is why it is private */
    }
    private static DCL dbConnection=null;
    public  static DCL getDbConnection(){
        if(dbConnection==null) {
            synchronized (DCL.class) {
                if (dbConnection == null) {
                    dbConnection = new DCL();
                }
            }
        }
        return dbConnection;
    }
}
