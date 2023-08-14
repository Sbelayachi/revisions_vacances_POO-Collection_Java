//====== Exercice L'hôtel =======
//==> Sujet
//Créer une classe Client possédant : un identifiant, un nom, un prénom et un numéro de téléphone
//Créer une classe Chambre ayant : un numéro, un statut, un nombre de lits et un tarif.
//Créer une classe Réservation possédant : un identifiant, un statut , une liste de chambres et un client
//Créer une classe Hotel comportant : une liste de clients, une liste de chambres et une liste de réservations
//Créer une IHM pour tester l'application




package org.example.exercicesCollections.hotel;

//Créer une classe Client possédant : un identifiant, un nom, un prénom et un numéro de téléphone
public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;

// Constructor
    public Customer(int customerId,String firstName, String lastName, String phoneNumber) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // Getter-Setter (=> attributs privés)

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    // Affichage


    @Override
    public String toString() {
        return "\n Details of the CUSTOMER : " +
                "\n ==> Customer Identifier = " + customerId +
                "\n ==> FirstName = " + firstName + '\'' +
                "\n ==> LastName = " + lastName +
                "\n ==> PhoneNumber = " + phoneNumber ;
    }


    public void printCustomer() {
        System.out.println("=====================================================================================================\n" +
                "Details of the CUSTOMER : " +
                "\n ==> Customer Identifier = " + customerId +
                "\n ==> FirstName = " + firstName + '\'' +
                "\n ==> LastName = " + lastName +
                "\n ==> PhoneNumber = " + phoneNumber + "\n=========================================================================");
    }
}





