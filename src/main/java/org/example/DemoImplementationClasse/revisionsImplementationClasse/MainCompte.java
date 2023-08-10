//Exemple d’implémentation d’une classe

//    ========= DIAPO 11 =========


package org.example.DemoImplementationClasse.revisionsImplementationClasse;

public class MainCompte {
    public static void main(String[] args) {

        //Création d'objet(s) AVEC CONSTRUCTEUR
//        Compte c1 = new Compte(500.f,1);
//        Compte c2=new Compte(-12,12);

        //Création d'objet(s) SANS CONSTRUCTEUR
  Compte c1 = new Compte();
  Compte c2=new Compte();
  c1.setCode(6);
c1.setSolde(6000);
        //Instanciation/application méthode(s) à l(objet(s)

/// INSTANCCIER  = APPLLIQUER METHODE RETIRER
//
//        c1.retirer(150.00f);
//        c1.verser(250.20f);
//        c1.setCode(3);
/////

c1.retirer(500);
c1.verser(60);
        System.out.println(c1);
        System.out.println("code = " + c1.getCode());
        System.out.println("solde =" + c1.getSolde());




//        c1.setSolde(500000.f);
//        System.out.println("solde final=" +c1.getSolde());



    }
}
