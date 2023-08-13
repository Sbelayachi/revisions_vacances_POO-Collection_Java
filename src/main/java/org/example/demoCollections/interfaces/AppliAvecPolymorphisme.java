package org.example.demoCollections.interfaces;

public class AppliAvecPolymorphisme {
    public static void main(String[] args) {

        Cercle cercle1 = new Cercle("Cercle toto", 10.5);
        Cercle cercle2 = new Cercle("Cercle tutu", 25.3);
        Cercle cercle3 = new Cercle("Cercle titi", 52.36);
        Cercle cercle4 = new Cercle("Cercle tata", 3.5);

        Rectangle rectangle1 = new Rectangle("rectangle carré", 12.5, 12.5);
        Rectangle rectangle2 = new Rectangle("rectangle classique", 30.6, 15.3);

        cercle1.afficherForme();
        cercle1.afficherCercle();
        System.out.println("Mon aire est la suivante " + Math.round(cercle1.calculerAire()) + " cm2");
        System.out.println("Mon périmètre est le suivant " + Math.round(cercle1.calculerPerimetre()) + " cm\n");


        rectangle1.afficherRectangle();
        rectangle1.afficherForme();
        System.out.println("Mon aire est la suivante " + Math.round(rectangle1.calculerAire()) + " cm2");
        System.out.println("Mon périmètre est le suivant " + Math.round(rectangle1.calculerPerimetre()) + " cm");
        System.out.println();


        ////   =====  Utilisation du polymorphisme avec un tableau de FORMES =====
        System.out.println("tableau de FORMES\n");

        Forme[] formes = {rectangle2, cercle2};

        for (Forme forme : formes) {
            forme.afficherForme();
            System.out.println("------------------------------------------------------------------------------------------------");
        }


//   =====  Utilisation du polymorphisme avec un tableau de CERCLES =====
        System.out.println("TABELAU DE CERCLES \n");
        Cercle[] cercles = {cercle1, cercle2, cercle3, cercle4};

        for (int i = 0; i < cercles.length; i++) {
            System.out.println(cercles[i].toString() + " N° " + i + " ;  aire : " + cercles[i].calculerAire());
//            cercles[i].afficherForme();
//            cercles[i].afficherCercle();
            System.out.println("------------------------------------------------------------------------------------------------");
        }


        // Utilisation du polymorphisme pour CALCULER aire totale de mes formes

        System.out.println("aire totale de mes forme\n");

        Calculable[] formes2 = {rectangle2, cercle2};

        double aireTotaleForme = 0;
//
//        for (Calculable forme : formes2) {
//            aireTotaleForme += forme.calculerAire();
//        }
//        System.out.println("\n =========> Aire totale des formes 2 : "+ aireTotaleForme);
//    }

        System.out.println();


        // Utilisation du polymorphisme pour AFFICHER formes
        System.out.println("aire totale de mes formes\n");

        for (Calculable forme : formes2) {
            if (forme instanceof Forme) {
                // Cast
                ((Forme) forme).afficherForme();
                System.out.println("########################");
            }
            System.out.println();

            // Utilisation du polymorphisme pour calculer aire totale de mes cercles
            System.out.println("aire totale de mes cercles\n");
            Calculable[] circles = {cercle1, cercle2, cercle3, cercle4};

            for (Calculable circle : circles)
                if (circle instanceof Forme) {
                    ((Forme) circle).afficherForme();
                    ((Forme) circle).calculerAire();
                    ((Forme) circle).calculerPerimetre();
                }
        }
    }}
