package org.example.exercices.chaise;

public class Main {
    public static void main(String[] args) {

Chaise chaise1=new Chaise(4,"plastique","jaune");
Chaise chaiseVerte=new Chaise(4,"bois","verte");
Chaise chaiseCuir=new Chaise(4,"cuir","noire");

        System.out.println("AFFICHAGE 1 chaise verte : " +chaiseVerte);
        System.out.println("\n AFFICHAGE 2 chaise verte: "+chaiseVerte);
        System.out.println("\n AFFICHAGE 3 chaise verte : ");
        chaiseVerte.afficher();

        System.out.println("AFFICHAGE 1 chaise 1 : " +chaise1);
        System.out.println("\n AFFICHAGE 2 chaise 1: "+chaise1);
        System.out.println("\n AFFICHAGE 3 chaise 1 : ");
        chaise1.afficher();

        System.out.println("AFFICHAGE 1 chaise cuir : " +chaiseCuir);
        System.out.println("\n AFFICHAGE 2 chaise cuir: "+chaiseCuir);
        System.out.println("\n AFFICHAGE 3 chaise cuir : ");
        chaiseCuir.afficher();

    }
}
