package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelBuscar extends JPanel {

	public JButton buscar;
	public JButton limpiar;
	public JButton eliminar;
	public JTextField campoTexto_titulo_pelicula;
	public JTextField campoTexto_estado;
	public JTextField campoTexto_id;
	JLabel etiqueta_titulo_pelicula;
	JLabel etiqueta_estado;
	JLabel etiqueta_id;
	JLabel etiqueta_titulo;


	public PanelBuscar() {

		setBounds(250, 25, 660, 300);
		setLayout(null);
		setBackground(new Color(100,177,255));

		etiqueta_titulo = new JLabel("Módulo de Eliminar Película");
		Font fuente=new Font("Dialog", Font.BOLD, 18);
		etiqueta_titulo.setFont(fuente);
		etiqueta_titulo.setBounds(199, 30, 400, 30);
		add(etiqueta_titulo);

		etiqueta_id = new JLabel("ID de la película:");
		etiqueta_id.setBounds(20, 100, 200, 30);
		add(etiqueta_id);

		campoTexto_id = new JTextField();
		campoTexto_id.setBounds(170, 100, 250, 30);
		add(campoTexto_id);

		etiqueta_titulo_pelicula = new JLabel("Título de la Película:");
		etiqueta_titulo_pelicula.setBounds(20, 150, 200, 30);
		add(etiqueta_titulo_pelicula);

		campoTexto_titulo_pelicula = new JTextField();
		campoTexto_titulo_pelicula.setBounds(170, 150, 250, 30);
		add(campoTexto_titulo_pelicula);

		etiqueta_estado = new JLabel("Estado de la Película:");
		etiqueta_estado.setBounds(20, 200, 200, 30);
		add(etiqueta_estado);

		campoTexto_estado = new JTextField();
		campoTexto_estado.setBounds(170, 200, 250, 30);
		add(campoTexto_estado);

		buscar = new JButton("Buscar");
		buscar.setBounds(430, 100, 80, 27);
		add(buscar);

		limpiar = new JButton("Limpiar Formulario");
		limpiar.setBounds(370, 250, 150, 27);
		add(limpiar);


	}

	public void limpiarFormulario() {
		campoTexto_titulo_pelicula.setText("");
		campoTexto_id.setText("");
		campoTexto_estado.setText("");
	}
}