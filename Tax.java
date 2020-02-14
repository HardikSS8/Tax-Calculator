package com.taxCalculator;

import java.util.Random;

public class Tax {

    // METHOD OVERLOADING NAMED AS CALCULATE WITH 2 or 3 ARGUMENTS WITH HELP OF POLYMORPHISM

    double calculate(double p, double r) {
        double tax = 0;
        tax = p*r/100;
        return tax;
    }

    double calculate(double p, double r, double c) {
        double tax = 0;
        double tax_gst = p*r/100;
        double tax_cgst = p*c/100;
        tax = tax_gst + tax_cgst;
        return tax;
    }

    // METHOD OVERRIDING NAMED AS TAX USING FOUR DIFFERENT OBJECTS OF PRODUCTS

    public Tax(Mobile m1) {
        double price = m1.price;
        double gst_rate = m1.gst_rate;
        double cgst_rate = m1.cgst_rate;
        double tax_value = calculate(price, gst_rate, cgst_rate);
        System.out.println("GST + CGST is: " + tax_value);
        System.out.println("Total Price: " + m1.price + " + " + tax_value + " = " + (m1.price+tax_value));
    }

    public Tax(Tv tv1) {
        double price = tv1.price;
        double rate = tv1.gst_rate;
        double tax_value = calculate(price, rate);
        System.out.println("GST for your " + tv1.product_name + " is: " + tax_value);
        System.out.println("Total Price: " + tv1.price + " + " + tax_value + " = " + (tv1.price+tax_value));
    }

    public Tax(Ref ref) {
        double price = ref.price;
        double rate = ref.gst_rate;
        double tax_value = calculate(price, rate);
        System.out.println("GST for your " + ref.product_name + " is: " + tax_value);
        System.out.println("Total Price: " + ref.price + " + " + tax_value + " = " + (ref.price+tax_value));
    }

    public Tax(Tablet tab) {
        double price = tab.price;
        double gst_rate = tab.gst_rate;
        double cgst_rate = tab.cgst_rate;
        double tax_value = calculate(price, gst_rate, cgst_rate);
        System.out.println("GST + CGST is: " + tax_value);
        System.out.println("Total Price: " + tab.price + " + " + tax_value + " = " + (tab.price+tax_value));
    }

    // Random any product that is not defined by subclass
    public Tax(Product p) {
        double price = p.price;
        double gst_rate = p.gst_rate;
        double tax_value = calculate(price, gst_rate);
        System.out.println("GST is: " + tax_value);
        System.out.println("Total price: " + p.price + " + " + tax_value + " = " + (p.price + tax_value));
    }
}
