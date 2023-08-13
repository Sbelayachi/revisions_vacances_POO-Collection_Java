//
//Une interface définit un ensemble de méthodes, mais pas leur implémentation.

// C'est pourquoi il n'est pas possible d'instancier une interface directement.

// Il est toutefois possible d'appeler une méthode en utilisant une référence à une interface,
// sans savoir quelle classe implémentant concrètement la méthode appelée est réellement utilisée.

// SI une classe implémente une interface : elle signe un contrat => toutes les méthodes de l'interface doivent être implémentées

// En fait, une interface est une classe abstraite dont toutes les méthodes sont abstraites
// et dont tous les attributs sont constants (des constantes, voir le mot-clé final).