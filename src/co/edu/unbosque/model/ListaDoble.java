package co.edu.unbosque.model;

public class ListaDoble {

    protected Nodo cabeza;
    protected Nodo actual;

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
