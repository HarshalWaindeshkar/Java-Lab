abstract class PaymentMethod {
    public abstract void processPayment(double amount);
}

class CCP extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
        System.out.println("Verifying credit card details...");
        System.out.println("Payment Successful!\n");
    }
}

class DCP extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing debit card payment of ₹" + amount);
        System.out.println("Checking account balance...");
        System.out.println("Payment Successful!\n");
    }
}

class DWP extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing digital wallet payment of ₹" + amount);
        System.out.println("Authenticating wallet ID...");
        System.out.println("Payment Successful!\n");
    }
}

public class Practical2B {
    // Method accepts any payment type and processes it (polymorphism)
    public static void makePayment(PaymentMethod method, double amount) {
        method.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentMethod credit = new CCP();
        PaymentMethod debit = new DCP();
        PaymentMethod wallet = new DWP();

        makePayment(credit, 1500.00);
        makePayment(debit, 2300.50);
        makePayment(wallet, 999.99);
    }
}
