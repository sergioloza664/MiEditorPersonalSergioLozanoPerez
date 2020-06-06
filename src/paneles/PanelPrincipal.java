package paneles;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ventanas.VentanaEditorTexto;

/**
 * Clase que contiene el panel central y el panel norte y dentro de este ultimo esta el panel del menu y el de los botones.
 * @author sergio
 *
 */
public class PanelPrincipal extends JPanel{
	private PanelNorte panelNorte;
	private PanelCentral panelCentral;
	private JScrollPane scroll;
	private VentanaEditorTexto ventana;
	/**
	 * Construye un nuevo PanelPrincipal con una VentanaEditorTexto.
	 * @param ventana. Usado para poder dar acceso a la ventana a los demas componentes.
	 */
	public PanelPrincipal(VentanaEditorTexto ventana) {
		this.ventana=ventana;
		this.setLayout(new BorderLayout());
		
		panelNorte=new PanelNorte(this);
		this.add(panelNorte, BorderLayout.PAGE_START);//Con page_Start hacemos que al añadir el panel del texto aparezca debajo del panel norte
		panelCentral=new PanelCentral(this);
		scroll=new JScrollPane(panelCentral);//Colocamos la funcion scroll al panel del texto
		this.add(scroll);//Añadimos el ScrollPane al panel principal
		
	}

	
	
	
	
	
	/**
	 * Devuelve el PanelNorte
	 * @return PanelNorte. Variable del pane norte
	 */
	public PanelNorte getPanelNorte() { return panelNorte; }
	/**
	 * Establece el PanelNorte
	 * @param PanelNorte. Variable del panel norte.
	 */
	public void setPanelNorte(PanelNorte panelNorte) { this.panelNorte = panelNorte; }
	/**
	 * Devuelve el PanelCentral
	 * @return PanelCentral. Variable del pane central
	 */
	public PanelCentral getPanelCentral() { return panelCentral; }
	/**
	 * Establece el PanelCentral
	 * @param PanelCentral. Variable del panel central.
	 */
	public void setPanelCentral(PanelCentral panelCentral) { this.panelCentral = panelCentral; }
	
	
		
}
