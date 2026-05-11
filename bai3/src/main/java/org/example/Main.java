package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer c = new Computer();

        double price1 = c.calculatePrice(1000);
        System.out.println("Gia cuoi cung: " + price1);

        System.out.println();

        double price2 = c.calculatePrice(1000, 100);
        System.out.println("Gia cuoi cung: " + price2);

        System.out.println();

        double price3 = c.calculatePrice(1000, 100, 50);
        System.out.println("Gia cuoi cung: " + price3);
    }
}