package co.edu.unbosque.view;


import javax.swing.JOptionPane;

public class Vista{
	
	public String menu() {
		return "Opciones: "+
				"\n 1. Ingresar Pel�cula"+
				"\n 2. Ver Pel�cula"+
				"\n 3. Modificar Pel�cula"+
				"\n 4. Eliminar Pel�cula"+
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