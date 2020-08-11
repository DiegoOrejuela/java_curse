package graficos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PruebaEventos1forma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConBotones miMarco = new MarcoConBotones ();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConBotones extends JFrame {
	
	public MarcoConBotones (){
		
		setTitle ("Marco con botones");
		setBounds (300, 300, 500, 500);
		LaminaConBotones miLamina = new LaminaConBotones ();
		add(miLamina);
	}
	
	
}

class LaminaConBotones extends JPanel implements ActionListener{
	
	//1. Creacion del objeto fuente
	JButton bAzul = new JButton ("Azul");
	JButton bAmarillo = new JButton ("Amarillo");
	JButton bRojo = new JButton ("Rojo");
	
		//1.1. Lo añadimos a la lamina. Para eso debemos crear el constructor.
	
	public LaminaConBotones () {
		add(bAzul,bRojo);
		add(bAmarillo);
		add(bRojo);
		
		
		
		
	/*2. Le asignamos dos cosas:
	 //a. El tipo de evento
	 		/*El tipo de evento depende a la acción que queremos que desencadene el
	 		 * evento. Esto definira el método, según los casos:*/
			//Con clik = Lo hacemos con el método ActionListener
			//Redimensión de ventana= lo hacemos con el método WindowListener
			//Etc
	 //b. el oyente al cual va dirigido la acción
			/*Dentro de los parentesis le asignamos el objeto listener*/
		
		bAzul.addActionListener(this);
		bAmarillo.addActionListener(this);
		bRojo.addActionListener(this);
	}
	
	/*3. Sobreescribimso el método ActionPerformed que nos obliga a implementar la 
	 * interfaz actionListener. Dentro de los parentesis colocamos el tipo de objeto
	 * de evento:
	 * - Hacer click = ActionEvent
	 * - Redimensión de evento: WindowEvent
	 * Y dentro del método colocamos lo que queremos que ejecute cuando se desencadene
	 * el evento. 
	 */
	public void actionPerformed (ActionEvent e) {
		Object botonPulsado = e.getSource();
		
		
		if (botonPulsado == bAzul) {
			setBackground (Color.blue);
		}
		
		else if (botonPulsado == bAmarillo) {
			setBackground (Color.yellow);
		}
		
		else {
			setBackground (Color.red);
		}
		
	}
}


