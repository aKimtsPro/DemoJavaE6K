package be.bstorm.e6k.demo;

import java.util.Scanner;

public class DemoType {

    public static void main(String[] args) {

        // Types primitifs

        // entiers
        byte b = 127;                       // -128;127 | 1byte
        short s = 32_000;                   // -32k;32k | 2byte
        int i = 2_000_000_000;              // -2M ; 2M | 4byte
        long l = 4_000_000_000_000_000_000L;// -bcp;bcp | 8byte

        // réels
        float f = 0.1F; // 4byte
        double d = 0.1; // 8Byte

        // autre
        boolean bool = true;
        char character = 's';               // 0;64k   | 2byte

        // Type référence
        String chaine = "hello world!";
        String chaine2 = "hello world!";
        String chaine3 = "hello world" + '!';
        String chaine4 = new String("hello world!");
        String chaine5 = new String("hello world") + '!';

        System.out.println( chaine == chaine2 ); // true
        System.out.println( chaine == chaine3 ); // true
        System.out.println( chaine == chaine4 ); // false
        System.out.println( chaine == chaine5 ); // false

        // Il est possible de déclarer plusieurs variables sur
        // la mêm ligne
        int x, y = 7, z;

        // Les constantes
        final int TAUX_TVA = 5;


        // lowerCamelCase : variable, methode
        // UpperCamelCase : Classe, Interface, Enum
        // lower_snake_case : variable
        // UPPER_SNAKE_CASE : CONSTANTE


        // Les conversions

        l = i; // conversion implicite
        i = (int)l; // conversion explicite

        // explicite nécessaire dans les cas suivant
        // - entier vers entier plus petit
        // - réel vers entier
        // - réel vers réel plus petit


        // Type Wrappers
        Byte B = null;
        Short S;
        Integer I;
        Long L;

        Float F;
        Double D;

        Boolean Bool;
        Character Char;

    }

}
