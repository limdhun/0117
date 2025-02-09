package org.example.transfer;

public class BusTMoney extends PublicTMoney {

    private int toolPay;

    public BusTMoney(int defaultMoney, int per, int toolPay) {
        super(defaultMoney, per);
        this.toolPay = toolPay;
    }

    @Override
    public int calc(int distance) {
        return defaultMoney + toolPay + (distance * per);
    }
}