package be.bstorm.e6k.demo.oo;

public abstract class Personne {

    private String nom;
    private int age;

    public Personne() {
    }

    public abstract void saluer();

    protected Personne(String nom, int age) {
        this.nom = nom;
        this.setAge( age );
    }

    void setAge( int age ) {
        if( age >= 0 )
            this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    boolean isMineur() {
        return age < 18;
    }

    // accesseur
    public String getNom() {
        return nom;
    }

    // mutateur
    public void setNom(String nom) {
        this.nom = nom;
    }
}
