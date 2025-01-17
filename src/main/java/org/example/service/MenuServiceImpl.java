package org.example.service;

import org.example.domain.DrinkMenu;
import org.example.domain.Menu;
import org.example.domain.PizzaMenu;
import org.example.domain.PizzaSize;

import java.util.ArrayList;
import java.util.List;

public class MenuServiceImpl implements MenuService{

    private List<Menu> menus;

    //사용자 입력 받도록 하기
    public MenuServiceImpl(List<Menu> menus) {
        this.menus = menus;
    }


    
    //미리 메뉴 선언
//    public MenuServiceImpl(){
//
//        menus = new ArrayList<>();
//        menus.add(new PizzaMenu(1, "Super Pizza", 3000, PizzaSize.M));
//        menus.add(new PizzaMenu(2, "Cheese Pizza", 3400, PizzaSize.M));
//        menus.add(new PizzaMenu(3, "Pineapple Pizza", 5000, PizzaSize.M));
//        menus.add(new PizzaMenu(4, "Sausage Pizza", 6000, PizzaSize.M));
//        menus.add(new PizzaMenu(5, "Bacon Pizza", 4000, PizzaSize.M));
//
//        menus.add(new DrinkMenu(6, "Cola", 3000, true));
//        menus.add(new DrinkMenu(7, "Americano", 1500, true));
//
//    }

    @Override
    public List<Menu> getMenus() {
        return this.menus;
    }
}
