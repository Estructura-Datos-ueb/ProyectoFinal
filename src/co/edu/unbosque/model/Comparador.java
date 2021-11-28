package co.edu.unbosque.model;

public interface Comparador {
    public boolean igualQue(Pelicula q1,Pelicula q2);
    public boolean menorQue(Pelicula q1,Pelicula q2);
    public boolean menorIgualQue(Pelicula q);
    public boolean mayorQue(Pelicula q, Pelicula q2);
    public boolean mayorIgualQue(Pelicula q);
}
