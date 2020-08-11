package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConFuentes miMarco = new MarcoConFuentes ();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoConFuentes extends JFrame {
	
	public MarcoConFuentes () {
		
		setTitle ("Marco con dibujo");
		setSize (500, 500);
		LaminaConFuentes miLamina = new LaminaConFuentes ();
		add(miLamina);
		miLamina.setForeground(Color.DARK_GRAY);
		
	}
}

class LaminaConFuentes extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Font miLetra = new Font ("Tahoma", Font.BOLD, 24);
		g2.setFont(miLetra);
		g2.drawString("Diego", 100, 100);
		
		g2.setFont(miLetra);
		g2.setColor(Color.CYAN);
		g2.drawString("Papi", 200, 200);
		
		
	}
	
}