package EjercicioPizza;

public class Pizza {
    String tamano;
    String tipo;
    String estado;

    private static int pedida = 0;
    private static int servida = 0;


    public Pizza(String tamano, String tipo) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.estado = "pedida: ";
        pedida++;
    }

    public static int getPedida() {
        return pedida;
    }

    public static int getServida() {
        return servida;
    }

    public void servida() {
        if (this.estado.equals("pedida"))
            System.out.println("La Pizza que pidio ya esta servida");
        else {
            this.estado = "servida: ";
            servida++;
        }
    }

    @Override
    public String toString() {
        return "------Pizza------" + "\n" + "Tamaño: " + tamano + "\n" + "Tipo: " + tipo;
    }
}
