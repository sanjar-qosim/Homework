package interfaces.payment;

public class PayPalPayment implements ProcessPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("The " + amount + " was successful paid via PayPal");
    }
}
