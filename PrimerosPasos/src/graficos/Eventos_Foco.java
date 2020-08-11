package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Eventos_Foco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConFoco miMarco = new MarcoConFoco ();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConFoco extends JFrame {
	
	public MarcoConFoco (){
		
		setTitle ("Marco con foco");
		setBounds (300, 300, 500, 500);
		setVisible(true);
		add(new LaminaConFoco ());
		
	}

	
}

class LaminaConFoco extends JPanel {
	
	JTextField Cuadro1;
	JTextField Cuadro2;
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);

	setLayout(null);
	
	Cuadro1 = new JTextField ();
	Cuadro1.setBounds(50, 50, 100, 20);
	add(Cuadro1);
	
	Cuadro2 = new JTextField ();
	Cuadro2.setBounds(50, 100, 100, 20);
	add(Cuadro2);
	
	Cuadro1.addFocusListener(new LanzaFocos ());
	Cuadro2.addFocusListener(new LanzaFocos ());
	}

	class LanzaFocos implements  FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("Ha ganado el foco");
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("Ha perdido el foco");
			
			//Objetivo: Revisar si en los carcateres ingresados hay un @
			
			String texto = Cuadro1.getText();
			
			Boolean comprobante = false;
			
			for (int i = 0; i < texto.length(); i++) {
				
				if (texto.charAt(i) == '@') {
					
					comprobante = true;
				} 
				
			}
			
			if(comprobante) {
				System.out.println("Correcto");
			} else {
				System.out.println("Incorrecto");
			}
		}
		
	}
	
	
}
	
	