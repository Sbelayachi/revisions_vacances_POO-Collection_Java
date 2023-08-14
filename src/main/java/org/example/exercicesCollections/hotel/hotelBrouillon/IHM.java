//////==> Sujet
//////Créer une classe Client possédant : un identifiant, un nom, un prénom et un numéro de téléphone
//////Créer une classe Chambre ayant : un numéro, un statut, un nombre de lits et un tarif.
//////Créer une classe Réservation possédant : un identifiant, un statut , une liste de chambres et un client
//////Créer une classe Hotel comportant : une liste de clients, une liste de chambres et une liste de réservations
//////Créer une IHM pour tester l'application
//
//package org.example.exercicesCollections.hotel.hotelBrouillon;
//
//import java.util.Scanner;
//
//public class IHM {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        Hotel hotel = new Hotel();
//
//        System.out.println("Quel est le nom de l'hôtel ? ");
//        String hotelNameEnter = scanner.nextLine();
//        System.out.println("Quel est le nom de l'hôtel ? " + hotelNameEnter);
//        System.out.println(hotelNameEnter + " crée avec succès ! ");
//
//        // ---------------- 1) Création HOTEL avec 1 nombre aléatoire de chb + lits + prix aléatoire--------------------------
//
//// Générer un nombre de chambres aléatoire
//                int nombreChambresAleatoire = (int) (Math.random()*100);
//                int nombreLitsAleatoire = (int) (Math.random()*100);
//                double prixAleatoire = (double) ((Math.random()*100));
//
//                System.out.println("\nHotel crée avec " + nombreLitsAleatoire);
//
//// Ajouter chambres aléatoires à l'hotel
//
//for (int i=1;i<=nombreChambresAleatoire;i++)
//        {
//            Room roomAleatoire = new Room( i,true,nombreLitsAleatoire,prixAleatoire);
//            hotel.ajouterChambre(roomAleatoire);
//        }
//
//// Afficher l'hotel
//        System.out.println(hotel);
//
//
//
//
//    }}