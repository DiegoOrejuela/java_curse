package experimentacion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class Repiñaña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame miMarco = new JFrame ();
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		miMarco.setBounds(tamanoPantalla.width/4,tamanoPantalla.height/4 , tamanoPantalla.width/2,
				tamanoPantalla.height/2);
	
		Image miIcono = miPantalla.getImage("src/Experimentacion/AlexaIcon.jpg");
		miMarco.setIconImage(miIcono);
	
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel miLamina = new Lamina ();
		miLamina.setAlignmentX(miLamina.CENTER_ALIGNMENT);
		
		
		
		miMarco.add(miLamina);
		miMarco.setVisible(true);
	}

}

class Lamina extends JPanel {
	
	JButton Primero = new JButton ("Primero");
	JButton Segundo = new JButton ("Segundo");
	JButton Tercero = new JButton ("Tercero");
	
	public Lamina () {
		add(Primero);
		add(Segundo);
		add(Tercero);
	}
	
		class Proposito implements ActionListener {
				
				private Image ImagenProposito;
				
			public Proposito (Image i) {
					
					ImagenProposito = i;
				}
				
				public void actionPerformed (ActionEvent e) {
					
					
				}
		}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g.setFont(new Font ("Tahoma", Font.BOLD, 24 ));
		g.drawString("Los propositos de la", 270, 450);
		g2.setPaint(Color.red);
		g.drawString(" BEBECHITA", 510, 450);
		
		try {
			imagen = ImageIO.read(new File ("src/Experimentacion/ahorrar.png"));
			}catch (IOException e) {
				System.out.println("La imagen no se encuentra disponible");
			}	
			g2.drawImage (imagen, 0, 0,  null);
		
			
			
	
	}
	private Image imagen;
}

