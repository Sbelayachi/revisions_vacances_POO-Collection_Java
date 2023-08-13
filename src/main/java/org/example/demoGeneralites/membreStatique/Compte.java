//  ==========     Membres statiques d’une classe ===
//Dans l’exemple de la classe Compte, chaque objet Compte possède ses propres
//variables code et solde. Les variables code et solde sont appelées variables
//d’instances.
//Les objets d’une même classe peuvent partager des mêmes variables qui sont
//stockées au niveau de la classe. Ce genre de variables, s’appellent les variables
//statiques ou variables de classes.
//Un attribut statique d’une classe est un attribut qui appartient à la classe et
//partagé par tous les objets de cette classe.
//Comme un attribut une méthode peut être déclarée statique, ce qui signifie qu’elle
//appartient à la classe et partagée par toutes les instances de cette classe.
//Dans la notation UML, les membres statiques d’une classe sont soulignés.
package org.example.demoGeneralites.membreStatique;

public class Compte {


    // Attributs-variables d'instance
    private final int code;
    private float solde;

//      ======  ajouter à la classe Compte : une variable qui permet de stocker le nombre de comptes créés.
    // declaration = <visibilité> static <type< <nom>
private static int nombreCompte;
//      Comme la valeur de variable nbComptes est la même pour tous les objets, celle-ci sera déclarée statique.
//      Sinon, elle sera dupliquée dans chaque nouvel objet créé.




//      ======================== constructeur ==============================

//      La valeur de nbComptes est au départ initialisée à 0, et pendant la création d’une nouvelle instance (au niveau
//      du constructeur), nbCompte est incrémentée et on profite de la valeur de nbComptes pour initialiser le
//      code du compte.


    /// Inutilisé

    public Compte(float solde) {
        this.code =nombreCompte++;
        this.solde = solde;
    }

   // getter et setter

    public int getCode() {
        return code;
    }
///
///    public void setCode(int code) {
//        this.code = code;
//    }
//
    public float getSolde() {
        return solde;
    }
///
///    public void setSolde(float solde) {
//        this.solde = solde;
//    }



//    ========= Méthodes VERSER ET RETIRER =========

    public void verser (float montantVerse)
    {solde+=montantVerse;}
    public void retirer (float montantRetire)
    {solde+=montantRetire;}




////   METHODE QUI : Retourne la valeur d'une VARIABLE STATIQUE de nbComptes = idem :
// on AJOUTE STATIC APRES LA VISIBILITE

    public static int getNombreCompte() {
        return nombreCompte ;
    }

//    public static void setNombreCompte(int nombreCompte) {
//        Compte.nombreCompte = nombreCompte;
//    }


    // affichage état de l'objet


    @Override
    public String toString() {
        return "CLASSE Compte : " +
                "\n=> code=" + code +
                "\n=> solde=" + solde+
                "\n=> nombre de compte=" + nombreCompte ;

    }
}
