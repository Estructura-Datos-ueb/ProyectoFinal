package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaEmergente extends JFrame{
	
	public PanelMostrarLista panel_mostrarLista;
	
	public VentanaEmergente() {
		setSize(1000, 800);
		setTitle("Resultados de busqueda");
		setDefaultCloseOperation(this.HIDE_ON_CLOSE);
	    setResizable(true);
	    setLocationRelativeTo(null);
	    
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(100, 177, 255));

		panel_mostrarLista = new PanelMostrarLista();
		getContentPane().add(panel_mostrarLista);
				
	    setVisible(true);
	}

}
