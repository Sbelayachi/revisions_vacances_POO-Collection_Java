package org.example.demoCollections.generiques;

public class Boite <T>
{
private T contenu;

    public Boite(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "\n Boite contenant : " +
                "\n ==> contenu = " + contenu ;
    }
}

