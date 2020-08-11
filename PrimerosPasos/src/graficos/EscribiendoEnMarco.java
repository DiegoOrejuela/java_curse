package graficos;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Constructor;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn

		MarcoConTexto miMarco = new MarcoConTexto ();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto () {

		setSize (600, 450);
		setLocation (400, 200);
		setTitle ("Primer texto");
		setVisible (true); 
		
		/*Creamos el objeto lámina. Este es un caso especial, porque regularmente tendríamos
		que llamar al método paintComponent para que hiciera lo que hace. Sin embargo, ese
		método se asigna automaticamnente, por lo cual es como si hiciera parte misma del
		Constructor<T>.class */
		
		Lamina miLamina = new Lamina ();
		
		/*Agregamos la lámina creada al marco*/
		
		add(miLamina);
	}
}

class Lamina extends JPanel {
	
	//Se toma el constructor por defecto, así que no enunciamos ningún constrcción. 
	
	//1. Sobreescribir el método de la clase Component
	
	public void paintComponent (Graphics g) { 
		
	/*Llamamos al método paintComponent de la clase padre para asegurarnos de que ejecute el
		la acción que está en el método propio, y luego si ejecute la que sobreescribimos.*/
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}