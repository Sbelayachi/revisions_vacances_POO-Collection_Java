package org.example.exercices.PlantesHeritage;

// 4. Créer une classe "Arbre" qui hérite de "Plante" et qui ajoute un attribut supplémentaire pour la circonférence du tronc
public class Arbre extends Plantes {

    private double circonferenceTronc;

    // Constructeur de la classe enfant
        public Arbre(String nom, double hauteur, String couleurFeuilles, double circonferenceTronc) {
        super(nom, hauteur, couleurFeuilles);
        this.circonferenceTronc = circonferenceTronc;
    }

    // Getter et Setter : car la classe Arbre possède un attribut privé (Circonférence du tronc)

    public double getCirconferenceTronc() {
        return circonferenceTronc;
    }

    public void setCirconferenceTronc(double circonferenceTronc) {
        this.circonferenceTronc = circonferenceTronc;
    }

//   5. Surcharger la méthode "afficher" pour qu'elle ajoute les informations à propos de l'arbre

    @Override
    public String toString() {
        return "\nJe suis l'arbre avec les attributs suivants : " +
                "\n ==> Mon nom= " + getNom()  +
                "\n ==> Je mesure (hauteur) " + getHauteur() + " cm"+
                "\n ==> Mes feuilles sont de cette couleur " + getCouleurFeuilles() +
                "\n ==> La Circonférence de mon tronc est de  " + circonferenceTronc + " cm" ;

    }
      }

