package org.example.DemoImplementationClasse.demoExemplePersonne;

public class Application {
    public static void main(String[] args) {
        Personne p = new Personne(1,"toto");
        System.out.println(p.getNom());
        p.setNom("AZER");
        System.out.println(p.getNom());

        System.out.println(p.toString());
    }
}
