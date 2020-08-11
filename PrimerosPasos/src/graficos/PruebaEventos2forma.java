package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos2forma {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConEvento miMarco = new MarcoConEvento ();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConEvento extends JFrame {
	
	public MarcoConEvento () {
		
		setTitle ("Cambiar color | 2 forma");
		setBounds (300, 200, 400, 400);
		LaminaConEvento miLamina = new LaminaConEvento ();
		add(miLamina);
	}
}

class LaminaConEvento extends JPanel{
	
	JButton Azul = new JButton ("Azul");
	JButton Rojo = new JButton ("Rojo");
	JButton Amarillo = new JButton ("Amarillo");
	
	ColorFondo Cazul= new ColorFondo (Color.BLUE);
	ColorFondo Crojo= new ColorFondo (Color.RED);
	ColorFondo Camarillo= new ColorFondo (Color.YELLOW);
	
		
	public LaminaConEvento () {
		
		add(Azul);
		add(Rojo);
		add(Amarillo);
		
		
		
		Azul.addActionListener(Cazul);
		Rojo.addActionListener(Crojo);
		Amarillo.addActionListener(Camarillo);
		
	}
	
	class ColorFondo implements ActionListener {
		
		private Color colorDeFondo;
		
		public ColorFondo (Color color) {
			
			colorDeFondo = color;
		}
		
	public void actionPerformed (ActionEvent e) {
		
		setBackground (colorDeFondo);
	}
	}*/
}






