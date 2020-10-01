package com.akp.ds.ubsint;

public class Test {

	 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        /**
         * Write a program to print sequence using these 3 threads. 
         * You are given 3 threads. You need to print in natural order up to a MAX number.
         * 
         * 
         * 
         * Let’s say you have 3 threads. T1,T2 and T3.
         * 
         * 
         * 
         * If MAX is 10, you need to print:
         * 
         * 
         * 
         * T1 1 T2 2 T3 3 T1 4 T2 5 T3 6 T1 7 T2 8 T3 9 T1 10
         * 
         */
        int i=0;
        
        Thread t1 = new Thread(new T(), "T1");
        Thread t2 = new Thread(new T(), "T2");
        Thread t3 = new Thread(new T(), "T3");
        
        t1.start();
        t2.start();
        t3.start();
    }
    
    static class T implements Runnable{
        private static int cnt =0;
        Object lock = new Object();
        
        public void run() {
            while (cnt<10) {
                synchronized(lock){
                    cnt++;
                    System.out.println(Thread.currentThread().getName() + " "+ cnt);
                }
            }
        }
    }

 

}
