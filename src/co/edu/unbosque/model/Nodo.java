package co.edu.unbosque.model;

public class Nodo {


    public Nodo adelante;
    public Pelicula dvd;
    public Nodo atras;

    public Nodo(Pelicula dvd) {
        this.dvd = dvd;
    }

    public Nodo(Nodo adelante, Pelicula dvd, Nodo atras) {
        this.adelante = adelante;
        this.dvd = dvd;
        this.atras = atras;
    }

    public Nodo getAdelante() {
        return adelante;
    }

    public void setAdelante(Nodo adelante) {
        this.adelante = adelante;
    }

    public Pelicula getDvd() {
        return dvd;
    }

    public void setDvd(Pelicula dvd) {
        this.dvd = dvd;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
}
