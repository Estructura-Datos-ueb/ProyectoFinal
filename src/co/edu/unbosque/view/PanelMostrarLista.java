package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class PanelMostrarLista extends JPanel {

	// Area donde se uestra el resultado
	public JTextArea area_Texto;
	public JScrollPane barra_Lateral;
	public JTable tabla;
	public int filas;
	public JScrollPane sp;
	public DefaultTableModel modelo;

	public PanelMostrarLista() {

		setBounds(250, 25, 530, 300);
		setLayout(null);
		setBackground(new Color(100, 177, 255));

	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public void agregarTabla(Object datos[][]) {

		String columnas[] = {"Nombre", "Dni", "edad", "Cantidad Dinero", "cuota", "Valor cuota" };

		tabla = new JTable(datos, columnas);
		tabla.isEditing();
		tabla.setEnabled(false);

		sp = new JScrollPane(tabla);
		sp.setBounds(15, 30, 480, 255);
		add(sp);
	}
}
