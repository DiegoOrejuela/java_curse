package graficos;

import java.awt.*;
import javax.swing.*;

import java.awt.geom.*;
public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConDibujo miMarco = new MarcoConDibujo ();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		
		
	}

}


class MarcoConDibujo extends JFrame {
	
	public MarcoConDibujo () {
		
		setTitle ("Marco con dibujo");
		setSize (500, 500);
		LaminaConFiguras miLamina = new LaminaConFiguras ();
		add(miLamina);
		
	}
}

class LaminaConFiguras extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
	
	//Graphics
		//g.drawRect(50, 50, 100, 100);
		//g.drawLine(100, 100, 200, 200);
		
	//Graphics 2D
		
		/*1. Refundición del objeto Graphics, que es que utiliza el método 
		PaintComponent, a un objeto Graphics2D. */

		
		Graphics2D g2 = (Graphics2D) g;
		
		//2. Crear los objetos 2D
		
			/*a. Instanciar clase, través de sus clases internas, heredando de
			la clase principal.*/
			Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
			/*b. Utilizar el método draw (shape s) con el objeto refundido al inicio, 
			y pasándole por parámetro el objeto instanciado en el segundo paso, porque
			implementa la interfaz shape.*/
			g2.draw(rectangulo);
			
			
			Ellipse2D elipse = new Ellipse2D.Double();
			elipse.setFrame(rectangulo);
			g2.draw(elipse);
			
			g2.draw(new Line2D.Double(100, 100, 300, 250));
			
			double centroX = rectangulo.getCenterX();
			double centroY = rectangulo.getCenterY();
			double radio = 150;
			Ellipse2D circulo = new Ellipse2D.Double();
			circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
			g2.draw(circulo);
			
		
		
	}
	
}