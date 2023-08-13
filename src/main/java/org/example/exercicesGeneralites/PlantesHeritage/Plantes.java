//Exercice : Plante
//1. Créer une classe "Plante" avec les attributs suivants : nom, hauteur et couleur des feuilles
//2. Ajouter un constructeur, des getters et des setters pour ces attributs
//3. Créer une méthode pour afficher les informations sur la plante
//4. Créer une classe "Arbre" qui hérite de "Plante" et qui ajoute un attribut
//supplémentaire pour la circonférence du tronc
//5. Surcharger la méthode "afficher" pour qu'elle ajoute les informations à propos de l'arbre


package org.example.exercicesGeneralites.PlantesHeritage;

public class Plantes {
    private String nom;
    private double hauteur;
    private String couleurFeuilles;

    // Constructeur
    public Plantes(String nom, double hauteur, String couleurFeuilles) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuilles = couleurFeuilles;
    }



    // Getter et setter (car la classe contient des attributs privés)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurFeuilles() {
        return couleurFeuilles;
    }

    public void setCouleurFeuilles(String couleurFeuilles) {
        this.couleurFeuilles = couleurFeuilles;
    }



    // Methode pour afficher les informations sur la plante (Etat)

    @Override
    public String toString() {
        return "\nJe suis la plante avec les attributs suivants : " +
                "\n ==> Mon nom est : " + nom  +
                "\n ==> Je mesure (hauteur) : " + hauteur + " cm"+
                "\n ==> Mes feuilles sont de cette couleur : " + couleurFeuilles ;
    }
}
