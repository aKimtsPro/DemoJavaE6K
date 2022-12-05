package be.bstorm.e6k.exo.oo;

public class CompteCourant extends Compte {

    private double ligneCredit;

    public CompteCourant(String numero, Personne titulaire) {
        super( numero, titulaire );
    }

    public CompteCourant(String numero, double ligneCredit, Personne titulaire) {
        super( numero, titulaire );
        this.setLigneCredit( ligneCredit );
    }

    @Override
    public void retrait(double montant){
        if( montant <= getSolde() + ligneCredit ){
            super.retrait( montant );
        }
    }

    public double getLigneCredit() {
        return ligneCredit;
    }

    public void setLigneCredit(double ligneCredit) {
        if( ligneCredit >= 0 )
            this.ligneCredit = ligneCredit;
    }

}
