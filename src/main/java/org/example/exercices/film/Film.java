//  =====   Exercice : Film  =====

//  =====   SLIDE  22 =====

// 1. Créer une classe "Film"
//2. Ajouter les attributs suivants : titre, réalisateur, année de sortie et genre
//3. Ajouter un constructeur, des getters et des setters pour ces attributs, ainsi qu'une méthode pour afficher les informations
//   sur le film

//Film{titre='La Haine', realisateur='Mathieu Kassovitz', dateSortie=1995-05-31, genre='Drame'}
//Film{titre='Avatar 2', realisateur='James Cameron', dateSortie=2022-12-14, genre='Action'}

package org.example.exercices.film;

import java.time.LocalDate;

public class Film {

    private final String titre;
    private final String realisateur;
    private final LocalDate dateDeSortie;
    private final String genre;

// Constructeur

    public Film(String titre, String realisateur, LocalDate dateDeSortie, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.dateDeSortie = dateDeSortie;
        this.genre = genre;
    }


// Getter and Setter (accesseurs/mutateurs)


    public String getTitre() {
        return titre;
    }

///    public void setTitre(String titre) {
//        this.titre = titre;
//    }

    public String getRealisateur() {
        return realisateur;
    }

///    public void setRealisateur(String realisateur) {
//        this.realisateur = realisateur;
//    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

///    public void setDateDeSortie(LocalDate dateDeSortie) {
//        this.dateDeSortie = dateDeSortie;
//    }

    public String getGenre() {
        return genre;
    }

//    public void setGenre(String genre) {
//        this.genre = genre;
//    }


    // methode toString


    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", realisateuur='" + realisateur + '\'' +
                ", dateDeSortie=" + dateDeSortie +
                ", genre='" + genre + '\'' +
                '}';
    }
}