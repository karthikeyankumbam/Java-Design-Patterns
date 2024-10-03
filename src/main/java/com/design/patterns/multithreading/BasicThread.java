package com.design.patterns.multithreading;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicThread {
    public static final int MAX_PASSWORD=9999;
    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<>();
        int realPassowrd = new Random().nextInt(MAX_PASSWORD);
        System.out.println("realPassowrd is "+realPassowrd);
        Vault vault =new Vault(realPassowrd);
        threads.add(new AscendingHackerThread(vault));
        threads.add(new DescendingOrderThread(vault));
        threads.add(new PoliceThread());
        for(Thread thread:threads){
            thread.start();
        }
    }
    private static class Vault{
        private int password;
        public Vault(int password){
            this.password = password;
        }
        public boolean isCorrectPassword(int guess){
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("interupted exception");
            }
            return this.password==guess;
        }
    }
    private static class HackerThread extends Thread{
        protected Vault vault;
        public HackerThread(Vault vault){
            this.vault=vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }
        @Override
        public  void start(){
            System.out.println("Starting ........."+this.getName());
            super.start();
        }
    }
    private static class AscendingHackerThread extends HackerThread{

        public AscendingHackerThread(Vault vault) {
            super(vault);
        }
        @Override
        public void run(){
            for(int guess=0;guess<MAX_PASSWORD;guess++){
                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName()+" guessed password is "+guess);
                    System.exit(0);
                }
            }
        }
    }
    private static class DescendingOrderThread extends HackerThread{

        public DescendingOrderThread(Vault vault) {
            super(vault);
        }
        @Override
        public void run(){
            for(int guess=MAX_PASSWORD;guess>=0;guess--){
                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName()+" guessed password is "+guess);
                    System.exit(0);
                }
            }
        }
    }
    private static class PoliceThread extends Thread{
        @Override
        public void run(){
            for(int i=10;i>0;i--){
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
            System.out.println("Game over for the hackers");
            System.exit(0);
        }
    }
}

