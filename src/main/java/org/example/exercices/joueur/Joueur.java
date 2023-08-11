////  =====   Exercice : Joueur  =====
//
////  =====   SLIDE  23 =====

//1. Créer une classe Joueur
//2. Ajouter les attributs suivants : nom, niveau et points d'expérience
//3. Ajouter un constructeur, des getters et des setters pour ces attributs


//4. Créer une méthode effectuerUneQuete() qui ajoute 10 points d'expérience au joueur

//5. Créer qu'une méthode qui augmente le niveau du joueur de +1 si son expérience dépasse 100 points et réinitialise son expérience
//6. Tester le programme

package org.example.exercices.joueur;

public class Joueur {

    private String nom;
    private int niveau=1;
    private int pointExperience;


    // === Constructeur

    public Joueur(String nom) {
        this.nom = nom;

    }
//
//    public Joueur(int niveau) {
//        this.niveau =niveau;
//    }

// === Getter et setter (accesseurs/mutateurs)

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

///    public void setNiveau() {
//        this.niveau =niveau;
//    }

    public int getPointExperience() {
        return pointExperience;
    }

//    public void setPointExperience(int pointExperience) {
//        this.pointExperience = pointExperience;
//    }


    // === Methode toString (affichage de l'état de l'objet


    @Override
    public String toString() {
        return "niveau"+niveau;
    }


    /// ========= METHODES D'INSTANCE

    //4. Créer une méthode effectuerUneQuete() qui ajoute 10 points d'expérience au joueur

    public void effectuerUneQuete()  // ou public void effectuerUneQuete (int ajouter)
    {
        this.pointExperience += 10;       }   // {this.pointExperience += ajouter; }
//        System.out.println("BRAVO !!! Vous venez d'ajouter 10 points à votre niveau d'expérience");


    //5. Créer qu'une méthode qui augmente le niveau du joueur de +1 si son expérience dépasse 100 points et réinitialise son expérience


    public void augmenterNiveauInitialiserExp() {
        if (this.pointExperience > 100)
        {this.niveau ++;
         this.pointExperience =0;
            }}
////            System.out.println("BRAVO vous avez dépassé 100 points vous venez de passer un niveau");



    }



