package paneles;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.JPanel;


/**
 * Contenedor para las clases del menu y la de los botones
 * @author sergio
 *
 */
public class PanelNorte extends JPanel{
	private Box cajaVerticalNorte;
	
	private PanelMenu panelMenu;
	private PanelIconos panelIconos;
	private PanelPrincipal panelPrincipal;
	/**
	 * Construye un nuevo PanelNorte con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public PanelNorte(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
		this.setLayout(new BorderLayout());//Aplicamos la disposicion de ordenacion de los elementos BorderLayout
		panelMenu=new PanelMenu(panelPrincipal);
		
		//con esta linea el menu ocupa el principio de este panel y la barra de herramientas estaria debajo, 
		//si pusieramos LINR_START los dos paneles estarian uno adetras del otro
		this.add(panelMenu, BorderLayout.PAGE_START);
		
		panelIconos=new PanelIconos(panelPrincipal);
		this.add(panelIconos);
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * Devuelve el PanelMenu
	 * @return PanelMenu. Variable del pane del menu.
	 */
	public PanelMenu getPanelMenu() {
		return panelMenu;
	}

	/**
	 * Establece el PanelMenu
	 * @param PanelMenu. Variable del panel del menu.
	 */
	public void setPanelMenu(PanelMenu panelMenu) {
		this.panelMenu = panelMenu;
	}

	/**
	 * Devuelve el PanelIconos
	 * @return PanelIconos. Variable del panel de iconos.
	 */
	public PanelIconos getPanelIconos() {
		return panelIconos;
	}

	/**
	 * Establece el PanelIconos
	 * @param PanelIconos. Variable del panel de iconos.
	 */
	public void setPanelIconos(PanelIconos panelIconos) {
		this.panelIconos = panelIconos;
	}

	/**
	 * Devuelve el Panelprincipal
	 * @return PanelPrincipal. Variable del panel principal.
	 */
	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}

	/**
	 * Establece el PanelPrincipal
	 * @param PanelPrincipal. Variable del panel principal.
	 */
	public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	
	

	
}
