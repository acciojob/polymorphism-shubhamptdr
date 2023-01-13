package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(2,4);
        p.product(2,4,1);
        p.product(2.0,4.0);
    }
}
class Product {
    public int product(int x, int y) {
        return x*y;
    }
    public int product(int x, int y, int z) {
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }
}