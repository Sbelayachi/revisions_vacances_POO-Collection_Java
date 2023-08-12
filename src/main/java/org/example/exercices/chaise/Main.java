package org.example.exercices.chaise;

public class Main {
    public static void main(String[] args) {

Chaise chaise1=new Chaise(4,"plastique","jaune");
Chaise chaiseVerte=new Chaise(4,"bois","verte");
Chaise chaiseCuir=new Chaise(4,"cuir","noire");

        System.out.println("AFFICHAGE 1 de la chaise verte : " +chaiseVerte);
///        System.out.println("\n AFFICHAGE 2 de la chaise verte : \n"+chaiseVerte.toString());
///        System.out.println("\n AFFICHAGE 3 de la chaise verte : ");
//        chaiseVerte.afficher();

        System.out.println("AFFICHAGE 1 de la chaise 1 : " +chaise1);
///        System.out.println("\n AFFICHAGE 2 de la chaise 1 :\n  "+chaise1.toString());
///        System.out.println("\n AFFICHAGE 3 chaise 1 : ");
//         chaise1.afficher();


        System.out.println("\n AFFICHAGE 2 de chaise en cuir: "+chaiseCuir);
///        System.out.println("\n AFFICHAGE 2 de la chaise en cuir :\n  "+chaiseCuir.toString());
///        System.out.println("\n AFFICHAGE 3 de la chaise en cuir  : ");
//        chaiseCuir.afficher();



    }
}
