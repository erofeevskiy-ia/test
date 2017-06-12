package lect_generic;

import java.lang.ref.WeakReference;

/**
 * Created by Igor on 14.03.2017.
 */
public class Demo  {

   public int ser;
   static void print() {
       System.out.println("Demo");
   }
    public static void main(String[] args) {
        /*int a = 0b1001;//8
        a=a>>32;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);*/


        Thread thread = new Thread( ()-> {
            short n = 1;
            while (n!=-1) {
                n>>>=1;
                //Thread curThread = new Thread().currentThread();
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(n);
            }
        });
        thread.start();


        System.out.println("thread.getName():"+ thread.getName());
        System.out.println("thread.getThreadGroup():"+thread.getThreadGroup());
        System.out.println("Thread.currentThread().getThreadGroup():"+Thread.currentThread().getThreadGroup());
        System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
        System.out.println("----------------------------------");


//        WeakReference<Integer> weakReference = new WeakReference<>(100);
//        System.out.printf("Before GC: %s\n", weakReference.get());
//
//        for(int i=1; weakReference.get()!=null; i++) {
//            System.gc();
//            System.out.printf("After  GC iteration %d: %s",i, weakReference.get());
//
//        }
    }


}
