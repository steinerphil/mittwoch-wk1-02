package com.company;

public class Main {

    public static void main(String[] args) {

        String string1 = "qwertzuiopüasdfghjkl"; // 20 Zeichen
        System.out.println(proofFancy(string1));
        System.out.println(proofLength(string1));

    }

    public static boolean proofLength(String string){
       return string.length() > 20;
    }

    public static boolean proofFancy(String string){
        return string.contains("fancy");
    }

}
