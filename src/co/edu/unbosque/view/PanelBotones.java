package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {
	
	public JButton ingresar;
	public JButton buscar;
	public JButton modificar;
	public JButton eliminar;
	public JButton prestar;


	public PanelBotones() {
		
		setBounds(15, 25, 220, 300);
		setLayout(null);
		Color c = new Color(42, 197, 211);
		Font f = new Font("Times new Roman", Font.BOLD, 17);
		setBackground(c);
		
		ingresar = new JButton("Ingresar Pelicula");
		ingresar.setBounds(35, 60, 175, 35);
		ingresar.setActionCommand("IngresoRegistro");
		ingresar.setBackground(new Color(20, 16, 3));
		ingresar.setForeground(c);
		ingresar.setFont(f);
		add(ingresar);

		
		buscar = new JButton("Filtrar Peliculas");
		buscar.setBounds(35, 110, 175, 35);
		buscar.setActionCommand("BuscarPelicula");
		buscar.setBackground(new Color(20, 16, 3));
		buscar.setForeground(c);
		buscar.setFont(f);
		add(buscar);
		
		modificar = new JButton("Modificar Pelicula");
		modificar.setBounds(35, 160, 175, 35);
		modificar.setActionCommand("ModificarPelicula");
		modificar.setBackground(new Color(20, 16, 3));
		modificar.setForeground(c);
		modificar.setFont(f);
		add(modificar);
		
		eliminar = new JButton("Eliminar pelicula");
		eliminar.setBounds(35, 210, 175, 35);
		eliminar.setActionCommand("EliminarPelicula");
		eliminar.setBackground(new Color(20, 16, 3));
		eliminar.setForeground(c);
		eliminar.setFont(f);
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


}
