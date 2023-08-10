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

    public WaterTank(double poidsAvide, double capaciteMaximale, double niveauRemplissage) {
        this.poidsAvide = poidsAvide;
        this.capaciteMaximale = capaciteMaximale;
        this.niveauRemplissage = niveauRemplissage;
    }


    @Override
    public String toString() {
        return "WaterTank{" +
                "poidsAvide=" + poidsAvide +
                ", capaciteMaximale=" + capaciteMaximale +
                ", niveauRemplissage=" + niveauRemplissage +
                '}';
    }


//3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne


    public void remplir(double volume) {

        if (niveauRemplissage < capaciteMaximale) {
            this.niveauRemplissage += volume;
        }

        else if (niveauRemplissage > capaciteMaximale) {

            double depassement;
            depassement = (this.niveauRemplissage - capaciteMaximale) + volume;
            System.out.println("attention !!! dépassement de volume " + depassement + " litres");
        }
    }
}
//    public void vider (double volume)
//    {
//        this.niveauRemplissage-=volume;
//    }
//


//    public void setNiveauRemplissage(double niveauRemplissage) {
//        this.niveauRemplissage = niveauRemplissage;
//    }


// ========== Constructeur ===============





        // ========== toString ===============





