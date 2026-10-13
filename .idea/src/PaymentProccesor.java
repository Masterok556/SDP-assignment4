public class PaymentProccesor {
    private int balance = 150;

    public boolean pay(int amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public void refund(int amount) {
        balance += amount;
    }
}