package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaEmergente extends JFrame{
	
	public PanelMostrarLista panel_mostrarLista;
	
	public VentanaEmergente() {
		setSize(850, 380);
		setTitle("Resultados de búsqueda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(false);
	    setLocationRelativeTo(null);
	    
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(192,192,192));
		
		panel_mostrarLista = new PanelMostrarLista();
		getContentPane().add(panel_mostrarLista);
				
	    setVisible(true);
	}

}
