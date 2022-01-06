package com.santa;

public class salesForShirt {
    public static void main(String[] args) {
        int costOfShirt = 3000;
        int countOfShirt = 5;
        int countOfSalesForShirt = 3;
        int countForSales = Math.abs(countOfShirt - countOfSalesForShirt * 2);
        System.out.println("countForSales = " + countForSales);
        int costOfSelectedShirt = costOfShirt * countOfShirt;
        int costOfAddShirt = countForSales * costOfShirt;
        double procentForSales = 0.7;
        double costOfSalesShirt = (countOfShirt + countForSales) * costOfShirt * procentForSales;
        double costOfSkidkaShirt = costOfSalesShirt / (costOfShirt * (countForSales + countOfShirt));
        double saveMany = (countOfShirt + countForSales) * costOfShirt - costOfSalesShirt;
        System.out.println("сэкономили = " + saveMany);
        double freeShirt = saveMany/costOfShirt;
        System.out.println("freeShirt = " + freeShirt);
    }
}
