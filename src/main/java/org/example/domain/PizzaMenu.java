package org.example.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PizzaMenu extends Menu{
    //피자 사이즈도 요소도 있어야 함. 미디엄 라지 정도만 있으니까 enum으로 하면 됨
    private PizzaSize size;

    public PizzaMenu(int mno, String name, int price, PizzaSize size) {
        super(mno, name, price);
        this.size = size;
    }

}
