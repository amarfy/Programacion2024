package ejerciciosSueltos;
/*
Crea una clase Motor con atributos como tipo y potencia. Luego, modifica la clase Coche para que tenga un atributo motor que sea una instancia de la clase Motor.

 */
public class Motor {

    String tipo;
    int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
