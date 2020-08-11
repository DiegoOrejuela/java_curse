package experimentacion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class _101_Procesador_de_Textos_Experimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Procesador Procesador = new Marco_Procesador();
		
	}
}

class Marco_Procesador extends JFrame{
	
	
	public Marco_Procesador() {
		
		setBounds (1500, 400, 400, 400);
		add ( new Lamina_Procesador());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	class Lamina_Procesador extends JPanel{
		
		JMenuBar miMenuBar = new JMenuBar ();
			JMenu Menus [] = { new JMenu ("Fuente"), new JMenu ("Estilo"), new JMenu ("Tamaño")};
				JMenuItem [] fuente = {new JMenuItem("Arial"), new JMenuItem ("Courier"), new JMenuItem ("Verdana")};
				JMenuItem [] estilo = {new JMenuItem ("Negrita"), new JMenuItem ("Cursiva"), new JMenuItem ("Plana") };
				JMenuItem [] tamajno = {new JMenuItem ("12"), new JMenuItem ("16"),new JMenuItem ("20"), new JMenuItem ("24")};
				
			
		JTextPane miArea = new JTextPane();
		
		
		public Lamina_Procesador() {
		
		setLayout (new BorderLayout ());
		
		JMenuItem_configurar (fuente, Menus[0]);
		JMenuItem_configurar (estilo, Menus[1]);
		JMenuItem_configurar (tamajno, Menus[2]);
		JMenus_configurar (Menus, miMenuBar);
		add(miMenuBar, BorderLayout.NORTH);
		add(miArea, BorderLayout.CENTER);
					
			
		}
		
		public void JMenus_configurar (JMenu [] arrayJM, JMenuBar objetoJMB) {
			
			for (JMenu i : arrayJM) {
				objetoJMB.add(i);
			}
		}
		
		public void JMenuItem_configurar (JMenuItem [] arrayJMI, JMenu objectJM) {
			
			for (JMenuItem i : arrayJMI) {
				objectJM.add(i);
				i.addActionListener(new Fuente_evento ());
			}
			
		}
			 class Fuente_evento implements ActionListener {
				
				
			
				public void actionPerformed(ActionEvent e) {
					Font letras = miArea.getFont();
					
					
					
					String letra = letras.getFontName();
					int estil = letras.getStyle();
					int tamaño = letras.getSize();
					
					JMenuItem item = (JMenuItem) e.getSource();
					
					
					if (item == fuente[0]) {
						letra = "Arial";
					}
					if (item == fuente[1]) {
						letra = "Courier";
					}
					if (item == fuente[2]) {
						letra = "Verdana";
					}
					if (item == estilo[0]) {
						estil = Font.BOLD;
					}
					if (item == estilo[1]) {
						estil = Font.ITALIC;
					}
					if (item == estilo[2]) {
						estil = Font.PLAIN;
					}
					if (item == tamajno[0]) {
						tamaño = 12;
					}
					if (item == tamajno[1]) {
						tamaño = 16;
					}
					if (item == tamajno[2]) {
						tamaño = 20;
					}
					if (item == tamajno[3]) {
						tamaño = 24;
					}
					
					
					
					
					miArea.setFont(new Font ( letra, estil, tamaño));
					
					
				}
				
			}			
		
	}
	
}






