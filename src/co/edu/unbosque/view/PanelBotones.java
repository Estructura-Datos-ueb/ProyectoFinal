package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {
	
	public JButton ingresar;
	public JButton ver;
	public JButton modificar;
	public JButton eliminar;
	public JButton prestar;
	public JButton mostrarLista;
	
	public PanelBotones() {
		
		setBounds(15, 25, 220, 300);
		setLayout(null);
		setBackground(new Color(0,0,255));
		
		ingresar = new JButton("Ingresar Persona");
		ingresar.setBounds(35, 60, 150, 27);
		add(ingresar);
		
		mostrarLista = new JButton("Mostrar Lista");
		mostrarLista.setBounds(35, 260, 150, 27);
		mostrarLista.setEnabled(false);
		add(mostrarLista);
		
		ver = new JButton("Ver Persona");
		ver.setBounds(35, 110, 150, 27);
		ver.setEnabled(false);
		add(ver);
		
		modificar = new JButton("Modificar Persona");
		modificar.setBounds(35, 160, 150, 27);
		modificar.setEnabled(false);
		add(modificar);
		
		eliminar = new JButton("Eliminar Persona");
		eliminar.setBounds(35, 210, 150, 27);
		eliminar.setEnabled(false);
		add(eliminar);
		
		prestar = new JButton("Realizar Prestamo");
		prestar.setBounds(35, 60, 150, 27);
		prestar.setEnabled(false);
		//add(prestar);
		
	}

}
