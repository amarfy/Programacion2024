package UD4.P7;
public class PilaPalabras {

    String pila = "";
    public void apilarPalabra(String palabra){
        pila += palabra + " ";
    }
    public String desapilarPalabra(){
        String aux = pila;
        pila = "";
        return aux;
    }
    public String obtenerPalabraCima(){
        return pila;
    }
    public boolean pilaPalabrasVacia(){
        return pila.equals("");
    }

}
