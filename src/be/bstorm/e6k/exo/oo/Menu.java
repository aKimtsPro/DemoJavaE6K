package be.bstorm.e6k.exo.oo;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner( System.in );
    private final CompteCourant compteCourant;

    public Menu(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }
}
