package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelModificar extends JPanel {

	public JButton buscar;
	public JButton limpiar;
	public JButton actualizar;

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



	public PanelModificar() {

		setBounds(250, 25, 660, 300);
		setLayout(null);
		setBackground(new Color(100,177,255));

		etiqueta_titulo = new JLabel("Modulo de Modificar Película");
		Font fuente=new Font("Dialog", Font.BOLD, 18);
		etiqueta_titulo.setFont(fuente);
		etiqueta_titulo.setBounds(199, 30, 400, 30);
		add(etiqueta_titulo);

		etiqueta_campoTexto_titulo_pelicula = new JLabel("Título:");
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

		etiqueta_clasificacion = new JLabel("Clasificación: ");
		etiqueta_clasificacion.setBounds(220, 10, 200, 300);
		add(etiqueta_clasificacion);

		String[] list = {"------------------ ","6","12","24","36"};
		escoger_Clasificacion = new JComboBox(list);
		escoger_Clasificacion.setBounds(300, 150, 100, 30);
		add(escoger_Clasificacion);

		etiqueta_anio = new JLabel("Año:");
		etiqueta_anio.setBounds(220, 200, 200, 30);
		add(etiqueta_anio );

		campoTexto_anio = new JTextField();
		campoTexto_anio.setBounds(300, 200, 101, 30);
		add(campoTexto_anio);

		actualizar = new JButton("Actualizar Película");
		actualizar.setBounds(212, 250, 150, 27);
		actualizar.setActionCommand("actualizarPelicula");
		add(actualizar);

		//-------------------------------------------

		etiqueta_genero= new JLabel("Género");
		etiqueta_genero.setBounds(440, 95, 200, 30);
		add(etiqueta_genero);

		campoTexto_genero = new JTextField();
		campoTexto_genero.setBounds(550, 95, 100, 30);
		add(campoTexto_genero);

		etiqueta_fecha_pub= new JLabel("Fecha Publicación:");
		etiqueta_fecha_pub.setBounds(440, 10, 200, 300);
		add(etiqueta_fecha_pub);

		campoTexto_fecha_pub = new JTextField();
		campoTexto_fecha_pub.setBounds(550, 150, 100, 30);
		add(campoTexto_fecha_pub);

		etiqueta_id= new JLabel("Número de ID:");
		etiqueta_id.setBounds(440, 200, 200, 30);
		add(etiqueta_id);

		campoTexto_id = new JTextField();
		campoTexto_id.setBounds(550, 200, 101, 30);
		add(campoTexto_id);

		limpiar = new JButton("Limpiar Formulario");
		limpiar.setBounds(379, 250, 150, 27);
		limpiar.setActionCommand("limipiarPanelModifi");
		add(limpiar);

		buscar = new JButton("Buscar:");
		buscar.setBounds(550, 250, 100, 27);
		buscar.setActionCommand("buscarMofificar");
		add(buscar);


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
}