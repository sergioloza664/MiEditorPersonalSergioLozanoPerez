package eventos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.text.StyledEditorKit;

import aciones.Accion;
import aciones.Editar;
import aciones.Imagen;
import aciones.Tema;
import constantes.Constantes;
import idiomas.Idioma;
import paneles.PanelPrincipal;

/**
 * Clase que contiene los eventos que ocurren al pulsar los botones y menus y que redirigiran a su respectiva accion,
 * y tambien contiene metodos de coherencia de coherencia de botones con los menus
 * @author sergio
 *
 */
public class Evento implements ActionListener {
	private PanelPrincipal panelPrincipal;
	/**
	 * Construye un nuevo Evento con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public Evento(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	
	/**
	 * Administra los eventos que ricibe de los menus o botones y los redirige a su respectiva accion en otra clase.
	 * @param e. Parametro recibido un menu o boton al ser pulsado.
	 */
	public void actionPerformed(ActionEvent e) {

		Accion accion = new Accion(panelPrincipal);
		Editar editar =new Editar(panelPrincipal);
		Imagen imagen= new Imagen(panelPrincipal);
		Tema tema =new Tema(panelPrincipal);

		switch (e.getActionCommand()) {
		// Botones del evento abrir guardar y salir
		case "botonAbrir":
			accion.abrirArchivo();
			break;

		case "botonGuardar":
			accion.guardarArchivo();
			break;

		case "botonSalir":
			accion.salirPrograma();
			break;

		// Botones estilo
		case "botonNegrita":
			accion.negrita(e);
			seleccionEstilo("botonNegrita");
			break;

		case "botonCursiva":
			accion.cursiva(e);
			seleccionEstilo("botonCursiva");
			break;

		case "botonSubrayar":
			accion.subrayar(e);
			seleccionEstilo("botonSubrayar");
			break;

		// ComboBox tamanño de letra en el panel de botones
		case "comboBoxTamanyoLetra":
			accion.tamanyoLetra((Integer) panelPrincipal.getPanelNorte().getPanelIconos().getComboBoxTamanyoLetra()
					.getSelectedItem(), e);
			break;

		// ComboBox tipo de letra (fuente) en el panel de botones
		case "comboBoxTipografia":
			accion.tipografiaLetra(
					(String) panelPrincipal.getPanelNorte().getPanelIconos().getComboBoxTipografia().getSelectedItem(),
					e);
			break;

		// Botones alineacion del texto
		case "botonTextoIzquierda":
			accion.textoIzquierda(e);
			seleccionAlineacion("botonTextoIzquierda");
			break;

		case "botonTextoCentrado":
			accion.textoCentrado(e);
			seleccionAlineacion("botonTextoCentrado");

			break;

		case "botonTextoDerecha":
			accion.textoDerecha(e);
			seleccionAlineacion("botonTextoDerecha");

			break;

		case "botonTextoJustificado":
			accion.textoJustificado(e);
			seleccionAlineacion("botonTextoJustificado");

			break;

		// boton color de la fuente
		case "botonColorFuente":
			accion.colorFuente(e);
			break;

		// botones idioma
		case "botonEspanol":
			new Idioma(panelPrincipal).textosEspanol();
			seleccionIdioma("botonEspanol");
			break;

		case "botonIngles":
			new Idioma(panelPrincipal).textosIngles();
			seleccionIdioma("botonIngles");
			break;

		// Elementos del menu archivo
		case "menuItemAbrir":
			accion.abrirArchivo();
			break;

		case "menuItemGuardar":
			accion.guardarArchivo();
			break;

		case "menuItemSalir":
			accion.salirPrograma();
			break;
			
		//Menu editar
		case "menuItemCortar":
			editar.cortar();
			break;
			
		case "menuItemCopiar":
			editar.copiar();;
			break;
			
		case "menuItemPegar":
			editar.pegar();		
			break;
			
		//Menu insertar	
		case "menuItemImagen":
			imagen.abrirImagen();		
			break;
			
		
		//menu fuente	
		case "menuItemFuente":
			accion.ventanaFuente(e);
			break;

		// Menu estilo
		case "menuItemNegrita":
			accion.negrita(e);
			seleccionEstilo("menuItemNegrita");
			break;

		case "menuItemCursiva":
			accion.cursiva(e);
			seleccionEstilo("menuItemCursiva");
			break;

		case "menuItemSubrayar":
			accion.subrayar(e);
			seleccionEstilo("menuItemSubrayar");
			break;

		// Item del menu tamaño
		case "menuItemTamanyo":
			accion.ventanaTamanyo(e);
			break;

		

		// Items del menu parrafo
		case "menuItemIzquierda":
			accion.textoIzquierda(e);
			seleccionAlineacion("menuItemIzquierda");
			break;

		case "menuItemCentrado":
			accion.textoCentrado(e);
			seleccionAlineacion("menuItemCentrado");
			break;

		case "menuItemDerecha":
			accion.textoDerecha(e);
			seleccionAlineacion("menuItemDerecha");
			break;

		case "menuItemJustificado":
			accion.textoJustificado(e);
			seleccionAlineacion("menuItemJustificado");
			break;

		// Estilos del menu contextual
		case "menuItemContextualNegrita":
			accion.negrita(e);
			seleccionEstilo("menuItemContextualNegrita");
			break;

		case "menuItemContextualCursiva":
			accion.cursiva(e);
			seleccionEstilo("menuItemContextualCursiva");
			break;

		case "menuItemContextualSubrayar":
			accion.subrayar(e);
			seleccionEstilo("menuItemContextualSubrayar");
			break;

		// Alineacion del menu contextual
		case "menuItemContextualIzquierda":
			accion.textoIzquierda(e);
			seleccionAlineacion("menuItemContextualIzquierda");
			break;

		case "menuItemContextualCentrado":
			accion.textoCentrado(e);
			seleccionAlineacion("menuItemContextualCentrado");

			break;

		case "menuItemContextualDerecha":
			accion.textoDerecha(e);
			seleccionAlineacion("menuItemContextualDerecha");

			break;

		case "menuItemContextualJustificado":
			accion.textoJustificado(e);
			seleccionAlineacion("menuItemContextualJustificado");

			break;
		//Opcion color del menu
		case "menuItemColorFuente":
			accion.colorFuente(e);
			break;
		//Informacion acerca de dentro del menu
		case "menuItemAcercaDe":
			accion.acercaDe();
			break;
		
		//opciones de idioma del menu
		case "menuItemEspanol":
			new Idioma(panelPrincipal).textosEspanol();
			seleccionIdioma("menuItemEspanol");
			break;

		case "menuItemIngles":
			new Idioma(panelPrincipal).textosIngles();
			seleccionIdioma("menuItemIngles");
			break;

		default:
			break;
		}
		
		
		//temas actionCommands, fuera del switch para no crear los action comands fijos y estos sean dependiendo de los temos del S.O.
		for (UIManager.LookAndFeelInfo lafi : UIManager.getInstalledLookAndFeels()) {
			if (e.getActionCommand().equals(lafi.getName())) {
				tema.cambioTema(e.getActionCommand());
			}
		}
		
		

	}
	
	
	
	
	//Coherencia de alineacion entre botones, el menu y menu contextual de la alineacion del texto
	//-----------------------------------------------------------------------------------------------------------
	private void seleccionAlineacion(String actionComand) {
		if (actionComand.equals("botonTextoIzquierda") || actionComand.equals("menuItemIzquierda")
				|| actionComand.equals("menuItemContextualIzquierda")) {
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

		}

		if (actionComand.equals("botonTextoCentrado") || actionComand.equals("menuItemCentrado")
				|| actionComand.equals("menuItemContextualCentrado")) {
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

		}

		if (actionComand.equals("botonTextoDerecha") || actionComand.equals("menuItemDerecha")
				|| actionComand.equals("menuItemContextualDerecha")) {
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

		}

		if (actionComand.equals("botonTextoJustificado") || actionComand.equals("menuItemJustificado")
				|| actionComand.equals("menuItemContextualJustificado")) {
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
	
	

	/**
	 * Coherencia de idioma entre botones y el menu del idioma.
	 * @param actionComand. String del elemento de idioma pulsado.
	 */
	private void seleccionIdioma(String actionComand) {
		if (actionComand.equals("botonEspanol") || actionComand.equals("menuItemEspanol")) {
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonEspanol().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonIngles().setSelected(false);
			
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemEspanol().setSelected(true);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIngles().setSelected(false);
		}
		if (actionComand.equals("botonIngles") || actionComand.equals("menuItemIngles")) {
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonEspanol().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelIconos().getBotonIngles().setSelected(true);
			
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemEspanol().setSelected(false);
			panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIngles().setSelected(true);
		}

	}
	
	
	
	

	
	/**
	 * Coherencia de estilo entre botones, el menu y menu contextual de los estilos.
	 * @param actionComand. String del elemento de estilos pulsado.
	 */
	private void seleccionEstilo(String actionComand) {
		//Negrita	
		//----------------------------------
		boolean negritaBoton = panelPrincipal.getPanelNorte().getPanelIconos().getBotonNegrita().isSelected();
		boolean negritaMenu = panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemNegrita().isSelected();
		boolean negritaMenuContext = panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemNegrita().isSelected();
			
		if (actionComand.equals("botonNegrita")) {
			if (negritaBoton) {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemNegrita().setSelected(true);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemNegrita().setSelected(true);
			} else if (negritaMenu || negritaMenuContext) {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemNegrita().setSelected(false);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemNegrita().setSelected(false);
			}
		}
		
		

		if (actionComand.equals("menuItemNegrita")) {
			if (negritaMenu) {
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonNegrita().setSelected(true);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemNegrita().setSelected(true);
			} else if (negritaBoton || negritaMenuContext) {
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonNegrita().setSelected(false);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemNegrita().setSelected(false);
			}
		}
		
		

		if (actionComand.equals("menuItemContextualNegrita")) {
			if (negritaBoton || negritaMenu) {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemNegrita().setSelected(false);
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonNegrita().setSelected(false);
			} else {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemNegrita().setSelected(true);
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonNegrita().setSelected(true);

			}
		}
		
		
		
		//Cursiva
		//-----------------------------------------------------------
		boolean cursivaBoton = panelPrincipal.getPanelNorte().getPanelIconos().getBotonCursiva().isSelected();
		boolean cursivaMenu = panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemCursiva().isSelected();
		boolean cursivaMenuContext = panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCursiva().isSelected();
		
		if (actionComand.equals("botonCursiva")) {
			if (cursivaBoton) {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemCursiva().setSelected(true);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCursiva().setSelected(true);
			} else if (cursivaMenu || cursivaMenuContext) {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemCursiva().setSelected(false);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCursiva().setSelected(false);
			}
		}
		
		

		if (actionComand.equals("menuItemCursiva")) {
			if (cursivaMenu) {
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonCursiva().setSelected(true);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCursiva().setSelected(true);
			} else if (cursivaBoton || cursivaMenuContext) {
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonCursiva().setSelected(false);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCursiva().setSelected(false);
			}
		}
		
		

		if (actionComand.equals("menuItemContextualCursiva")) {
			if (cursivaBoton || cursivaMenu) {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemCursiva().setSelected(false);
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonCursiva().setSelected(false);
			} else {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemCursiva().setSelected(true);
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonCursiva().setSelected(true);

			}
		}
		
		
		
		//Subrayar
		//------------------------------------
		boolean subrayarBoton = panelPrincipal.getPanelNorte().getPanelIconos().getBotonSubrayar().isSelected();
		boolean subrayarMenu = panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemSubrayar().isSelected();
		boolean subrayarMenuContext = panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemSubrayar().isSelected();
		
		if (actionComand.equals("botonSubrayar")) {
			if (subrayarBoton) {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemSubrayar().setSelected(true);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemSubrayar().setSelected(true);
			} else if (subrayarMenu || subrayarMenuContext) {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemSubrayar().setSelected(false);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemSubrayar().setSelected(false);
			}
		}
		
		

		if (actionComand.equals("menuItemSubrayar")) {
			if (subrayarMenu) {
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonSubrayar().setSelected(true);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemSubrayar().setSelected(true);
			} else if (subrayarBoton || subrayarMenuContext) {
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonSubrayar().setSelected(false);
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemSubrayar().setSelected(false);
			}
		}
		
		

		if (actionComand.equals("menuItemContextualSubrayar")) {
			if (subrayarBoton || subrayarMenu) {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemSubrayar().setSelected(false);
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonSubrayar().setSelected(false);
			} else {
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemSubrayar().setSelected(true);
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonSubrayar().setSelected(true);

			}
		}
		
		
		
		

	}

}
