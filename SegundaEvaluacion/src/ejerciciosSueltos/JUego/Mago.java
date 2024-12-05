package ejerciciosSueltos.JUego;

public class Mago extends Personaje {
    public Mago(String nombre, int vida, int ataque, int defensa) {
        super(nombre, vida, ataque, defensa);
    }

    @Override
    public void usarHabilidad() {
        System.out.println("Usando magia");
    }
    @Override
    public void usarArma(){
        System.out.println("Baston de fuego");
    }
}
