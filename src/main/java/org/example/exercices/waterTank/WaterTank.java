//////  =====   Exercice : Joueur  =====
////
//////  =====   SLIDE  25 =====

//1. Créer une classe WaterTank
//2. Ajouter les attributs suivants: poids à vide, capacité maximale, niveau de remplissage
//3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne
//4. Créer une méthode vider() qui enlèvera un volume d'eau à la citerne
//5. Créer un attribut de classe qui contiendra la totalité des volumes d'eau de la citerne
//6. /!\ le volume d'eau d'une citerne ne peut pas être négatif ou dépasser le volume maximum

package org.example.exercices.waterTank;

public class WaterTank {

    private double poidsAvide;
    private double capaciteMaximale;
    private double niveauRemplissage;

    private static double totaliteVolumescCiternes;

    //constructeur
    public WaterTank(double poidsAvide, double capaciteMaximale, double niveauRemplissage) {
        this.poidsAvide = poidsAvide;
        this.capaciteMaximale = capaciteMaximale;
        this.niveauRemplissage = niveauRemplissage;
    }

    @Override
    public String toString() {
        return "WaterTank {" +
                "\n==> Poids à vide = " + poidsAvide +
                "\n==> Capacité Maximale (Volume max) = " + capaciteMaximale +
                "\n==> Niveau de Remplissage  = " + niveauRemplissage +
                "\n}";
    }


//3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne

    public void remplir(double volume) {

        if (niveauRemplissage > capaciteMaximale) {
            System.out.println("ATTENTION !!! La Cuve est déja pleine - Capacité maximum atteinte \n==> VOUS NE POUVEZ PAS REMPLIR");

        } else if (niveauRemplissage + volume > capaciteMaximale) {
            System.out.println("\nATTENTION !!! Dépassement de volume : ");
            double capaciteLibre ,reste;
            capaciteLibre=capaciteMaximale-niveauRemplissage;
            reste = volume-capaciteLibre;
            niveauRemplissage += capaciteLibre;
            System.out.println("\nIl reste une capacité "+capaciteLibre+ " litres libres dans la cuve");
            System.out.println("Si vous versez ce volume  (+ "+volume+" litres),  \n ===> le surplus de " + reste + "litres pourrait générer UN DEBORDEMENT (de "+reste+" litres)");
        }

         if (niveauRemplissage < capaciteMaximale)
         {
             if ((niveauRemplissage+volume)<capaciteMaximale)
             {
            System.out.println("REMPLISSAGE");
            niveauRemplissage += volume;
             }}
    }

    public WaterTank(double poidsAvide) {
        this.poidsAvide = poidsAvide;
    }

    //3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne
    public void retirer (double volume2) {

    if (niveauRemplissage > volume2 && (niveauRemplissage-volume2)>0 )
    {
        System.out.println(" RETRAIT POSSIBLE DE ( " + volume2 + "litres) :");
        this.niveauRemplissage -= volume2;
    }
        else if (niveauRemplissage < volume2 || (niveauRemplissage-volume2)>0)
        {
            System.out.println("ATTENTION : \n==> le volume à retirer est supérieur au volume restant");
            double possibiteDeRetrait, surplusRetrait;
            possibiteDeRetrait = niveauRemplissage;
            surplusRetrait = (volume2 - possibiteDeRetrait);
            System.out.println("sur les : " + volume2 + " A retirer, vous pourrez retirer que : " + possibiteDeRetrait + " litres, au maximum");
            System.out.println("Les reste : ==> " + surplusRetrait + " litres, ne porront pas être retirés tant que la cuve est à ce niveau ( " + niveauRemplissage + " litres) ");
            niveauRemplissage=0;
        }


        //5. Créer un attribut de classe qui contiendra la totalité des volumes d'eau de la citerne




    }
}





