package be.bstorm.e6k.demo.oo.enfant;

import be.bstorm.e6k.demo.oo.Personne;

public class Employe extends Personne {

    private double salaire;

    public Employe(String nom, int age, double salaire) {
        super(nom, age);
        this.salaire = salaire;
    }

    @Override
    public void saluer(){
//        super.saluer(); // impossible si abstract
        System.out.println("je suis un employé");
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        if( salaire >= 0 )
            this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom: "+getNom()+
                ", age: "+getAge()+
                ", salaire: "+getSalaire()+
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof Employe) )
            return false;

        Employe employe = (Employe) obj;

        return employe.getSalaire() == this.getSalaire()
                && employe.getNom().equals( this.getNom() )
                && employe.getAge() == this.getAge();
    }

}
