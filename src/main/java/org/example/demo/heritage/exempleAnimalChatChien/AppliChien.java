package org.example.demo.heritage.exempleAnimalChatChien;

public class AppliChien {
    public static void main(String[] args) {

Chien chien1=new Chien ("toto",5,"gris",60.,5.6);

// AFFICHAGE D'un CHIEN 1 (état)

System.out.println(chien1.toString());


// Instanciation des méthodes

        chien1.crier();
        chien1.manger();
        chien1.anneeNaissance();
        chien1.utiliserMethodeTaillenom();
    }
}
