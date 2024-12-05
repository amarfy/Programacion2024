package UD4.P6;
public class Libro {
    String titulo;
    String autor;
    String ISBN;
    int paginas;
    String edicion;
    String editorial;
    String lugar;

    public Libro(String titulo, String autor, String ISBN, int paginas, String edicion, String editorial, String lugar) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugar = lugar;


    }
    public void leerLibro(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("Edicion: " + this.edicion);
        System.out.println("Editorial: " + this.editorial);
        System.out.println("Lugar: " + this.lugar);


    }

}
