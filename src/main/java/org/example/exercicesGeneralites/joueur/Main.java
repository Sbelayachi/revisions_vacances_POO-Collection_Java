package org.example.exercicesGeneralites.joueur;

public class Main {
    public static void main(String[] args) {

        Joueur warriorDu59 = new Joueur("WarriorDu59");

        for (int i = 1; i <= 21; i++) {
            warriorDu59.effectuerUneQuete();
            System.out.println("Le joueur WarriorDu59 effectue la quête" + i + " : " + " (Rappel : votre experience a atteint : "+warriorDu59.getPointExperience()+" )");


                if (i%10==0)
                {
                    warriorDu59.augmenterNiveauInitialiserExp();
                    System.out.println("Le joueur WarriorDu59 passe au  niveau " + (warriorDu59.getNiveau()+1));
        }}

        String ancienNom = warriorDu59.getNom();
        warriorDu59.setNom("LeGigaBossDuJava ");
        System.out.println(ancienNom + " change de pseudo : " + warriorDu59.getNom());
    }}


//         ==== tests ===
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
//        joueur1.augmenterReinitialiserNiveau();
//        System.out.println("Joueur " + joueur1.getNom() + " -- Niveau : "+joueur1.getNiveau() + " -- Experience : "+joueur1.getPointExperience() +" Points");
//    }
//}
