package org.example.demoGeneralites.classeAbstraite;

public class AppliChien  {
    public static void main(String[] args) {
        Chien chien1 = new Chien("toto",6,"marron");


        System.out.println("je suis l'animal CHIEN "+chien1.toString()+"\n");
        chien1.crier();
        chien1.manger();

        Chien chien2=new Chien("titi",2,"blanche");
        System.out.println("je suis le chien " + chien2.getNom());
        System.out.println("j'ai  " + chien2.getAge()+ " ans");
        System.out.println("je suis de couleur "+chien2.couleur);
        System.out.println();
        chien2.manger();
        chien2.crier();


    }
}
