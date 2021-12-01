package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEliminar extends JPanel {

	public JButton limpiar;
	public JButton eliminar;
	public JTextField campoTexto_id1;

	JLabel etiqueta_id;
	JLabel etiqueta_titulo;
	
	public PanelEliminar() {
		
		setBounds(250, 25, 660, 300);
		setLayout(null);
		setBackground(new Color(42, 197, 211));
		Color c1 = new Color(20, 16, 3);
		Color c2 = new Color(42, 197, 211);
		Font f = new Font("Times new Roman", Font.BOLD, 13);
		 
		etiqueta_titulo = new JLabel("Modulo de Eliminar Pelicula");
		Font fuente=new Font("Dialog", Font.BOLD, 18);
		etiqueta_titulo.setFont(fuente);
		etiqueta_titulo.setBounds(199, 30, 400, 30);
		add(etiqueta_titulo);
		
		etiqueta_id = new JLabel("ID de la pelicula:");
		etiqueta_id.setBounds(20, 100, 200, 30);
		add(etiqueta_id);
		
		campoTexto_id1 = new JTextField();
		campoTexto_id1.setBounds(170, 100, 250, 30);
		add(campoTexto_id1);


		eliminar = new JButton("Borrar Pelicula");
		eliminar.setBounds(200, 250, 150, 27);
		eliminar.setActionCommand("eliminarPelicula");
		eliminar.setBackground(c1);
		eliminar.setForeground(c2);
		eliminar.setFont(f);

		add(eliminar);
		
		limpiar = new JButton("Limpiar Formulario");
		limpiar.setBounds(370, 250, 150, 27);
		limpiar.setActionCommand("limipiarEliminar");
		limpiar.setBackground(c1);
		limpiar.setForeground(c2);
		limpiar.setFont(f);

		add(limpiar);
		
		
	}
	
	public void limpiarFormulario() {
		campoTexto_id1.setText("");

	}

}
