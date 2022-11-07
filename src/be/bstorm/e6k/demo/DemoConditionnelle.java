package be.bstorm.e6k.demo;

import java.util.Scanner;

public class DemoConditionnelle {

    public static void main(String[] args) {

        int age = 17;

        if( age >= 18 ){
            System.out.println("Vous êtes majeur");
        }
        else if (age >= 12 ) {
            System.out.println("Vous êtes ado");
        }
        else {
            System.out.println("Vous êtes mineur");
        }


        String nom = new Scanner(System.in).nextLine();

        // Si j'écris "Alex":
        System.out.println("Alex" == nom); // False

        switch ( nom ){
            case "Alexandre":
                System.out.println("Il a un surnom, ");
            case "Alex": // Ce cas est executé
                System.out.println("C'est Alex");
                break;
            case "Luc":
                System.out.println("C'est Luc");
                break;
            case "Marie":
                System.out.println("C'est Marie");
                break;
            default:
                System.out.println("C'est pas Alex");
        }

    }

}
