package com.santa;

public class travelTime {
    public static void main(String[] args) {
        int distanceFromHomeToWork = 60;
        double speedOfTaxi = 70.0;
        double timeToWork = distanceFromHomeToWork/speedOfTaxi;
        double vechernieProbki = 1.3;
        double timeToHome = timeToWork* vechernieProbki;
        System.out.println("timeToWork = " + timeToWork);
        System.out.println("timeToHome = " + timeToHome);
    }
}
