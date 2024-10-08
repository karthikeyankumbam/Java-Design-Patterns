package com.design.patterns.multithreading.threadcoordination;

import java.math.BigInteger;

public class ThreadCoordination {
    public static void main(String[] args) throws InterruptedException {
//        Thread task = new Thread(new  BlockingTask());
//        task.start();
//        task.interrupt();

        Thread thread = new Thread(new LongComputationalTask(new BigInteger("2000000"), new BigInteger("1000000")));
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
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
    private static class LongComputationalTask implements Runnable{
        private BigInteger base;
        private BigInteger power;

        public LongComputationalTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base+"^"+power+" = "+pow(base,power));
        }
        private BigInteger pow(BigInteger base, BigInteger power){
            BigInteger result=BigInteger.ONE;
            for(BigInteger i=BigInteger.ZERO;i.compareTo(power)!=0;i=i.add(BigInteger.ONE)){
//                if(Thread.currentThread().isInterrupted()){
//                    System.out.println("Prematurely Interrupted Communication");
//                    return BigInteger.ZERO;
//                }
                result = result.multiply(base);
            }
            return result;
        }
    }
}
