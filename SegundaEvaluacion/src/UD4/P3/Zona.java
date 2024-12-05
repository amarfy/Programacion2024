package UD4.P3;
/*
Queremos gestionar la venta de entradas (no numeradas) de Expocoches Huesca que tiene 3 zonas:

    La sala principal con 1000 entradas disponibles
    La zona de compra-venta con 200 entradas disponbles
    La zona vip con 25 entradas disponibles
 */
public class Zona {
    String nombre;
    String Capacidad;

    public Zona(String nombre, String capacidad) {
        this.nombre = nombre;
        Capacidad = capacidad;
    }

    public void MostrarInformacion() {
        System.out.println("-------------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Disponibles: " + this.Capacidad);
        System.out.println("-------------------------");
    }

    private int entradasPorVender;
    public Zona(int n) {
        entradasPorVender = n;
    }
    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    public void vender(int n){
        if(n <=0){
            System.out.println("Las Entradas para Esta Zona Ya No Se Encuentran Disponibles");
        }else if (this.entradasPorVender == 5){
            n = 10;
            System.out.println("Solo quedan " + this.entradasPorVender + " Entradas Disponibles");
        }else{
            entradasPorVender = entradasPorVender = n ;
            System.out.println("Aqui Tienes Sus " + n + " Entradas, Gracias!!");
        }
    }
}
