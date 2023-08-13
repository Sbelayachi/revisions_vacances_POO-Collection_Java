package org.example.ArrayList;

// // Utilisation de mot clé extends pour hériter d'une classe + nom de la classe
public class Chat extends Animal {

//    // attribut propre à la classe dérivée ex : poids
//    private double poids ;



    // constructeur
    public Chat(String nom, int age, String couleur, double poids) {
        super(nom, age, couleur);
    }


// surcharge de la methode crier = méthode abstraite = OBLIGATION d'IMPLEMENTER dans la classe dérivées
//    @Override
//    public void crier() {
//        System.out.println("miaou");
//    }

    // surcharge de la methode "manger"
     @Override
     public void manger() {
            System.out.println("je mange de la bonne pâté");
        }

    @Override
    public void affiche() {
        super.affiche();
    }
}
