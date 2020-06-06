package aciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

import constantes.Constantes;
import idiomas.Idioma;
import paneles.PanelPrincipal;

/**
 * En esta clase estan la mayoria de las aciones que ejecutaran los menus y botones a traves de la clase Evento, incluye las ventanas 
 * emergentes de los menus: color, tamaño, fuente, acerca de
 * @author sergio
 */
public class Accion {
	
	private PanelPrincipal panelPrincipal;
	
	/**
	 * Construye una nueva Accion con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public Accion(PanelPrincipal panelPrincipal) {
		this.panelPrincipal=panelPrincipal;
	}
	
	/**
	 * Pone el texto en negrita
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void negrita(ActionEvent e) {
		new StyledEditorKit.BoldAction().actionPerformed(e);
	}
	
	/**
	 * Pone el texto en cursiva
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void cursiva(ActionEvent e) {
		new StyledEditorKit.ItalicAction().actionPerformed(e);
	}
	
	/**
	 * Pone el texto en subrayado
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void subrayar(ActionEvent e) {
		new StyledEditorKit.UnderlineAction().actionPerformed(e);
	}
	
	/**
	 * Cambia el tamaño del texto
	 * @param tamanyo. Tamaño del texto escogido.
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void tamanyoLetra(Integer tamanyo, ActionEvent e) {
		Constantes.tamanyoTextoDefecto=tamanyo;
			new StyledEditorKit.FontSizeAction(null, tamanyo).actionPerformed(e);
	}
	
	/**
	 * Cambia la fuente del texto.
	 * @param letra. Fuente del texto escogida.
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void tipografiaLetra(String letra, ActionEvent e) {
		Constantes.tipografiatextoDefecto=letra;
		new StyledEditorKit.FontFamilyAction(null, letra).actionPerformed(e);
	}
	/**
	 * Pone el texto alineado a la izquierda
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void textoIzquierda(ActionEvent e) {
		new StyledEditorKit.AlignmentAction(null, StyleConstants.ALIGN_LEFT).actionPerformed(e);
	}
	/**
	 * Pone el texto centrado
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void textoCentrado(ActionEvent e) {
		new StyledEditorKit.AlignmentAction(null, StyleConstants.ALIGN_CENTER).actionPerformed(e);
	}
	/**
	 * Pone el texto alineado a la derecha
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void textoDerecha(ActionEvent e) {
		new StyledEditorKit.AlignmentAction(null, StyleConstants.ALIGN_RIGHT).actionPerformed(e);
	}
	/**
	 * Pone el texto justificado
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void textoJustificado(ActionEvent e) {
		new StyledEditorKit.AlignmentAction(null, StyleConstants.ALIGN_JUSTIFIED).actionPerformed(e);
	}
	/**
	 * Abre un documento usando de la clase Archivo el metodo abrirArchivo
	 */
	public void abrirArchivo() {
		Archivo archivo=new Archivo(panelPrincipal);
		archivo.abrirArchivo();

	}
	/**
	 * Guarda un documento usando de la clase Archivo el metodo guardarArchivo
	 */
	public void guardarArchivo() {
		Archivo archivo=new Archivo(panelPrincipal);
		archivo.guardarArchivo();
	}
	/**
	 * Crea una ventana que nos pregunta si queremos salir, en caso afirrmativo salimos del programa.
	 */
	public void salirPrograma() {
		String si=Idioma.siVentanaSalir;
		String no=Idioma.noVentanaSalir;
		String descripcion=Idioma.descripcionVentanaSalir;
		String titulo=Idioma.tituloVentanaSalir;
		
		int seleccion = JOptionPane.showOptionDialog(panelPrincipal, descripcion, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[] { si, no, }, si);
		if (seleccion==0) { System.exit(0); }
			
		
		
	}
	/**
	 * Crea una ventana que nos muestra informacion del creador y las licencias de los recursos.
	 */
	public void acercaDe() {
		
		String titulo=Idioma.tituloAcercaDe;
		String descripcion=Idioma.descripcionAcercaDe;
		
		JOptionPane.showOptionDialog(panelPrincipal, descripcion, titulo, 
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] { Idioma.ventanaFuenteAceptar }, 
				Idioma.ventanaFuenteAceptar);
	}
	
	/**
	 * Crea una ventana en la que escogemos un color, el cual se aplicara al texto.
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void colorFuente(ActionEvent e) {
		String titulo=Idioma.tituloVentanaColor;
		JColorChooser vColores=new JColorChooser();  
		vColores.setDefaultLocale(Idioma.traduccionVentanaColor);
		Color color=vColores.showDialog(null, titulo, Color.gray);

		
		new StyledEditorKit.ForegroundAction(null, color).actionPerformed(e);
	}
	
	
	
	
	/**
	 * Crea una ventana en la que escogemos una fuente, la cual se aplicara al texto.
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void ventanaFuente(ActionEvent e) {
		JComboBox<String> jcb = new JComboBox<String>(Constantes.listaTipografia);
		jcb.setSelectedItem(Constantes.tipografiatextoDefecto);
		
		JOptionPane.showOptionDialog(panelPrincipal, jcb, Idioma.ventanaFuenteTitulo, 
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] { Idioma.ventanaFuenteAceptar }, 
				Idioma.ventanaFuenteAceptar);
		Constantes.tipografiatextoDefecto=jcb.getSelectedItem().toString();
		panelPrincipal.getPanelNorte().getPanelIconos().getComboBoxTipografia().setSelectedItem(Constantes.tipografiatextoDefecto);
		tipografiaLetra(jcb.getSelectedItem().toString(), e); 
	}
	
	
	
	/**
	 * Crea una ventana en la que escogemos un tamaño, el cual se aplicara al texto.
	 * @param e. Parametro recibido de la clase que maneja los eventos(Evento).
	 */
	public void ventanaTamanyo(ActionEvent e) {
		JComboBox<Integer> jcb = new JComboBox<Integer>(Constantes.listaTamanyo);
		jcb.setSelectedItem(Constantes.tamanyoTextoDefecto);
		JOptionPane.showOptionDialog(panelPrincipal, jcb, Idioma.ventanaTamanyoTitulo, 
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] { Idioma.ventanaTamanyoAceptar }, 
				Idioma.ventanaTamanyoAceptar);
		
		
		Constantes.tamanyoTextoDefecto=(int)jcb.getSelectedItem();
		panelPrincipal.getPanelNorte().getPanelIconos().getComboBoxTamanyoLetra().setSelectedItem(Constantes.tamanyoTextoDefecto);
		tamanyoLetra((int)jcb.getSelectedItem(), e); 
	}
	
	
	
}
