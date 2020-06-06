package constantes;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

/**
 * Clase que contiene las variables y constantes iniciales de la aplicacion
 * @author sergio
 *
 */
public class Constantes {
	
	/**
	 * Lista de tamaños del texto
	 */
	public static final Integer[]listaTamanyo= {8,9,10,11,12,14,16,18,20,22,24,26,28,36,48,72};
	
	/**
	 * Lista de fuentes instaladas en el sistema.
	 */
	public static final String[]listaTipografia=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();//fuentes del sistema
	/**
	 * Tamaño del boton
	 */
	public static final Dimension  tamanyoBoton=new Dimension(32, 32);
	
	/**
	 * Tamaño del comboBox de la fuente del texto.
	 */
	public static final  Dimension  tamanyoComboBoxFuente=new Dimension(256, 32);
	
	/**
	 * Tamaño del comboBox del tamaño del texto.
	 */
	public static final Dimension  tamanyoComboBoxTexto=new Dimension(56, 32);
	
	/**
	 * Fuente inicial del programa
	 */
	public static String tipografiatextoDefecto="Tahoma";
	
	/**
	 * Tamaño inicial del texto
	 */
	public static int tamanyoTextoDefecto=8;
}
