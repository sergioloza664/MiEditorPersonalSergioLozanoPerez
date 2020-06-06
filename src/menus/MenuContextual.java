package menus;


import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

import eventos.Evento;
import iconos.Icono;
import paneles.PanelPrincipal;
/**
 * Clase encargada de crear el menu contextual.
 * @author sergio
 *
 */
public class MenuContextual extends JPopupMenu{
	private PanelPrincipal panelPrincipal;
	
	
	private JMenuItem  menuItemCortar, menuItemCopiar, menuItemPegar;
	
	private JCheckBoxMenuItem menuItemNegrita, menuItemCursiva, menuItemSubrayar;
	private JRadioButtonMenuItem menuItemIzquierda, menuItemCentrado, menuItemDerecha, menuItemJustificado;
	private ButtonGroup grupoAlineacion;
	
	/**
	 * Construye un nuevo MenuContextual con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public MenuContextual(PanelPrincipal panelPrincipal) {
		this.panelPrincipal=panelPrincipal;
		
		//cortar, copiar y pegar
		//-------------------------------------------------------
		menuItemCortar=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_editar_cortar"), Icono.iconoCortar());
		menuItemCortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuItemCortar.setActionCommand("menuItemContextualCortar");
		menuItemCortar.addActionListener(new Evento(panelPrincipal));
		this.add(menuItemCortar);//Añade el item al menu contextual
		
		menuItemCopiar=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_editar_copiar"), Icono.iconoCopiar());
		menuItemCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuItemCopiar.setActionCommand("menuItemContextualCopiar");
		menuItemCopiar.addActionListener(new Evento(panelPrincipal));
		this.add(menuItemCopiar);		
		
		menuItemPegar=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_editar_pegar"), Icono.iconoPegar());
		menuItemPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuItemPegar.setActionCommand("menuItemContextualPegar");
		menuItemPegar.addActionListener(new Evento(panelPrincipal));
		this.add(menuItemPegar);
		
		
		this.addSeparator();	//Linea separadora en el menu
		
		//Estilos
		//-----------------------------------------------------------------------------------
		menuItemNegrita=new JCheckBoxMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_estilo_negrita"), Icono.botonNegrita());
		menuItemNegrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		menuItemNegrita.setActionCommand("menuItemContextualNegrita");
		menuItemNegrita.addActionListener(new Evento(panelPrincipal));
		this.add(menuItemNegrita);
		
		
		menuItemCursiva=new JCheckBoxMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_estilo_cursiva"), Icono.botonCursiva());
		menuItemCursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
		menuItemCursiva.setActionCommand("menuItemContextualCursiva");
		menuItemCursiva.addActionListener(new Evento(panelPrincipal));
		this.add(menuItemCursiva);
		
		
		menuItemSubrayar=new JCheckBoxMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_estilo_subrayar"), Icono.botonSubrayar());
		menuItemSubrayar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		menuItemSubrayar.setActionCommand("menuItemContextualSubrayar");
		menuItemSubrayar.addActionListener(new Evento(panelPrincipal));
		this.add(menuItemSubrayar);
		
		
		this.addSeparator();	//Linea separadora en el menu
		
		//Alineacion
		//--------------------------------------------------------------------
		grupoAlineacion=new ButtonGroup();
		
		menuItemIzquierda=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_parrafo_izquierda"), Icono.botonTextoIzquierda());
		menuItemIzquierda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
		menuItemIzquierda.setActionCommand("menuItemContextualIzquierda");
		menuItemIzquierda.addActionListener(new Evento(panelPrincipal)); 
		this.add(menuItemIzquierda);
		grupoAlineacion.add(menuItemIzquierda);//grupo para no poder pulsar varios a la vez
		
		menuItemCentrado=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_parrafo_centrado"), Icono.botonTextoCentrado());
		menuItemCentrado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
		menuItemCentrado.setActionCommand("menuItemContextualCentrado");
		menuItemCentrado.addActionListener(new Evento(panelPrincipal));
		this.add(menuItemCentrado);
		grupoAlineacion.add(menuItemCentrado);
		
		menuItemDerecha=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_parrafo_derecha"), Icono.botonTextoDerecha());
		menuItemDerecha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		menuItemDerecha.setActionCommand("menuItemContextualDerecha");
		menuItemDerecha.addActionListener(new Evento(panelPrincipal));
		this.add(menuItemDerecha);
		grupoAlineacion.add(menuItemDerecha);
		
		menuItemJustificado=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_parrafo_justificado"), Icono.botonTextoJustificado());
		menuItemJustificado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_DOWN_MASK));
		menuItemJustificado.setActionCommand("menuItemContextualJustificado");
		menuItemJustificado.addActionListener(new Evento(panelPrincipal));
		this.add(menuItemJustificado);
		grupoAlineacion.add(menuItemJustificado);
		
	}
	
	
	
	
	
	
	
	
	/**
	 * Devuelve el PanelMrincipal
	 * @return PanelPrincipal. Variable del panelprincipal.
	 */
	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}
	/**
	 * Establece el PanelPrincipal
	 * @param PanelPrincipal. Variable del panelprincipal.
	 */
	public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

	/**
	 * Devuelve el JCheckBoxMenuItem de negrita.
	 * @return JCheckBoxMenuItem. Variable del item negrita.
	 */
	public JCheckBoxMenuItem getMenuItemNegrita() {
		return menuItemNegrita;
	}
	
	/**
	 * Establece el JCheckBoxMenuItem de negrita.
	 * @param menuItemNegrita. Variable del item negrita.
	 */
	public void setMenuItemNegrita(JCheckBoxMenuItem menuItemNegrita) {
		this.menuItemNegrita = menuItemNegrita;
	}


	/**
	 * Devuelve el JCheckBoxMenuItem de cursiva.
	 * @return JCheckBoxMenuItem. Variable del item cursiva.
	 */
	public JCheckBoxMenuItem getMenuItemCursiva() {
		return menuItemCursiva;
	}


	/**
	 * Establece el JCheckBoxMenuItem de cursiva.
	 * @param menuItemCursiva. Variable del item cursiva.
	 */
	public void setMenuItemCursiva(JCheckBoxMenuItem menuItemCursiva) {
		this.menuItemCursiva = menuItemCursiva;
	}

	/**
	 * Devuelve el JCheckBoxMenuItem de subrayar.
	 * @return JCheckBoxMenuItem. Variable del item subrayar.
	 */
	public JCheckBoxMenuItem getMenuItemSubrayar() {
		return menuItemSubrayar;
	}

	/**
	 * Establece el JCheckBoxMenuItem de subrayar.
	 * @param menuItemSubrayar. Variable del item subrayar.
	 */
	public void setMenuItemSubrayar(JCheckBoxMenuItem menuItemSubrayar) {
		this.menuItemSubrayar = menuItemSubrayar;
	}

	/**
	 * Devuelve el JRadioButtonMenuItem de alineacion izquierda.
	 * @return JRadioButtonMenuItem. Variable del item izquierda.
	 */
	public JRadioButtonMenuItem getMenuItemIzquierda() {
		return menuItemIzquierda;
	}

	/**
	 * Establece el JRadioButtonMenuItem de alineacion izquierda.
	 * @param menuItemIzquierda. Variable del item izquierda.
	 */
	public void setMenuItemIzquierda(JRadioButtonMenuItem menuItemIzquierda) {
		this.menuItemIzquierda = menuItemIzquierda;
	}

	/**
	 * Devuelve el JRadioButtonMenuItem de alineacion centrado.
	 * @return JRadioButtonMenuItem. Variable del item centrado.
	 */
	public JRadioButtonMenuItem getMenuItemCentrado() {
		return menuItemCentrado;
	}

	/**
	 * Establece el JRadioButtonMenuItem de alineacion centrado.
	 * @param menuItemCentrado. Variable del item centrado.
	 */
	public void setMenuItemCentrado(JRadioButtonMenuItem menuItemCentrado) {
		this.menuItemCentrado = menuItemCentrado;
	}

	/**
	 * Devuelve el JRadioButtonMenuItem de alineacion derecha.
	 * @return JRadioButtonMenuItem. Variable del item derecha.
	 */
	public JRadioButtonMenuItem getMenuItemDerecha() {
		return menuItemDerecha;
	}

	/**
	 * Establece el JRadioButtonMenuItem de alineacion derecha.
	 * @param menuItemDerecha. Variable del item derecha.
	 */
	public void setMenuItemDerecha(JRadioButtonMenuItem menuItemDerecha) {
		this.menuItemDerecha = menuItemDerecha;
	}

	/**
	 * Devuelve el JRadioButtonMenuItem de alineacion justificado.
	 * @return JRadioButtonMenuItem. Variable del item justificado.
	 */
	public JRadioButtonMenuItem getMenuItemJustificado() {
		return menuItemJustificado;
	}
	/**
	 * Establece el JRadioButtonMenuItem de alineacion justificado.
	 * @param menuItemIJustificado. Variable del item justificado.
	 */
	public void setMenuItemJustificado(JRadioButtonMenuItem menuItemJustificado) {
		this.menuItemJustificado = menuItemJustificado;
	}
	/**
	 * Devuelve el JMenuItem de cortar.
	 * @return menuItemCortar. Variable del item cortar
	 */
	public JMenuItem getMenuItemCortar() {
		return menuItemCortar;
	}
	/**
	 * Establece el JMenuItem de cortar.
	 * @param menuItemICortar. Variable del item cortar.
	 */
	public void setMenuItemCortar(JMenuItem menuItemCortar) {
		this.menuItemCortar = menuItemCortar;
	}
	/**
	 * Devuelve el JMenuItem de copiar.
	 * @return menuItemCopiar. Variable del item copiar
	 */
	public JMenuItem getMenuItemCopiar() {
		return menuItemCopiar;
	}
	/**
	 * Establece el JMenuItem de copiar.
	 * @param menuItemICopiar. Variable del item copiar.
	 */
	public void setMenuItemCopiar(JMenuItem menuItemCopiar) {
		this.menuItemCopiar = menuItemCopiar;
	}
	/**
	 * Devuelve el JMenuItem de pegar.
	 * @return menuItemPegar. Variable del item pegar
	 */
	public JMenuItem getMenuItemPegar() {
		return menuItemPegar;
	}
	/**
	 * Establece el JMenuItem de pegar.
	 * @param menuItemIPegar. Variable del item Pegar.
	 */
	public void setMenuItemPegar(JMenuItem menuItemPegar) {
		this.menuItemPegar = menuItemPegar;
	}
	
	

	
	
	
	
	
	
}
