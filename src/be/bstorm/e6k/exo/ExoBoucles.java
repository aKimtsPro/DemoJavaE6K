package be.bstorm.e6k.exo;

import java.util.Scanner;

public class ExoBoucles {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        String choixLigne;
        char choix;
        int taille;

        System.out.println("(T)riangle ou (S)apin ?");
        do {
            choixLigne = sc.nextLine();
            choix = choixLigne.charAt(0);
            if( choixLigne.trim().length() > 1 && choix != 'T' && choix != 'S' )
                System.out.println("Choix invalide");
        } while ( choixLigne.trim().length() > 1 && choix != 'T' && choix != 'S' );

        System.out.println("De quelle taille?");
        do {
            taille = sc.nextInt();
            if( taille < 1 )
                System.out.println("Taille invalide");
        } while ( taille < 1 );



        if( choix == 'T' ){

            String line = "";
            for (int i = 0; i < taille; i++) {
                System.out.println(line += "*");
            }

        }
        else {
            // Le sapin
            for (int ligne = 1; ligne <= taille; ligne++) {

                for (int espace = taille-ligne; espace > 0 ; espace--) {
                    System.out.print(' ');
                }
                for (int etoiles = ligne*2-1; etoiles > 0 ; etoiles--) {
                    System.out.print('*');
                }

                System.out.println();
            }
            for (int espace = taille-1; espace > 0 ; espace--) {
                System.out.print(' ');
            }
            System.out.println('|');
        }

        System.out.println("Voila votre " + (choix == 'S' ? "sapin" : "triangle"));


    }

}
