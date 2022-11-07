package be.bstorm.e6k.demo;

public class DemoOperateur {

    public static void main(String[] args) {

        // Opérateurs
        // - arithmétique

        int a = 5, b = 10;
        double rslt;

        rslt = a + b; // 12
        rslt = a - b; // -2
        rslt = a * b; // 35
        rslt = a / b; // 0
        rslt = (double)a / b; // 0.5
        rslt = a % b; // 5

        // - affectation

        double contenu;
        contenu = (rslt = 5);

        rslt += 2;
        rslt -= 2;
        rslt *= 2;
        rslt /= 2;
        rslt %= 2;


        a = 0;

        System.out.println( a++ ); // 0
        System.out.println( ++a ); // 2
        System.out.println( a-- ); // 2
        System.out.println( --a ); // 0

        System.out.println( a ); // 0

        // - concaténation

        String chaine = "ok" + 5;
        chaine += '!';

        // - comparaison

        String ch1 = "ok", ch2 = "pas ok";
        // Entre valeurs comparable
        System.out.println( ch1 == ch2 );
        System.out.println( ch1 != ch2 );


        // Seulement avec les nombres
        System.out.println( a <= b );
        System.out.println( a < b );
        System.out.println( a >= b );
        System.out.println( a > b );


        // - logique

        // AND - &&

        System.out.println( true && true ); // true
        System.out.println( true && false ); // false
        System.out.println( false && true ); // false
        System.out.println( false && false ); // false

        // OR - ou inclusif

        System.out.println( true || true ); // true
        System.out.println( true || false ); // true
        System.out.println( false || true ); // true
        System.out.println( false || false ); // false

        // NOT

        System.out.println( !true ); // false
        System.out.println( !false ); // true

        // Loi de De Morgan

        boolean estVert = false, estLigne = true;

        boolean rslt1 = !( estVert && estLigne );
        boolean rslt2 = !estVert || !estLigne;

        rslt1 = !(estVert || estLigne);
        rslt2 = !estVert && !estLigne;

        // XOR - ou exclusif
        boolean ouExclu = (estVert || estLigne) && !(estVert && estLigne);
        ouExclu = estVert ^ estLigne;

        //  estVert    !estLigne - true
        //  !estVert    estLigne - true
        //  estVert     estLigne - false
        //  !estVert    !estLigne- false

        // Opération ternaire

        int age = 17;
        String majeur = age >= 18 ? "majeur" : "mineur";


    }

}
