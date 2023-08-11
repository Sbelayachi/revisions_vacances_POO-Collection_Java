//      === Exemple d’implémentation d’une classe Compte ===

// ========= Attributs d'instance : <visibilité> <type> <nom>   ========

    // ==>  private (-) : accessible qu’à l’intérieur de la classe.
    // ==>  protected (#) : accessible à l’intérieur de cette classe + Aux classes dérivées de cette classe.
    // ==>  public (+) : accès à partir de toute entité interne ou externe à la classe
    // ==>  Autorisation par défaut dans java = accessible à l’intérieur du package =
    //      = ACCES  uniquement par les classes du même package


package org.example.demo.implementation.exClasseCompte;

public class Compte {


    // 1- Attributs
    private final int code;
    protected float solde;


    // 2- IMPLEMENTATION avec le CONSTRUCTOR

//    public Compte() {
//        System.out.println("je suis le constructeur sans paramètre");
//    }

    public Compte(int code, float solde) {
        this.code = code;
        this.solde = solde;
//        System.out.println("je suis le constructeur avec tous les attributs");
    }

//    public Compte(int code) {
//        this.code = code;
////        System.out.println("je suis le constructeur avec l'attributs code");
//    }

//    public Compte(float solde) {
//        this.solde = solde;
////        System.out.println("je suis le constructeur avec l'attributs solde");
//    }


    // Méthodes d'instance :  <visibilité> <type de retour> <nom> (<parmétres>)

//    public void compte(int c, float s) {
//        code=c;
//        solde=s;
//    }

public void verser (float montant){
        solde+=montant;
}
public void retirer (float montant)
{
    solde-=montant;}


    //// Une méthode qui retourne l'état du compte toString() { return ""+""+}
    @Override
    public String toString() {
        return "code=" + code +
                ", solde=" + solde + " euros"
               ;

        }

}

