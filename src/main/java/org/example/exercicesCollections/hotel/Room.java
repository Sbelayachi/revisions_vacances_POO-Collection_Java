//====== Exercice L'hôtel =======
//==> Sujet
//Créer une classe Client possédant : un identifiant, un nom, un prénom et un numéro de téléphone
//Créer une classe Chambre ayant : un numéro, un statut, un nombre de lits et un tarif.
//Créer une classe Réservation possédant : un identifiant, un statut, une liste de chambres et un client
//Créer une classe Hotel comportant : une liste de clients, une liste de chambres et une liste de réservations
//Créer une IHM pour tester l'application

package org.example.exercicesCollections.hotel;

public class Room {
    //Créer une classe Chambre ayant : un numéro, un statut, un nombre de lits et un tarif.

    private int roomNumber;
    public boolean RoomStatus;
    public int numberOfBeds;
    public double rate;


// Constructeur

    public Room(int roomNumber, boolean status, int numberOfBeds, double rate) {
        this.roomNumber = roomNumber;
        this.RoomStatus = status;
        this.numberOfBeds = numberOfBeds;
        this.rate = rate;
    }


// Getter et Setter

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isRoomStatus() {
        return RoomStatus;
    }

    public void setRoomStatus(boolean roomStatus) {
        this.RoomStatus = roomStatus;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    // methode affichage d'une chambre

    ;
    @Override
    public String toString() {
        return "Details of the Chamber" +
                "\n ==> RoomNumber = Room Number : " + roomNumber +
                "\n ==> Status = " + RoomStatus +
                "\n ==> Number Of beds = " + numberOfBeds + "bed(s)"+
                "\n ==> Rate = " + rate + " $";
    }
    public void printRoom() {
        System.out.println("======================================================================================================\n"+
                "Details of the Chamber" +
                "\n ==> RoomNumber = Room Number : " + roomNumber +
                "\n ==> Status = " + RoomStatus +
                "\n ==> Number Of beds = " + numberOfBeds + "bed(s)"+
                "\n ==> Rate = " + rate + " $ \n=====================================================================================");

    }
}