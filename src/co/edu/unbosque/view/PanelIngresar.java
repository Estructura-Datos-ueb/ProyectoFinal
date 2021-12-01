package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelIngresar extends JPanel {
	
	public JButton registrar;
	public JButton limpiar;
	
	public JTextField campoTexto_titulo_pelicula;
	public JTextField campoTexto_estudio;
	public JTextField campoTexto_estado;
	public JTextField campoTexto_version;
	public JTextField campoTexto_anio;
	public JTextField campoTexto_genero;
	public JTextField campoTexto_precio;
	public JComboBox escoger_Clasificacion;
	public JTextField campoTexto_fecha_pub;
	public JTextField campoTexto_id;
	
	JLabel etiqueta_titulo;
	JLabel etiqueta_campoTexto_titulo_pelicula;
	JLabel etiqueta_campoTexto_estudio;
	JLabel etiqueta_campoTexto_estado;
	JLabel etiqueta_campoTexto_version;
	JLabel etiqueta_anio;
	JLabel etiqueta_precio;
	JLabel etiqueta_genero;
	JLabel etiqueta_clasificacion;
	JLabel etiqueta_fecha_pub;
	JLabel etiqueta_id;

	
	
	public PanelIngresar() {
		
		setBounds(250, 25, 660, 300);
		setLayout(null);
		setBackground(new Color(100,177,255));
		
		etiqueta_titulo = new JLabel("Modulo de Ingreso de Pelicula");
		Font fuente=new Font("Dialog", Font.BOLD, 18);
		etiqueta_titulo.setFont(fuente);
		etiqueta_titulo.setBounds(199, 30, 400, 30);
		add(etiqueta_titulo);
		
		
		etiqueta_campoTexto_titulo_pelicula = new JLabel("Titulo:");
		etiqueta_campoTexto_titulo_pelicula.setBounds(20, 100, 200, 30);
		add(etiqueta_campoTexto_titulo_pelicula);
		
		campoTexto_titulo_pelicula = new JTextField();
		campoTexto_titulo_pelicula.setBounds(90, 100, 100, 30);
		add(campoTexto_titulo_pelicula);
		
		etiqueta_campoTexto_estudio = new JLabel("Estudio:");
		etiqueta_campoTexto_estudio.setBounds(20, 150, 200, 30);
		add(etiqueta_campoTexto_estudio);
		
		campoTexto_estudio = new JTextField();
		campoTexto_estudio.setBounds(90, 150, 100, 30);
		add(campoTexto_estudio);
		
		etiqueta_campoTexto_estado = new JLabel("Estado:");
		etiqueta_campoTexto_estado.setBounds(20, 200, 200, 30);
		add(etiqueta_campoTexto_estado);
		
		campoTexto_estado = new JTextField();
		campoTexto_estado.setBounds(90, 200, 100, 30);
		add(campoTexto_estado);
		
		
		etiqueta_campoTexto_version = new JLabel("Versiones:");
		etiqueta_campoTexto_version.setBounds(20, 250, 250, 30);
		add(etiqueta_campoTexto_version);
		
		campoTexto_version = new JTextField();
		campoTexto_version.setBounds(90, 250, 100, 30);
		add(campoTexto_version);		
		
		//-------------------------------------------
		
		etiqueta_precio = new JLabel("Precio:");
    	etiqueta_precio.setBounds(220, 95, 200, 30);
    	add(etiqueta_precio);
    	
    	campoTexto_precio = new JTextField();
    	campoTexto_precio.setBounds(300, 95, 100, 30);
    	add(campoTexto_precio);
    	
    	etiqueta_clasificacion = new JLabel("Clasificacion: ");
    	etiqueta_clasificacion.setBounds(220, 10, 200, 300);
    	add(etiqueta_clasificacion);
    	
    	String[] list = {"------------------ ","6","12","24","36"};
    	escoger_Clasificacion = new JComboBox(list);
    	escoger_Clasificacion.setBounds(300, 150, 100, 30);
    	add(escoger_Clasificacion);
    	 	
    	etiqueta_anio = new JLabel("Anio:");
    	etiqueta_anio.setBounds(220, 200, 200, 30);
    	add(etiqueta_anio );
    	
    	campoTexto_anio = new JTextField();
    	campoTexto_anio.setBounds(300, 200, 101, 30);
    	add(campoTexto_anio);
    	
		registrar = new JButton("Registrar Pelicula");
		registrar.setBounds(260, 250, 150, 27);
		registrar.setActionCommand("registrar");
		add(registrar);
    	
		//-------------------------------------------
		
    	etiqueta_genero= new JLabel("Genero");
    	etiqueta_genero.setBounds(440, 95, 200, 30);
        add(etiqueta_genero);
        
        campoTexto_genero = new JTextField();
    	campoTexto_genero.setBounds(550, 95, 100, 30);
    	add(campoTexto_genero);
    	
    	etiqueta_fecha_pub= new JLabel("Fecha Publicacion:");
    	etiqueta_fecha_pub.setBounds(440, 10, 200, 300);
        add(etiqueta_fecha_pub);
        
        campoTexto_fecha_pub = new JTextField();
    	campoTexto_fecha_pub.setBounds(550, 150, 100, 30);
    	add(campoTexto_fecha_pub);
        
    	etiqueta_id= new JLabel("Numero de ID:");
    	etiqueta_id.setBounds(440, 200, 200, 30);
        add(etiqueta_id);
        
        campoTexto_id = new JTextField();
    	campoTexto_id.setBounds(550, 200, 101, 30);
    	add(campoTexto_id);
    	
		limpiar = new JButton("Limpiar Formulario");
		limpiar.setBounds(440, 250, 150, 27);
		limpiar.setActionCommand("limpiar");
		add(limpiar);
			
	}
	
	public void limpiarFormulario() {
		campoTexto_titulo_pelicula.setText("");
		campoTexto_estudio.setText("");
		campoTexto_estado.setText("");
		campoTexto_version.setText("");
		campoTexto_precio.setText("");
		campoTexto_anio.setText("");
		campoTexto_genero.setText("");
		campoTexto_fecha_pub.setText("");
		campoTexto_id.setText("");
	}

	public JButton getRegistrar() {
		return registrar;
	}

	public void setRegistrar(JButton registrar) {
		this.registrar = registrar;
	}

	public JButton getLimpiar() {
		return limpiar;
	}

	public void setLimpiar(JButton limpiar) {
		this.limpiar = limpiar;
	}

	public JTextField getCampoTexto_titulo_pelicula() {
		return campoTexto_titulo_pelicula;
	}

	public void setCampoTexto_titulo_pelicula(JTextField campoTexto_titulo_pelicula) {
		this.campoTexto_titulo_pelicula = campoTexto_titulo_pelicula;
	}

	public JTextField getCampoTexto_estudio() {
		return campoTexto_estudio;
	}

	public void setCampoTexto_estudio(JTextField campoTexto_estudio) {
		this.campoTexto_estudio = campoTexto_estudio;
	}

	public JTextField getCampoTexto_estado() {
		return campoTexto_estado;
	}

	public void setCampoTexto_estado(JTextField campoTexto_estado) {
		this.campoTexto_estado = campoTexto_estado;
	}

	public JTextField getCampoTexto_version() {
		return campoTexto_version;
	}

	public void setCampoTexto_version(JTextField campoTexto_version) {
		this.campoTexto_version = campoTexto_version;
	}

	public JTextField getCampoTexto_anio() {
		return campoTexto_anio;
	}

	public void setCampoTexto_anio(JTextField campoTexto_anio) {
		this.campoTexto_anio = campoTexto_anio;
	}

	public JTextField getCampoTexto_genero() {
		return campoTexto_genero;
	}

	public void setCampoTexto_genero(JTextField campoTexto_genero) {
		this.campoTexto_genero = campoTexto_genero;
	}

	public JTextField getCampoTexto_precio() {
		return campoTexto_precio;
	}

	public void setCampoTexto_precio(JTextField campoTexto_precio) {
		this.campoTexto_precio = campoTexto_precio;
	}

	public JComboBox getEscoger_Clasificacion() {
		return escoger_Clasificacion;
	}

	public void setEscoger_Clasificacion(JComboBox escoger_Clasificacion) {
		this.escoger_Clasificacion = escoger_Clasificacion;
	}

	public JTextField getCampoTexto_fecha_pub() {
		return campoTexto_fecha_pub;
	}

	public void setCampoTexto_fecha_pub(JTextField campoTexto_fecha_pub) {
		this.campoTexto_fecha_pub = campoTexto_fecha_pub;
	}

	public JTextField getCampoTexto_id() {
		return campoTexto_id;
	}

	public void setCampoTexto_id(JTextField campoTexto_id) {
		this.campoTexto_id = campoTexto_id;
	}
}
