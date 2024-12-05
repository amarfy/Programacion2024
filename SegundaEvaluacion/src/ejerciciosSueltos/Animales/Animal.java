package ejerciciosSueltos.Animales;

import java.util.SplittableRandom;

public abstract class Animal {
    private int edad;
    private String nombre;
    private String especie;
    private String tipoPelo;

    public Animal(int edad, String nombre, String especie, String tipoPelo) {
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
        this.tipoPelo = tipoPelo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", tipoPelo='" + tipoPelo + '\'' +
                '}';
    }

    public abstract double darComida(double kg);
}
