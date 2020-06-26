package idiomas;

import java.util.Locale;
import java.util.ResourceBundle;

import aciones.Accion;
import paneles.PanelPrincipal;

/**
 * Esta clase es la encargada de cambiar el idioma del programa
 * @author sergio
 *
 */
public class Idioma {
	private PanelPrincipal panelPrincipal;

	/**
	 * Titulo de la ventana acerca de.
	 */
	public static String tituloAcercaDe=ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("ventana_acerca_de_titulo");
	/**
	 * Descripcion de la ventana acerca de.
	 */
	public static String descripcionAcercaDe=ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("ventana_acerca_de_descripcion");
	/**
	 * Texto aceptar de la ventana acerca de.
	 */
	public static String aceptarAcercaDe=ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("ventana_acerca_de_aceptar");
	/**
	 * Titulo de la ventana salir.
	 */
	public static String tituloVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("ventana_salir_titulo");
	/**
	 * Descripcion de la ventana salir.
	 */
	public static String descripcionVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("ventana_salir_descripcion");
	/**
	 * Texto si de la ventana salir.
	 */
	public static String siVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("ventana_salir_si");
	/**
	 * Texto no de la ventana salir.
	 */
	public static String noVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("ventana_salir_no");
	
	/**
	 * Titulo de la ventana seleccion de color.
	 */
	public static String tituloVentanaColor=ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("ventana_color_titulo");
	/**
	 * variable para traducir la ventana seleccion de color.
	 */
	public static Locale traduccionVentanaColor=Locale.forLanguageTag("es");
	
	/**
	 * Variable para traducir la ventana abrir.
	 */
	public static Locale traduccionVentanaAbrir=Locale.forLanguageTag("es");
	/**
	 * Variable para traducir la ventana guardar.
	 */
	public static Locale traduccionVentanaGuardar=Locale.forLanguageTag("es");
	
	/**
	 * Titulo ventana fuente.
	 */
	public static String ventanaFuenteTitulo=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_fuente_titulo");
	/**
	 * Texto aceptar de la ventana fuente.
	 */
	public static String ventanaFuenteAceptar=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_fuente_aceptar");
	/**
	 * Titulo de la ventana tamaño
	 */
	public static String ventanaTamanyoTitulo=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_tamanyo_titulo");;
	/**
	 * Texto aceptar de la ventana tamaño.
	 */
	public static String ventanaTamanyoAceptar=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_tamanyo_aceptar");
	
	/**
	 * Construye un nuevo Idioma con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public Idioma(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	
	
	
	
	
	/**
	 * Cambia los textos del programa a español
	 */
	public void textosEspanol() {
		//Textos de los botones en español
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonAbrir().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_abrir"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonGuardar().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_guardar"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonSalir().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_salir"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonNegrita().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_negrita"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonCursiva().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_cursiva"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonSubrayar().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_subrayar"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoIzquierda().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_izquierda"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoCentrado().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_centrado"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoDerecha().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_derecha"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoJustificado().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_justificado"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonColorFuente().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_color_texto"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonEspanol().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_espanol"));
		panelPrincipal.getPanelNorte().getPanelIconos().getBotonIngles().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("boton_ingles"));

		
		
		//Textos de los menus en español
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuArchivo().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_archivo"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemAbrir().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_archivo_abrir"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemGuardar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_archivo_guardar"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemSalir().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_archivo_salir"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuEditar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_editar"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCortar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_editar_cortar"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCopiar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_editar_copiar"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemPegar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_editar_pegar"));		
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuInsertar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_insertar"));	
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemImagen().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_insertar_imagen"));		
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuFuente().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_fuente"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuEstilo().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_estilo"));
		panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemNegrita().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_estilo_negrita"));
		panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemCursiva().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_estilo_cursiva"));
		panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemSubrayar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_estilo_subrayar"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuParrafo().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_parrafo"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIzquierda().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_parrafo_izquierda"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCentrado().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_parrafo_centrado"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemDerecha().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_parrafo_derecha"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemJustificado().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_parrafo_justificado"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemTamanyo().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_tamanyo"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuColor().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_color"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemColorFuente().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_color_color_fuente"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuInformacion().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_informacion"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemAcercaDe().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_informacion_acerca_de"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuIdioma().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_idioma"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemEspanol().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_idioma_espanol"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIngles().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_idioma_ingles"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuOpciones().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_opciones"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuTemas().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_temas"));
		panelPrincipal.getPanelNorte().getPanelMenu().getMenuFormato().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_formato"));

		//Textos español menu contextual
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCortar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_editar_cortar"));
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCopiar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_editar_copiar"));
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemPegar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_editar_pegar"));
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemNegrita().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_estilo_negrita"));
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCursiva().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_estilo_cursiva"));
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemSubrayar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_estilo_subrayar"));
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemIzquierda().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_parrafo_izquierda"));
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCentrado().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_parrafo_centrado"));
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemDerecha().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_parrafo_derecha"));
		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemJustificado().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("menu_parrafo_justificado"));

		
		//Textos de las ventanas
		tituloAcercaDe=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_acerca_de_titulo"); 
		descripcionAcercaDe=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_acerca_de_descripcion");
		aceptarAcercaDe=ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("ventana_acerca_de_aceptar");
		
		tituloVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_salir_titulo");
		descripcionVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_salir_descripcion");
		siVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_salir_si");
		noVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_salir_no");
		
		traduccionVentanaColor=Locale.forLanguageTag("es");
		tituloVentanaColor=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_color_titulo");
		
		traduccionVentanaAbrir=Locale.forLanguageTag("es");
		traduccionVentanaGuardar=Locale.forLanguageTag("es");
		
		ventanaFuenteTitulo=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_fuente_titulo");
		ventanaFuenteAceptar=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_fuente_aceptar");
		
		ventanaTamanyoTitulo=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_tamanyo_titulo");;
		ventanaTamanyoAceptar=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_es").getString("ventana_tamanyo_aceptar");
		
	}
	
	
	/**
	 * Cambia los textos del programa a ingles
	 */
	public void textosIngles() {
		//Textos de los botones en ingles
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonAbrir().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_abrir"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonGuardar().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_guardar"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonSalir().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_salir"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonNegrita().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_negrita"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonCursiva().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_cursiva"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonSubrayar().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_subrayar"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoIzquierda().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_izquierda"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoCentrado().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_centrado"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoDerecha().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_derecha"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoJustificado().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_justificado"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonColorFuente().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_color_texto"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonEspanol().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_espanol"));
				panelPrincipal.getPanelNorte().getPanelIconos().getBotonIngles().setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("boton_ingles"));

				
				
				//Textos de los menus en ingles
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuArchivo().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_archivo"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemAbrir().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_archivo_abrir"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemGuardar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_archivo_guardar"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemSalir().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_archivo_salir"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuEditar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_editar"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCortar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_editar_cortar"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCopiar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_editar_copiar"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemPegar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_editar_pegar"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuInsertar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_insertar"));	
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemImagen().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_insertar_imagen"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuFuente().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_fuente"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuEstilo().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_estilo"));
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemNegrita().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_estilo_negrita"));
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemCursiva().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_estilo_cursiva"));
				panelPrincipal.getPanelNorte().getPanelMenu().getCheckBoxMenuItemSubrayar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_estilo_subrayar"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuParrafo().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_parrafo"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIzquierda().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_parrafo_izquierda"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemCentrado().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_parrafo_centrado"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemDerecha().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_parrafo_derecha"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemJustificado().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_parrafo_justificado"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemTamanyo().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_tamanyo"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuColor().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_color"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemColorFuente().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_color_color_fuente"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuInformacion().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_informacion"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemAcercaDe().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_informacion_acerca_de"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuIdioma().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_idioma"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemEspanol().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_idioma_espanol"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIngles().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_idioma_ingles"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuOpciones().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_opciones"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuTemas().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_temas"));
				panelPrincipal.getPanelNorte().getPanelMenu().getMenuFormato().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_formato"));
				
				//Textos ingles menu contextual
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCortar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_editar_cortar"));
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCopiar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_editar_copiar"));
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemPegar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_editar_pegar"));
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemNegrita().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_estilo_negrita"));
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCursiva().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_estilo_cursiva"));
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemSubrayar().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_estilo_subrayar"));
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemIzquierda().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_parrafo_izquierda"));
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemCentrado().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_parrafo_centrado"));
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemDerecha().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_parrafo_derecha"));
				panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemJustificado().setText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("menu_parrafo_justificado"));
	
				//Textos de las ventanas
				tituloAcercaDe=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_acerca_de_titulo"); 
				descripcionAcercaDe=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_acerca_de_descripcion");
	
				aceptarAcercaDe=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_acerca_de_aceptar");
				
				tituloVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_salir_titulo");
				descripcionVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_salir_descripcion");
				siVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_salir_si");
				noVentanaSalir=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_salir_no");
				
				traduccionVentanaColor=Locale.forLanguageTag("en");
				tituloVentanaColor=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_color_titulo");
				
				traduccionVentanaAbrir=Locale.forLanguageTag("en");
				traduccionVentanaGuardar=Locale.forLanguageTag("en");
				
				ventanaFuenteTitulo=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_fuente_titulo");
				ventanaFuenteAceptar=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_fuente_aceptar");
				
				ventanaTamanyoTitulo=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_tamanyo_titulo");;
				ventanaTamanyoAceptar=ResourceBundle.getBundle("recursos.idiomas.Etiquetas_en").getString("ventana_tamanyo_aceptar");
				
	}





	
	
	
	
}
