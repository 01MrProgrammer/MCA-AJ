// Thread class that performs a task
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multi-Threading in JAVA");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();  // Create thread object
        thread.start();                    // Start new thread

        // Main thread task
        for (int i = 1; i <= 5; i++) {
            System.out.println("JAVA Programming!");
        }
    }
}
