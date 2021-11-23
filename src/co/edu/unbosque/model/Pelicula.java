package co.edu.unbosque.model;

public class Pelicula {

    private String titulo;
    private String estudio;
    private String estado;
    private String version;
    private String precio;
    private String calificacion;
    private String dateDebut;
    private String genero;
    private String dateIngreso;
    private String Id;

    public Pelicula(String titulo, String estudio, String estado, String version,
                    String precio, String calificacion, String dateDebut, String genero, String dateIngreso, String id) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.estado = estado;
        this.version = version;
        this.precio = precio;
        this.calificacion = calificacion;
        this.dateDebut = dateDebut;
        this.genero = genero;
        this.dateIngreso = dateIngreso;
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDateIngreso() {
        return dateIngreso;
    }

    public void setDateIngreso(String dateIngreso) {
        this.dateIngreso = dateIngreso;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Pelicula: " +
                "titulo: '" + titulo + '\'' +
                ", estudio: '" + estudio + '\'' +
                ", estado: '" + estado + '\'' +
                ", version: '" + version + '\'' +
                ", precio: '" + precio + '\'' +
                ", calificacion: '" + calificacion + '\'' +
                ", dateDebut: '" + dateDebut + '\'' +
                ", genero: '" + genero + '\'' +
                ", dateIngreso:'" + dateIngreso + '\'' +
                ", Id: '" + Id + '\'' +
                '}';
    }
}
