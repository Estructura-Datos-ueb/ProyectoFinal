package co.edu.unbosque.view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class PanelBuscar extends JPanel {

	public JButton buscar;
	public JButton limpiar;
	public JTextField campoTexto1;
	public JTextField campo_Texto2;
	public JComboBox<String> listaOpciones;
	JLabel etiqueta1;
	JLabel etiqueta2;
	JLabel etiqueta_id;
	JLabel etiqueta_titulo;


	public PanelBuscar() {

		setBounds(250, 25, 660, 300);
		setLayout(null);
		setBackground(new Color(100,177,255));

		etiqueta_titulo = new JLabel("Buscar pelicula dados ciertos parametros");
		Font fuente=new Font("Dialog", Font.BOLD, 18);
		etiqueta_titulo.setFont(fuente);
		etiqueta_titulo.setBounds(199, 30, 400, 30);
		add(etiqueta_titulo);

		etiqueta_id = new JLabel("Buscar por:");
		etiqueta_id.setBounds(20, 100, 200, 30);
		add(etiqueta_id);

		String[] lista = {"Clasificacion", "Version", "Genero",
				"Periodo Anual de Debut", "titulo" ,"Ejemplares mas costosos segun el genero"};

		listaOpciones = new JComboBox<String>();
		for (String elem:lista) {
			listaOpciones.addItem(elem);
		}
		listaOpciones.setBounds(170, 100, 250, 30);
		listaOpciones.setActionCommand("parametro");
		add(listaOpciones);

		etiqueta1 = new JLabel("");
		etiqueta1.setBounds(20, 150, 200, 30);
		add(etiqueta1);

		campoTexto1 = new JTextField();
		campoTexto1.setBounds(170, 150, 250, 30);
		campoTexto1.setEnabled(false);
		add(campoTexto1);

		etiqueta2 = new JLabel("");
		etiqueta2.setBounds(20, 200, 200, 30);
		add(etiqueta2);

		campo_Texto2 = new JTextField();
		campo_Texto2.setBounds(170, 200, 250, 30);
		campo_Texto2.setEnabled(false);
		add(campo_Texto2);

		buscar = new JButton("Buscar");
		buscar.setBounds(430, 100, 80, 27);
		buscar.setActionCommand("buscarCategoria");
		add(buscar);

		limpiar = new JButton("Limpiar Formulario");
		limpiar.setActionCommand("limpiarPanelFiltro");
		limpiar.setBounds(370, 250, 150, 27);
		add(limpiar);


	}

	public void limpiarFormulario() {
		campoTexto1.setText("");
		campo_Texto2.setText("");
	}

	public void cambiarTexto(String tipo){
		limpiarListas();
		campoTexto1.setEnabled(true);
		switch (tipo){
			case "Periodo Anual de Debut":
				etiqueta1.setText("Desde el anio: ");
				etiqueta2.setText("Hasta el anio: ");
				campo_Texto2.setEnabled(true);
				break;
			case "Clasificacion":
				etiqueta1.setText("Clasificacion de la pelicula: ");
				etiqueta2.setText("");
				campo_Texto2.setEnabled(false);
				break;
			case "Version":
				etiqueta1.setText("Version de la pelicula: ");
				etiqueta2.setText("");

				campo_Texto2.setEnabled(false);
				break;
			case "Genero":
				etiqueta1.setText("Genero de la pelicula: ");
				etiqueta2.setText("");
				campo_Texto2.setEnabled(false);
				break;
			case "titulo":
				etiqueta1.setText("Titulo de la pelicula: ");
				etiqueta2.setText("");
				campo_Texto2.setEnabled(false);
				break;
			case "Ejemplares mas costosos segun el genero":
				etiqueta1.setText("Genero de la pelicula: ");
				etiqueta2.setText("# de ejemplares a mostrar");
				campo_Texto2.setEnabled(true);
				break;
		}
	}

	public void limpiarListas(){
		campoTexto1.setText("");
		campo_Texto2.setText("");
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	public JButton getLimpiar() {
		return limpiar;
	}

	public void setLimpiar(JButton limpiar) {
		this.limpiar = limpiar;
	}


	public JTextField getCampoTexto1() {
		return campoTexto1;
	}

	public void setCampoTexto1(JTextField campoTexto1) {
		this.campoTexto1 = campoTexto1;
	}

	public JTextField getCampo_Texto2() {
		return campo_Texto2;
	}

	public void setCampo_Texto2(JTextField campo_Texto2) {
		this.campo_Texto2 = campo_Texto2;
	}

	public JComboBox<String> getListaOpciones() {
		return listaOpciones;
	}

	public void setListaOpciones(JComboBox<String> listaOpciones) {
		this.listaOpciones = listaOpciones;
	}

	public JLabel getEtiqueta1() {
		return etiqueta1;
	}

	public void setEtiqueta1(JLabel etiqueta1) {
		this.etiqueta1 = etiqueta1;
	}

	public JLabel getEtiqueta2() {
		return etiqueta2;
	}

	public void setEtiqueta2(JLabel etiqueta2) {
		this.etiqueta2 = etiqueta2;
	}

	public JLabel getEtiqueta_id() {
		return etiqueta_id;
	}

	public void setEtiqueta_id(JLabel etiqueta_id) {
		this.etiqueta_id = etiqueta_id;
	}

	public JLabel getEtiqueta_titulo() {
		return etiqueta_titulo;
	}

	public void setEtiqueta_titulo(JLabel etiqueta_titulo) {
		this.etiqueta_titulo = etiqueta_titulo;
	}
}