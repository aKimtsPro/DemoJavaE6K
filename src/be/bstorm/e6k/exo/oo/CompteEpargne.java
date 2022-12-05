package be.bstorm.e6k.exo.oo;

import java.time.LocalDate;

public class CompteEpargne extends Compte {

    private LocalDate dateDernierRetrait;

    public CompteEpargne(String numero, Personne titulaire) {
        super( numero, titulaire );
    }

    public void retrait(double montant){
        if( montant > 0 && montant <= getSolde() ) {
            super.retrait( montant );
            dateDernierRetrait = LocalDate.now();
        }
    }

    public LocalDate getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    private void setDateDernierRetrait(LocalDate dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }

}
