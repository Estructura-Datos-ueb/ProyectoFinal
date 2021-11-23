package co.edu.unbosque.controller;

import co.edu.unbosque.model.Nodo;
import co.edu.unbosque.model.Pelicula;
import co.edu.unbosque.view.ViewConsole;
import co.edu.unbosque.model.persistence.PeliculaDao;
import co.edu.unbosque.model.ListaDoble;

public class Controller {

    private ViewConsole v;
    private PeliculaDao dvdCsv;
    private ListaDoble listaDoble;
    ListaDoble listaEliminar;

    private int caso;

    public Controller (){
        v = new ViewConsole();
        dvdCsv = new PeliculaDao();
        listaDoble = new ListaDoble();
        v.mostrarInformacion("Binvenidos Proyecto Final");
        listaEliminar = new ListaDoble();
        start();
    }
    
    public void start() {
        dvdCsv.leerCSV();
        listaDoble = dvdCsv.getListaDoble();
        mostrarNodos();
        v.mostrarInformacionConsola("busqueda");
        Nodo nodoBuscado = listaDoble.buscarIterativo(listaDoble.getActual().dvd);
        v.mostrarInformacionConsola(nodoBuscado.dvd.toString());
        v.mostrarInformacionConsola("eliminacion");
        Nodo nodoEliminar = listaDoble.getCabeza().adelante.adelante;
        listaDoble.eliminar(nodoEliminar);
        // se debe hacer el set de la lista doble en cual cargo todos lo datos del csv
        // para postrteriormente sobre escribir el archivo y que los cambios persistan
        dvdCsv.setListaDoble(listaDoble);
        mostrarNodos();
        dvdCsv.modificarCsv();

    }

    public void mostrarNodos() {
        Nodo nodoInicio;
        nodoInicio = listaDoble.getCabeza();
        while (nodoInicio != null) {
            v.mostrarInformacionConsola(nodoInicio.dvd.toString());
            nodoInicio= nodoInicio.adelante;
        }
    }

    public boolean cargarListaEliminar(Pelicula dvd){
        if(dvd != null){
            if(listaEliminar.getCabeza()==null){
                listaEliminar.insertarCabezaLista(dvd);
                return true;
            }
            listaEliminar.insertarDespues(listaEliminar.getActual(),dvd);
            return true;
        }else {
            return false;
        }
    }
    
    public void eliminarNodos(){
      Nodo nodoActual = listaEliminar.getCabeza();
      while(nodoActual!=null){
          listaDoble.eliminar(nodoActual);
          nodoActual= nodoActual.adelante;
      }

    }

}