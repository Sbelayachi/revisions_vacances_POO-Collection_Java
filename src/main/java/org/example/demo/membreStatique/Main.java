package org.example.demo.membreStatique;

public class Main {
    public static void main(String[] args) {

    Compte c1= new Compte(6000);
        System.out.println(c1);
        System.out.println();
//        System.out.println(c1.toString());
        System.out.println("\n===== COMPTE 2 =====");
        System.out.println("SOLDE C1 : " + c1.getCode() +" -- CODE C1 : " + c1.getSolde()  + " -- Nombre de comptes "+ c1.getCode())   ;

        Compte c2= new Compte(6000);
        System.out.println();
//        System.out.println(c2.toString());
        System.out.println("SOLDE C2 : " + c2.getCode() +" -- CODE C2 : " + c2.getSolde() ) ;

        c1.verser(100);
        c1.retirer(200);
        System.out.println("nb compte = " +Compte.getNombreCompte());
}}