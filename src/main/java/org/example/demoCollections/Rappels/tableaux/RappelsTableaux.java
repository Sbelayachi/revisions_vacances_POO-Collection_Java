// ============= RAPPELS TABLEAUX =============

//      ==> DEFINITION d’un tableau en Java :
//          - Un tableau est une structure de données qui contient plusieurs éléments du MEME TYPE
//            int[] tableau ;

//      ==> ALLOCATION d’un tableau en Java :
//          Un tableau doit être alloué dans la mémoire avec : "new"
//          Allocation d'un tableau de "n" éléments ayant pour type "type" :
//          ==> new "type"["nb"]


// VOIR EXEMPLE

package org.example.demoCollections.Rappels.tableaux;

import java.util.Arrays;

public class RappelsTableaux {
    public static void main(String[] args) {


        int[] tableau ;
        tableau= new int[5];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i]=i;
            System.out.println(tableau[i]);
        }
        System.out.println(Arrays.toString(tableau));

    }
}