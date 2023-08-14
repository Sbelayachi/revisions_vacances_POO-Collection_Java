package org.example.exercicesCollections.hotelFinal;
public class Room {
//Créer une classe Chambre ayant : un numéro, un statut, un nombre de lits et un tarif.

    private int roomNumber;
    public boolean RoomStatus;
    public boolean roomStatus;
    public int numberOfBeds;
    public double rate;


// Constructeur

    public Room(int roomNumber, boolean roomStatus, int numberOfBeds, double rate) {
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
        this.numberOfBeds = numberOfBeds;
        this.rate = rate;
    }
    // Affichage du statut de la chambre
    public void  printRoomsStatus()
    {
        if (roomStatus)
        {
            System.out.println("Occupée");
        }
        else {System.out.println("Libre");
        }
    }


// Getter et setter


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
        RoomStatus = roomStatus;
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
                "\n ==> Status = " + roomStatus +
                "\n ==> Number Of beds = " + numberOfBeds + "bed(s)" +
                "\n ==> Rate = " + rate + " $";
    }

    public void printRoom() {
                System.out.println("======================================================================================================\n" +
                        "Details of the Chamber" +
                        "\n ==> RoomNumber = Room Number : " + roomNumber +
                        "\n ==> Status = " + roomStatus +
                        "\n ==> Number Of beds = " + numberOfBeds + "bed(s)"+
                        "\n ==> Rate = " + rate + " $ \n=====================================================================================");

    }

}

