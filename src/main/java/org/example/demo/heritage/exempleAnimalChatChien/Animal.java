
package org.example.demo.heritage.exempleAnimalChatChien;
import java.time.Year;

public  class Animal {

private String nom;
private int age;
private String couleur;

// 1 - Constructeur
    public Animal(String nom, int age, String couleur) {
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
    }
// 2 - getter et setter car attributs privés


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // 3- méthodes
public void crier (){
    System.out.println("Un animal n'a pas de cri");
}

public void manger(){
    System.out.println("L'animal mange");
}

protected void anneeNaissance ()
{
    System.out.println("Je suis né(e) en : " + (Year.now().getValue() - age));
}

private void tailleNom()
{    // Méthode privée donc la classe dérivée ne peut pas en hériter
    System.out.println("Mon nom : " + nom + "comporte " + nom.length() + " caractères.");
    }

// tailleNom() = méthode privée = accessible que par la classe
// pour utiliser cette méthode ⇒ Création d'une méthode publique qui affiche cette méthode privée
public void utiliserMethodeTaillenom(){
        tailleNom();
    }




    // 4 methode toString pour afficher l'état de l'objet

    @Override
    public String toString() {
        return "\n ==> nom='" + nom  +
                "\n ==> age=" + age + " an(s)"+
                "\n ==> couleur='" + couleur ;
    }
}
