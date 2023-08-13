package org.example.exercicesGeneralites.film;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


//Film{titre='La Haine', realisateur='Mathieu Kassovitz', dateSortie=1995-05-31, genre='Drame'}
//Film{titre='Avatar 2', realisateur='James Cameron', dateSortie=2022-12-14, genre='Action'}

        Film film1=new Film("La Haine","Mathieu Kassovitz", LocalDate.of(1995,05,31),"Drame");
        Film film2=new Film("Avatar 2","James Cameron",LocalDate.of(2022,12,14),"Action");


        System.out.println("AFFICHAGE 1 du film LA HAINE\n");
        System.out.println(film1);
        System.out.println(film1.toString());
        System.out.println("\n Je suis le film " + film1.getTitre()+" de " + film1.getRealisateur()+ ", sortie en "+film1.getDateDeSortie()+ ", je suis un film du genre : "+film1.getGenre());

        System.out.println("AFFICHAGE 1 du film LA AVATAR2\n");
        System.out.println(film2);
        System.out.println(film2.toString());
        System.out.println("\n Je suis le film " + film2.getTitre()+" de " + film2.getRealisateur()+ ", sortie en "+film2.getDateDeSortie()+ ", je suis un film du genre : "+film2.getGenre());

    }}