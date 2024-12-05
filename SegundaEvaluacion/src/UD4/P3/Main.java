package UD4.P3;

import java.util.Scanner;

public class Main {

        static Zona salaPrincipal = new Zona("Sala Principal", "1000");
        static Zona compraVenta = new Zona("CompraVenta", "200");
        static Zona zonaVip = new Zona("Zona VIP", "25");

        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int opcion;
        do {
            System.out.println("----------Menu----------");
            System.out.println("1. Ver Entradas disponibles");
            System.out.println("2. Donde quieres comprar tu entrada ?");
            System.out.println("3. Salir");
            System.out.println("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                   salaPrincipal.MostrarInformacion();
                    compraVenta.MostrarInformacion();
                    zonaVip.MostrarInformacion();
                    break;
                case 2:
                   venderEntradas();
                    break;
                case 3:
                    System.out.println("Adios ");
                    break;
                default:
                    System.out.println("Opcion no valida, Puedes intentarlo de nuevo");
                    break;
            }
        } while (opcion != 3);
    }

    public static void venderEntradas() {
        System.out.println("En que zona quieres comprar tu entrada ?");
        System.out.println("1 - Sala Principal");
        System.out.println("2 - CompraVenta");
        System.out.println("3 - Zona VIP");
        int opcionZona = scanner.nextInt();

        System.out.println("Cuantas entradas quieres comprar ?");
        int cantidad = scanner.nextInt();


        switch (opcionZona) {
            case 1:
                salaPrincipal.vender(cantidad);
                break;
            case 2:
                compraVenta.vender(cantidad);
                break;
            case 3:
                zonaVip.vender(cantidad);
                break;
            default:
                System.out.println("Opcion no valida, Puedes intentarlo de nuevo");
                break;
        }
    }
}
