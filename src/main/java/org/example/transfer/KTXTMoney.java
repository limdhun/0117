package org.example.transfer;

public class KTXTMoney implements TMoney{

    private int defaultPay = 30000;

    @Override
    public int calc(int distance) {
        return defaultPay + (distance * 50);
    }
}
