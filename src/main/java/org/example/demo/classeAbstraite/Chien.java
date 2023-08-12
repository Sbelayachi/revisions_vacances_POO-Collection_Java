package org.example.demo.classeAbstraite;

public class Chien extends Animal  {

    public Chien (String nom, int age,String couleur )
    {super(nom,age,couleur);}

    @Override
    public void crier() {
        System.out.println("wouf wouf");
    }

    // surcharge de la methode manger (méthode non abstraite = modifiable)
    @Override
    public void manger() {
        super.manger();
        System.out.println("je mange des bonnes croquettes");
    }
}
