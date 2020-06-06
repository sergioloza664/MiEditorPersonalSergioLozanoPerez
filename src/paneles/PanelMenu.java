package paneles;

import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import eventos.Evento;
import iconos.Icono;

/**
 * Esta clase es la encargada de crear la barra del menu con sus respectivos menus dentro de ella
 * @author sergio
 *
 */
public class PanelMenu extends JPanel{
	private PanelPrincipal panelPrincipal;
	private JMenuBar barraMenu;
	private JMenu menuArchivo, menuEstilo, menuParrafo, menuColor, menuInformacion, menuIdioma, menuEditar,
		menuInsertar, menuTemas, menuFormato, menuOpciones;
	private JMenuItem menuItemAbrir, menuItemGuardar, menuItemSalir, menuItemColorFuente, menuItemAcercaDe,  
		menuItemCortar, menuItemCopiar, menuItemPegar, menuItemImagen,
		menuItemFuente, menuItemTamanyo;
	private JCheckBoxMenuItem checkBoxMenuItemNegrita, checkBoxMenuItemCursiva, checkBoxMenuItemSubrayar;
	private JRadioButtonMenuItem menuItemIzquierda, menuItemCentrado, menuItemDerecha, menuItemJustificado, 
	menuItemEspanol, menuItemIngles, menuItemTema;
	private ButtonGroup botonGrupoParrafo, botonGrupoIdioma, botonGrupoTemas;

	
	
	/**
	 * Construye un nuevo PanelMenu con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public PanelMenu(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
		creaBarraMenu();
		creaMenuArchivo();
		creaMenuEditar();		
		creaMenuInsertar();
		creaMenuFormato();
		creaMenuOpciones();
		creaMenuInformacion();
		
	}
	/**
	 * Crea la barra del menu
	 */
	private void creaBarraMenu() {
		barraMenu=new JMenuBar();
		this.setLayout(new BorderLayout());
		this.add(barraMenu, BorderLayout.LINE_START);//con esta linea esta clase ocupa una linea en el panelNorte, este elemento ocupara una sola linea
	}
	
	/**
	 * Crea el menu de archivo
	 */
	private void creaMenuArchivo() {
		menuArchivo= new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_archivo"));
		
		menuItemAbrir= new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_archivo_abrir"), Icono.botonAbrir());
		menuItemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));//Uso del item mediante el teclado
		menuItemAbrir.setActionCommand("menuItemAbrir");
		menuItemAbrir.addActionListener(new Evento(panelPrincipal));
		menuArchivo.add(menuItemAbrir);
		
		menuItemGuardar=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_archivo_guardar"), Icono.botonGuardar());
		menuItemGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
		menuItemGuardar.setActionCommand("menuItemGuardar");
		menuItemGuardar.addActionListener(new Evento(panelPrincipal));
		menuArchivo.add(menuItemGuardar);
		
		menuItemSalir=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_archivo_salir"), Icono.botonSalir());
		menuItemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		menuItemSalir.setActionCommand("menuItemSalir");
		menuItemSalir.addActionListener(new Evento(panelPrincipal));
		menuArchivo.add(menuItemSalir);
		
		
		barraMenu.add(menuArchivo);
	}
	

	/**
	 * Crea el menu editar.
	 */
	private void creaMenuEditar() {
		menuEditar= new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_editar"));
		
		menuItemCortar=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_editar_cortar"), Icono.iconoCortar());
		menuItemCortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuItemCortar.setActionCommand("menuItemCortar");
		menuItemCortar.addActionListener(new Evento(panelPrincipal));
		menuEditar.add(menuItemCortar);
		
		menuItemCopiar=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_editar_copiar"), Icono.iconoCopiar());
		menuItemCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuItemCopiar.setActionCommand("menuItemCopiar");
		menuItemCopiar.addActionListener(new Evento(panelPrincipal));
		menuEditar.add(menuItemCopiar);		
		
		menuItemPegar=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_editar_pegar"), Icono.iconoPegar());
		menuItemPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuItemPegar.setActionCommand("menuItemPegar");
		menuItemPegar.addActionListener(new Evento(panelPrincipal));
		menuEditar.add(menuItemPegar);
		
		barraMenu.add(menuEditar);
		
	}
	
	
	/**
	 * Crea el menu insertar.
	 */
	private void creaMenuInsertar() {
		menuInsertar= new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_insertar"));
		
		menuItemImagen=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_insertar_imagen"), Icono.iconoImagen());
		menuItemImagen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
		menuItemImagen.setActionCommand("menuItemImagen");
		menuItemImagen.addActionListener(new Evento(panelPrincipal));
		menuInsertar.add(menuItemImagen);
		
		barraMenu.add(menuInsertar);
		
	}
	

	/**
	 * Crea el menu formato.
	 */
	private void creaMenuFormato() {
		menuFormato=new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_formato"));
		
		//submenu Tamaño		
		//------------------------------------------------------------
		menuItemTamanyo=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_tamanyo"));
		
		
		menuItemTamanyo.setActionCommand("menuItemTamanyo");
		menuItemTamanyo.addActionListener(new Evento(panelPrincipal));
		menuFormato.add(menuItemTamanyo);
		
		
		
		
		
		
		//Submenu estilo
		//------------------------------------------------------------------------------------------------------
		menuEstilo=new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_estilo"));
		
		checkBoxMenuItemNegrita=new JCheckBoxMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_estilo_negrita"), Icono.botonNegrita());
		checkBoxMenuItemNegrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		checkBoxMenuItemNegrita.setActionCommand("menuItemNegrita");
		checkBoxMenuItemNegrita.addActionListener(new Evento(panelPrincipal));
		menuEstilo.add(checkBoxMenuItemNegrita);
		
		checkBoxMenuItemCursiva=new JCheckBoxMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_estilo_cursiva"), Icono.botonCursiva());
		checkBoxMenuItemCursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
		checkBoxMenuItemCursiva.setActionCommand("menuItemCursiva");
		checkBoxMenuItemCursiva.addActionListener(new Evento(panelPrincipal));
		menuEstilo.add(checkBoxMenuItemCursiva);
		
		checkBoxMenuItemSubrayar=new JCheckBoxMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_estilo_subrayar"), Icono.botonSubrayar());
		checkBoxMenuItemSubrayar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		checkBoxMenuItemSubrayar.setActionCommand("menuItemSubrayar");
		checkBoxMenuItemSubrayar.addActionListener(new Evento(panelPrincipal));
		menuEstilo.add(checkBoxMenuItemSubrayar);
		
		menuFormato.add(menuEstilo);
		
		
		
		//Submenu parrafo
		//----------------------------------------------------------------------
		menuParrafo= new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_parrafo"));
		botonGrupoParrafo=new ButtonGroup();
		
		menuItemIzquierda=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_parrafo_izquierda"), Icono.botonTextoIzquierda());
		menuItemIzquierda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
		menuItemIzquierda.setActionCommand("menuItemIzquierda");
		menuItemIzquierda.addActionListener(new Evento(panelPrincipal));
		botonGrupoParrafo.add(menuItemIzquierda);
		menuParrafo.add(menuItemIzquierda);
		
		menuItemCentrado=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_parrafo_centrado"), Icono.botonTextoCentrado());
		menuItemCentrado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
		menuItemCentrado.setActionCommand("menuItemCentrado");
		menuItemCentrado.addActionListener(new Evento(panelPrincipal));
		botonGrupoParrafo.add(menuItemCentrado);
		menuParrafo.add(menuItemCentrado);
		
		menuItemDerecha=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_parrafo_derecha"), Icono.botonTextoDerecha());
		menuItemDerecha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		menuItemDerecha.setActionCommand("menuItemDerecha");
		menuItemDerecha.addActionListener(new Evento(panelPrincipal));
		botonGrupoParrafo.add(menuItemDerecha);
		menuParrafo.add(menuItemDerecha);
		
		menuItemJustificado=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_parrafo_justificado"), Icono.botonTextoJustificado());
		menuItemJustificado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_DOWN_MASK));
		menuItemJustificado.setActionCommand("menuItemJustificado");
		menuItemJustificado.addActionListener(new Evento(panelPrincipal));
		botonGrupoParrafo.add(menuItemJustificado);
		menuParrafo.add(menuItemJustificado);
		
		
		menuFormato.add(menuParrafo);
		
		
		//Submenu fuente
		//------------------------------------------------------------------
		menuItemFuente=new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_fuente"));
		menuItemFuente.setActionCommand("menuItemFuente");
		menuItemFuente.addActionListener(new Evento(panelPrincipal));
		menuFormato.add(menuItemFuente);
		
		
		
		//Submenu color
		//-----------------------------------------------------------------------
		menuColor= new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_color"));
		
		menuItemColorFuente= new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_color_color_fuente"), Icono.colorFuente());
		menuItemColorFuente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
		menuItemColorFuente.setActionCommand("menuItemColorFuente");
		menuItemColorFuente.addActionListener(new Evento(panelPrincipal));
		menuColor.add(menuItemColorFuente);
		
		menuFormato.add(menuColor);
		
		
		barraMenu.add(menuFormato);
				
	}
	
	
	
	
	
	
	/**
	 * Crea el menu opciones.
	 */
	private void creaMenuOpciones() {
		menuOpciones=new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_opciones"));
		
		//Submenu temas
		//-----------------------------------------
		menuTemas= new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_temas"));
		botonGrupoTemas=new ButtonGroup();
		
		for (UIManager.LookAndFeelInfo lafi : UIManager.getInstalledLookAndFeels()) {
			menuItemTema=new JRadioButtonMenuItem(lafi.getName());		
			menuItemTema.setActionCommand(lafi.getName());
			menuItemTema.addActionListener(new Evento(panelPrincipal));
			botonGrupoTemas.add(menuItemTema);
			menuTemas.add(menuItemTema);
			
			//dejamos seleccionado el tema del sistema
			if (lafi.getClassName().equals(UIManager.getSystemLookAndFeelClassName())) {
				menuItemTema.setSelected(true);
			}
			
		}
		
		menuOpciones.add(menuTemas);
		
		
		//Submenu idioma
		//--------------------------------------------------------------
		menuIdioma= new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_idioma"));
		botonGrupoIdioma=new ButtonGroup();
		
		menuItemEspanol=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_idioma_espanol"), Icono.iconoEspana());
		menuItemEspanol.setActionCommand("menuItemEspanol");
		menuItemEspanol.addActionListener(new Evento(panelPrincipal));
		botonGrupoIdioma.add(menuItemEspanol);
		menuIdioma.add(menuItemEspanol);
		
		menuItemIngles=new JRadioButtonMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_idioma_ingles"), Icono.iconoInglaterra());
		menuItemIngles.setActionCommand("menuItemIngles");
		menuItemIngles.addActionListener(new Evento(panelPrincipal));
		botonGrupoIdioma.add(menuItemIngles);//Los añadimos al grupo para no poder seleccionar varios a la vez
		menuIdioma.add(menuItemIngles);
		
		menuOpciones.add(menuIdioma);
		
		
		
		barraMenu.add(menuOpciones);//Añadimos el menu a la barra
				
	}
	
	
	
	

	/**
	 * Crea el menu información.
	 */
	private void creaMenuInformacion() {
		menuInformacion= new JMenu(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_informacion"));
		
		menuItemAcercaDe= new JMenuItem(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("menu_informacion_acerca_de"), Icono.iconoEscritorio());//Texto al abrir la ventana
		menuItemAcercaDe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_DOWN_MASK));//Acceso rapido mediante teclado
		menuItemAcercaDe.setActionCommand("menuItemAcercaDe");
		menuItemAcercaDe.addActionListener(new Evento(panelPrincipal));
		menuInformacion.add(menuItemAcercaDe);
		
		barraMenu.add(menuInformacion);
	}
	
	
	

	//getters y setters
	
	/**
	 * Devuelve el JCheckBoxMenuItem de negrita.
	 * @return JCheckBoxMenuItem. Variable del item negrita.
	 */
	public JCheckBoxMenuItem getCheckBoxMenuItemNegrita() {
		return checkBoxMenuItemNegrita;
	}
	/**
	 * Establece el JCheckBoxMenuItem de negrita.
	 * @param checkBoxMenuItemNegrita. Variable del item negrita.
	 */
	public void setCheckBoxMenuItemNegrita(JCheckBoxMenuItem checkBoxMenuItemNegrita) {
		this.checkBoxMenuItemNegrita = checkBoxMenuItemNegrita;
	}
	/**
	 * Devuelve el JCheckBoxMenuItem de cursiva.
	 * @return JCheckBoxMenuItem. Variable del item cursiva.
	 */
	public JCheckBoxMenuItem getCheckBoxMenuItemCursiva() {
		return checkBoxMenuItemCursiva;
	}
	/**
	 * Establece el JCheckBoxMenuItem de cursiva.
	 * @param checkBoxMenuItemCursiva. Variable del item cursiva.
	 */
	public void setCheckBoxMenuItemCursiva(JCheckBoxMenuItem checkBoxMenuItemCursiva) {
		this.checkBoxMenuItemCursiva = checkBoxMenuItemCursiva;
	}
	/**
	 * Devuelve el JCheckBoxMenuItem de subrayar.
	 * @return JCheckBoxMenuItem. Variable del item subrayar.
	 */
	public JCheckBoxMenuItem getCheckBoxMenuItemSubrayar() {
		return checkBoxMenuItemSubrayar;
	}
	/**
	 * Establece el JCheckBoxMenuItem de subrayar.
	 * @param checkBoxMenuItemSubrayar. Variable del item subrayar.
	 */
	public void setCheckBoxMenuItemSubrayar(JCheckBoxMenuItem checkBoxMenuItemSubrayar) {
		this.checkBoxMenuItemSubrayar = checkBoxMenuItemSubrayar;
	}

	/**
	 * Devuelve el JMenu de subrayar.
	 * @return JMenu. Variable del menu archivo.
	 */
	public JMenu getMenuArchivo() {
		return menuArchivo;
	}
	/**
	 * Establece el JMenu de archivo.
	 * @param menuArchivo. Variable del menu archivo.
	 */
	public void setMenuArchivo(JMenu menuArchivo) {
		this.menuArchivo = menuArchivo;
	}
	/**
	 * Devuelve el JMenu de fuente.
	 * @return JMenu. Variable del item fuente.
	 */
	public JMenuItem getMenuFuente() {
		return menuItemFuente;
	}
	/**
	 * Establece el JMenu de fuente.
	 * @param menuItemFuente. Variable del item fuente.
	 */
	public void setMenuItemFuente(JMenuItem menuItemFuente) {
		this.menuItemFuente = menuItemFuente;
	}
	/**
	 * Devuelve el JMenu de estilo.
	 * @return JMenu. Variable del menu estilo.
	 */
	public JMenu getMenuEstilo() {
		return menuEstilo;
	}
	/**
	 * Establece el JMenu de estilo.
	 * @param menuEstilo. Variable del menu estilo.
	 */
	public void setMenuEstilo(JMenu menuEstilo) {
		this.menuEstilo = menuEstilo;
	}
	/**
	 * Devuelve el JMenuItem de tamaño.
	 * @return JMenuItem. Variable del item tamaño.
	 */
	public JMenuItem getMenuItemTamanyo() {
		return menuItemTamanyo;
	}
	/**
	 * Establece el JMenuItem de tamaño.
	 * @param menuItemTamanyo. Variable del item tamaño.
	 */
	public void setMenuItemTamanyo(JMenuItem menuItemTamanyo) {
		this.menuItemTamanyo = menuItemTamanyo;
	}
	/**
	 * Devuelve el JMenu de parrafo.
	 * @return JMenu. Variable del item parrafo.
	 */
	public JMenu getMenuParrafo() {
		return menuParrafo;
	}
	/**
	 * Establece el JMenu de parrafo.
	 * @param menuParrafo. Variable del menu parrafo.
	 */
	public void setMenuParrafo(JMenu menuParrafo) {
		this.menuParrafo = menuParrafo;
	}
	/**
	 * Devuelve el JMenu de color.
	 * @return JMenu. Variable del menu color.
	 */
	public JMenu getMenuColor() {
		return menuColor;
	}
	/**
	 * Establece el JMenu de color.
	 * @param menuColor. Variable del menu color.
	 */
	public void setMenuColor(JMenu menuColor) {
		this.menuColor = menuColor;
	}
	/**
	 * Devuelve el JMenu de informacion.
	 * @return JMenu. Variable del menu informacion.
	 */
	public JMenu getMenuInformacion() {
		return menuInformacion;
	}
	/**
	 * Establece el JMenu de informacion.
	 * @param menuInformacion. Variable del menu informacion.
	 */
	public void setMenuInformacion(JMenu menuInformacion) {
		this.menuInformacion = menuInformacion;
	}
	/**
	 * Devuelve el JRadioButtonMenuItem de  izquierda.
	 * @return JRadioButtonMenuItem. Variable del item izquierda.
	 */
	public JRadioButtonMenuItem getMenuItemIzquierda() {
		return menuItemIzquierda;
	}
	/**
	 * Establece el JRadioButtonMenuItem de izquierda.
	 * @param menuItemIzquierda. Variable del item izquierda.
	 */
	public void setMenuItemIzquierda(JRadioButtonMenuItem menuItemIzquierda) {
		this.menuItemIzquierda = menuItemIzquierda;
	}
	/**
	 * Devuelve el JRadioButtonMenuItem de  centrado.
	 * @return JRadioButtonMenuItem. Variable del item centrado.
	 */
	public JRadioButtonMenuItem getMenuItemCentrado() {
		return menuItemCentrado;
	}
	/**
	 * Establece el JRadioButtonMenuItem de centrado.
	 * @param menuItemCentrado. Variable del item centrado.
	 */
	public void setMenuItemCentrado(JRadioButtonMenuItem menuItemCentrado) {
		this.menuItemCentrado = menuItemCentrado;
	}
	/**
	 * Devuelve el JRadioButtonMenuItem de  derecha.
	 * @return JRadioButtonMenuItem. Variable del item derecha.
	 */
	public JRadioButtonMenuItem getMenuItemDerecha() {
		return menuItemDerecha;
	}
	/**
	 * Establece el JRadioButtonMenuItem de derecha.
	 * @param menuItemDerecha. Variable del item derecha.
	 */
	public void setMenuItemDerecha(JRadioButtonMenuItem menuItemDerecha) {
		this.menuItemDerecha = menuItemDerecha;
	}
	/**
	 * Devuelve el JRadioButtonMenuItem de  justificado.
	 * @return JRadioButtonMenuItem. Variable del item justificado.
	 */
	public JRadioButtonMenuItem getMenuItemJustificado() {
		return menuItemJustificado;
	}
	/**
	 * Establece el JRadioButtonMenuItem de justificado.
	 * @param menuItemJustificado. Variable del item justificado.
	 */
	public void setMenuItemJustificado(JRadioButtonMenuItem menuItemJustificado) {
		this.menuItemJustificado = menuItemJustificado;
	}
	/**
	 * Devuelve el JMenuItem de  abrir.
	 * @return JMenuItem. Variable del item abrir.
	 */
	public JMenuItem getMenuItemAbrir() {
		return menuItemAbrir;
	}
	/**
	 * Establece el JRadioButtonMenuItem de abrir.
	 * @param menuItemAbrir. Variable del item abrir.
	 */
	public void setMenuItemAbrir(JMenuItem menuItemAbrir) {
		this.menuItemAbrir = menuItemAbrir;
	}
	/**
	 * Devuelve el JMenuItem de  guardar.
	 * @return JMenuItem. Variable del item guardar.
	 */
	public JMenuItem getMenuItemGuardar() {
		return menuItemGuardar;
	}
	/**
	 * Establece el JRadioButtonMenuItem de guardar.
	 * @param menuItemGuardar. Variable del item guardar.
	 */
	public void setMenuItemGuardar(JMenuItem menuItemGuardar) {
		this.menuItemGuardar = menuItemGuardar;
	}
	/**
	 * Devuelve el JMenuItem de  salir.
	 * @return JMenuItem. Variable del item salir.
	 */
	public JMenuItem getMenuItemSalir() {
		return menuItemSalir;
	}
	/**
	 * Establece el JRadioButtonMenuItem de salir.
	 * @param menuItemSalir. Variable del item salir.
	 */
	public void setMenuItemSalir(JMenuItem menuItemSalir) {
		this.menuItemSalir = menuItemSalir;
	}
	/**
	 * Devuelve el JMenuItem de  color de fuente.
	 * @return JMenuItem. Variable del item color de fuente.
	 */
	public JMenuItem getMenuItemColorFuente() {
		return menuItemColorFuente;
	}
	/**
	 * Establece el JRadioButtonMenuItem de color de fuente.
	 * @param menuItemColorFuente. Variable del item color de fuente.
	 */
	public void setMenuItemColorFuente(JMenuItem menuItemColorFuente) {
		this.menuItemColorFuente = menuItemColorFuente;
	}
	/**
	 * Devuelve el JMenuItem de  acerca de.
	 * @return JMenuItem. Variable del item acerca de.
	 */
	public JMenuItem getMenuItemAcercaDe() {
		return menuItemAcercaDe;
	}
	/**
	 * Establece el JRadioButtonMenuItem de acerca de.
	 * @param menuItemAcercaDe. Variable del item acerca de.
	 */
	public void setMenuItemAcercaDe(JMenuItem menuItemAcercaDe) {
		this.menuItemAcercaDe = menuItemAcercaDe;
	}
	/**
	 * Devuelve el JMenu de  idioma.
	 * @return JMenu. Variable del menu idioma.
	 */
	public JMenu getMenuIdioma() {
		return menuIdioma;
	}
	/**
	 * Establece el JMenu de idioma.
	 * @param menuIdioma. Variable del menu idioma.
	 */
	public void setMenuIdioma(JMenu menuIdioma) {
		this.menuIdioma = menuIdioma;
	}
	/**
	 * Devuelve el JRadioButtonMenuItem de  español.
	 * @return JRadioButtonMenuItem. Variable del item español.
	 */
	public JRadioButtonMenuItem getMenuItemEspanol() {
		return menuItemEspanol;
	}
	/**
	 * Establece el JRadioButtonMenuItem de español.
	 * @param menuItemEspanol. Variable del item español.
	 */
	public void setMenuItemEspanol(JRadioButtonMenuItem menuItemEspanol) {
		this.menuItemEspanol = menuItemEspanol;
	}
	/**
	 * Devuelve el JRadioButtonMenuItem de  ingles.
	 * @return JRadioButtonMenuItem. Variable del item ingles.
	 */
	public JRadioButtonMenuItem getMenuItemIngles() {
		return menuItemIngles;
	}
	/**
	 * Establece el JRadioButtonMenuItem de ingles.
	 * @param menuItemIngles. Variable del item ingles.
	 */
	public void setMenuItemIngles(JRadioButtonMenuItem menuItemIngles) {
		this.menuItemIngles = menuItemIngles;
	}
	/**
	 * Devuelve el JMenu de  editar.
	 * @return JMenu. Variable del menu editar.
	 */
	public JMenu getMenuEditar() {
		return menuEditar;
	}
	/**
	 * Establece el JMenu de editar.
	 * @param menuEditar. Variable del menu editar.
	 */
	public void setMenuEditar(JMenu menuEditar) {
		this.menuEditar = menuEditar;
	}
	/**
	 * Devuelve el JMenuItem de  cortar.
	 * @return JMenuItem. Variable del item cortar.
	 */
	public JMenuItem getMenuItemCortar() {
		return menuItemCortar;
	}
	/**
	 * Establece el JMenuItem de cortar.
	 * @param menuItemCortar. Variable del item cortar.
	 */
	public void setMenuItemCortar(JMenuItem menuItemCortar) {
		this.menuItemCortar = menuItemCortar;
	}
	/**
	 * Devuelve el JMenuItem de  copiar.
	 * @return JMenuItem. Variable del item copiar.
	 */
	public JMenuItem getMenuItemCopiar() {
		return menuItemCopiar;
	}
	/**
	 * Establece el JMenuItem de copiar.
	 * @param menuItemCopiar. Variable del item copiar.
	 */
	public void setMenuItemCopiar(JMenuItem menuItemCopiar) {
		this.menuItemCopiar = menuItemCopiar;
	}
	/**
	 * Devuelve el JMenuItem de  pegar.
	 * @return JMenuItem. Variable del item pegar.
	 */
	public JMenuItem getMenuItemPegar() {
		return menuItemPegar;
	}
	/**
	 * Establece el JMenuItem de pegar.
	 * @param menuItemPegar. Variable del item pegar.
	 */
	public void setMenuItemPegar(JMenuItem menuItemPegar) {
		this.menuItemPegar = menuItemPegar;
	}
	/**
	 * Devuelve el JMenu de  insertar.
	 * @return JMenu. Variable del menu insertar.
	 */
	public JMenu getMenuInsertar() {
		return menuInsertar;
	}
	/**
	 * Establece el JMenu de insertar.
	 * @param menuInsertar. Variable del menu insertar.
	 */
	public void setMenuInsertar(JMenu menuInsertar) {
		this.menuInsertar = menuInsertar;
	}
	/**
	 * Devuelve el JMenuItem de  imagen.
	 * @return JMenuItem. Variable del item imagen.
	 */
	public JMenuItem getMenuItemImagen() {
		return menuItemImagen;
	}
	/**
	 * Establece el JMenuItem de imagen.
	 * @param menuItemImagen. Variable del item imagen.
	 */
	public void setMenuItemImagen(JMenuItem menuItemImagen) {
		this.menuItemImagen = menuItemImagen;
	}
	/**
	 * Devuelve el JMenu de  temas.
	 * @return JMenu. Variable del menu temas.
	 */
	public JMenu getMenuTemas() {
		return menuTemas;
	}
	/**
	 * Establece el JMenu de temas.
	 * @param menuTemas. Variable del menu temas.
	 */
	public void setMenuTemas(JMenu menuTemas) {
		this.menuTemas = menuTemas;
	}
	/**
	 * Devuelve el JMenu de  formato.
	 * @return JMenu. Variable del menu formato.
	 */
	public JMenu getMenuFormato() {
		return menuFormato;
	}
	/**
	 * Establece el JMenu de formato.
	 * @param menuFormato. Variable del menu formato.
	 */
	public void setMenuFormato(JMenu menuFormato) {
		this.menuFormato = menuFormato;
	}
	/**
	 * Devuelve el JMenu de  opciones.
	 * @return JMenu. Variable del menu opciones.
	 */
	public JMenu getMenuOpciones() {
		return menuOpciones;
	}
	/**
	 * Establece el JMenu de opciones.
	 * @param menuOpciones. Variable del menu opciones.
	 */
	public void setMenuOpciones(JMenu menuOpciones) {
		this.menuOpciones = menuOpciones;
	}
	/**
	 * Devuelve el JRadioButtonMenuItem de  tema.
	 * @return JRadioButtonMenuItem. Variable del item tema.
	 */
	public JRadioButtonMenuItem getMenuItemTema() {
		return menuItemTema;
	}
	/**
	 * Establece el JRadioButtonMenuItem de tema.
	 * @param menuItemTema. Variable del item tema.
	 */
	public void setMenuItemTema(JRadioButtonMenuItem menuItemTema) {
		this.menuItemTema = menuItemTema;
	}
	

	
	

	
	
	
	
	
	
	
	
	
}
