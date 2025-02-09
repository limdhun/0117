package org.example.transfer;

abstract class PublicTMoney implements TMoney  {

    protected int defaultMoney;
    protected int per;

    PublicTMoney(int defaultMoney, int per) {
        this.defaultMoney = defaultMoney;
        this.per = per;
    }
}