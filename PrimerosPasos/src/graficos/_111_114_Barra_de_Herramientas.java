package graficos;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class _111_114_Barra_de_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Barra mimarco=new Marco_Barra();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Barra extends JFrame{
	JMenuBar barra_menu = new JMenuBar ();
	JMenu menu = new JMenu ("Color");
	JToolBar barra_herramientas = new JToolBar ();
	
	public Marco_Barra(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		lamina=new JPanel();
		
		add(lamina);
		
		// configuración de acciones
		
		
		
		Action accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/Bola_Azul.png"), Color.BLUE);
		
		Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/Bola_Amarilla.png"), Color.YELLOW);
		
		Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/Bola_Roja.png"), Color.RED);
		
		Action salir = new AbstractAction ("Salir", new ImageIcon ("src/graficos/Salir.png")) {

			
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
			
		};
		menu.add(accionAzul);
		menu.add(accionAmarillo);
		menu.add(accionRojo);
		
		barra_menu.add(menu);
		
		setJMenuBar (barra_menu);
		
		barra_herramientas.add(accionRojo);
		barra_herramientas.add(accionAzul);
		barra_herramientas.add(accionAmarillo);
		
		barra_herramientas.addSeparator();
		
		barra_herramientas.add(salir);
		
		add(barra_herramientas, BorderLayout.NORTH);
		
		
	}
		
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}		
		
	}
	private JPanel lamina;
}



