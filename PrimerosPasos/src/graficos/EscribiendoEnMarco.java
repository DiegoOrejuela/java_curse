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
		
		/*Creamos el objeto l�mina. Este es un caso especial, porque regularmente tendr�amos
		que llamar al m�todo paintComponent para que hiciera lo que hace. Sin embargo, ese
		m�todo se asigna automaticamnente, por lo cual es como si hiciera parte misma del
		Constructor<T>.class */
		
		Lamina miLamina = new Lamina ();
		
		/*Agregamos la l�mina creada al marco*/
		
		add(miLamina);
	}
}

class Lamina extends JPanel {
	
	//Se toma el constructor por defecto, as� que no enunciamos ning�n constrcci�n. 
	
	//1. Sobreescribir el m�todo de la clase Component
	
	public void paintComponent (Graphics g) { 
		
	/*Llamamos al m�todo paintComponent de la clase padre para asegurarnos de que ejecute el
		la acci�n que est� en el m�todo propio, y luego si ejecute la que sobreescribimos.*/
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}