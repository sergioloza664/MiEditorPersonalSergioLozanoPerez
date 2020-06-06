package aciones;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

import idiomas.Idioma;
import paneles.PanelPrincipal;

/**
 * Esta clase es la encargada de abrir imagenes para el JTextPane
 * @author sergio
 *
 */
public class Imagen {
	private PanelPrincipal panelPrincipal;
	/**
	 * Construye una nueva Imagen con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public Imagen(PanelPrincipal panelPrincipal) {
		this.panelPrincipal=panelPrincipal;
	}
	
	
	
	
	
	/**
	 * Abre una ventana para cargar una imagen de nuestro ordenador.
	 */
	public void abrirImagen() {
		JFileChooser.setDefaultLocale(Idioma.traduccionVentanaAbrir); //La ponemos en el idioma antes de crear la ventana, sino no se vera el cambio reflejado
		JFileChooser explorador = new JFileChooser(); 
		
		if (explorador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)//si damos a aceptar
		{
			String ruta = explorador.getSelectedFile().getPath();//obtenemos la ruta de la imagen
			try
			{
				panelPrincipal.getPanelCentral().insertIcon(new ImageIcon(ruta));//insertamos la imagen en el panelCentral
			}catch (Exception e1)
			{
			System.out.println(e1.getMessage());
			}
		}

	}
	
	

}
