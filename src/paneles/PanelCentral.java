package paneles;


import java.awt.Color;
import javax.swing.JTextPane;
import eventos.EventoRaton;
import menus.MenuContextual;

/**
 * Clase encargada de crear el panel de texto.
 * @author sergio
 *
 */
public class PanelCentral extends JTextPane{
	
	private PanelPrincipal panelPrincipal;
	private MenuContextual menuContextual;
	/**
	 * Construye un nuevo PanelCentral con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public PanelCentral(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
		this.setBackground(Color.white);//ponemos el fondo blanco

		menuContextual= new MenuContextual(panelPrincipal);
		this.setComponentPopupMenu(menuContextual); //Añadimos el menu contextual
		this.addMouseListener(new EventoRaton(panelPrincipal));
	}
	


	/**
	 * Devuelve el MenuContextual.
	 * @return MenuContextual. Variable del menu contextual
	 */
	public MenuContextual getMenuContextual() {
		return menuContextual;
	}

	/**
	 * Establece el MenuContextual.
	 * @param menuContextual. Variable del menu contextual.
	 */
	public void setMenuContextual(MenuContextual menuContextual) {
		this.menuContextual = menuContextual;
	}
	

	
	
}
