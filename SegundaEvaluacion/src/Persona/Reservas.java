package Persona;


import java.util.ArrayList;

public class Reservas {
    public static void main(String[] args) {
        ArrayList<Persona> reservas = new ArrayList<>();
        reservas.add(new Persona("Rami", 28));
        reservas.add(new Persona("Aaron", 29));
        reservas.add(new Persona("Amarfy", 30));

       mostrarReservas(reservas);
    }
    public static void mostrarReservas(ArrayList<Persona> reservas) {
        for (Persona persona : reservas) {
            persona.presentarse();
        }
    }
}
