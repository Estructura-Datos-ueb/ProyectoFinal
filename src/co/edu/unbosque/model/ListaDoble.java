package co.edu.unbosque.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class ListaDoble {

    protected Nodo cabeza;
    protected Nodo actual;
    protected int tamanio;

    public ListaDoble(){
        cabeza=null;
    }

    public ListaDoble insertarCabezaLista(Pelicula dvd){
        Nodo nuevo;
        nuevo = new Nodo(dvd);
        nuevo.adelante = cabeza;
        if(cabeza !=null){
            cabeza.atras = nuevo;
        }
        cabeza= nuevo;
        actual= cabeza;
        tamanio++;
        return this;
    }

    public ListaDoble insertarDespues(Nodo anterior,  Pelicula dvdEntrada){
        Nodo nuevo;
        nuevo = new Nodo(dvdEntrada);
        nuevo.adelante = anterior.adelante;
        if(anterior.adelante != null){
            anterior.adelante.atras= nuevo;
        }
        anterior.adelante = nuevo;
        nuevo.atras= anterior;
        actual= nuevo;
        tamanio++;
        return this;
    }


    public void eliminar(Nodo actual){
        if(actual != null){
            if(actual==cabeza){
                cabeza= actual.adelante;
                if(actual.adelante!=null){
                    actual.adelante.atras=null;
                }
            }else if(actual.adelante!=null){
                actual.atras.adelante=actual.adelante;
                actual.adelante.atras=actual.atras;
            }else {
                actual.atras.adelante=null;
                actual=null;
            }
        }

    }

    public Nodo buscarIterativo(Pelicula referencia){
        // Crea una copia de la lista.
        Nodo aux = cabeza;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al primer nodo nuevamente.
        do{
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.dvd){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al Enlace. nodo.
                aux = aux.adelante;
            }
        }while(aux != cabeza && encontrado != true);
        // Retorna el resultado de la bandera.
        return aux;
    }

    public Nodo editarIterativo(Pelicula referencia, Pelicula cambio){
        // Crea una copia de la lista.
        Nodo aux = cabeza;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al primer nodo nuevamente.
        do{
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.dvd){
                // Canbia el valor de la bandera.
                encontrado = true;
                aux.dvd.setTitulo(cambio.getTitulo());
                aux.dvd.setEstudio(cambio.getEstudio());
                aux.dvd.setEstado(cambio.getEstado());
                aux.dvd.setVersion(cambio.getVersion());
                aux.dvd.setPrecio(cambio.getPrecio());
                aux.dvd.setCalificacion(cambio.getCalificacion());
                aux.dvd.setDateDebut(cambio.getDateDebut());
                aux.dvd.setGenero(cambio.getGenero());
                aux.dvd.setDateIngreso(cambio.getDateIngreso());
                aux.dvd.setId(cambio.getId());
            }
            else{
                // Avansa al Enlace. nodo.
                aux = aux.adelante;
            }
        }while(aux != cabeza && encontrado != true);
        // Retorna el resultado de la bandera.
        return aux;
    }

    public Pelicula[] ordenarPorGeneroMasCostosos(String genero, int numero){
        // Crea una copia de la lista.
        Nodo aux = cabeza;
        int contador = 0;
        // Bandera para indicar si el valor existe.
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al primer nodo nuevamente.
        do{
            // Consulta si el valor del nodo es igual al de referencia.
            if (genero.equalsIgnoreCase(aux.getDvd().getGenero())){
                // Canbia el valor de la bandera.
                contador++;
                aux = aux.adelante;
            }
            else{
                // Avansa al Enlace. nodo.
                aux = aux.adelante;
            }
        }while(aux != null);

        Pelicula[] lista = new Pelicula[contador];

        contador = 0;

        aux = cabeza;

        do{
            if (genero.equalsIgnoreCase(aux.getDvd().getGenero())){

                lista[contador] = aux.getDvd();
                contador++;
                aux = aux.adelante;
            }
            else{
                aux = aux.adelante;
            }
        }while(aux != null);

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].toString());
        }
        lista = ordenarListaPorPrecios(lista, numero);
        // Retorna el resultado de la bandera.
        return lista;
    }

    public Pelicula[] buscarPorTitulo(String titulo){
        // Crea una copia de la lista.
        Nodo aux = cabeza;
        int contador = 0;
        // Bandera para indicar si el valor existe.
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al primer nodo nuevamente.
        do{
            // Consulta si el valor del nodo es igual al de referencia.
            if (aux.getDvd().getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                // Canbia el valor de la bandera.
                contador++;
                aux = aux.adelante;
            }
            else{
                // Avansa al Enlace. nodo.
                aux = aux.adelante;
            }
        }while(aux != null);

        Pelicula[] lista = new Pelicula[contador];

        contador = 0;

        aux = cabeza;

        do{
            if (aux.getDvd().getTitulo().toLowerCase().contains(titulo.toLowerCase())){

                lista[contador] = aux.getDvd();
                contador++;
                aux = aux.adelante;
            }
            else{
                aux = aux.adelante;
            }
        }while(aux != null);

        // Retorna el resultado de la bandera.
        return lista;
    }

    public Pelicula[] ordenarListaPorPrecios(Pelicula[] lista, int numero){


        Ordenamiento o = new Ordenamiento(lista);
        Pelicula[] temp = o.sort();
        Pelicula[] orden = new Pelicula[numero];

        for (int i = 0; i < numero; i++) {
            if(i < temp.length) {
                orden[i] = temp[i];
            }else{
                i = numero;
            }
        }


        return orden;
    }



    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getActual() {
        return actual;
    }

    public void setActual(Nodo actual) {
        this.actual = actual;
    }
}
