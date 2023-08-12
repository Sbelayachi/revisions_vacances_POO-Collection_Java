package org.example.demo.classeAbstraite;

public class AppliChat {
    public static void main(String[] args) {

        Chat chat1=new Chat ("felix",4,"noir",10);

        System.out.println(chat1);
        chat1.crier();
        chat1.manger();

    }
}
