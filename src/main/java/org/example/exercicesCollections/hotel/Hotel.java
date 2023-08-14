//====== Exercice L'hôtel =======
//==> Sujet
//Créer une classe Client possédant : un identifiant, un nom, un prénom et un numéro de téléphone
//Créer une classe Chambre ayant : un numéro, un statut, un nombre de lits et un tarif.
//Créer une classe Réservation possédant : un identifiant, un statut , une liste de chambres et un client
//Créer une classe Hotel comportant : une liste de clients, une liste de chambres et une liste de réservations
//Créer une IHM pour tester l'application

package org.example.exercicesCollections.hotel;

import java.util.List;

public class Hotel {

    private String hotelName;
    private List<Customer> customers;
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel(String hotelName, List<Customer> customers, List<Room> rooms, List<Reservation> reservations) {
        this.hotelName = hotelName;
        this.customers = customers;
        this.rooms = rooms;
        this.reservations = reservations;
    }

    // CONSTRUCTEUR vide
    public Hotel() {

    }

    // méthodes pour ajouter des CLIENTS à l'hôtel
    public void ajouterClient(Customer client) {
        customers.add(client);
    }

    // méthodes pour ajouter des CHAMBRES à l'hôtel
    public void ajouterChambre(Room room) {
        rooms.add(room);
    }

// methode pour afficher liste client
    public List<Customer> getListeClients() {
        return customers;
    }
    // méthodes pour ajouter des RESERVATIONS à l'hôtel
    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void prinHotel() {
        System.out.println(
                "======================================================================================================\n"+
                "Details of the HOTEL " +
                "\n ==> Name = " + hotelName +
                "\n ==> Customers = " + customers +
                "\n ==> Rooms = " + rooms +
                "\n ==> Reservations=" + reservations + " \n=====================================================================================");
    }

    // Getter et Setter


    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }



    // AFFICHER HOTEL

    @Override
    public String toString() {
        return "Hotel{" +
                "\n ==> Name = " + hotelName +
                "\n ==> Customers = " + customers +
                "\n ==> Rooms = " + rooms +
                "\n ==> Reservations = " + reservations +
                '}';


    }}