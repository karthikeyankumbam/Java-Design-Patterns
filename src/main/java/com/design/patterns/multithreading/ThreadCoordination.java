package com.design.patterns.multithreading;

public class ThreadCoordination {
    public static void main(String[] args) {
        Thread task = new Thread(new  BlockingTask());
        task.start();
        task.interrupt();
    }
    private static  class BlockingTask implements Runnable{

        @Override
        public void run() {
            try{
                Thread.sleep(50000);
            }catch (InterruptedException e){
                System.out.println("Exiting the blocking thread");
            }
        }
    }
}
