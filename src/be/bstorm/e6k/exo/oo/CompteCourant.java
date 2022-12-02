package be.bstorm.e6k.exo.oo;

public class CompteCourant {

    private final String numero;
    private double solde;
    private double ligneCredit;
    private Personne titulaire;

    public CompteCourant(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    public CompteCourant(String numero, double ligneCredit, Personne titulaire) {
        this.numero = numero;
        this.setLigneCredit( ligneCredit );
        this.titulaire = titulaire;
    }

    public void depot(double montant){
        if( montant > 0 ) {
            this.solde += montant;
        }
    }

    public void retrait(double montant){
        if( montant > 0 && montant <= solde + ligneCredit ){
            this.solde -= montant;
        }
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public double getLigneCredit() {
        return ligneCredit;
    }

    public void setLigneCredit(double ligneCredit) {
        if( ligneCredit >= 0 )
            this.ligneCredit = ligneCredit;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }
}
