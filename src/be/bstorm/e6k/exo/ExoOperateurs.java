package be.bstorm.e6k.exo;

import java.util.Locale;
import java.util.Scanner;

public class ExoOperateurs {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in ); //.useLocale( Locale.US );

        System.out.print( "Veuillez entrer un nombre, une opération et un nombre: " );
        double membre1 = sc.nextDouble();
        char operation = sc.next().charAt(0);
        double membre2 = sc.nextDouble();

        switch ( operation ){

            case '+':
                System.out.println(membre1 + " + " + membre2 + " = " + (membre1+membre2));
                break;

            case '-':
                System.out.println(membre1 + " - " + membre2 + " = " + (membre1-membre2));
                break;

            case '*':
                System.out.println(membre1 + " * " + membre2 + " = " + (membre1*membre2));
                break;

            case '/':
                if( membre2 == 0 )
                    System.out.println("Opération impossible (div par 0)");
                else
                    System.out.println(membre1 + " / " + membre2 + " = " + (membre1/membre2));
                break;

            case '%':
                if( membre2 == 0 )
                    System.out.println("Opération impossible (mod par 0)");
                else
                    System.out.println(membre1 + " % " + membre2 + " = " + (membre1%membre2));
                break;

            default:
                System.out.println("Opération impossible (invalide)");
        }

    }

}
