package ejerciciosSueltos.JUego;
/*
Desarrolla un sistema para un juego de rol que incorpore interfaces, herencia, polimorfismo, comparadores y enumeraciones. El juego debe incluir los siguientes elementos:
Una interfaz Combatiente que defina métodos comunes para todos los personajes que pueden luchar.
Una clase abstracta Personaje que implemente Combatiente y contenga atributos y métodos comunes.
Clases concretas que hereden de Personaje: Guerrero, Mago y Arquero.
Una enumeración TipoArma que incluya diferentes tipos de armas.
Una interfaz Habilidad y clases que la implementen para representar habilidades especiales.
Un sistema de inventario que use un comparador para ordenar los objetos por valor.
Un metodo polimórfico usarHabilidad() que se comporte de manera diferente según la clase del personaje.
Una clase Batalla que simule un combate entre personajes, utilizando sus habilidades y armas.
Implementa el sistema completo, asegurándote de utilizar correctamente interfaces, herencia, polimorfismo, comparadores y enumeraciones. Incluye un metodo main() que demuestre el funcionamiento del sistema.
 */
public abstract class Personaje {
    String nombre;
    int vida;
    int ataque;
    int defensa;

    public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                '}';
    }


    public abstract void usarHabilidad();

    public abstract void usarArma();
}
