package UD4.P4;

public class Cancion {
    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public String dameTitulo() {
        return titulo;
    }

    public String dameAutor() {
        return autor;
    }

    public void ponTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

    public void ponAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
    }


    public String toString() {
        String Cancion = "\nCancion ";
        Cancion += "Autor: " + this.autor + "\n";
        Cancion += "titulo: " + this.titulo + "\n";
        return Cancion;
    }
}


