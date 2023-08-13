package org.example.exercicesCollections.bibliotheque;

public class ObjetLivreTest {

    public static void main(String[] args) {

        Livre livre1=new Livre("Le Rouge rouge et le Noir","Stendhal",512,true);
        Livre livre2=new Livre("Les femmes savantes","Molière",300,false);
        Livre livre3=new Livre("Danse macabre","Stephen King",250,true);
        Livre livre4=new Livre("Les fleurs du mal","Charles Baudelaire",512,true);


        livre1.affcherInfoLivre();
        livre1.changeStatus();
        livre1.affcherInfoLivre();

    }
}
