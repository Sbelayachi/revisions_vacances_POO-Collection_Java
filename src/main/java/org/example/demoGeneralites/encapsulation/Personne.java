package org.example.demoGeneralites.encapsulation;

public class Personne {


    private int code;
    private String name;

    /*
Constructeur
    public Personne(int code, String name) {
        this.code = code;
        this.name = name;
    }
*/

    /// getter et setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;




    }
}
