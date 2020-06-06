package paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SpinnerNumberModel;

import constantes.Constantes;

import iconos.Icono;
import eventos.Evento;

/**
 * Esta clase es la encargada de crear la barra de herramientas con los botones y distintos elementos
 * @author sergio
 *
 */
public class PanelIconos extends JToolBar {
	private JToggleButton botonNegrita, botonCursiva, botonSubrayar, botonTextoIzquierda, botonTextoCentrado,
			botonTextoDerecha, botonTextoJustificado, botonEspanol, botonIngles;
	private JButton botonColorFuente, botonAbrir, botonGuardar, botonSalir;
	private JComboBox<String> comboBoxTipografia;
	private JComboBox<Integer> comboBoxTamanyoLetra;

	private PanelPrincipal panelPrincipal;
	/**
	 * Construye un nuevo PanelIconos con un PanelPrincipal
	 * @param panelPrincipal. Usado para poder acceder a todos los elementos.
	 */
	public PanelIconos(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
		
		botonesArchivo();
		tipografiaTexto();
		formatoTexto();
		alineacionTexto();
		tamanyoLetra();
		colortexto();
		idiomaTexto();
		introduceElementosPanel();
		
	}
	/**
	 * Crea los botones relacionados con el archivo.
	 */
	public void botonesArchivo() {
		botonAbrir = new JButton(Icono.botonAbrir());
		botonAbrir.setActionCommand("botonAbrir");
		botonAbrir.setPreferredSize(Constantes.tamanyoBoton);//tamaño predeterminado
		botonAbrir.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_abrir"));
		botonAbrir.addActionListener(new Evento(panelPrincipal));

		botonGuardar = new JButton(Icono.botonGuardar());
		botonGuardar.setActionCommand("botonGuardar");
		botonGuardar.setPreferredSize(Constantes.tamanyoBoton);
		botonGuardar.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_guardar"));
		botonGuardar.addActionListener(new Evento(panelPrincipal));

		botonSalir = new JButton(Icono.botonSalir());
		botonSalir.setActionCommand("botonSalir");
		botonSalir.setPreferredSize(Constantes.tamanyoBoton);
		botonSalir.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_salir"));
		botonSalir.addActionListener(new Evento(panelPrincipal));

	}
	
	
	/**
	 * Crea el combobox de la fuente del texto.
	 */
	public void tipografiaTexto() {

		comboBoxTipografia = new JComboBox<String>(Constantes.listaTipografia);		
		comboBoxTipografia.setActionCommand("comboBoxTipografia");//linea que utilizaremos para saber de donde vienen los eventos
		comboBoxTipografia.setMaximumSize(Constantes.tamanyoComboBoxFuente);//El tamaño maximo del conboBox
		comboBoxTipografia.addActionListener(new Evento(panelPrincipal));
	}
	/**
	 * Crea los botones relacionados con el formato de texto (negrita, cursiva y subrayar)
	 */
	public void formatoTexto() {

		botonNegrita = new JToggleButton(Icono.botonNegrita());
		botonNegrita.setActionCommand("botonNegrita"); // Ponemos un comando para identificar un evento con un boton
		botonNegrita.setPreferredSize(Constantes.tamanyoBoton); // Tamaño del boton
		botonNegrita.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_negrita")); // Nombre del boton al pasar el ratón por encima
		botonNegrita.addActionListener(new Evento(panelPrincipal));

		botonCursiva = new JToggleButton(Icono.botonCursiva());
		botonCursiva.setActionCommand("botonCursiva");
		botonCursiva.setPreferredSize(Constantes.tamanyoBoton);
		botonCursiva.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_cursiva"));
		botonCursiva.addActionListener(new Evento(panelPrincipal));

		botonSubrayar = new JToggleButton(Icono.botonSubrayar());
		botonSubrayar.setActionCommand("botonSubrayar");
		botonSubrayar.setPreferredSize(Constantes.tamanyoBoton);
		botonSubrayar.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_subrayar"));
		botonSubrayar.addActionListener(new Evento(panelPrincipal));

	}
	/**
	 * Crea los botones de alineacion del texto.
	 */
	public void alineacionTexto() {

		botonTextoIzquierda = new JToggleButton(Icono.botonTextoIzquierda());
		botonTextoIzquierda.setActionCommand("botonTextoIzquierda");
		botonTextoIzquierda.setPreferredSize(Constantes.tamanyoBoton); //tamaño fijo del boton
		botonTextoIzquierda.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_izquierda"));
		botonTextoIzquierda.addActionListener(new Evento(panelPrincipal));
		
		botonTextoCentrado = new JToggleButton(Icono.botonTextoCentrado());
		botonTextoCentrado.setActionCommand("botonTextoCentrado");
		botonTextoCentrado.setPreferredSize(Constantes.tamanyoBoton);
		botonTextoCentrado.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_centrado"));
		botonTextoCentrado.addActionListener(new Evento(panelPrincipal));

		botonTextoDerecha = new JToggleButton(Icono.botonTextoDerecha());
		botonTextoDerecha.setActionCommand("botonTextoDerecha");
		botonTextoDerecha.setPreferredSize(Constantes.tamanyoBoton);
		botonTextoDerecha.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_derecha"));
		botonTextoDerecha.addActionListener(new Evento(panelPrincipal));

		botonTextoJustificado = new JToggleButton(Icono.botonTextoJustificado());
		botonTextoJustificado.setActionCommand("botonTextoJustificado");
		botonTextoJustificado.setPreferredSize(Constantes.tamanyoBoton);
		botonTextoJustificado.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_justificado"));
		botonTextoJustificado.addActionListener(new Evento(panelPrincipal));

	}

	public void tamanyoLetra() {

		comboBoxTamanyoLetra = new JComboBox<Integer>(Constantes.listaTamanyo);
		
		comboBoxTamanyoLetra.setActionCommand("comboBoxTamanyoLetra");
		comboBoxTamanyoLetra.setMaximumSize(Constantes.tamanyoComboBoxTexto);
		comboBoxTamanyoLetra.addActionListener(new Evento(panelPrincipal));

	}
	/**
	 * Crea el boton de dar color al texto.
	 */
	public void colortexto() {
		botonColorFuente = new JButton(Icono.colorFuente());
		botonColorFuente.setActionCommand("botonColorFuente");
		botonColorFuente.setPreferredSize(Constantes.tamanyoBoton);
		botonColorFuente.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_color_texto"));
		botonColorFuente.addActionListener(new Evento(panelPrincipal));
	}
	/**
	 * Crea los botones de cambio de idioma.
	 */
	public void idiomaTexto() {
		botonEspanol = new JToggleButton(Icono.iconoEspana());
		botonEspanol.setActionCommand("botonEspanol"); // Ponemos un comando para identificar un evento con un boton
		botonEspanol.setPreferredSize(Constantes.tamanyoBoton); // Tamaño del boton
		botonEspanol.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_espanol")); // Nombre del boton al pasar el ratón por encima
		botonEspanol.addActionListener(new Evento(panelPrincipal));

		botonIngles = new JToggleButton(Icono.iconoInglaterra());
		botonIngles.setActionCommand("botonIngles");
		botonIngles.setPreferredSize(Constantes.tamanyoBoton);
		botonIngles.setToolTipText(ResourceBundle.getBundle("recursos.idiomas.Etiquetas").getString("boton_ingles"));
		botonIngles.addActionListener(new Evento(panelPrincipal));
	}
	
	
	/**
	 * Introducimos los componentes en la barra de herramientas(JToolBar)y tambias separamos los conjumtos coo estilos,
	 * alineacion etc
	 */
	public void introduceElementosPanel() {
		this.add(botonAbrir);
		this.add(botonGuardar);
		this.add(botonSalir);
		this.addSeparator();
		this.add(comboBoxTipografia);
		this.addSeparator();
		this.add(botonNegrita);
		this.add(botonCursiva);
		this.add(botonSubrayar);
		this.addSeparator();
		this.add(botonTextoIzquierda);
		this.add(botonTextoCentrado);
		this.add(botonTextoDerecha);
		this.add(botonTextoJustificado);
		this.addSeparator();
		this.add(comboBoxTamanyoLetra);
		this.addSeparator();
		this.add(botonColorFuente);
		this.addSeparator();
		this.add(botonEspanol);
		this.add(botonIngles);
	}

	
	
	
	
	
	
	
	//getters y setters
	/**
	 * Devuelve el JToggleButton de negrita.
	 * @return JToggleButton. Variable del boton negrita.
	 */
	public JToggleButton getBotonNegrita() {
		return botonNegrita;
	}
	/**
	 * Establece el JToggleButton de negrita.
	 * @param botonNegrita. Variable del boton negrita.
	 */
	public void setBotonNegrita(JToggleButton botonNegrita) {
		this.botonNegrita = botonNegrita;
	}
	/**
	 * Devuelve el JToggleButton de cursiva.
	 * @return JToggleButton. Variable del boton cursiva.
	 */
	public JToggleButton getBotonCursiva() {
		return botonCursiva;
	}
	/**
	 * Establece el JToggleButton de cursiva.
	 * @param botonCursiva. Variable del boton cursiva.
	 */
	public void setBotonCursiva(JToggleButton botonCursiva) {
		this.botonCursiva = botonCursiva;
	}
	/**
	 * Devuelve el JToggleButton de subrayar.
	 * @return JToggleButton. Variable del boton subrayar.
	 */
	public JToggleButton getBotonSubrayar() {
		return botonSubrayar;
	}
	/**
	 * Establece el JToggleButton de subrayar.
	 * @param botonSubrayar. Variable del boton subrayar.
	 */
	public void setBotonSubrayar(JToggleButton botonSubrayar) {
		this.botonSubrayar = botonSubrayar;
	}
	/**
	 * Devuelve el JComboBox de tipo de fuente.
	 * @return JComboBox. Variable del combobox tipografia.
	 */
	public JComboBox<String> getComboBoxTipografia() {
		return comboBoxTipografia;
	}
	/**
	 * Establece el JComboBox de tipografia.
	 * @param comboBoxTipografia. Variable del combobox tipografia.
	 */
	public void setComboBoxTipografia(JComboBox<String> comboBoxTipografia) {
		this.comboBoxTipografia = comboBoxTipografia;
	}
	/**
	 * Devuelve el JComboBox del tamaño del texto.
	 * @return JComboBox. Variable del combobox tamaño texto.
	 */
	public JComboBox<Integer> getComboBoxTamanyoLetra() {
		return comboBoxTamanyoLetra;
	}
	/**
	 * Establece el JComboBox de tamaño de texto.
	 * @param comboBoxTamanyoLetra. Variable del combobox tamaño del texto.
	 */
	public void setComboBoxTamanyoLetra(JComboBox<Integer> comboBoxTamanyoLetra) {
		this.comboBoxTamanyoLetra = comboBoxTamanyoLetra;
	}
	/**
	 * Devuelve el JToggleButton de aliniacion izquierda.
	 * @return JToggleButton. Variable del boton alineacion izquierda.
	 */
	public JToggleButton getBotonTextoIzquierda() {
		return botonTextoIzquierda;
	}
	/**
	 * Establece el JToggleButton de alineacion izquierda.
	 * @param botonTextoIzquierda. Variable del boton alineacion izquierda.
	 */
	public void setBotonTextoIzquierda(JToggleButton botonTextoIzquierda) {
		this.botonTextoIzquierda = botonTextoIzquierda;
	}
	/**
	 * Devuelve el JToggleButton de aliniacion centrada.
	 * @return JToggleButton. Variable del boton alineacion centrada.
	 */
	public JToggleButton getBotonTextoCentrado() {
		return botonTextoCentrado;
	}
	/**
	 * Establece el JToggleButton de alineacion centrada.
	 * @param botonTextoCentrado. Variable del boton alineacion centrada.
	 */
	public void setBotonTextoCentrado(JToggleButton botonTextoCentrado) {
		this.botonTextoCentrado = botonTextoCentrado;
	}
	/**
	 * Devuelve el JToggleButton de aliniacion derecha.
	 * @return JToggleButton. Variable del boton alineacion derecha.
	 */
	public JToggleButton getBotonTextoDerecha() {
		return botonTextoDerecha;
	}
	/**
	 * Establece el JToggleButton de alineacion derecha.
	 * @param botonTextoDerecha. Variable del boton alineacion derecha.
	 */
	public void setBotonTextoDerecha(JToggleButton botonTextoDerecha) {
		this.botonTextoDerecha = botonTextoDerecha;
	}
	/**
	 * Devuelve el JToggleButton de aliniacion justificado.
	 * @return JToggleButton. Variable del boton alineacion justificado.
	 */
	public JToggleButton getBotonTextoJustificado() {
		return botonTextoJustificado;
	}
	/**
	 * Establece el JToggleButton de alineacion justificado.
	 * @param botonTextoJustificado. Variable del boton alineacion justificado.
	 */
	public void setBotonTextoJustificado(JToggleButton botonTextoJustificado) {
		this.botonTextoJustificado = botonTextoJustificado;
	}
	/**
	 * Devuelve el JButton de color de fuente.
	 * @return JButton. Variable del boton color de fuente.
	 */
	public JButton getBotonColorFuente() {
		return botonColorFuente;
	}
	/**
	 * Establece el JButton de color de fuente.
	 * @param botonColorFuente. Variable del boton color de fuente.
	 */
	public void setBotonColorFuente(JButton botonColorFuente) {
		this.botonColorFuente = botonColorFuente;
	}
	/**
	 * Devuelve el JButton de abrir.
	 * @return JButton. Variable del boton abrir.
	 */
	public JButton getBotonAbrir() {
		return botonAbrir;
	}
	/**
	 * Establece el JButton de abrir.
	 * @param botonAbrir. Variable del boton de abrir.
	 */
	public void setBotonAbrir(JButton botonAbrir) {
		this.botonAbrir = botonAbrir;
	}
	/**
	 * Devuelve el JButton de guardar.
	 * @return JButton. Variable del boton guardar.
	 */
	public JButton getBotonGuardar() {
		return botonGuardar;
	}
	/**
	 * Establece el JButton de guardar.
	 * @param botonGuardar. Variable del boton de guardar.
	 */
	public void setBotonGuardar(JButton botonGuardar) {
		this.botonGuardar = botonGuardar;
	}
	/**
	 * Devuelve el JButton de salir.
	 * @return JButton. Variable del boton salir.
	 */
	public JButton getBotonSalir() {
		return botonSalir;
	}
	/**
	 * Establece el JButton de salir.
	 * @param botonSalir. Variable del boton de salir.
	 */
	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;
	}
	/**
	 * Devuelve el JToggleButton de español.
	 * @return JToggleButton. Variable del boton español.
	 */
	public JToggleButton getBotonEspanol() {
		return botonEspanol;
	}
	/**
	 * Establece el JToggleButton de español.
	 * @param botonEspanol. Variable del boton de español.
	 */
	public void setBotonEspanol(JToggleButton botonEspanol) {
		this.botonEspanol = botonEspanol;
	}
	/**
	 * Devuelve el JToggleButton de ingles.
	 * @return JToggleButton. Variable del boton ingles.
	 */
	public JToggleButton getBotonIngles() {
		return botonIngles;
	}
	/**
	 * Establece el JToggleButton de ingles.
	 * @param botonIngles. Variable del boton de ingles.
	 */
	public void setBotonIngles(JToggleButton botonIngles) {
		this.botonIngles = botonIngles;
	}
	
	

}
