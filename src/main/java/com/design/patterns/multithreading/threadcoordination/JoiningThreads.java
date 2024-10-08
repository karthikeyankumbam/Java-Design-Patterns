package com.design.patterns.multithreading.threadcoordination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class JoiningThreads {
    public static void main(String[] args) throws InterruptedException {
        List<Long> inputNumbers = Arrays.asList(0L,345L,35435L,2324L,4656L,23L,5556L);
        List<FactorialThread> threads = new ArrayList<>();
        Stack<String> st = new Stack<>();

        for(long num:inputNumbers){
            threads.add(new FactorialThread(num));
        }
        for(Thread thread:threads){
            thread.start();
        }
        for(Thread thread:threads){
            thread.join(200);
        }
        for(FactorialThread thread:threads){
            if(thread.isFinished()){
                System.out.println("Factorial of "+thread.inputNumber+" is "+thread.getResult());
            }else {
                System.out.println("The Calculation for "+thread.inputNumber+" is still in progress");
            }
        }
    }
}
