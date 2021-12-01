package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {
	
	public JButton ingresar;
	public JButton buscar;
	public JButton modificar;
	public JButton eliminar;
	public JButton prestar;
	public JButton mostrarLista;


	public PanelBotones() {
		
		setBounds(15, 25, 220, 300);
		setLayout(null);
		setBackground(new Color(0,0,255));
		
		ingresar = new JButton("Ingresar Pelicula");
		ingresar.setBounds(35, 60, 150, 27);
		ingresar.setActionCommand("IngresoRegistro");
		add(ingresar);
		
		mostrarLista = new JButton("Mostrar Lista");
		mostrarLista.setBounds(35, 260, 150, 27);
		mostrarLista.setEnabled(false);
		add(mostrarLista);
		
		buscar = new JButton("Filtrar Peliculas");
		buscar.setBounds(35, 110, 150, 27);
		buscar.setActionCommand("BuscarPelicula");
		add(buscar);
		
		modificar = new JButton("Modificar Pelicula");
		modificar.setBounds(35, 160, 150, 27);
		modificar.setActionCommand("ModificarPelicula");
		add(modificar);
		
		eliminar = new JButton("Eliminar pelicula");
		eliminar.setBounds(35, 210, 150, 27);
		eliminar.setActionCommand("EliminarPelicula");
		add(eliminar);
		
		prestar = new JButton("Realizar Prestamo");
		prestar.setBounds(35, 60, 150, 27);
		prestar.setEnabled(false);
		//add(prestar);
		
	}

	public JButton getIngresar() {
		return ingresar;
	}

	public void setIngresar(JButton ingresar) {
		this.ingresar = ingresar;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	public JButton getModificar() {
		return modificar;
	}

	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getPrestar() {
		return prestar;
	}

	public void setPrestar(JButton prestar) {
		this.prestar = prestar;
	}

	public JButton getMostrarLista() {
		return mostrarLista;
	}

	public void setMostrarLista(JButton mostrarLista) {
		this.mostrarLista = mostrarLista;
	}
}
