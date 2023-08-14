//////==> Sujet
//////Créer une classe Client possédant : un identifiant, un nom, un prénom et un numéro de téléphone
//////Créer une classe Chambre ayant : un numéro, un statut, un nombre de lits et un tarif.
//////Créer une classe Réservation possédant : un identifiant, un statut , une liste de chambres et un client
//////Créer une classe Hotel comportant : une liste de clients, une liste de chambres et une liste de réservations
//////Créer une IHM pour tester l'application
//
//package org.example.exercicesCollections.hotel;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class IHMbrouilon {
//
//    public static void main(String[] args) {
//
//
//
//// ---------------- 1) Révisions--------------------------
//// ---------------- 2) Exercice IHM ===> VOIR LIGNE 118 début de l'exercice--------------------------
//
//
//
//// ---------------- 1) Révisions--------------------------
//
//// Créer des clients
//        Customer customer1 = new Customer(1, "BELAYACHI", "saliha", "0623456789");
//        Customer customer2 = new Customer(2, "MACRON", "Brigitte", "062378456789");
//        Customer customer3 = new Customer(3, "MACRON", "Manu", "0623456789");
////
//////  Ajouter les clients à la liste des clients de l'hôtel :
////        hotel.getCustomers().add(customer1);
////        hotel.getCustomers().add(customer2);
////        hotel.getCustomers().add(customer3);
////
//////        customer2.printCustomer();
//////        System.out.println(hotel.toString());
//////        hotel.prinHotel();
//
//
//// Créer des chambres
//        Room room1 = new Room(22, true, 5, 560.20);
//        Room room2 = new Room(72, true, 2, 400.30);
//        Room room3 = new Room(9, true, 4, 1260.00);
//        Room room4 = new Room(54, true, 1, 500.60);
//        Room room5 = new Room(94, true, 2, 200.00);
//        Room room6 = new Room(641, true, 5, 1000.30);
//        room3.printRoomsStatus();
//
//////  Ajouter des chambres à la liste des chambres de l'hôtel :
////
////        hotel.getRooms().add(room1);
////        hotel.getRooms().add(room2);
////        hotel.getRooms().add(room3);
////        hotel.getRooms().add(room4);
//////        System.out.println(hotel.toString());
////        //room3.printRoom();
//
//
//        // Créer des réservations
//        ////RAPPEL classe Réservation possédant : un identifiant, un statut, une liste de chambres et un client
//
//        List<Room> roomsReservation1 = new ArrayList<>();
//        roomsReservation1.add(room1);
//        Reservation reservation1 = new Reservation(2, true, roomsReservation1, customer2);
//
//
//        List<Room> roomsReservation2 = new ArrayList<>();
//        roomsReservation2.add(room1);
//        Reservation reservation2 = new Reservation(4, true, roomsReservation2, customer2);
//
//        List<Room> roomsReservation3 = new ArrayList<>();
//        roomsReservation3.add(room2);
//        Reservation reservation23 = new Reservation(4, true, roomsReservation3, customer2);
//
//        // Création de l'hôtel
//
//        // AJOUT DES CLIENTS
//        List<Customer> customers = new ArrayList<>();
//        customers.add(customer2);
//        customers.add(customer2);
//        customers.add(customer3);
//
////        // AJOUT DES CHAMBRES
////        List<Room> rooms = new ArrayList<>();
////        rooms.add(room1);
////        rooms.add(room2);
////        rooms.add(room3);
////        rooms.add(room4);
////        rooms.add(room5);
////        rooms.add(room6);
//
////        // AJOUT DES RESERVATIONS
////        List<Reservation> reservations = new ArrayList<>();
////        reservations.add(reservation1);
////        reservations.add(reservation2);
////        reservations.add(reservation3);
//
//
//        // Création de l'hôtel
////        Hotel hotel = new Hotel("Excellsior", customers, roomsReservation1, reservation1.setReservationStatus());
////
////        Hotel hotel = new Hotel("Excellsior", customers, true);
//
////// =========== Affichage des réservations ===============
////
//////        for (Reservation reservation : hotel.getReservations()) {
////
////
////        for (int i = 0; i < hotel.getReservations().size(); i++) {
//////            System.out.println(reservations.get(i));
////            //ou
//////            reservations.get(i).printReservation();
//////        }
//
//
//// ---------------- 2) Exercice IHM --------------------------
//
////   =======         Inviter l'utilisateur à créer un client
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Quel est le nom de l'hôtel ? ");
//        String hotelNameEnter = scanner.nextLine();
//        System.out.println("Quel est le nom de l'hôtel ? " + hotelNameEnter);
//        System.out.println(hotelNameEnter + " crée avec succès ! ");
//        System.out.println("=== Menu Principal\n");
//        System.out.println("1 - Ajouter un client");
//        System.out.println("2 - Afficher la liste des clients");
//        System.out.println("3 - Afficher les réservations d'un client");
//        System.out.println("4 - Ajouter une réservation");
//        System.out.println("5 - Annuler une réservation");
//        System.out.println("6 - Afficher la liste des réservations");
//        System.out.println("0 - Quitter");
//
//        System.out.println("\nSaisir Votre Choix : ");
//        int choix = scanner.nextInt();
//        int idCustomerEnter = (int) Math.floor(Math.random() * 10);
//        scanner.nextLine(); // Vider le scanner
//        Hotel hotel = new Hotel();
//
//        switch (choix) {
//
// ///
//            case 1:
//                System.out.println("=== Ajout d'un client === \n");
//
//                System.out.print("1 - Quel est le nom du client : \n");
//                String firstNameEnter = scanner.nextLine();
//
//                System.out.print("2 - Quel est le nom prénom du client : \n");
//                String lastNameEnter = scanner.nextLine();
//
//                System.out.print("3 - Quel le numéro de téléphone du client : \n");
//                String phoneNumberEnter = scanner.nextLine();
//
//// =======>        Création du client saisi par l'utilisateur :
//                Customer customerEnter = new Customer(idCustomerEnter, firstNameEnter, lastNameEnter, phoneNumberEnter);
//                System.out.print("Client ajouté avec succès \n");
//                hotel.getCustomers().add(customerEnter);
//
////                System.out.println(customerEnter.toString());
//                System.out.println();
//
//
//                break;
//
////=================================================================================================================
//
//            case 2:
//                System.out.println("=== Afficher la liste des clients === \n");
//
//                List<Customer> listeClients = hotel.getListeClients();
//                System.out.println(hotel.getCustomers());
//
//                System.out.println("\nListe des clients :");
////               OU// for (Customer c : listeClients) {
////                    System.out.println("Identifiant : " + c.getCustomerId());
////                    System.out.println("Nom : " + c.getFirstName());
////                    System.out.println("Prénom : " + c.getLastName());
////                    System.out.println("Numéro de téléphone : " + c.getPhoneNumber());
////                    System.out.println();
////                }
//                break;
//
//// =========================================================================================================================
//            case 3:
//                System.out.println("=== Afficher Afficher les réservations d'un client ===");
//                int idReservation = (int) Math.floor(Math.random() * 10);
//
//                Reservation reservation9 = new Reservation(idReservation, true, new ArrayList<>(), customer1);
//                hotel.getReservations().add(reservation1);
//                System.out.println(reservation9);
//                break;
//
//// =========================================================================================================================
//
//            case 4:
//                System.out.println("== Ajouter une réservation == ");
//
//                System.out.print("Identifiant de réservation : ");
//                int identifiantReservation = scanner.nextInt();
//                scanner.nextLine(); // Lire la nouvelle ligne après le nombre entier
//                System.out.print("Statut: ");
//                boolean statutReservation = Boolean.parseBoolean(scanner.nextLine());
//                System.out.print("Nombre de chambres à réserver: ");
//                int nombreChambres = scanner.nextInt();
//
//                List<Room> rooms = new ArrayList<>();
//
//                for (int j = 0; j < nombreChambres; j++) {
//                    System.out.println("----- Chambre " + (j + 1) + " -----");
//                    System.out.print("Numéro: ");
//                    int numeroChambre = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.print("Statut: ");
//                    boolean statutChambre = Boolean.parseBoolean(scanner.nextLine());
//                    System.out.print("Nombre de lits: ");
//                    int nombreLits = scanner.nextInt();
//                    System.out.print("Tarif: ");
//                    double tarif = scanner.nextDouble();
//
//                    Room chambre = new Room(numeroChambre, statutChambre, nombreLits, tarif);
//                    rooms.add(chambre);
//
//                }
//                Reservation reservationEnter = new Reservation(identifiantReservation, statutReservation, rooms, customer3);
//                hotel.ajouterReservation(reservationEnter);
//                System.out.println(reservationEnter);
//
//                break;
//
//// =========================================================================================================================
//
//            case 5:
//                System.out.println();
//                System.out.println("=== Annuler une réservation === \n");
//                System.out.print("Identifiant de réservation: ");
//                int identifiantResaAnnulation = scanner.nextInt();
//
//
//                // Supprimer la resa à l'indice i de l'hotel
////               hotel.getReservations().remove(1);
//
//                // SUPPRIMER LA DERNIERE Résa
//                List<Reservation> reservations = new ArrayList<>();
//                Reservation reservation6 = new Reservation(12, true, new ArrayList<>(), customer1);
//                Reservation reservation7 = new Reservation(14, false, new ArrayList<>(), customer2);
//                Reservation reservation8 = new Reservation(14, false, new ArrayList<>(), customer2);
//
//
//                // Supprimer la dernière résa
//                if (reservations.size() > 0) {
//                    System.out.println(reservations.size());
//                    hotel.getReservations().remove(reservations.size() - 1);
//                    System.out.println(reservations.size());
//                }
//
//                // Supprimer la dernière à l'indice 1
//                hotel.getReservations().remove(1);
//                System.out.println(reservations.size());
//
//                break;
//
////=====================================================================================================================
//            // TODO: 14/08/2023 ne fonctionne pas voir exception = erreur
//
//            case 6:
//                System.out.println("6 - Afficher la liste des réservations");
//                System.out.println("Liste des réservations : ");
//                for (Reservation reservation : hotel.getReservations()) {
//                    System.out.println("Réservation " + reservation.getReservationId() + " - Statut : " + reservation.isReservationStatus());
//                    System.out.println("Client : " + reservation.getCustomer().toString());
//                    System.out.println("Chambres réservées : ");
//
//                    for (Room chambre : reservation.getRooms()) {
//                        System.out.println("Numéro : " + chambre.getRoomNumber() + " - Statut : " + chambre.isRoomStatus() +
//                                " - Nombre de lits : " + chambre.getRoomNumber() + " - Tarif : " + chambre.getRate());
//                    }}
//                    System.out.println("--------------------------------");
//                    break;
//// =========================================================================================================================
//            case 0:
//                System.out.println("0 - Quitter");
//                scanner.close();
//                break;
//
//// =========================================================================================================================
//
//            default:
//                System.out.println("Choix invalide. Veuillez réessayer.");
//                break;
//                }
//}
//}
////        System.out.print("Entrez l'identifiant du client : ");
////        int customerId = scanner.nextInt();
////        scanner.nextLine();
////
////        System.out.print("Entrez le nom du client : ");
////        String firstName = scanner.nextLine();
////
////        System.out.print("Entrez le prénom du client : ");
////        String lastName = scanner.nextLine();
////
////        System.out.print("Entrez le numéro de téléphone du client : ");
////        String phoneNumber = scanner.nextLine();
////
////        // Création du client crée par l'utilisateur :
////        Customer client = new Customer(customerId, firstName, lastName, phoneNumber);
////
//////        client.printCustomer();
//
//
