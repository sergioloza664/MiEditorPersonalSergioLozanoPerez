package iconos;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * En esta clase encargada de obtener las imagenes para los iconos.
 * @author sergio
 *
 */
public class Icono {
	
	/**
	 * Obtiene la imagen de negrita.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonNegrita() {
		try {
			return new ImageIcon("./src/recursos/iconos/bold.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de cursiva.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonCursiva() {
		try {
			return new ImageIcon("./src/recursos/iconos/italic.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de subrayar.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonSubrayar() {
		try {
			return new ImageIcon("./src/recursos/iconos/underline.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de alinear a la izquierda.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonTextoIzquierda() {
		try {
			return new ImageIcon("./src/recursos/iconos/align_left.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de alinear a la derecha.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonTextoDerecha() {
		try {
			return new ImageIcon("./src/recursos/iconos/align_right.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de alineacion centrada.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonTextoCentrado() {
		try {
			return new ImageIcon("./src/recursos/iconos/align_center.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de alineacion justificada.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonTextoJustificado() {
		try {
			return new ImageIcon("./src/recursos/iconos/align_justify.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de abrir.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonAbrir() {
		try {
			return new ImageIcon("./src/recursos/iconos/open.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de guardar.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonGuardar() {
		try {
			return new ImageIcon("./src/recursos/iconos/save.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de salir.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon botonSalir() {
		try {
			return new ImageIcon("./src/recursos/iconos/exit.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de color de la fuente.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon colorFuente() {
		try {
			return new ImageIcon("./src/recursos/iconos/color_font.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de icono del programa que es utilizada en algunas ventanas emergentes.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon iconoEscritorio() {
		try {
			return new ImageIcon("./src/recursos/iconos/icon.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de bandera españa.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon iconoEspana() {
		try {
			return new ImageIcon("./src/recursos/iconos/spain.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de bandera inglaterra.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon iconoInglaterra() {
		try {
			return new ImageIcon("./src/recursos/iconos/united_kingdom.png");
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * Obtiene la imagen de cortar.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon iconoCortar() {
		try {
			return new ImageIcon("./src/recursos/iconos/cut.png");
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * Obtiene la imagen de copiar.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon iconoCopiar() {
		try {
			return new ImageIcon("./src/recursos/iconos/copy.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de pegar.
	 * @return Icon. Devuelve el icono.
	 */
	public static Icon iconoPegar() {
		try {
			return new ImageIcon("./src/recursos/iconos/paste.png");
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Obtiene la imagen de abrir imagen.
	 * @return Icon. Devuelve el icono.
	 */
	public static ImageIcon iconoImagen() {
		try {
			return new ImageIcon("./src/recursos/iconos/image.png");
		} catch (Exception e) {
			return null;
			
		}
	}
	/**
	 * Obtiene la imagen de escritorio del programa.
	 * @return ImageIcon. Devuelve el icono.
	 */
	public static ImageIcon iconoPrograma() {
		try {
			return new ImageIcon("./src/recursos/iconos/icon.png");
		} catch (Exception e) {
			return null;
			
		}
	}
	
}
