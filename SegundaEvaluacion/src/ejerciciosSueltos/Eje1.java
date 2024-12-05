package ejerciciosSueltos;
/*
Crea una clase llamada Coche que tenga atributos para el color, el modelo y la velocidad.
Define un metodo acelerar() que aumente la velocidad del coche en 10 unidades y un metodo frenar() que la disminuya en 10 unidades.

Añade un metodo estático convertirAKm() en la clase Coche que convierta una velocidad de millas por hora a kilómetros por hora.
 Luego, crea un metodo de clase totalCoches() que devuelva el número de coches creados (necesitarás una variable que lo almacene).
 */

public class Eje1 {
    public static void main(String[] args) {
        Coche coche = new Coche("Negro","AMP60",250,200);
        coche.acelerar();
        coche.frenar();
        coche.velocidad = 200;

        String color = coche.getColor();
        String modelo = coche.getModelo();
        int velocidad = coche.getVelocidad();
        int platitud = coche.getPlatitud();
        System.out.println("");

        System.out.println("--------Coche Con mejor Velocidad Y mejor estilo--------");
        System.out.println("");

        System.out.println("-------Color-------- " +"\n"+ color);
        System.out.println("-------Modelo------- " + "\n"+ modelo);
        System.out.println("-------Velocidad------- " + "\n"+ velocidad);
        System.out.println("-------Platitud------- " + "\n"+platitud);

    }
}
