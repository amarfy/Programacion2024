package UD4.P4;

public class Main {

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("tinkiringuinquis: ", "Jfgfg");

        System.out.println("Canción 1: " + cancion1);

        Cancion cancion2 = new Cancion();
        cancion2.ponTitulo("");
        cancion2.ponAutor("");

        System.out.println("Canción 2 - Título: " + cancion2.dameTitulo() + ", Autor: " + cancion2.dameAutor());
    }
}



