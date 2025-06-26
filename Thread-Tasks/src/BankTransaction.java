public class BankTransaction {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread depositor = new Thread(() -> {
            int[] deposits = {100, 200, 300, 150, 50};
            for (int amount : deposits) {
                try {
                    Thread.sleep(1000);
                    account.deposit(amount);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });


        Thread withdrawer = new Thread(() -> {
            int[] withdrawals = {150, 100, 200, 250};
            for (int amount : withdrawals) {
                try {
                    Thread.sleep(1500); // Wait 1.5 seconds between withdrawals
                    account.withdraw(amount);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        depositor.start();
        withdrawer.start();
    }
}
