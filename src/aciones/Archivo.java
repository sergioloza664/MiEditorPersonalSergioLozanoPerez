package aciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

import idiomas.Idioma;
import paneles.PanelPrincipal;
//
//
//
/**
 * Clase encargada de abrir y guardar archivos
 * @author sergio
 *
 */
public class Archivo {
	
	private PanelPrincipal panelPrincipal;
	/**
	 * Construye un nuevo Archivo con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public Archivo(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}



	/**
	 * Crea una ventana en la que seleccionamos el archivo a abrir y este es representado panel de texto.
	 */
	public void abrirArchivo() {
		JFileChooser.setDefaultLocale(Idioma.traduccionVentanaAbrir); //La ponemos en el idioma antes de crear la ventana
		JFileChooser explorador = new JFileChooser(); 
		
		if (explorador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)//al dar a aceptar nos dara la ruta del archivo
		{
		String ruta = explorador.getSelectedFile().getPath();
		try
		{
		BufferedReader reader = new BufferedReader(new FileReader(ruta));
		String textoTotal="";
		String linea = reader.readLine();
		while (linea != null)
		{
		textoTotal = textoTotal + linea + System.getProperty("line.separator"); //salto de linea, line.separator es lo mismo que \n pero este sirve para todos los S.O.
		linea = reader.readLine();
		}
		panelPrincipal.getPanelCentral().setText(textoTotal);
		reader.close();
		}catch (Exception e)
		{
		e.printStackTrace();
		}
		}

	}
	
	
	/**
	 * Crea una ventana en la que seleccionamos donde guardar el documento, crea una archivo en el que guarda el contenido del panel de texto.
	 */
	public void guardarArchivo() {
		JFileChooser.setDefaultLocale(Idioma.traduccionVentanaGuardar); //La ponemos en el idioma antes de crear la ventana
		JFileChooser explorador = new JFileChooser();
		if (JFileChooser.APPROVE_OPTION == explorador.showSaveDialog(null))//al dar a aceptar nos dara la ruta del archivo
		{
		String ruta = explorador.getSelectedFile().getPath();
		try
		{
		PrintWriter writer = new PrintWriter(ruta);
		writer.print(panelPrincipal.getPanelCentral().getText());//guardamos el texto del panel en un archivo
		writer.close();
		}catch (Exception e)
		{
		e.printStackTrace();
		}
		}
	}
	
	
	
	
	
}
