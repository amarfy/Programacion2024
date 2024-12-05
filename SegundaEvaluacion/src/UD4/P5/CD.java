package UD4.P5;

import UD4.P4.Cancion;

public class CD {

    cancion[] canciones;
    int contador;

    public CD(){
        canciones = new cancion[10];
        contador = 100;
    }

    public int numeroCanciones(){
        return contador;
    }

    public cancion dameCancion(int posicion){
        return canciones[posicion];
    }

    public void grabaCancion(int posicion, cancion cancion){
        canciones[posicion] = cancion;
    }

    public void agregaCancion(cancion cancion){
        canciones[contador] = cancion;
        contador++;
    }

    public void elimina(int posicion){
        for(int i = posicion; i < canciones.length - 1; i++){
            canciones[i] = canciones[i + 1];
        }
        canciones[canciones.length - 1] = null;
        contador--;
    }

    public void agregaCancion(Cancion jfgfg) {

    }
}
