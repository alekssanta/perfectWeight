package com.santa;

public class Main {
    public static void main(String[] args) {
        final int height = 175;
        System.out.println("height = " + height);
        final int weight = 71;
        System.out.println("weight = " + weight);
//        final int perfectWeight = 80;
        final double perfectWeight = height - 100 - (height/100.0*10);
        System.out.println("perfectWeight = " + perfectWeight);
        if ((weight > (perfectWeight-6)) && (weight< (perfectWeight+6))) {
            System.out.println("weight is perfect");
        } else {
            System.out.println("weight is NOT perfect");
        }


    }
}
