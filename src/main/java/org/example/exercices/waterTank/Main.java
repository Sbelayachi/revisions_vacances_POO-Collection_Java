package org.example.exercices.waterTank;

public class Main {
    public static void main(String[] args) {

WaterTank waterTank1=new WaterTank(150,500,200.50);
        System.out.println(waterTank1);
        System.out.println();

// Instanciation Methode ==> REMPLIR
        waterTank1.remplir(400);
        System.out.println(waterTank1.toString());

WaterTank waterTank2=new WaterTank(150,180,100);

        waterTank2.remplir(50);
        System.out.println(waterTank2.toString());

        waterTank2.remplir(50);
        System.out.println(waterTank2.toString());

        waterTank2.remplir(50);
        waterTank2.remplir(50);
        waterTank2.remplir(50);

        System.out.println(waterTank2.toString());



    }
}
