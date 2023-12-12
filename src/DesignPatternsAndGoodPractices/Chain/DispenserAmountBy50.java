package DesignPatternsAndGoodPractices.Chain;

public class DispenserAmountBy50 implements DispenserAmountChain{
    private DispenserAmountChain next;
    @Override
    public void dispenseAmount(Currency currency) {
        if (currency.getAmount() < 50) {
            next.dispenseAmount(currency);
        } else {
            System.out.println("Numar bancnote de 50: " + currency.getAmount() / 50);

            int remainingAmount = currency.getAmount() % 50;
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
