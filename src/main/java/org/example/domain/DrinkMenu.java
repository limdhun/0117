package org.example.domain;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class DrinkMenu extends Menu{
    private boolean ice;
    public DrinkMenu(int mno, String name, int price, boolean ice) {
        super(mno, name, price);
        this.ice = ice;
    }
}
