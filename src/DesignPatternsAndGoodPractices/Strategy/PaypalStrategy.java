package DesignPatternsAndGoodPractices.Strategy;

public class PaypalStrategy implements PaymentStrategy{
    private String emailID;
    private String password;

    public PaypalStrategy(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }

    @Override
    public void pay(int payValue) {
        System.out.println("You pay: " + payValue + " payed with Paypal");
    }
}
