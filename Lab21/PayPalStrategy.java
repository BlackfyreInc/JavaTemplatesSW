public class PayPalStrategy implements Strategy {
    @Override
    public void makePayment(int amount) {
        System.out.println("PayPal transaction of " + amount);
    }
}
