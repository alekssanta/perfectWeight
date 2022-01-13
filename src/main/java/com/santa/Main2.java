package com.santa;

public class Main2 {
    public static void main(String[] args) {
        String name = "Ilya";
        int length = 10;
        Integer bigLength = 10;
        String intStr = bigLength.toString();
        System.out.println("intStr = " + intStr);
        long universeAge = 4_000_000_000L;
        boolean isNight = false;
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

    }
}
