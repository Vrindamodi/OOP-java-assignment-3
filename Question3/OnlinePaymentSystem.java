abstract class Payment {
    protected String transactionId;
    protected double amount;

    Payment(String transactionId, double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive");
        this.transactionId = transactionId;
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {

    CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    void processPayment() {
        double fee = amount * 0.02; // 2% transaction fee for credit card
        System.out.println("Credit Card Payment:");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
        System.out.println("Fee: $" + fee);
        System.out.println("Total: $" + (amount + fee));
    }
}

class PayPalPayment extends Payment {

    PayPalPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    void processPayment() {
        double fee = amount * 0.03; // paypal charges 3%
        System.out.println("PayPal Payment:");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
        System.out.println("Fee: $" + fee);
        System.out.println("Total: $" + (amount + fee));
    }
}

public class OnlinePaymentSystem {
    public static void main(String[] args) {
        try {
            Payment p1 = new CreditCardPayment("CC101", 5000);
            Payment p2 = new PayPalPayment("PP202", 3000);

            p1.processPayment();
            System.out.println();
            p2.processPayment();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
