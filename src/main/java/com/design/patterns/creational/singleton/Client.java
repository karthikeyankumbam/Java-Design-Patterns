package com.design.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    /** Code for getting critical situation  */
    public static void main(String[] args) throws InterruptedException {
        Map<String, Boolean> map = new ConcurrentHashMap<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<10000; i++){
            Runnable r = () -> {
                //System.out.println("Name:" + Thread.currentThread().getName());
                DbConnection dbc = DbConnection.getDbConnection();
//                map.put(dbc.toString(), true);
//                System.out.println(dbc.toString());
                // Thread t = new Thread(r);
                // t.start();
                // t.join();
                set.add(dbc.toString());
            };
            executorService.execute(r);
        }
        executorService.shutdown();
        System.out.println("O/P:" + set.size());
        for(String s: set){
            System.out.println(s);
        }
    }
}
