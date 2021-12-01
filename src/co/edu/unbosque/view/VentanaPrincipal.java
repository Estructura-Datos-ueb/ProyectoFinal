package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

import co.edu.unbosque.view.PanelBotones;
import co.edu.unbosque.view.PanelEliminar;
import co.edu.unbosque.view.PanelIngresar;
import co.edu.unbosque.view.PanelModificar;
import co.edu.unbosque.view.PanelMostrarLista;
import co.edu.unbosque.view.PanelBuscar;

public class VentanaPrincipal extends JFrame {
	
	public PanelBotones panel_botones;
	public PanelIngresar panel_ingresar;
	public PanelBuscar panel_buscar;
	public PanelModificar panel_modificar;
	public PanelEliminar panel_eliminar;

	
	public VentanaPrincipal() {
		setSize(950, 380);

		setTitle("Proyecto final ED");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(true);
	    setLocationRelativeTo(null);
	    
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(20, 16, 3));
		
		panel_botones = new PanelBotones();
		getContentPane().add(panel_botones);
		
		panel_ingresar = new PanelIngresar();
		panel_ingresar.setVisible(false);
		getContentPane().add(panel_ingresar);
		
		panel_buscar = new PanelBuscar();
		panel_buscar.setVisible(false);
		getContentPane().add(panel_buscar);
		
		panel_modificar = new PanelModificar();
		panel_modificar.setVisible(false);
		getContentPane().add(panel_modificar);
		
		panel_eliminar = new PanelEliminar();
		panel_eliminar.setVisible(false);
		getContentPane().add(panel_eliminar);		
		
	    setVisible(true);
	}

	public void visibilidadPanelIngresar(boolean visibility){
		panel_ingresar.setVisible(visibility);

	}

	public void visibilidadPanelBuscar(boolean visibility){
		panel_buscar.setVisible(visibility);
	}

	public void visibilidadPanelEliminar(boolean visibility){
		panel_eliminar.setVisible(visibility);
	}
	public void visibilidadPanelModificar(boolean visibility){
		panel_modificar.setVisible(visibility);
	}

}
