package DesignPatternsAndGoodPractices.Chain;

public class DispenserAmountBy10 implements DispenserAmountChain{
    private DispenserAmountChain next;
    @Override
    public void dispenseAmount(Currency currency) {
        if (currency.getAmount() < 10) {
            System.out.println("Suma mai mica de 10!");
        } else {
            System.out.println("Numar bancnote de 10: " + currency.getAmount() / 10);

            int remainingAmount = currency.getAmount() % 10;
            if (remainingAmount > 0) {
                next.dispenseAmount(new Currency(remainingAmount));
            }
        }
    }

    @Override
    public void setNextChain(DispenserAmountChain next) {
        this.next = next;
    }
}
