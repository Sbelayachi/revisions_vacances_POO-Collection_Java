package org.example.demoCollections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExempleArrayListAnimal {
    public static void main(String[] args) {


// Liste d'animaux
List <Animal> animaux;
animaux=new ArrayList<Animal>();

       // Ajouter deux objets de type Forme à la liste:
animaux.add(new Animal("toto",5,"blanc"));
animaux.add(new Animal("titi",3,"roux"));

        // Afficher la liste des objets

        for (int i = 0; i<animaux.size();i++)
        {animaux.get(i).affiche();
    }

}
}