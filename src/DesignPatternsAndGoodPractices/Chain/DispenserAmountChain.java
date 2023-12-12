package DesignPatternsAndGoodPractices.Chain;

public interface DispenserAmountChain {
    void dispenseAmount(Currency currency);
    void setNextChain(DispenserAmountChain next);
}
