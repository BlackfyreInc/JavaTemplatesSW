public class GooglePayStrategy implements Strategy {
    @Override
    public void makePayment(int amount) {
        System.out.println("Google Pay transaction of " + amount);
    }
}
