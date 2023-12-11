package DesignPatternsAndGoodPractices.Strategy;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("123", 100);
        Item item2 = new Item("4521", 322);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        System.out.println(shoppingCart);
        shoppingCart.pay(new CreditCardStrategy("BRD", "Dragos", "121", "10.10.2024"));
        shoppingCart.pay(new PaypalStrategy("dragos@gmail.ro", "1234567"));
    }
}
