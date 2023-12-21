package Modules.Features.thread.examples;

public class DeadLockThreads {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();


    }
    private static final Object object1 = new Object();
    private static final Object object2 = new Object();

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (object1) {
                System.out.println("Thread1: object1 blocked");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread1: waiting for object2");
                synchronized (object2) {
                    System.out.println("Thread1: object1 and object2 blocked");
                }
            }
        }
    }
    public static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (object2) {
                System.out.println("Thread2: object2 blocked");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread2: waiting for object1");
                synchronized (object1) {
                    System.out.println("Thread2: object2 and object1 blocked");
                }
            }
        }
    }


}
