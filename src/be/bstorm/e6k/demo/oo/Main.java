package be.bstorm.e6k.demo.oo;

import be.bstorm.e6k.demo.oo.enfant.Employe;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Employe employe = new Employe("pol", 35, 2000);
        Personne personne = employe;
        Object o = new Object();

        personne.saluer();

        if( o instanceof Employe )
            System.out.println( ((Employe)o).getSalaire() );

        System.out.println( personne );

    }

}
