package org.example.transfer;

public class CarTMoney implements TMoney{
    @Override
    public int calc(int distance) {
        return distance * 130;
    }
}
