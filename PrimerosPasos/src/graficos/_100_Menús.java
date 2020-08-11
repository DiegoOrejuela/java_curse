package graficos;

import javax.swing.*;

public class _100_Menús {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Menu miMarco = new Marco_Menu();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Menu extends JFrame {
	
	public Marco_Menu () {
		
		setBounds (1500, 400, 400, 400);
		setVisible(true);
		add ( new Lamina_Menu());
		setVisible(true);
	}
	
	
}

class Lamina_Menu extends JPanel{
	
	JMenuBar miMenuBar;
	
	
	public Lamina_Menu() {
		
		miMenuBar = new JMenuBar ();
			JMenu archivo = new JMenu ("Archivo");
				JMenuItem guardar = new JMenuItem ("Guardar");
				JMenuItem guardar_como = new JMenuItem ("Guardar Como");
			JMenu edicion = new JMenu ("Edicion");
				JMenuItem Cortar = new JMenuItem ("Cortar");
				JMenuItem pegar = new JMenuItem ("Pegar");
				JMenuItem copiar = new JMenuItem ("Copiar");
				JMenu opciones = new JMenu ("Opciones");
					JMenuItem opcion1 = new JMenuItem ("Opción 1");
					JMenuItem opcion2 = new JMenuItem ("Opción 2");
			JMenu herramientas = new JMenu ("Herramientas");
				JMenuItem generales = new JMenuItem ("Generales");
				
		
			archivo.add(guardar);
			archivo.add(guardar_como);
			edicion.add(Cortar);
			edicion.add(pegar);
			edicion.add(copiar);
			edicion.addSeparator();
				opciones.add(opcion1);
				opciones.add(opcion2);
			edicion.add(opciones);
			herramientas.add(generales);
		miMenuBar.add(archivo);
		miMenuBar.add(edicion);
		miMenuBar.add(herramientas);
	add(miMenuBar);
		
		
		
	}
}


