package ejerciciosSueltos.Animales;

public class Mamifero  extends Animal{
    private String tipoPelo1;

    public Mamifero(int edad, String nombre, String especie, String tipoPelo) {
        super(edad, nombre, especie, tipoPelo);
        String tipoPelo1 = this.tipoPelo1;
    }
    @Override
    public double darComida(double kg){
        return 4;
    }
}
