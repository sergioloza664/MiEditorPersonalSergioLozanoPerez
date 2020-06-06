package eventos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.AttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;

import constantes.Constantes;
import paneles.PanelPrincipal;

/**
 * En esta clase tenemos los eventos del raton con distintos click para la clase PanelCentral.
 * @author sergio
 *
 */
public class EventoRaton extends MouseAdapter{
	private PanelPrincipal panelPrincipal;

	private boolean contadorClick=true;
	
	private AttributeSet atributo;
	private int posicion;
	private String fuente;
	private int tamanyo;
	
	/**
	 * Construye un nuevo EventoRaton con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public EventoRaton(PanelPrincipal panelPrincipal) {
		this.panelPrincipal=panelPrincipal;
	}
	
	//
	/**
	 * Cuando hacemos el primer click ponemos el panel con estas caracteristicas para escribir
	 * @param e. Evento de raton.
	 */
	public void mouseClicked(MouseEvent e) {
		if (contadorClick) {
			contadorClick=false;
			new StyledEditorKit.AlignmentAction(null, StyleConstants.ALIGN_LEFT).actionPerformed(null);
			new StyledEditorKit.ForegroundAction(null, Color.BLACK).actionPerformed(null);//color texto
			new StyledEditorKit.FontFamilyAction(null, Constantes.tipografiatextoDefecto).actionPerformed(null);//Fuente defecto
			new StyledEditorKit.FontSizeAction(null, Constantes.tamanyoTextoDefecto).actionPerformed(null); //Tamaño defecto
		}
	}
	
	

	
	/**
	 * Usamos este metodo para activar botones de estilos segun el texto seleccionado en cada momento
	 * @param e. Evento de raton.
	 */
	public void mouseReleased(MouseEvent e) {
		//Comprobamos si hay texto seleccionado o donde esta el cursor
		//------------------------------------------------------------------------------------
		if (panelPrincipal.getPanelCentral().getSelectedText() != null) {
			posicion = panelPrincipal.getPanelCentral().getSelectionStart();
			atributo = panelPrincipal.getPanelCentral().getStyledDocument().getCharacterElement(posicion).getAttributes();

			// si no hay texto seleccionado obtiene los atributos del estilo de la posición del cursor
		} else {
			posicion = panelPrincipal.getPanelCentral().getCaretPosition();
			atributo = panelPrincipal.getPanelCentral().getCharacterAttributes();
			
			// Si el cursor se encuentra al final del texto obtiene los atributos de estilo de entrada
			if (posicion == panelPrincipal.getPanelCentral().getText().length()) {
				atributo = panelPrincipal.getPanelCentral().getInputAttributes();
			}
		}
		
		
		
		//Comprobamos que atributos de estilo contiene y los seleccionamos en los menus
		//----------------------------------------------------------------------------------
		//Negrita
		if (atributo.containsAttribute(StyleConstants.Bold, true)) {
			panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemNegrita().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonNegrita().setSelected(true);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemNegrita().setSelected(true);			
		} else {
			panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemNegrita().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonNegrita().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemNegrita().setSelected(false);		
		}
		
		//Cursiva
		if (atributo.containsAttribute(StyleConstants.Italic, true)) {
			panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemCursiva().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonCursiva().setSelected(true);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCursiva().setSelected(true);			
		} else {
			panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemCursiva().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonCursiva().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCursiva().setSelected(false);		
		}
		
		//Subrayar
		if (atributo.containsAttribute(StyleConstants.Underline, true)) {
			panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemSubrayar().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonSubrayar().setSelected(true);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemSubrayar().setSelected(true);			
		} else {
			panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemSubrayar().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonSubrayar().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemSubrayar().setSelected(false);		
		}
		
		
		//Obtenemos la fuente del texto y la ponemos en los menus
		//---------------------------------------------------------------------------------------------------
		fuente = panelPrincipal.getPanelCentral().getStyledDocument().getFont(atributo).getFontName();
		panelPrincipal.getPanelNorte().getPanelIconos().getComboBoxTipografia().setSelectedItem(fuente);//mandamos la fuente a la barra de botones
		Constantes.tipografiatextoDefecto=fuente;//cambiamos el valor de la constante que sera el que se use en el menu en la ventana emergente
		
		
		
		//Obtenemos el tamaño del texto y la ponemos en los menus
		//---------------------------------------------------------------------------
		tamanyo = panelPrincipal.getPanelCentral().getStyledDocument().getFont(atributo).getSize();
		panelPrincipal.getPanelNorte().getPanelIconos().getComboBoxTamanyoLetra().setSelectedItem(tamanyo);//mandamos el tamanño a la barra de botones
		Constantes.tamanyoTextoDefecto=tamanyo;//cambiamos el valor de la constante que sera el que se use en el menu en la ventana emergente
		
		
		
		//Obtenemos la alineacion del parrafo y seleccionamos en los menus las opciones
		//------------------------------------------------------------------------------------------------------------------
		atributo = panelPrincipal.getPanelCentral().getParagraphAttributes();// Obtenemos los atributos del parrafo donde esta el cursor

		// control de los atributos de alineado
		if (atributo.containsAttribute(StyleConstants.Alignment, StyleConstants.ALIGN_LEFT)) {
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoIzquierda().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoCentrado().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoDerecha().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoJustificado().setSelected(false);
			
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIzquierda().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCentrado().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemDerecha().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemJustificado().setSelected(false);
			
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemIzquierda().setSelected(true);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCentrado().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemDerecha().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemJustificado().setSelected(false);
			
		} else if (atributo.containsAttribute(StyleConstants.Alignment, StyleConstants.ALIGN_CENTER)) {
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoIzquierda().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoCentrado().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoDerecha().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoJustificado().setSelected(false);
			
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIzquierda().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCentrado().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemDerecha().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemJustificado().setSelected(false);
			
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemIzquierda().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCentrado().setSelected(true);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemDerecha().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemJustificado().setSelected(false);
			
		} else if (atributo.containsAttribute(StyleConstants.Alignment, StyleConstants.ALIGN_RIGHT)) {
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoIzquierda().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoCentrado().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoDerecha().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoJustificado().setSelected(false);
			
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIzquierda().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCentrado().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemDerecha().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemJustificado().setSelected(false);
			
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemIzquierda().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCentrado().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemDerecha().setSelected(true);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemJustificado().setSelected(false);
			
		} else if(atributo.containsAttribute(StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED)){
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoIzquierda().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoCentrado().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoDerecha().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoJustificado().setSelected(true);
			
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIzquierda().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCentrado().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemDerecha().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemJustificado().setSelected(true);
			
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemIzquierda().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCentrado().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemDerecha().setSelected(false);
			panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemJustificado().setSelected(true);
			
		}
		
		
		
	}	

}
