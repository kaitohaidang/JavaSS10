package org.example;

public class Retangle extends Shape {
    public double cd;
    public double cr;

    public Retangle(double cd,double cr) {
        this.cd=cd;
        this.cr=cr;
    }

    @Override
    public double area() {
        return cd*cr;
    }
}
