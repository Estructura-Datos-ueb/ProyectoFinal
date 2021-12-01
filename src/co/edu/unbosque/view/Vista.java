package co.edu.unbosque.view;


import javax.swing.JOptionPane;

public class Vista{
	
	public String menu() {
		return "Opciones: "+
				"\n 1. Adicionar Persona"+
				"\n 2. Ver Persona"+
				"\n 3. Modificar Persona"+
				"\n 4. Eliminar Persona"+
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