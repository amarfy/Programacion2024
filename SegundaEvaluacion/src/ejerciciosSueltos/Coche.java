package ejerciciosSueltos;

public class Coche {
    String color;
    String modelo;
    int velocidad;
    private int platitud;

    public Coche(String color, String modelo, int velocidad, int platitud) {
        this.color = color;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.platitud = platitud;
    }

    public void acelerar() {
        this.platitud += 10;
    }

    public void frenar() {
        this.platitud -= 10;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", platitud=" + platitud +
                '}';
    }

    public String getColor() {
        return color;
    }
    public String getModelo() {
        return modelo;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public int getPlatitud() {
        return platitud;
    }

    public static int Convertir_A_Km(int platitud) {
        int km = (int)1069 * platitud;
        return km;
    }




}
