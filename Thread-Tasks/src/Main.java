//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create a class that extends Thread, override run() method, and print "Hello from thread". Start the thread.
        MyThread myThread = new MyThread(); // Create instance of the thread
        myThread.start();

        //Create a class that implements Runnable and prints the current thread name and a message.
        Thread simpleRunnable = new Thread(new SimpleRunnable());
        simpleRunnable.start();

        //Task: Print numbers 1 to 5 with a 1-second delay between each number using sleep().
        Runnable numberPrint = () -> {
            try{
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };

        Thread numberThread = new Thread(numberPrint);
        numberThread.start();
    }
}