package org.example.ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ExempleArrayListChien {
    public static void main(String[] args) {

        // Liste de Chiens

        List<Chien> chiens;
        chiens = new ArrayList<Chien>();


        // ajouter des chiens à la liste


        chiens.add(new Chien("toto",5,"brun"));
        chiens.add(new Chien("titi",6,"noir"));


        for (int i=0;i<chiens.size();i++)
        {
            chiens.get(i).affiche();
    }
}}