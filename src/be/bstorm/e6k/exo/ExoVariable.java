package be.bstorm.e6k.exo;

import java.util.Scanner;

public class ExoVariable {

    public static void main(String[] args) {

        Scanner sc = new Scanner( "Alex\n84" );

        System.out.println("Quel est votre nom?");
        String nom = sc.nextLine();
        System.out.println("Quel est votre age?");
        int age = sc.nextInt();

        System.out.println("Bonjour " + nom + ", vous avez " + age + "ans." );

    }

}
