package com.santa;

public class Main2 {
    public static void main(String[] args) {
        String name = "Ilya";
        int length = 10;
        Integer bigLength = 10;
        String intStr = bigLength.toString();
        System.out.println("intStr = " + intStr);
        System.out.println(intStr.charAt(0));
        long universeAge = 4_000_000_000L;
        boolean isNight = false;
        String weightStr = "163 kg";
        Integer weight = Integer.valueOf(weightStr.substring(0,3));
        System.out.println("weight = " + weight);
        
        int smallVolume = 15;
        Integer bigVolume = new Integer(smallVolume);
        System.out.println("bigVolume = " + bigVolume);

        Integer anotherVolume = 15;
        if (bigVolume.equals(anotherVolume)){
            System.out.println("volumes are equal");
        }  if (!(bigVolume> anotherVolume) && !(bigVolume< anotherVolume)){
            System.out.println("volumes equal");

        }
        else
            System.out.println("volumes not equal");
        
        System.out.println(name);
        String surname = new String(new char[]{'I', 'l', 'y', 'a'});
        System.out.println(surname);
        if (name.equals(surname)) {
            System.out.println("Rare surname");
        }
        boolean containsYa = name.contains("ya");
        System.out.println("containsYa = " + containsYa);

        int indexOfL = name.indexOf('1');
        System.out.println("indexOfL = " + indexOfL);

        boolean startsWithSaz = name.startsWith("Saz");
        System.out.println("startsWithSaz = " + startsWithSaz);

        boolean endsWithYa = name.endsWith("ya");
        System.out.println("endsWithYa = " + endsWithYa);

        int strLen = name.length();
        System.out.println("strLen = " + strLen);

        int monthNumber = 12;
        String monthName = "";
//        if (monthNumber == 3) {
//            monthName = "March";
//        } else if (monthNumber == 0) {
//            monthName ="January";
//        }
String [] monthNames = {
        "january",
        "february",
        "march",
        "april",
        "may",
        "june",
        "july",
        "august",
        "september",
        "october",
        "november",
        "december",
};
monthName = monthNames[monthNumber-1];

        System.out.println("monthName = " + monthName);


    }
}
