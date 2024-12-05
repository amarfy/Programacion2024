package UD4.P1;
/*
Implementa la clase Perro (piensa antes los posibles atributos y métodos). Pruébala a través de otra clase, creando instancias y aplicándole algunos métodos. */
public class p1 {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais", 5, "Pastor Aleman", "Blanco", "Grande", "Macho", "Liso", 4);
        System.out.println(perro);
        perro.ladrar();
    }
}
