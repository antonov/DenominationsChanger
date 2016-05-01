package com.company;

public class Main {

    public static void main(String[] args) {
        DenominationsChanger denominationsChanger = new DenominationsChanger();
        System.out.println(denominationsChanger.MakeChanges(135));
        System.out.println(denominationsChanger.MakeChanges(120));
        System.out.println(denominationsChanger.MakeChanges(350));

    }
}
