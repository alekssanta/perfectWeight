package com.santa;

public class glass {
     static int number = 666;


    public static void print (int value) {
        System.out.println("------");
        System.out.println(value);
        System.out.println("------");
    }
    public static void main(String[] args) {
        int volumeOfGlass = 300;
        double zapolnenieOfGlass = 0.6;
        int volumeOfWaterOfGlass = (int) (volumeOfGlass*zapolnenieOfGlass);
        System.out.println("volumeOfWaterOfGlass = " + volumeOfWaterOfGlass);
print(number);
    }
}
