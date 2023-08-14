package org.example.exercicesCollections.hotelFinal;

import java.util.Scanner;

public class Ihm {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        System.out.println("Quel est le nom de l'hôtel ? ");
        String hotelNameEnter = scanner.nextLine();
        System.out.println("Quel est le nom de l'hôtel ? " + hotelNameEnter);
        System.out.println(hotelNameEnter + " crée avec succès ! ");

        // ---------------- 1) Création HOTEL avec 1 nombre aléatoire de chb + lits + prix aléatoire--------------------------

// Générer un nombre de chambres aléatoire
        int nombreChambresAleatoire = (int) (Math.random()*100);
        int nombreLitsAleatoire = (int) (Math.random()*100);
        double prixAleatoire = (double) ((Math.random()*100));

        System.out.println("\nHotel crée avec " + nombreLitsAleatoire);

// Ajouter chambres aléatoires à l'hotel

        for (int i=1;i<=nombreChambresAleatoire;i++)
        {
            Room roomAleatoire = new Room( i,true,nombreLitsAleatoire,prixAleatoire);
            hotel.ajouterChambre(roomAleatoire);
        }

// Afficher l'hotel
        System.out.println(hotel);
        System.out.println("hotel crée avec " +nombreChambresAleatoire+ " chambres");

    }}
