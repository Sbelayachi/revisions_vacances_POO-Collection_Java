//          ===== DEMO =====

package org.example.demoCollections.ArrayList;

public  class Animal {    // Déclaraction d'une classe abstraite = mot clé 'abstract' devant class / après visibilité)
    protected String nom;
    protected int age;
    protected String couleur;


// Constructeur
    public Animal(String nom, int age, String couleur) {
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
    }

// Méthodes

//      1 - Méthodes ABSTRAITE ==> ex crier : On peut définir des signatures de méthodes en abstract
//          La méthode astraite devra être
//       se déclare avec le mot clé 'abstact' juste après la visivilité
//    public abstract void crier ();

//      2 - Méthodes CONCRETES ==> ex: manger : On peut définir des signatures de méthodes en abstract
//       se déclare avec le mot clé 'abstact' juste après la visivilité

    public void manger()
    {
        System.out.println("miam miam");
    }
    public  void affiche() {
        System.out.println( "\n => nom =" + nom +
                "\n => age = " + age +
                "\n => couleur =" + couleur);

    }


// getteur - setter (ici inutiles, car les attributs de la classe abstraite sont en protected
//                  donc accessibles à la classe elle-même et à ses dérivés ou enfants
                    //donc accessibles aux classes enfants chat et chien
    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getCouleur() {
        return couleur;
    }


    // toString pour afficher l'état des OBJETS
    @Override
    public String toString() {
        return
                "\n => nom =" + nom +
                "\n => age = " + age +
                "\n => couleur =" + couleur ;
        }
}
