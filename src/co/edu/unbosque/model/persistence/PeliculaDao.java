
package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.*;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
/*
La funcionalidad de esta clase es la de leer el archivo csv
*/

public class PeliculaDao {

    private String line;
    private BufferedReader br;
    private BufferedWriter bw;
    private FileReader fr;
    private FileWriter fw;
    private  Pelicula dvd;
    private int cantidadDVD;
    private ListaDoble listaDoble;
    private ArbolBinarioBusqueda arbolId;
    private ArbolBinarioBusqueda arbolTitulo;

    public PeliculaDao() {
        listaDoble = new ListaDoble();
    }
    public void leerCSV(ArbolBinarioBusqueda id, ArbolBinarioBusqueda titulos) {
        this.arbolId = id;
        this.arbolTitulo = titulos;
        String path="data/DVD.csv";
        line="";
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();
            int i=0;
            while (null!=line) {
                String [] fields = line.split(";");


                if(fields.length<11){
                    try{
                        String titulo=fields[0];
                        String estudio=fields[1];
                        String estado=fields[2];
                        String version=fields[3];
                        String precio=fields[4];
                        String calificacion=fields[5];
                        String dateDebut=fields[6];
                        String genero=fields[7];
                        String dateIngreso=fields[8];
                        String Id=fields[9];
                        int id1 = Integer.parseInt(Id);
                        dvd = new Pelicula(titulo,estudio,estado,version,precio,calificacion,dateDebut,genero,dateIngreso,Id);
                        arbolId.insertar(dvd);
                        if(i==0){
                            listaDoble.insertarCabezaLista(dvd);
                        }else{
                            listaDoble.insertarDespues(listaDoble.getActual(), dvd);
                        }
                        i++;

                    } catch (NumberFormatException e) {
                        //System.out.println("No agregado inconsistencia en los datos");
                    }
                }

                line = br.readLine();
            }
            cantidadDVD= i;

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void modificarCsv (){
        String path="data/DVD.csv";
        line="";
        try {
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            line="Titulo;Estudio;Estado;Versiones;Precio;Clasificacion;Ano;Genero;Fecha de Publicacion de DVD;ID";
            bw.write(line);
            Nodo nodoActual= listaDoble.getCabeza();
            while(nodoActual!= null){
                String titulo=nodoActual.dvd.getTitulo();
                String estudio=nodoActual.dvd.getEstudio();
                String estado=nodoActual.dvd.getEstado();
                String version=nodoActual.dvd.getVersion();
                String precio=nodoActual.dvd.getPrecio();
                String calificacion=nodoActual.dvd.getCalificacion();
                String dateDebut=nodoActual.dvd.getDateDebut();
                String genero=nodoActual.dvd.getGenero();
                String dateIngreso=nodoActual.dvd.getDateIngreso();
                String Id=nodoActual.dvd.getId();

                line=titulo+";"+estudio+";"+estado+";"+version+";"+precio+";"+calificacion+";"+dateDebut+";"+genero+";"+dateIngreso+";"+Id;
                bw.newLine();
                bw.write(line);
                nodoActual= nodoActual.adelante;
            }
            bw.close();
            fw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getCantidadDVD() {
        return cantidadDVD;
    }

    public void setCantidadDVD(int cantidadDVD) {
        this.cantidadDVD = cantidadDVD;
    }

    public ListaDoble getListaDoble() {
        return listaDoble;
    }

    public void setListaDoble(ListaDoble listaDoble) {
        this.listaDoble = listaDoble;
    }

    public ArbolBinarioBusqueda getArbolId() {
        return arbolId;
    }

    public void setArbolId(ArbolBinarioBusqueda arbolId) {
        this.arbolId = arbolId;
    }

    public ArbolBinarioBusqueda getArbolTitulo() {
        return arbolTitulo;
    }

    public void setArbolTitulo(ArbolBinarioBusqueda arbolTitulo) {
        this.arbolTitulo = arbolTitulo;
    }
}
