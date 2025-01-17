package org.example.transfer;

public class BusTMoney implements TMoney{

    private int defaultPay = 10000;
    private int toolPay = 40000;

    @Override
    public int calc(int distance) {
        return defaultPay + toolPay + (distance * 10);
    }
}
