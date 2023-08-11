package org.example.exercices.waterTank;

public class Main {
    public static void main(String[] args) {

WaterTank waterTank1=new WaterTank(150,500,200.50);
        System.out.println(waterTank1);
        System.out.println();

////    ===================== Instanciation Methode ==> REMPLIR ==========================

        waterTank1.remplir(400);
        System.out.println(waterTank1);

WaterTank waterTank2=new WaterTank(150,180,100);

        waterTank2.remplir(50);
        System.out.println(waterTank2);

        waterTank2.remplir(50);
        System.out.println(waterTank2);

        waterTank2.remplir(50);
        waterTank2.remplir(50);
        waterTank2.remplir(50);

        System.out.println(waterTank2);


        /// =============== Instanciation Méthode RETIRER

        WaterTank waterTank5=new WaterTank(50,500,150);

        waterTank5.retirer(50);
        System.out.println(waterTank5);
        waterTank5.retirer(50);
        System.out.println(waterTank5);
        waterTank5.retirer(100);
        System.out.println(waterTank5);
    }
}
