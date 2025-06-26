public class ThreadJoin {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Task 1 - Count " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Task 1 interrupted");
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Task 2 - Count " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Task 2 interrupted");
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting");
        }

        System.out.println("Both threads have finished. Main thread ends.");
    }
}
