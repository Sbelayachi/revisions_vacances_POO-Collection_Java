


package org.example.exercices.joueur;

public class Main {
    public static void main(String[] args) {

        Joueur warriorDu59 = new Joueur("WarriorDu59", 1, 0);
        for (int i = 1; i <= 20; i++) {
            warriorDu59.effectuerUneQuete(10);
            System.out.println("Le joueur WarriorDu59 effectue la quête" + i + " : " + warriorDu59.getPointExperience());

            if (warriorDu59.getPointExperience() >= 100) {
warriorDu59.augmenterReinitialiserNiveau();
            System.out.println("Le joueur WarriorDu59 passe au  niveau " + (warriorDu59.getNiveau()));

            }
        }

    }
}

//        Joueur joueur1 = new Joueur("Saliha",1,80);
//
//        joueur1.effectuerUneQuete(10);
//
//        System.out.println(joueur1);
//
//        joueur1.effectuerUneQuete(10);
//
//        System.out.println(joueur1.toString());
//
//        joueur1.effectuerUneQuete(10);
//
//        System.out.println(joueur1);
//
//joueur1.augmenterReinitialiserNiveau();
//        System.out.println("Joueur " + joueur1.getNom() + " -- Niveau : "+joueur1.getNiveau() + " -- Experience : "+joueur1.getPointExperience() +" Points");
//    }
//}
