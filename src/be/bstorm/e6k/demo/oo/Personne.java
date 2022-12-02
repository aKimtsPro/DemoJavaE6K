package be.bstorm.e6k.demo.oo;

public class Personne {

    private String nom;
    private int age;

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
