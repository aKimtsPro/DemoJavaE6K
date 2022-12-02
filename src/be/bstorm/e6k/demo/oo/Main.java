package be.bstorm.e6k.demo.oo;

public class Main {

    public static void main(String[] args) {

        Personne p = new Personne("luc", -42);

        p.setNom("truc");
        p.setAge( -45 );

        System.out.println( "Age de p: " + p.getAge() );

    }

}
