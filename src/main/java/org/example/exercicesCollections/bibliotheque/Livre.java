//  ========== Exercice BIBLIOTHÈQUE =============

//Créer une classe "Livre" avec les attributs suivants : titre, auteur, nombre de pages et estEmprunté (par défaut false)
//Ajouter un constructeur, des getters et des setters pour ces attributs
//Créer une méthode pour afficher les informations sur le livre et une autre pour changer l'état d'emprunt
//Créer une classe "Bibliothèque" avec un tableau de "Livre" et les méthodes suivantes :
//Ajouter un livre à la collection
//Supprimer un livre de la collection
//Afficher la liste de tous les livres
//Emprunter un livre (changer l'état d'emprunt à true)
//Retourner un livre (changer l'état d'emprunt à false)
//Utiliser la classe "Bibliothèque" pour créer une bibliothèque avec plusieurs livres et afficher la liste de tous les livres
//Emprunter et retournez un livre, puis affichez à nouveau la liste de tous les livres pour vérifier que l'état d'emprunt a bien été modifié

package org.example.exercicesCollections.bibliotheque;

public class Livre {
//Créer une classe "Livre" avec les attributs suivants : titre, auteur, nombre de pages et estEmprunté (par défaut false)

    private String titre;
    private String auteur;
    private int nombrePages;
    private boolean estEmprunte;

    //Ajouter un constructeur, des getters et des setters pour ces attributs
    // CONSTRUCTEUR
    public Livre(String titre, String auteur, int nombrePages, boolean estEmprunte)
    {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.estEmprunte = estEmprunte;
    }


    // GETTER - SETTER

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public boolean isEstEmprunte() {
        return estEmprunte;
    }

    public void setEstEmprunte(boolean estEmprunte) {
        this.estEmprunte = estEmprunte;
    }


    //Créer une méthode pour afficher les informations sur le livre et une autre pour changer l'état d'emprunt


    @Override
    public String toString() {
        return "Caractéristiques du Livres " +
                "\n ==> Titre='" + titre +
                "\n ==> Auteur='" + auteur + '\'' +
                "\n ==> NombrePages=" + nombrePages +
                "\n ==> EstEmprunté=" + estEmprunte;
    }

    public void affcherInfoLivre() {
        System.out.println(
                "Caractéristiques du Livres " +
                        "\n ==> Titre='" + titre +
                        "\n ==> Auteur='" + auteur + '\'' +
                        "\n ==> NombrePages=" + nombrePages +
                        "\n ==> EstEmprunté=" + estEmprunte);
    }

    public void changeStatus(){
        this.estEmprunte = !this.estEmprunte;
    }


}