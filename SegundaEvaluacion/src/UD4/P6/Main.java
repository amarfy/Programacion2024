package UD4.P6;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Introduction to Java Programming", "Liang, Y. Daniel", "0-13-031997-X", 784, "3ª ecición", "Prentice-Hall, New Jersey (USA)", "viernes 16 de noviembre de 2001");
        Libro libro2 = new Libro("Java: A Beginner's Guide", "Schildt, Herbert", "0-201-50800-8", 784, "3ª edición", "McGraw-Hill Professional", "May 2004");
        System.out.println("------------------------------------------------");
        System.out.println("LIBRO 1");
        System.out.println("------------------------------------------------");
        libro1.leerLibro();
        System.out.println("------------------------------------------------");
        System.out.println("LIBRO 2");
        System.out.println("------------------------------------------------");
        libro2.leerLibro();

    }


}
