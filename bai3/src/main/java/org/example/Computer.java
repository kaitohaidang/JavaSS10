package org.example;

public class Computer {
    double calculatePrice(double basePrice) {
        System.out.println("Cong thuc: Gia goc");
        return basePrice;
    }

    // Tính theo giá gốc + thuế
    double calculatePrice(double basePrice, double tax) {
        System.out.println("Cong thuc: Gia goc + thue");
        return basePrice + tax;
    }

    // Tính theo giá gốc + thuế - giảm giá
    double calculatePrice(double basePrice, double tax, double discount) {
        System.out.println("Cong thuc: Gia goc + thue - giam gia");
        return basePrice + tax - discount;
    }

}
