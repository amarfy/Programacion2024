package UD4.P5;

public class cancion {
    private String titulo;
    private String autor;
    public cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public cancion(){
        this.titulo = "";
        this.autor = "";
    }
    public String dameTitulo(){
        return titulo;
    }
    public String dameAutor(){
        return autor;
    }
    public void ponTitulo(String nuevoTitulo){
        this.titulo = nuevoTitulo;
    }
    public void ponAutor(String nuevoAutor){
        this.autor = nuevoAutor;
    }
    public String toString(){
        String cancion = "\nCancion ";
        cancion += "Autor: " + this.autor + "\n";
        cancion += "titulo: " + this.titulo + "\n";
        return cancion;
    }

}
