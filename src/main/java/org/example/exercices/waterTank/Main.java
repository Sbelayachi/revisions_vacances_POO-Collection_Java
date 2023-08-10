package org.example.exercices.waterTank;

public class Main {
    public static void main(String[] args) {

WaterTank waterTank1=new WaterTank(150,500,200.50);
        System.out.println(waterTank1.toString());

waterTank1.remplir(600);
        System.out.println(waterTank1.toString());



    }
}
