package org.example.demo.heritage.exempleAnimalChatChien;

public class AppliChat {
    public static void main(String[] args) {

        Chat chat1=new Chat("félix",4,"gris",9);


        System.out.println(chat1.toString());
        chat1.manger();
        System.out.println();
        chat1.crier();
        System.out.println();
        chat1.anneeNaissance();
        System.out.println();
        chat1.utiliserMethodeTaillenom();
        System.out.println();

    }
}
