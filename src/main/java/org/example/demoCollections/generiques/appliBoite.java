package org.example.demoCollections.generiques;

import org.example.demoGeneralites.classeAbstraite.Chat;
import org.example.demoGeneralites.classeAbstraite.Chien;

public class appliBoite {
    public static void main(String[] args) {

        // Boite pour une chaine de caractères

Boite <String> boiteContenuString = new Boite<>("Bijoux");

        System.out.println(boiteContenuString.getContenu());
        String contenuString = boiteContenuString.getContenu();
        System.out.println("Contenu de la boite String :"+contenuString);
        boiteContenuString.setContenu("argent");
        System.out.println("NOUVEAU Contenu de la boite String :"+boiteContenuString.getContenu());

        // Boite pour un objet Double

Boite <Double> boiteContenuDouble = new Boite<>(200.5);
        System.out.println("Contenu de la boite DOUBLE :"+contenuString);
        System.out.println("\n ou Contenu de la boite DOUBLE :"+boiteContenuDouble.getContenu());
        System.out.println("\n ou Contenu de la boite DOUBLE :"+boiteContenuDouble.toString());


        // Boite pour un objet CHAT

Boite<Chat> contenuChat = new Boite<Chat>(new Chat ("fifi",2,"bleus",4));
        System.out.println("\n ou Contenu de la boite CHAT :"+contenuChat.toString());
            System.out.println("\n ou Contenu de la boite CHAT :"+contenuChat.getContenu());


        // Boite pour un objet CHIEN

       Boite<Chien> boiteChien = new Boite<>(new Chien("toto",5,"gris"));

            System.out.println("\n ou Contenu de la boite CHIEN :" + boiteChien.getContenu());
            System.out.println("\n ou Contenu de la boite CHIEN :" + boiteChien.toString());
    }
}
