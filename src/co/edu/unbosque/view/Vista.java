package co.edu.unbosque.view;


import javax.swing.JOptionPane;

public class Vista{
	
	public String menu() {
		return "Opciones: "+
				"\n 1. Ingresar Película"+
				"\n 2. Ver Película"+
				"\n 3. Modificar Película"+
				"\n 4. Eliminar Película"+
				"\n 5. Salir"+
				"\n\n Opcion?";
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public String leerDato(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}
	
	
	
	
}