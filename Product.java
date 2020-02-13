package com.taxCalculator;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Product {

    public int id;
    public String product_name;
    public double price;
    public double gst_rate;

    public Product(int id, String name, double price, double rate) {
        this.id = id;
        this.product_name = name;
        this.price = price;
        this.gst_rate = rate;
    }
}

class Mobile extends Product {

    public String product_brand;
    double cgst_rate;

    public Mobile(int id, String name, double price, double rate, double cgst_rate, String brand) {
        super(id, name, price, rate);
        this.product_brand = brand;
        this.cgst_rate = cgst_rate;
    }
}

class Tablet extends Mobile {

    public double size;

    public Tablet(int id, String name, double price, double rate, double cgst_rate, String brand, double a) {
        super(id, name, price, rate, cgst_rate, brand);
        this.size = a;
    }
    public void tab() {
        System.out.println("Tablet size in inch is: " + size);
    }
}

class Tv extends Product {

    public String product_brand;
    public int screen_size;

    public Tv(int id, String name, double price, double rate, String brand, int screen_size) {
        super(id, name, price, rate);
        this.product_brand = brand;
        this.screen_size = screen_size;
    }
}

class Ref extends Product {

    public int volume_capacity;

    public Ref(int id, String name, double price, double rate, int v) {
        super(id, name, price, rate);
        this.volume_capacity = v;
    }
}