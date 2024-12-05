package Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");

        System.out.println("Estas son las personas que Se jubilan este año");
        System.out.println("------------------------------------------------");


        Persona persona1 = new Persona("Rami", 28);
        Persona persona2 = new Persona("Aaron", 29);
        Persona persona3 = new Persona("Amarfy", 30);
        Persona persona4 = new Persona("Elena", 17);
        Persona persona5 = new Persona("Elisa", 15);

       Persona[] personas = new Persona[5];
       personas[0] = persona1;
       personas[1] = persona2;
       personas[2] = persona3;
       personas[3] = persona4;
       personas[4] = persona5;
       try {

        for (Persona persona : personas) {
            persona.presentarse();
        }
    } catch (Exception e) {
           System.out.println("No hay persona ");

    }
    }
}
