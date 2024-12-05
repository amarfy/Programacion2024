package UD4.P7;

public class Main {

    public static void main(String[] args) {
        PilaPalabras pila = new PilaPalabras();
        pila.apilarPalabra("hola");
        pila.apilarPalabra("mundo");
        System.out.println(pila.obtenerPalabraCima());
        System.out.println(pila.desapilarPalabra());
    }

}
