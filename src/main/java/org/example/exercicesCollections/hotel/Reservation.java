////====== Exercice L'hôtel =======
////==> Sujet
////Créer une classe Client possédant : un identifiant, un nom, un prénom et un numéro de téléphone
////Créer une classe Chambre ayant : un numéro, un statut, un nombre de lits et un tarif.
////Créer une classe Réservation possédant : un identifiant, un statut , une liste de chambres et un client
////Créer une classe Hotel comportant : une liste de clients, une liste de chambres et une liste de réservations
////Créer une IHM pour tester l'application


package org.example.exercicesCollections.hotel;


import java.util.ArrayList;
import java.util.List;

public class Reservation {

    ////Créer une classe Réservation possédant : un identifiant, un statut , une liste de chambres et un client

    // ATTRIBUTS

    private int reservationId;
    private boolean reservationStatus;

    private List<Room> rooms ;
    private Customer customer;


    // CONSTRUCTOR

    public Reservation(int reservationId, boolean reservationStatus, List<Room> rooms, Customer client) {
        this.reservationId = reservationId;
        this.reservationStatus = reservationStatus;
        this.rooms = rooms = new ArrayList<Room>();
        this.customer = client;
    }

    // GETTER and SETTER (attributs privés)

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public boolean isReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus() {
        this.reservationStatus = reservationStatus;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    // méthodes d'affichage

    @Override
    public String toString() {
        return "Details of the Reservation" +
                "\n ==> Reservation Number (id.) = " + reservationId +
                "\n ==> Status of the reservation is : = " + reservationStatus +
                "\n ==> Details of Rooms = " + rooms +
                "\n => Details of client = " + customer +
                '}';
    }

    public void printReservation() {
        System.out.println("\n" +
                "\nDetails of the Reservation" +
                "\n ==> Reservation Number (id.) = " + reservationId +
                "\n ==> Status of the reservation is : = " + reservationStatus +
                "\n ==> Details of Rooms = " + rooms +
               "\n => Details of client = " + customer + "\n===================================================================================================== ");
    }
}