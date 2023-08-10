//        // Instanciation d'objets ==>  ex : compte1, compte2


package org.example.demo.ExpleImplementationDuneClasse;

public class Application {
    public static void main(String[] args) {

        // Instanciation d'un objet compte 1

        Compte compte1= new Compte(1,6000.f);
        System.out.println("===> COMPTE N°1 _ état initial : "+compte1.toString());

        // Instanciation d'un objet compte 2
        Compte compte2= new Compte(2,6000.f);
        System.out.println("===> COMPTE N°2 _ état initial : "+compte2.toString());


        // Pour executer une méthode d'instance , il suffit de faire : ===>  objet.methode(<paramétres>)

        // Exemple 1 : instancier la methode retirer aux objets comptes 1 et compte2
        compte1.retirer(203.569f);
        compte2.retirer(600.f);
        System.out.println("\nAprès la méthodes 1) RETIRER 203.569 euros, l'état du COMPTE N°1 est :\n" + compte1.toString());
        System.out.println("\nAprès la méthodes 1) RETIRER 600 euros, l'état du COMPTE N°2 est :\n" + compte2.toString());

        // Exemple 2 : instancier la methode verser aux objets comptes 1 et compte2

        compte1.verser(958.6f);
        compte2.verser(10000.f);
        System.out.println("\nAprès la méthodes 1) RETIRER 203.569 euros, l'état du COMPTE N°1 est :\n" + compte1.toString());
        System.out.println("\nAprès la méthodes 1) RETIRER 600 euros, l'état du COMPTE N°2 est :\n" + compte2.toString());

        // Exemple 3 : instancier la methode verser aux objets comptes 1 et compte2

        compte1.retirer(100.56f);
        compte2.retirer(1000.0f);
        compte1.verser(20);
        compte2.verser(200_000);

        System.out.println("\nAprès les méthodes 1) RETIRER 156.56 euros puis 2) VERSER 20 euros, l'état du COMPTE N°1 est :\n" + compte1.toString());
        System.out.println("\nAprès les méthodes 1) RETIRER 1000.0 euros puis 2) VERSER 200 000 euros, l'état du COMPTE N°2 est :\n" + compte2.toString());



    }
}
