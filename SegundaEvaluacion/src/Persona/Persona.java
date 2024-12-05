package Persona;
/*
Crea una clase Persona con los atributos nombre y edad. Agrega un metodo presentarse() que muestre un mensaje como "Hola, me llamo [nombre] y tengo [edad] años".
 Luego, crea varias instancias de Persona y llama al metodo presentarse() en cada una.
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, me llamo " + this.nombre + " y tengo " + this.edad + " años.");
    }
}
