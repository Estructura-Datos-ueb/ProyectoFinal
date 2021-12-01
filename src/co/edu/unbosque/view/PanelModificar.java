package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelModificar extends JPanel {
	
	public JButton buscar;
	public JButton limpiar;
	public JButton actualizar;
	public JTextField nombre;
	public JTextField edad;
	public JTextField dni;
	JLabel etiqueta_nombre;
	JLabel etiqueta_edad;
	JLabel etiqueta_dni;
	JLabel etiqueta_titulo;
	
	public PanelModificar() {
		
		setBounds(250, 25, 530, 300);
		setLayout(null);
		setBackground(new Color(100,177,255));
		
		etiqueta_titulo = new JLabel("Modulo de Modificar de Persona");
		Font fuente=new Font("Dialog", Font.BOLD, 18);
		etiqueta_titulo.setFont(fuente);
		etiqueta_titulo.setBounds(150, 20, 400, 30);
		add(etiqueta_titulo);
		
		
		etiqueta_nombre = new JLabel("Nombres de la Persona:");
		etiqueta_nombre.setBounds(20, 150, 200, 30);
		add(etiqueta_nombre);
		
		nombre = new JTextField();
		nombre.setBounds(170, 150, 250, 30);
		add(nombre);
		
		etiqueta_dni = new JLabel("Dni de la Persona:");
		etiqueta_dni.setBounds(20, 100, 200, 30);
		add(etiqueta_dni);
		
		dni = new JTextField();
		dni.setBounds(170, 100, 250, 30);
		add(dni);
		
		etiqueta_edad = new JLabel("Edad de la Persona:");
		etiqueta_edad.setBounds(20, 200, 200, 30);
		add(etiqueta_edad);
		
		edad = new JTextField();
		edad.setBounds(170, 200, 250, 30);
		add(edad);
		
		buscar = new JButton("Buscar:");
		buscar.setBounds(430, 100, 80, 27);
		add(buscar);
		
		actualizar = new JButton("Actualizar Persona");
		actualizar.setBounds(200, 250, 150, 27);
		add(actualizar);
		
		limpiar = new JButton("Limpiar Formulario");
		limpiar.setBounds(370, 250, 150, 27);
		add(limpiar);
		
		
	}
	
	public void limpiarFormulario() {
		nombre.setText("");
		dni.setText("");
		edad.setText("");
	}
}
