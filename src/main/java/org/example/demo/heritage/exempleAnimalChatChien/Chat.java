package org.example.demo.heritage.exempleAnimalChatChien;

public class Chat extends Animal {
    // Déclaration des variables propres à la classe dérivée (enfant) = chat
    private int nbVies ;

    // CONSTRUCTEUR

    public Chat(String nom, int age, String couleur, int nbVies) {
        super(nom, age, couleur);
        this.nbVies = nbVies;
    }


    // Getter et setter pout l'attribut privé nombre de vies

    public int getNbVies() {
        return nbVies;
    }

    public void setNbVies(int nbVies) {
        this.nbVies = nbVies;
    }


    // SURCHARGE DES METHODS DU PARENT = animal


    @Override
    public void crier() {
        super.crier();
        System.out.println("pourtant je fais miaou miaou");

    }

    @Override
    public void manger() {
        super.manger();
        System.out.println("J'aime le pâté");
    }

    @Override
    public void utiliserMethodeTaillenom() {
        super.utiliserMethodeTaillenom();
    }

    @Override
    protected void anneeNaissance() {
        super.anneeNaissance();
    }


    // méthode pour afficher l'état des objets instanciés


    @Override
    public String toString() {
        return "Je suis le chien avec les caractéristiques suivantes : " +
                "\n ==> Je m'appelle : " +getNom()+
                "\n ==> J'ai : " +getAge()+" ans"+
                "\n ==> Mon poil est de cette couleur : " +getCouleur()+
                "\n ==> On dit que j'ai " + nbVies + " vies"
                ;
    }
}
