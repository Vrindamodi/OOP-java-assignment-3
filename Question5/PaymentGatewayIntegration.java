interface UPIPayment {
    void payViaUPI(double amount, String upiId);
}

interface CardPayment {
    void payViaCard(double amount, String cardNumber);
}

class OnlinePayment implements UPIPayment, CardPayment {

    @Override
    public void payViaUPI(double amount, String upiId) {
        if (amount <= 0) {
            System.out.println("Invalid amount entered.");
            return;
        }
        if (!upiId.contains("@")) {
            System.out.println("UPI ID must contain '@'");
            return;
        }

        System.out.println("Processing UPI payment...");
        System.out.println("Paying Rs." + amount + " to " + upiId);
        System.out.println("Payment Successful!");
    }

    @Override
    public void payViaCard(double amount, String cardNumber) {
        if (amount <= 0) {
            System.out.println("Invalid amount entered.");
            return;
        }

        // show only last 4 digits
        String maskedCard = "XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4);

        System.out.println("Processing Card payment...");
        System.out.println("Card: " + maskedCard);
        System.out.println("Amount: Rs." + amount);
        System.out.println("Payment Successful!");
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        OnlinePayment payment = new OnlinePayment();

        payment.payViaUPI(1500, "student@ybl");

        System.out.println();

        payment.payViaCard(2500, "9876543212345678");
    }
}
