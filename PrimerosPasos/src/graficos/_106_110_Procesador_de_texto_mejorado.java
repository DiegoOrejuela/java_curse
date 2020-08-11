package graficos;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

public class _106_110_Procesador_de_texto_mejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Procesador2 Procesador = new Marco_Procesador2();
		Procesador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Procesador2 extends JFrame{
	
	
	public Marco_Procesador2() {
		
		setBounds (700, 200, 300, 300);
		setVisible(true);
		add ( new Lamina_Procesador2());
		setVisible(true);
	}
	
	
	class Lamina_Procesador2 extends JPanel{
		
		JMenuBar miMenuBar;
			JMenu fuente, estilo, tamajno, alineacion;
				ButtonGroup grupo_tamajno = new ButtonGroup();
				JPopupMenu menu_emergente = new JPopupMenu ();
		JToolBar menu_herramientas;
	
				
		JTextPane miArea = new JTextPane();
		Font letras;
			
		
		
		public Lamina_Procesador2() {
		
		setLayout (new BorderLayout ());
		
					miMenuBar = new JMenuBar();
						fuente = new JMenu("Fuente");
							Configura_menuItem ("Arial", fuente , 1, 1, 0, "");
							Configura_menuItem ("Courier", fuente, 1, 1, 0, "");
							Configura_menuItem ("Verdana", fuente, 1, 1, 0, "");
						estilo= new JMenu("Estilo");
							Configura_menuItem ("Negrita", estilo, Font.BOLD, 1, 0, "bin/graficos/Negrita.png");
							Configura_menuItem ("Cursiva", estilo, Font.ITALIC, 1, 0, "bin/graficos/Cursiva.png" );
						tamajno = new JMenu("Tamaño");
							Configura_menuItem ("12", tamajno, 1, 12, 0, "");
							Configura_menuItem ("16", tamajno, 1, 16, 0, "");
							Configura_menuItem ("20", tamajno, 1, 20, 0, "");
							Configura_menuItem ("24", tamajno, 1, 24, 0, "");
						alineacion = new JMenu ("Alineación");
							Configura_menuItem ("Izquierda", alineacion, 1, 12, StyleConstants.ALIGN_LEFT, "");
							Configura_menuItem ("Centro", alineacion, 1, 12, StyleConstants.ALIGN_CENTER, "");
							Configura_menuItem ("Derecha", alineacion, 1, 12, StyleConstants.ALIGN_RIGHT, "");
							Configura_menuItem ("Justificado", alineacion, 1, 12, StyleConstants.ALIGN_JUSTIFIED, "");
	
					menu_herramientas = new JToolBar ();
					//Estilo
					
						Configura_boton ("Estilo", "Negrita", "bin/graficos/Negrita.png", 0);
						Configura_boton ("Estilo", "Cursiva", "bin/graficos/Cursiva.png", 0);
						Configura_boton ("Estilo", "Subrayado", "bin/graficos/Subrayado.png", 0);
					//Colores	
					menu_herramientas.addSeparator();
						Configura_botonColores ("bin/graficos/Bola_Amarilla.png").addActionListener(new StyledEditorKit.ForegroundAction("", Color.YELLOW));
						Configura_botonColores ("bin/graficos/Bola_Azul.png").addActionListener(new StyledEditorKit.ForegroundAction("", Color.BLUE));
						Configura_botonColores ("bin/graficos/Bola_Roja.png").addActionListener(new StyledEditorKit.ForegroundAction("", Color.RED));
						
					//Alineación
					menu_herramientas.addSeparator();
						Configura_boton ("Alineacion","Izquierda", "bin/graficos/izquierda.png",StyleConstants.ALIGN_LEFT );
						Configura_boton ("Alineacion", "Centrado", "bin/graficos/centrado.png", StyleConstants.ALIGN_CENTER);
						Configura_boton ("Alineacion", "Derecha", "bin/graficos/derecha.png", StyleConstants.ALIGN_RIGHT);
						Configura_boton ("Alineacion", "Justificado", "bin/graficos/justificado.png", StyleConstants.ALIGN_JUSTIFIED);
							
						
					miMenuBar.add(fuente);
					miMenuBar.add(estilo);
					miMenuBar.add(tamajno);
					miMenuBar.add(alineacion);
					//Centras MenuBar
				add(miMenuBar, BorderLayout.NORTH);
				add(miArea, BorderLayout.CENTER);
				
				menu_herramientas.setOrientation(1);
				add(menu_herramientas, BorderLayout.WEST);
					
			
		}
		
		public JButton Configura_botonColores (String ruta) {
			
			JButton elem_botonColor = new JButton (new ImageIcon (ruta));
			
			menu_herramientas.add(elem_botonColor);
			
			return elem_botonColor;
		}
		
		public void Configura_boton (String tipo, String etiqueta, String nombreImagen, int alin) {
			
			JButton elem_boton = new JButton (new ImageIcon (nombreImagen));
			
			if (tipo == "Estilo") {
				
				if (etiqueta == "Negrita") {
					elem_boton.addActionListener(new StyledEditorKit.BoldAction());
					
				} else if (etiqueta == "Cursiva") {
					elem_boton.addActionListener(new StyledEditorKit.ItalicAction());
				} else {
					elem_boton.addActionListener(new StyledEditorKit.UnderlineAction());
				}
			} else {
				
				elem_boton.addActionListener(new StyledEditorKit.AlignmentAction("", alin));
			}
			
			
			menu_herramientas.add(elem_boton);
		}
		
		public void Configura_menuItem (String etiqueta, JMenu menu, int style, int tam, int alin, String icono) {
			
			
			if (menu == fuente) {
				
				
				JMenuItem elem_menu = new JMenuItem (etiqueta);
				JMenuItem elem_menuE = new JMenuItem (etiqueta);
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction ("", etiqueta));
				elem_menuE.addActionListener(new StyledEditorKit.FontFamilyAction ("", etiqueta));
				
				menu.add(elem_menu);
				
				menu_emergente.add(elem_menuE);
				miArea.setComponentPopupMenu(menu_emergente);
				
				
			
				
				
				
			} else if (menu == estilo) {
				
				JCheckBoxMenuItem elem_menu = new JCheckBoxMenuItem (etiqueta, new ImageIcon (icono));
				
				if (style == Font.BOLD) {
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				
				} else {
					elem_menu.setHorizontalTextPosition(SwingConstants.LEFT);
					elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
					elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
					
				}
				
				
				menu.add(elem_menu);
				
			} else if (menu == tamajno) {
				
				JRadioButtonMenuItem elem_menu = new JRadioButtonMenuItem (etiqueta);
				grupo_tamajno.add(elem_menu);
				elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("", tam));
				System.out.println(tam);
				menu.add(elem_menu);
				
			} else {
				JMenuItem elem_menu = new JMenuItem (etiqueta);
				elem_menu.addActionListener(new StyledEditorKit.AlignmentAction("", alin));
				menu.add(elem_menu);
			}
			
			
			
			
		}
		
		
		
		
	}
	
}
