// Multithreading using Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread - " + Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class MultiThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // First thread
        MyThread t2 = new MyThread(); // Second thread

        t1.setName("A");
        t2.setName("B");

        t1.start(); // Start thread t1
        t2.start(); // Start thread t2
    }
}
