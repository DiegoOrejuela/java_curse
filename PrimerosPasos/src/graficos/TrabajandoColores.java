package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConColor miMarco = new MarcoConColor ();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoConColor extends JFrame {
	
	public MarcoConColor () {
		
		setTitle ("Marco con dibujo");
		setSize (500, 500);
		LaminaConColor miLamina = new LaminaConColor ();
		add(miLamina);
		miLamina.setBackground(Color.green);
		
	}
}

class LaminaConColor extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
			Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
			g2.setPaint(Color.blue);
			g2.draw(rectangulo);
			g2.setPaint(Color.red);
			g2.fill(rectangulo);
			
			
			Ellipse2D elipse = new Ellipse2D.Double();
			elipse.setFrame(rectangulo);
			//g2.setPaint(Color.blue); Asignación de color simple
			//g2.setPaint(new Color (23, 234, 123)); Asignación de color con constructor
			g2.setPaint(new Color (23, 234, 123).darker());
			g2.fill(elipse);
			
						
		
		
	}
	
}

