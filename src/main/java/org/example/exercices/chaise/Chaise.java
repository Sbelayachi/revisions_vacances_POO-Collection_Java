//  =====   Exercice : La chaise  =====

//  =====   SLIDE  21 =====

//1. Créer une classe Chaise possédant comme variables d’instance :
//      => le nombre de pieds, le matériaux et la couleur de l’objet

//2. Afficher ses informations en surchargeant une méthode de la classe Object
//3. La classe Chaise pourra être instanciée avec ou sans paramètres (Constructeur par défaut)
//4. Afficher toutes les chaises (Possibilité de simplifier avec une méthode ToString)


package org.example.exercices.chaise;

public class Chaise {

    private int nombrePieds;
    private String materiaux;
    private String couleur;


// Constructeur :
    public Chaise(int nombrePieds, String materiaux, String couleur) {
        this.nombrePieds = nombrePieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
    }

// Methode toString pour afficher l'état de la chaise

//public void afficher (){
//    System.out.println(toString());
//}




    @Override
    public String toString() {
        return "Chaise " +
                "\n ==> nbrePieds=" + nombrePieds +
                "\n ==> materiaux='" + materiaux + '\'' +
                "\n ==> couleur='" + couleur + '\'';
    }
}
