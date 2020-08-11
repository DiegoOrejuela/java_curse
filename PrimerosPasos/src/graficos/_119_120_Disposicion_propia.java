package graficos;

import java.awt.*;

import javax.swing.*;


public class _119_120_Disposicion_propia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Disposicion_propia miMarco = new Marco_Disposicion_propia();
	}

}

class Marco_Disposicion_propia extends JFrame {
	
	public Marco_Disposicion_propia() {
		
		setBounds (300,300,600,600);
		add (new Lamina_Disposicion_propia ());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		
	}
}

class Lamina_Disposicion_propia extends JPanel {
	
		JLabel etiqueta1 = new JLabel("Nombre: ");
		JLabel etiqueta2 = new JLabel("Apellido: ");
		
		JTextField CampoTexto1 = new JTextField();
		JTextField CampoTexto2 = new JTextField();
		
	public Lamina_Disposicion_propia() {
		
		setLayout (new Disposicion_propia ());
		
		
		add (etiqueta1);
		add (CampoTexto1);
		
		add (etiqueta2);
		add (CampoTexto2);
	}
}

class Disposicion_propia implements LayoutManager {
	
	int x;
	int y;;
	

	public void addLayoutComponent(String name, Component comp) {
		
	}

	
	public void layoutContainer(Container miContenedor) {
		
		x = miContenedor.getHeight()/2;
		y = 20;
		
		int contador = 0;
		
		
		for (int i = 0; i < miContenedor.getComponentCount(); i++) {
			
			contador++;
			
			miContenedor.getComponent(i).setBounds(x-100, y, 100, 20);
			
			x += 100;
			
			if (contador % 2 == 0) {
				
				x = miContenedor.getHeight()/2;
				y += 40;
			}
			
		}
		
		
	}


	public Dimension minimumLayoutSize(Container parent) {
		
		return null;
	}

	
	public Dimension preferredLayoutSize(Container parent) {
	
		return null;
	}

	
	public void removeLayoutComponent(Component comp) {
	
		
	}
	
}


