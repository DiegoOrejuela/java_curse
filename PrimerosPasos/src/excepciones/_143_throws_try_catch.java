package excepciones;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class _143_throws_try_catch {

	public static void main(String[] args) {
	
		MarcoConImagen mimarco = new MarcoConImagen ();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoConImagen extends JFrame {
	
	public MarcoConImagen () {
		
		setTitle ("Con imagen");
		setBounds (300, 300, 500, 500);
		LaminaConImagen milamina = new LaminaConImagen();
		add(milamina);
	
		
	}
}

class LaminaConImagen extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2= (Graphics2D) g;
	
		
		
	//Globo
		try {
		imagen2 = ImageIO.read(new File ("src/graficos/globo.gif"));
		} catch (IOException e){
			System.out.println("La imagen no se encuentra disponible");
		}
		g.drawImage(imagen2, 0, 0, null);
		
		//Copiando el area de una lámina
			//g.copyArea(0, 0, 20, 15, 30,0 );
		
		int ancho = imagen2.getWidth(this);
		int alto = imagen2.getHeight(this);
		
		for(int i = 0; i<500; i++) {
			for (int j = 0; j<500; j++) {
				g.copyArea(0, 0, ancho, alto, i*ancho, j*alto);
			}
		}
		
		//Sabiduria
				try {
				imagen = ImageIO.read(new File ("src/graficos/sabiduria.jpg"));
				}catch (IOException e) {
					System.out.println("La imagen no se encuentra disponible");
				}	
				g2.drawImage (imagen, 20, 20, null);
	}
		
	
	private Image imagen;
	private Image imagen2;
}