package aciones;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import paneles.PanelPrincipal;

/**
 * Esta clase es la encargada de los temas
 * @author sergio
 *
 */
public class Tema {
	private PanelPrincipal panelPrincipal;
	/**
	 * Construye un nuevo Tema con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public Tema(PanelPrincipal panelPrincipal) {
		this.panelPrincipal=panelPrincipal; 
	}
	
	
	/**
	 * Aplica el tema que le pasemos em un String.
	 * @param tema. Tema escogido para aplicar
	 */
	public void cambioTema(String tema) {
		try {
			for (UIManager.LookAndFeelInfo lafi : UIManager.getInstalledLookAndFeels()) {
				if (tema.equals(lafi.getName())) {
					UIManager.setLookAndFeel(lafi.getClassName());
					SwingUtilities.updateComponentTreeUI(panelPrincipal);//Decimos al componente que se actualice con la nueva skin
					break;
				}
			}
			
		} catch (Exception e) {
		}
		
		
	
	}

}
