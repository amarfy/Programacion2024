package ejerciciosSueltos.JUego;

public interface Combatiente {
    public void usarHabilidad();
    public void usarArma();
    public void recibirDanio(int danio);
    public int getVida();
    public void atacar(Combatiente combatiente);
}
