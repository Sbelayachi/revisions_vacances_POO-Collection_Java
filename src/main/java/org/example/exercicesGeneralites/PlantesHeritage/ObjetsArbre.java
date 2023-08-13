package org.example.exercicesGeneralites.PlantesHeritage;

public class ObjetsArbre {

    public static void main(String[] args) {

        Arbre arbre1=new Arbre("Hêtre",30,"vertes",3.50);

        System.out.println(arbre1.toString());

        arbre1.setCirconferenceTronc(2.50);
        System.out.println();
        System.out.println(arbre1.toString());
    }
}
