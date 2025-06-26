public class BankAccount {

    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
        notify(); // Notify any waiting withdrawer
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting to withdraw " + amount);
            try {
                wait(); // Wait for deposit
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + " | Balance: " + balance);
    }

}
