package Modules.Features.thread.examples;

public class SuspendResumeThread implements Runnable{
    public static void main(String[] args) {
        SuspendResumeThread thread1 = new SuspendResumeThread("Thread1");
        SuspendResumeThread thread2 = new SuspendResumeThread("Thread2");
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);

            System.out.println(thread1.name + " suspended");
            thread1.suspend();
            Thread.sleep(2000);
            System.out.println(thread1.name + " resuming");
            thread1.resume();

            System.out.println(thread2.name + " suspended");
            thread2.suspend();
            Thread.sleep(1000);
            System.out.println(thread2.name + " resuming");
            thread2.resume();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread1.getThread().join();
            thread2.getThread().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    private String name;
    private boolean isSuspended = false;
    private Thread thread;

    public Thread getThread() {
        return thread;
    }

    public SuspendResumeThread(String name) {
        this.name = name;
    }
    public void start() {
        if (thread == null) {
            this.thread = new Thread(this, name);
            System.out.println("Starting: " + name);
            thread.start();
        }
    }
    @Override
    public void run() {
        System.out.println("Running " + name);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(name + " -> " + i);
                Thread.sleep(500);
                synchronized (this) {
                    while (isSuspended) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " finished");
    }
    synchronized public void suspend() {
        isSuspended = true;
    }

    public synchronized void resume() {
        isSuspended = false;
        notify();
    }
}
