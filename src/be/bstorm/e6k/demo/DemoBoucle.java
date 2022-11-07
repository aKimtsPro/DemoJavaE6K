package be.bstorm.e6k.demo;

public class DemoBoucle {

    public static void main(String[] args) {

        // while
        int oeufs = 5;
        while ( oeufs > 0 ){
            System.out.println("Je lance un oeuf, il m'en reste " + (oeufs - 1));
            oeufs--;
        }

        // do while
        do {
            System.out.println("Je lance un oeuf");
            oeufs--;
        } while ( oeufs > 0 );

        // for

        for (int nbrOeufs = 5; nbrOeufs > 0 ; nbrOeufs--) {
            System.out.println("Je lance un oeuf");
        }

        System.out.println(oeufs);

        for ( int nOeufs = 5 ; nOeufs>0 ; --nOeufs ){
            System.out.println("Je lance un oeuf, il m'en reste " + (nOeufs-1));
        }


        // foreach

    }

}
