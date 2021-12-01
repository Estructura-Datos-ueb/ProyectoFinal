package co.edu.unbosque.controller;

import co.edu.unbosque.model.ArbolBinarioBusqueda;
import co.edu.unbosque.model.Nodo;
import co.edu.unbosque.model.Pelicula;
import co.edu.unbosque.view.ViewConsole;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.model.persistence.PeliculaDao;
import co.edu.unbosque.model.ListaDoble;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private ViewConsole v;
    private VentanaPrincipal ventana_principal;
    private PeliculaDao dvdCsv;
    private ListaDoble listaDoble;
    ListaDoble listaEliminar;
    private ArbolBinarioBusqueda arbolId;
    private ArbolBinarioBusqueda arbolTitulo;

    private int caso;

    public Controller () {
        //arbolId = new ArbolBinarioBusqueda("id");
        //arbolTitulo = new ArbolBinarioBusqueda("titulo");
        ventana_principal = new VentanaPrincipal();
        v = new ViewConsole();
        dvdCsv = new PeliculaDao();
        listaDoble = new ListaDoble();
       // v.mostrarInformacion("Binvenidos Proyecto Final");
        listaEliminar = new ListaDoble();
        asignarOyentes();
        //start();
    }

    public void asignarOyentes() {



        ventana_principal.panel_botones.ingresar.addActionListener(this);
        ventana_principal.panel_ingresar.registrar.addActionListener(this);
        ventana_principal.panel_ingresar.limpiar.addActionListener(this);

        ventana_principal.panel_botones.buscar.addActionListener(this);
        //ventana_principal.panel_ver.buscar.addActionListener(this);
        //ventana_principal.panel_ver.limpiar.addActionListener(this);

        ventana_principal.panel_botones.modificar.addActionListener(this);
        ventana_principal.panel_modificar.actualizar.addActionListener(this);
        ventana_principal.panel_modificar.limpiar.addActionListener(this);
        ventana_principal.panel_modificar.buscar.addActionListener(this);

        ventana_principal.panel_botones.eliminar.addActionListener(this);
        ventana_principal.panel_eliminar.eliminar.addActionListener(this);
        ventana_principal.panel_eliminar.limpiar.addActionListener(this);
        ventana_principal.panel_eliminar.buscar.addActionListener(this);

        ventana_principal.panel_buscar.buscar.addActionListener(this);
        ventana_principal.panel_buscar.limpiar.addActionListener(this);

        ventana_principal.panel_botones.mostrarLista.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        switch (command){

            case "IngresoRegistro":
                ventana_principal.visibilidadPanelIngresar(true);
                ventana_principal.visibilidadPanelBuscar(false);
                ventana_principal.visibilidadPanelEliminar(false);
                ventana_principal.visibilidadPanelModificar(false);

                break;
            case "registrar":
                break;
            case "limpiar":
                break;


            case "BuscarPelicula":
                ventana_principal.visibilidadPanelBuscar(true);
                ventana_principal.visibilidadPanelIngresar(false);
                ventana_principal.visibilidadPanelEliminar(false);
                ventana_principal.visibilidadPanelModificar(false);
                break;

            case "buscarPelicula":
                break;
            case "limpiarPanelBusqueda":
                System.out.println("asdf");
                ventana_principal.panel_buscar.limpiarFormulario();
                break;
            case "EliminarPelicula":
                ventana_principal.visibilidadPanelEliminar(true);
                ventana_principal.visibilidadPanelIngresar(false);
                ventana_principal.visibilidadPanelBuscar(false);
                ventana_principal.visibilidadPanelModificar(false);



                break;
            case "eliminarPelicula":
                break;
            case "busquedaEliminar":
                break;
            case "limipiarEliminar":
                ventana_principal.panel_eliminar.limpiarFormulario();
                break;
            case "ModificarPelicula":
                ventana_principal.visibilidadPanelModificar(true);
                ventana_principal.visibilidadPanelEliminar(false);
                ventana_principal.visibilidadPanelIngresar(false);
                ventana_principal.visibilidadPanelBuscar(false);

                break;
            case "buscarMofificar":
                break;
            case "actualizarPelicula":
                break;
            case "limipiarPanelModifi":
                ventana_principal.panel_modificar.limpiarFormulario();
                break;
        }

    }
    /*
    limpiar.setActionCommand("limpiarPanelBusqueda");
    buscar.setActionCommand("buscarPelicula");
     */

    
    public void start() {
        dvdCsv.leerCSV(arbolId,arbolTitulo);
        //arbolId = dvdCsv.getArbolId();
        //arbolTitulo = dvdCsv.getArbolTitulo();


        listaDoble = dvdCsv.getListaDoble();
        mostrarNodos();
        v.mostrarInformacionConsola("busqueda");
        Nodo nodoBuscado = listaDoble.buscarIterativo(listaDoble.getActual().dvd);
        v.mostrarInformacionConsola(nodoBuscado.dvd.toString());
        v.mostrarInformacionConsola("eliminacion");
        Nodo nodoEliminar = listaDoble.getCabeza().adelante.adelante;
        listaDoble.eliminar(nodoEliminar);
        v.mostrarInformacionConsola(listaDoble.getCabeza().dvd.toString());
        v.mostrarInformacionConsola("\nAñadir:\n");
        //Para anadir se le debe pasar de parametro una pelicula nueva al metodo insertarCabezaLista
        Pelicula p = new Pelicula("Zootopia", "Disney Animation", "Fuera", "1",
                "300", "PG", "2017", "Aventura", "17 de marzo de 2016",
                "56454");

        listaDoble.insertarCabezaLista(p);



        //mostrarNodos();
        //Para editar se debe buscar la pelicula usando el metodo buscar iterativo y
        // luego pasarle otra instancia de pelicula con los datos actualizados
        Nodo comprobar = listaDoble.editarIterativo(p,new Pelicula("Zootopia 2", "Disney Animation+", "No estrenada",
                "1", "1000", "PG-13", "2030",
                "Aventura", "17 de marzo de 2025",
                "22222"));
        System.out.println("\nEditar:     \n");
        //mostrarNodos();
//        try{
//            String genero = JOptionPane.showInputDialog("Ingrese el Genero que desea buscar");
//            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de peliculas que desea mostrar"));
//
//            Pelicula[] pelis = listaDoble.ordenarPorGeneroMasCostosos(genero,numero);
//            v.imprimirLista(pelis);
//
//        }catch(Exception e ){
//            e.printStackTrace();
//        }


        String rango = JOptionPane.showInputDialog("Rango de años debut (anio1,anio2)");
        Pelicula[] pe1 = listaDoble.rangoDebut(rango);
        v.imprimirLista(pe1);

        String generos = JOptionPane.showInputDialog("Ingrese el genero de las peliculas");
        Pelicula[] pe2 = listaDoble.filtGenero(generos);
        v.imprimirLista(pe2);


        String titulo = JOptionPane.showInputDialog("Indique el titulo de la pelicula que desea buscar");
        Pelicula[] pe = listaDoble.buscarPorCategoria(titulo, "titulo");
//        Pelicula resultadoUnico = arbolTitulo.buscar(new Pelicula(titulo, "","",
//                "", "", "",
//                "", "", "", "")).getDato();
        v.imprimirLista(pe);

        String clasificacion = JOptionPane.showInputDialog("Indique la calificacion de la pelicula que desea buscar");

        pe = listaDoble.buscarPorCategoria(clasificacion, "calificacion");
        v.imprimirLista(pe);

        String version = JOptionPane.showInputDialog("Indique la version de la pelicula que desea buscar");

        pe = listaDoble.buscarPorCategoria(version, "version");
        v.imprimirLista(pe);

        //v.mostrarInformacion("Resultado Único: " + resultadoUnico);


        // se debe hacer el set de la lista doble en cual cargo todos lo datos del csv
        // para postrteriormente sobre escribir el archivo y que los cambios persistan
        dvdCsv.setListaDoble(listaDoble);
        //mostrarNodos();
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