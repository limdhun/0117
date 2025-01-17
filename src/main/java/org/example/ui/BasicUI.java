package org.example.ui;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;


@RequiredArgsConstructor
public abstract class BasicUI {
    //UI에 물려주고싶은 기능 : scanner, 키보드로부터 입력받기
    private final Scanner scanner;
    public String input(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }
    public int inputInt(String msg){
        return Integer.parseInt(input(msg));
    }

    //MenuUI, OrderUI에 대해 각기 다른 것을 물려주고 싶다. -> 오버라이딩


    public abstract void execute();

}
