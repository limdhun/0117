package org.example.transfer;

public class KTXTMoney extends PublicTMoney {
    public KTXTMoney(int defaultMoney, int per) {
        super(defaultMoney, per);
    }

    @Override
    public int calc(int distance) {
        return defaultMoney  + (distance * per);
    }
}