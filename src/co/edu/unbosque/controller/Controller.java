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
    private Pelicula peliModi;
    ListaDoble listaEliminar;
    private ArbolBinarioBusqueda arbolId;
    private ArbolBinarioBusqueda arbolTitulo;

    private int caso;

    public Controller () {

        arbolId = new ArbolBinarioBusqueda("id");
        arbolTitulo = new ArbolBinarioBusqueda("titulo");
        dvdCsv = new PeliculaDao();
        listaDoble = new ListaDoble();
        listaEliminar = new ListaDoble();

        iniLista();

        v = new ViewConsole();
        ventana_principal = new VentanaPrincipal();
        v.mostrarInformacion("Binvenidos Proyecto Final");
        peliModi = null;
        asignarOyentes();

//        start();
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
                System.out.println("registrar");
                try{
                    int id =Integer.parseInt(ventana_principal.panel_ingresar.getCampoTexto_id().getText());
                    Pelicula pelicula = new Pelicula(
                            ventana_principal.panel_ingresar.getCampoTexto_titulo_pelicula().getText(),
                            ventana_principal.panel_ingresar.getCampoTexto_estudio().getText(),
                            ventana_principal.panel_ingresar.getCampoTexto_estado().getText(),
                            ventana_principal.panel_ingresar.getCampoTexto_version().getText(),
                            ventana_principal.panel_ingresar.getCampoTexto_precio().getText(),
                            ventana_principal.panel_ingresar.getCampoTexto_clasificacion().getText(),
                            ventana_principal.panel_ingresar.getCampoTexto_anio().getText(),
                            ventana_principal.panel_ingresar.getCampoTexto_genero().getText(),
                            ventana_principal.panel_ingresar.getCampoTexto_fecha_pub().getText(),
                            ventana_principal.panel_ingresar.getCampoTexto_id().getText() );
                    arbolId.insertar(pelicula);
                    listaDoble.insertarDespues(listaDoble.getActual(), pelicula);
                    dvdCsv.setListaDoble(listaDoble);
                    dvdCsv.modificarCsv();
                    System.out.println("agregado");
                } catch (Exception exception) {
                    v.mostrarInformacion("El id ya se encuentra asignado o datos incorrectos");
                    exception.printStackTrace();
                }

                break;
            case "limpiarRegistro":
                ventana_principal.panel_ingresar.limpiarFormulario();
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
                try {
                    String id= ventana_principal.panel_eliminar.campoTexto_id1.getText();
                    Nodo nodoEliminar =listaDoble.buscarIterativo(id);
                    listaDoble.eliminar(nodoEliminar);
                    arbolId.eliminar(nodoEliminar.dvd);
                    v.mostrarInformacion("La pelicula fue eliminada correctamente");
                    ventana_principal.panel_eliminar.limpiarFormulario();
                } catch (Exception exception) {
                    v.mostrarInformacion("El id no se puede eliminar");
                    exception.printStackTrace();
                }


                dvdCsv.setListaDoble(listaDoble);
                dvdCsv.modificarCsv();

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
                String id = ventana_principal.panel_modificar.campoTexto_id.getText();
                if(!id.equals("")){
                    Nodo nodo =listaDoble.buscarIterativo(id);
                    if(nodo!=(null)){
                        String titulo;
                        String estudio;
                        String estado;
                        String version;
                        String precio;
                        String calificacion;
                        String dateDebut;
                        String genero;
                        String dateIngreso;
                        String Id;
                        peliModi= new  Pelicula(
                         titulo=nodo.getDvd().getTitulo(),
                         estudio=nodo.getDvd().getTitulo(),
                         estado=nodo.getDvd().getEstado(),
                         version=nodo.getDvd().getVersion(),
                         precio=nodo.getDvd().getPrecio(),
                         calificacion=nodo.getDvd().getCalificacion(),
                         dateDebut=nodo.getDvd().getDateDebut(),
                         genero=nodo.getDvd().getGenero(),
                         dateIngreso=nodo.getDvd().getDateIngreso(),
                         Id=nodo.getDvd().getId());
                        ventana_principal.panel_modificar.encontrado(true);
                        ventana_principal.panel_modificar.getCampoTexto_anio().setText(nodo.getDvd().getDateIngreso());
                        ventana_principal.panel_modificar.getCampoTexto_Clasificacion().setText(nodo.getDvd().getCalificacion());
                        ventana_principal.panel_modificar.getCampoTexto_estado().setText(nodo.getDvd().getEstado());
                        ventana_principal.panel_modificar.getCampoTexto_estudio().setText(nodo.getDvd().getEstudio());
                        ventana_principal.panel_modificar.getCampoTexto_fecha_pub().setText(nodo.getDvd().getDateDebut());
                        ventana_principal.panel_modificar.getCampoTexto_genero().setText(nodo.getDvd().getGenero());
                        ventana_principal.panel_modificar.getCampoTexto_precio().setText(nodo.getDvd().getPrecio());
                        ventana_principal.panel_modificar.getCampoTexto_version().setText(nodo.getDvd().getVersion());
                        ventana_principal.panel_modificar.getCampoTexto_titulo_pelicula().setText(nodo.getDvd().getTitulo());
                    }
                }


                break;
            case "actualizarPelicula":
                Pelicula pelicula = new Pelicula(
                        ventana_principal.panel_modificar.getCampoTexto_titulo_pelicula().getText(),
                        ventana_principal.panel_modificar.getCampoTexto_estudio().getText(),
                        ventana_principal.panel_modificar.getCampoTexto_estado().getText(),
                        ventana_principal.panel_modificar.getCampoTexto_version().getText(),
                        ventana_principal.panel_modificar.getCampoTexto_precio().getText(),
                        ventana_principal.panel_modificar.getCampoTexto_Clasificacion().getText(),
                        ventana_principal.panel_modificar.getCampoTexto_fecha_pub().getText(),
                        ventana_principal.panel_modificar.getCampoTexto_genero().getText(),
                        ventana_principal.panel_modificar.getCampoTexto_anio().getText(),
                         ventana_principal.panel_modificar.getCampoTexto_id().getText()
                 );
                listaDoble.editarIterativo(peliModi,pelicula);
                dvdCsv.setListaDoble(listaDoble);
                dvdCsv.modificarCsv();
                System.out.println("agregado");
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
    public void iniLista() {
        dvdCsv.leerCSV(arbolId,arbolTitulo);
        arbolId = dvdCsv.getArbolId();
        listaDoble = dvdCsv.getListaDoble();
    }

    
    public void start() {

        mostrarNodos();
         String id = JOptionPane.showInputDialog("Ingrese Id");


        try {
            Nodo nodoEliminar = listaDoble.buscarIterativo(id);

            arbolId.eliminar(nodoEliminar.dvd);
            listaDoble.eliminar(nodoEliminar);
        }catch (Exception e){
        v.mostrarInformacion("Esa pelicula no existe");
        }


        //Para anadir se le debe pasar de parametro una pelicula nueva al metodo insertarCabezaLista
//        Pelicula p = new Pelicula("Zootopia", "Disney Animation", "Fuera", "1",
//                "300", "PG", "2017", "Aventura", "17 de marzo de 2016",
//                "106128");
//
//
//        try {
//            arbolId.insertar(p);
//            listaDoble.insertarCabezaLista(p);
//        }catch (Exception e){
//            v.mostrarInformacion("Ya existe esa peli");
//        }
//
//        mostrarNodos();
//
//
//
//        //mostrarNodos();
//        //Para editar se debe buscar la pelicula usando el metodo buscar iterativo y
//        // luego pasarle otra instancia de pelicula con los datos actualizados
////        Nodo comprobar = listaDoble.editarIterativo(p,new Pelicula("Zootopia 2", "Disney Animation+", "No estrenada",
////                "1", "1000", "PG-13", "2030",
////                "Aventura", "17 de marzo de 2025",
////                "22222"));
//        //mostrarNodos();
////        try{
////            String genero = JOptionPane.showInputDialog("Ingrese el Genero que desea buscar");
////            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de peliculas que desea mostrar"));
////
////            Pelicula[] pelis = listaDoble.ordenarPorGeneroMasCostosos(genero,numero);
////            v.imprimirLista(pelis);
////
////        }catch(Exception e ){
////            e.printStackTrace();
////        }
//
//
//        String rango = JOptionPane.showInputDialog("Rango de años debut (anio1,anio2)");
//        Pelicula[] pe1 = listaDoble.rangoDebut(rango);
//        v.imprimirLista(pe1);
//
//        String generos = JOptionPane.showInputDialog("Ingrese el genero de las peliculas");
//        Pelicula[] pe2 = listaDoble.filtGenero(generos);
//        v.imprimirLista(pe2);
//
//
//        String titulo = JOptionPane.showInputDialog("Indique el titulo de la pelicula que desea buscar");
//        Pelicula[] pe = listaDoble.buscarPorCategoria(titulo, "titulo");
////        Pelicula resultadoUnico = arbolTitulo.buscar(new Pelicula(titulo, "","",
////                "", "", "",
////                "", "", "", "")).getDato();
//        v.imprimirLista(pe);
//
//        String clasificacion = JOptionPane.showInputDialog("Indique la calificacion de la pelicula que desea buscar");
//
//        pe = listaDoble.buscarPorCategoria(clasificacion, "calificacion");
//        v.imprimirLista(pe);
//
//        String version = JOptionPane.showInputDialog("Indique la version de la pelicula que desea buscar");
//
//        pe = listaDoble.buscarPorCategoria(version, "version");
//        v.imprimirLista(pe);

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