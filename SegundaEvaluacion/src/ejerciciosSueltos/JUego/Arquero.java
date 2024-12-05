package ejerciciosSueltos.JUego;

public class Arquero extends Personaje implements Habilidad {
    public Arquero(String nombre, int vida, int ataque, int defensa) {
        super(nombre, vida, ataque, defensa);
    }

    @Override
    public void usarArma() {
        System.out.println("Usa el arco");

    }

    @Override
    public void recibirDanio(int danio) {

    }

    @Override
    public void atacar(Combatiente combatiente) {

    }

    @Override
    public void usarHabilidad() {
        System.out.println("Usa Multiple Flechas");

    }
}
