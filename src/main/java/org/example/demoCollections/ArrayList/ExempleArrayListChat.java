package org.example.demoCollections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExempleArrayListChat {

    public static void main(String[] args) {

        // Liste de chats

        List<Chat> chats;
        chats = new ArrayList<Chat>();

        // Ajouter des chats
        chats.add(new Chat("tutu", 2, "noir", 6));
        chats.add(new Chat("oscar", 2, "marron", 5));

        // Afficher les chats

        for (int i = 0; i < chats.size(); i++) {

            chats.get(i).affiche();
        }
    }
}