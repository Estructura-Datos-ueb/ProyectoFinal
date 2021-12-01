package co.edu.unbosque.view;

import java.awt.*;

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

		setBounds(0, 25, 1000, 800);
		setLayout(null);
		setBackground(new Color(42, 197, 211));

	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public void agregarTabla(Object datos[][]) {

		String columnas[] = {"Titulo", "Estudio", "Estado", "Versiones", "Precio", "Clasificacion", "Anio", "Genero", "Fecha Publicacion", "ID" };
		Color c1 = new Color(20, 16, 3);
		Color c2 = new Color(42, 197, 211);
		tabla = new JTable(datos, columnas);
		tabla.isEditing();
		tabla.setEnabled(false);
		tabla.setBackground(c1);
		tabla.setForeground(c2);


		sp = new JScrollPane(tabla);
		sp.setBounds(15, 0, 950, 750);


		add(sp);
	}
}
