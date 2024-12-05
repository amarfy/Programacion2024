package ejerciciosSueltos.JUego;

public class Guerrero extends Personaje implements Combatiente{

    public Guerrero(String nombre, int vida, int ataque, int defensa) {
        super(nombre, vida, ataque, defensa);
    }

    @Override
    public void usarHabilidad() {
        System.out.println("Remolino de Fuerza huracaniano");

    }

    @Override
    public void usarArma() {
        System.out.println("usa una espada de fuedo y adamantium");

    }

    @Override
    public void recibirDanio(int danio) {

    }

    @Override
    public void atacar(Combatiente combatiente) {

    }
}
