package UD4.P1;

public class Perro {
    String nombre;
    int edad;
    String raza;
    String color;
    String tamanio;
    String sexo;
    String pelaje;
    int patas;

    public Perro(String nombre, int edad, String raza, String color, String tamanio, String sexo, String pelaje, int patas) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.sexo = sexo;
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPelaje() {
        return pelaje;
    }

    public int getPatas() {
        return patas;
    }

    @Override
    public String toString() {
        return "--------Perro-------- " + "\n" +
                "nombre: " + nombre + '\n' +
                "edad: " + edad + "\n" +
                "raza: " + raza + '\n' +
                "color: " + color + '\n' +
                "tamaño: " + tamanio + '\n' +
                "sexo:" + sexo + '\n' +
                "pelaje: " + pelaje + '\n' +
                "patas: " + patas ;
    }

    public void ladrar() {
        System.out.println("Woof!");
    }


}
