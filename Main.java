// OVERLOADING AND OVERRIDING IS USED IN TAX CLASS FOR DIFF DIFF TAX CALCULATION.

package com.taxCalculator;

import java.util.Random;
import java.util.Scanner;

public class Main {

//    public static Object Mobile;
//    public static Object Tv;
//    public static Object Ref;
//    public static Object Tablet;

    public static void main(String[] args) {

        int i = 1;
        while(i == 1) {
            System.out.println("Enter the details of Product:");
            Scanner s = new Scanner(System.in);
            System.out.print("Product Name: ");
            String n = s.nextLine();
            System.out.print("Product ID: ");
            String c = s.nextLine();
            System.out.print("Product Price: ");
            Double p = Double.parseDouble(s.nextLine());
            if(n.toLowerCase().equals("mobile")) {
                System.out.print("Product Brand: ");
                String b = s.nextLine();
                System.out.println("Your selected Product is Mobile of Company " + b + ".");
                double gst = 12;
                double cgst = 14;
                System.out.println("GST rate is: " + gst + "%.");
                System.out.println("CGST rate is: " + cgst + "%.");
                Mobile m1 = new Mobile(c, n, p, gst, cgst, b);
                Tax t1 = new Tax(m1);
//                Tax t1 = new Tax(p, d);
            } else if (n.toLowerCase().equals("tv")) {
                System.out.println("Product Brand: ");
                String f = s.nextLine();
                System.out.println("Screen Size: ");
                int size = s.nextInt();
                System.out.println("Your selected product is Tv of company " + f + " and screen size of " + size + " inch.");
                double gst = 18;
                System.out.println("GST rate is: " + gst + "%.");
                System.out.println("NO CGST is applicable");
                Tv tv1 = new Tv(c, n, p, gst, f, size);
                Tax t1 = new Tax(tv1);
//                Tax t1 = new Tax(p, d);
            } else if(n.toLowerCase().equals("ref")) {
                System.out.println("Volume Capacity[in L]: ");
                int volume = s.nextInt();
                System.out.println("Your selected product is Refrigerator of Capacity " + volume + " in liter.");
                double gst = 18;
                System.out.println("GST rate is: " + gst + "%.");
                System.out.println("NO CGST is applicable");
                Ref r1 = new Ref(c, n, p, gst, volume);
                Tax t1 = new Tax(r1);
//                Tax t1 = new Tax(p, d);
            } else if(n.toLowerCase().equals("tablet")) {
                System.out.print("Product Brand: ");
                String b = s.nextLine();
                System.out.println("Screen Size[in inch]: ");
                double tab_size = s.nextDouble();
                System.out.println("Selected Product is Tablet of brand " + b + " and screen size of " + tab_size + " in inch.");
                double gst = 10;
                double cgst = 11;
                System.out.println("GST rate is: " + gst + "%.");
                System.out.println("CGST rate is: " + cgst + "%.");
                Tablet tab1 = new Tablet(c, n, p, gst, cgst, b, tab_size);
                Tax t1 = new Tax(tab1);
//                Tax t1 = new Tax(p, d);
            } else {
                System.out.println("Your selected product is " + n + " of Rs. " + p);
                Random r = new Random();
                double gst_rate = 0;
                if (p <= 50000) {
                    gst_rate = Math.floor(r.nextInt(5)) + 5;
                } else if (p > 50000 && p < 100000) {
                    gst_rate = Math.floor(r.nextInt(2)) + 10;
                } else {
                    gst_rate = Math.floor(r.nextInt(3)) + 12;
                }
                System.out.println("GST rate is: " + gst_rate);
                Product randomProduct = new Product(n, c, p, gst_rate);
                Tax t1 = new Tax(randomProduct);
            }
            System.out.println("Want another tax calculation ? [1/0]");
            int q = s.nextInt();
            if(q == 1) {
                i = 1;
            } else i = 0;
        }
    }
}
