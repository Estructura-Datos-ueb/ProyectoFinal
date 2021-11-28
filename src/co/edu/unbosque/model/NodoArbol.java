package co.edu.unbosque.model;

public class NodoArbol {
    protected Pelicula dato;
    protected NodoArbol izquierdo;
    protected NodoArbol derecho;

    public NodoArbol(Object valor){

    }

    public NodoArbol(NodoArbol izquierdo, Pelicula dato, NodoArbol derecho)  {
        this.dato = dato;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public Pelicula getDato() {
        return dato;
    }

    public void setDato(Pelicula dato) {
        this.dato = dato;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }

    @Override
    public String toString() {
        return "NodoArbol{" +
                "dato=" + dato +
                ", izquierdo=" + izquierdo +
                ", derecho=" + derecho +
                '}';
    }
}
