package ventanas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import aciones.Tema;
import constantes.Constantes;
import iconos.Icono;
import idiomas.Idioma;
import paneles.PanelPrincipal;

/**
 * Clase que se encarga de crear la ventana del programa con sus respectivas caracteristicas
 * @author sergio
 *
 */
public class VentanaEditorTexto extends JFrame{
	private PanelPrincipal panelPrincipal;

	/**
	 * Construye una nueva VentanaEditorTexto.
	 */
	public VentanaEditorTexto() {
		this.setTitle("Mi editor"); //titulo ventana
		this.setExtendedState(MAXIMIZED_BOTH); //la venatana se creara maximizada
		this.setIconImage(Icono.iconoPrograma().getImage());//Icono del programa
		
		
		this.setSize(new Dimension(1024, 768));//tamaño de la ventana cuando no este maximizada
		
		
		temaSistema();
		eventosVentana(); //metodo ventana confirmacion paracerrar con la X
		
		panelPrincipal = new PanelPrincipal(this);
		this.add(panelPrincipal);
		this.setVisible(true); //Tenemos que hacer visible en ultimo lugar, cuando ya estan especificadas las caracteristicas de la ventana
		
	}
	
	
	
	/**
	 * Encargado de los eventos de ventana, mensaje al cerrar con X e iniciar los componentes a seleccionados en los menus.
	 */
	public void eventosVentana() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			//Mensaje que nos saldra al cerrar desde la X
	        public void windowClosing(WindowEvent e) {
	            
	        	String si=Idioma.siVentanaSalir;
	    		String no=Idioma.noVentanaSalir;
	    		
	    		int seleccion = JOptionPane.showOptionDialog(panelPrincipal, Idioma.descripcionVentanaSalir, Idioma.tituloVentanaSalir, 
	    				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[] { si, no, }, si);
	    		if (seleccion==0) { System.exit(0); }//Si es 0 cierra la ventana	                	            
	        } 
	        
	        
	        
	        //Cuando se abre la ventana ponemos estos componentes un valor inicial
	        public void windowOpened(WindowEvent e) {
	        	panelPrincipal.getPanelNorte().getPanelIconos().getBotonTextoIzquierda().setSelected(true);
	    		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemIzquierda().setSelected(true);
	    		panelPrincipal.getPanelCentral().getMenuContextual().getMenuItemIzquierda().setSelected(true);
	    		panelPrincipal.getPanelNorte().getPanelIconos().getBotonEspanol().setSelected(true);
	    		panelPrincipal.getPanelNorte().getPanelMenu().getMenuItemEspanol().setSelected(true);
	    		panelPrincipal.getPanelNorte().getPanelIconos().getComboBoxTipografia().setSelectedItem(Constantes.tipografiatextoDefecto); // Tipografia del texto por defecto	        
	    		panelPrincipal.getPanelNorte().getPanelIconos().getComboBoxTamanyoLetra().setSelectedItem(Constantes.tamanyoTextoDefecto); // Tamaño del texto por defecto	        }
	        
	        } 
	        
	        
	        

	    });
		
	
		
		
		
		
	}
	
	
	
	/**
	 * Aplica el tema al programa del sistema que estemos utilizando.
	 */
	private void temaSistema() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
