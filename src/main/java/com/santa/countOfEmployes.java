package com.santa;

public class countOfEmployes {
    public static void main(String[] args) {
        int allCountOfProgrammist = 20;
        int countOfQaOfProgrammist = 3;
        int countOfTpOfProgrammist = 5;
        int allCountOfQa = countOfQaOfProgrammist*allCountOfProgrammist;
        int allCountOfTp = countOfTpOfProgrammist*allCountOfProgrammist;
        int allcount = allCountOfProgrammist+ allCountOfQa+allCountOfTp;
        System.out.println("allcount = " + allcount);
    }
}
