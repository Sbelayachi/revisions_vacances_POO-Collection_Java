package org.example.demoGeneralites.heritage.exempleAnimalChatChien;
public class Chien extends Animal {


    // Déclaration des variables propres à la classe dérivée (enfant) = chien
    private double taille;
    private double poids;

    // CONSTRUCTEUR de la classe dérivée (enfants) = chien
    // contient les attributs hérités de la classe "parent" (ANIMAL) : nom, age, couleur ==> super (<nom attributs>)
    // contient les attributs propres : poids et taille ==> this.attribut =  <attributs ou formule ou autre>).

    public Chien(String nom, int age, String couleur, double taille, double poids) {
        super(nom, age, couleur);
        this.taille = taille;
        this.poids = poids;
    }

    // SI ATTRIBUT(s) Privé(s) ==> Getter et Setter pour l'affichage des attributs de l'objet
    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }


    // METHODES AVEC un @override

//      1 - héritage des méthodes publiques de la classe "parent" (ANIMAL) : crier + manger
//          Code = super.nomMéthode

    // 1-1 Héritage de la méthode publique : crier / Telle qu'elle = sans modification = SANS SURCHARGE
    @Override
    public void crier() {
        super.crier();
    }
    // 1-2 Héritage + SURCHARGE de la méthode publique : manger (modification/ajout)


    @Override
    public void manger() {
        System.out.println("Jaime les bonnes croquettes");
    }

    @Override
    public void utiliserMethodeTaillenom() {
        super.utiliserMethodeTaillenom();
    }

    @Override
    protected void anneeNaissance() {
        super.anneeNaissance();
    }



    // methode toString


    @Override
    public String toString() {
        return "Je suis le chien avec les caractéristiques suivantes : " +
                "\n ==> Je m'appelle : " +getNom()+
                "\n ==> J'ai : " +getAge()+" ans"+
                "\n ==> Mon poil est de cette couleur : " +getCouleur()+
                "\n ==> Je mesure (taille en cm) " + taille + " cm"+
                "\n ==> Je pèse (poids en kg) " + poids + " kg\n"
                ;
    }
}

