package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class _101_105_Procesador_de_Textos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Procesador Procesador = new Marco_Procesador();
		Procesador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Procesador extends JFrame{
	
	
	public Marco_Procesador() {
		
		setBounds (700, 300, 400, 400);
		setVisible(true);
		add ( new Lamina_Procesador());
		setVisible(true);
	}
	
	
	class Lamina_Procesador extends JPanel{
		
		JMenuBar miMenuBar;
			JMenu fuente, estilo, tamajno;
				
		JTextPane miArea = new JTextPane();
		Font letras;
			
		
		
		public Lamina_Procesador() {
		
		setLayout (new BorderLayout ());
		
					miMenuBar = new JMenuBar();
						fuente = new JMenu("Fuente");
							Configura_menuItem ("Arial", fuente , 1, 1);
							Configura_menuItem ("Courier", fuente, 1, 1);
							Configura_menuItem ("Verdana", fuente, 1, 1);
						estilo= new JMenu("Estilo");
							Configura_menuItem ("Negrita", estilo, Font.BOLD, 1);
							Configura_menuItem ("Cursiva", estilo, Font.ITALIC, 1);
							Configura_menuItem ("Plana", estilo, Font.PLAIN, 1);
						tamajno = new JMenu("Tamaño");
							Configura_menuItem ("12", tamajno, 1, 12);
							Configura_menuItem ("16", tamajno, 1, 16);
							Configura_menuItem ("20", tamajno, 1, 20);
							Configura_menuItem ("24", tamajno, 1, 24);
							
							
						
					miMenuBar.add(fuente);
					miMenuBar.add(estilo);
					miMenuBar.add(tamajno);
					//Centras MenuBar
				add(miMenuBar, BorderLayout.NORTH);
				
				add(miArea, BorderLayout.CENTER);
					
			
		}
		
		public void Configura_menuItem (String etiqueta, JMenu menu, int style, int tam) {
			
			JMenuItem elem_menu = new JMenuItem (etiqueta);
			
			menu.add(elem_menu);
			
			elem_menu.addActionListener(new Fuente_evento (etiqueta, menu, style, tam));
			
			
			
		}
		
		private class Fuente_evento implements ActionListener {

			JMenu menu_fuente;
			String nombre_letra;
			int estil;
			int tamaño;
			
			
		
			public Fuente_evento(String etiqueta, JMenu menu, int style, int tam) {
				
				nombre_letra = etiqueta;
				menu_fuente = menu;
				estil = style;
				tamaño = tam;
			}
			
			
		
			public void actionPerformed(ActionEvent e) {
				letras = miArea.getFont();
		
			if (menu_fuente == fuente) {
				
				estil = letras.getStyle();
				tamaño = letras.getSize();
				
			}
			
			if (menu_fuente == estilo) {
				
				nombre_letra = letras.getFontName();
				tamaño = letras.getSize();
				
				if(estil == 1 && nombre_letra == "Cursiva" ) {estil = 3;}
				else if (estil == 2 && nombre_letra == "Negrita") {estil = 3;}
				else if (estil != 1 && estil != 2 && estil !=3 && nombre_letra == "Cursiva") {estil =2;}
				else if  (estil != 1 && estil != 2 && estil !=3 &&  nombre_letra == "Negrita") estil =1;
				
				
			}
			
			if (menu_fuente == tamajno ) {
				
				
				
				nombre_letra = letras.getFontName();
				estil = letras.getStyle();
				
			}
				
				miArea.setFont(new Font ( nombre_letra, estil, tamaño));
				
				
			}
			
		}
		
		
		
		
	}
	
}




