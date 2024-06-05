public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer(new PayPalStrategy());
    customer.makePayment(322);

    customer.setStrategy(new GooglePayStrategy());
    customer.makePayment(525);
  }

}
