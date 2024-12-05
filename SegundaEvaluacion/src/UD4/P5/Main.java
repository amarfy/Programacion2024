package UD4.P5;

import UD4.P4.Cancion;

public class Main {
    public static void main(String[] args) {
        CD cd = new CD();
        cd.agregaCancion(new Cancion("tinkiringuinquis: ", "Jfgfg"));
        cd.agregaCancion(new Cancion("tinkiringuinquis: ", "Jfgfg"));
        cd.agregaCancion(new Cancion("tinkiringuinquis: ", "Jfgfg"));
        System.out.printf("%d canciones\n", cd.numeroCanciones());
    }


}
