///         ============    ENCAPSULATION   ===========

///         ============    Getters et Setters   ===========


//Les attributs privés d’une classe ne sont accessibles qu’à l’intérieur de la classe.
//Pour donner la possibilité à d’autres classes d’accéder aux membres privés, il faut définir dans la classes des méthodes
//publiques qui permettent de :
//lire la variables privés. Ce genre de méthodes s’appellent les accesseurs ou Getters
//modifier les variables privés. Ce genre de méthodes s’appellent les mutateurs ou Setters
//Les getters sont des méthodes qui commencent toujours par le mot get et finissent par le nom de l’attribut en écrivant en
//majuscule la lettre qui vient juste après le get. Les getters retourne toujours le même type que l’attribut correspondant.


package org.example.demo.encapsulation;

public class Main {
    public static void main(String[] args) {


        Personne personne1 = new Personne();
        personne1.setCode(2);
        personne1.setName("saliha");


        System.out.println(personne1);
        System.out.println(personne1.getCode() + " - " + personne1.getName());
    }
}
