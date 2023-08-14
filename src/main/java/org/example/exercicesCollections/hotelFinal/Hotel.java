package org.example.exercicesCollections.hotelFinal;

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

    // méthodes pour ajouter et supprimer  des CLIENTS à l'hôtel

    public void ajouterClient(Customer client) {
        customers.add(client);
    }
    public void supprimer(Customer client) {
        customers.remove(client);
    }

    // methode pour afficher liste client
    public List<Customer> getListeClients() {
        return customers;
    }
    // méthodes pour ajouter ou supprimer des CHAMBRES à l'hôtel

    public void ajouterChambre(Room room) {
        rooms.add(room);
    }
    public void supprimerChambre(Room room) {
        rooms.remove(room);
    }



    // méthodes pour ajouter et supprimer des RESERVATIONS à l'hôtel
    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }
    public void supprimerReservation(Reservation reservation) {
        reservations.remove(reservation);
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
