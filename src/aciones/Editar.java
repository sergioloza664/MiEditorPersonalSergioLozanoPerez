package aciones;

import java.awt.Font;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.AttributeSet;
import javax.swing.text.StyledDocument;

import paneles.PanelPrincipal;

/**
 * En esta clase tenemos las acciones cortar , copiar y pegar con los respectivos estilos del texto seleccionado
 * @author sergio
 *
 */
public class Editar {
	private PanelPrincipal panelPrincipal;
	

	private AttributeSet atributo;
	private List<AttributeSet> atributos;
	/**
	 * Construye un nuevo Editar con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public Editar(PanelPrincipal panelPrincipal){
		this.panelPrincipal=panelPrincipal;
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * Copia un texto seleccionado al portapapeles.
	 */
	public void copiar() {
		copiarFormatoSeleccionado();//Obtenemos los atributos del texto seleccionado	
		panelPrincipal.getPanelCentral().copy(); // copia el texto normal
	}
	
	
	
	
	/**
	 * Obtiene los estilos del texto seleccionado.
	 */
	private void copiarFormatoSeleccionado() {
		
		StyledDocument documento = panelPrincipal.getPanelCentral().getStyledDocument();
		atributos = new LinkedList<AttributeSet>();//lista de los atributos
		int inicio = panelPrincipal.getPanelCentral().getSelectionStart();//inicio texto seleccionado
		int fin = panelPrincipal.getPanelCentral().getSelectionEnd();//fin tento seleccionado

		// Copia caracter a caracter una lista de las fuentes seleccionadas.
		for (int i = inicio; i < fin; i++) {
			atributo = documento.getCharacterElement(i).getAttributes();//obtenemos todos los atributos de cada caracter			
			atributos.add(atributo);//añadimos cada caracter a la lista
		}
	}
	
	
	/**
	 * Corta un texto seleccionado al portapapeles.
	 */
	public void cortar() {
		this.copiarFormatoSeleccionado();//Obtenemos los atributos del texto seleccionado
		panelPrincipal.getPanelCentral().cut();//corta el texto
	}
	
	
	/**
	 * Pega un texto desde portapapeles
	 */
	public void pegar() {
		
		panelPrincipal.getPanelCentral().paste();// pega el texto plano, despuer de pegarlo aplica a este los distintos atributos

		
		
		int longitudTexto = atributos.size();//cantidad de atributos
		int posicion = panelPrincipal.getPanelCentral().getCaretPosition();//posicion actual del cursor
		
		//recorre el texto añadiendo a cada caracter los atributos obtenidos del metodo copiar, el caretPosition esta a la derecha del texto
		for (int i = 0; i < longitudTexto; i++) {
			panelPrincipal.getPanelCentral().getStyledDocument().setCharacterAttributes(posicion - longitudTexto + i, 1, atributos.get(i),
					true); // recorremos la posicion del texto seleccionado, longitud de los cambios, un atributo de la lista, con true borra los atributos antes de poner los nuevos
		}
		
	}
	
	
	
	
	
	

}
