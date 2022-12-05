package be.bstorm.e6k.exo.oo;

public class Compte {

    private final String numero;
    private double solde;
    private Personne titulaire;

    public Compte(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    public void retrait(double montant){
        if( montant > 0 )
            this.solde -= montant;
    }

    public void depot(double montant){
        if(montant > 0)
            this.solde += montant;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }
}
