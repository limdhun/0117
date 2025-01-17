package org.example.domain;

public class KoreanMenu extends Menu{

    private int person;

    public KoreanMenu(int mno, String name, int price, int person) {
        super(mno, name, price);
        this.person = person;
    }
}
