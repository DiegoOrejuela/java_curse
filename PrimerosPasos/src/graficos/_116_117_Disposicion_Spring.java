package graficos;

import javax.swing.*;

public class _116_117_Disposicion_Spring {
	
	public static void main(String[] args) {
		
		Marco_Disposicion_Spring miMarco = new Marco_Disposicion_Spring();
	}
}

class Marco_Disposicion_Spring extends JFrame {
	
	public Marco_Disposicion_Spring() {
		
		setBounds (300,300,300,300);
		add (new Lamina_Disposicion_Spring());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		
	}
}

class Lamina_Disposicion_Spring extends JPanel {
	
	SpringLayout miDisposicion = new SpringLayout();
	
	JButton boton1 = new JButton ("boton 1");
	JButton boton2 = new JButton ("boton 2");
	JButton boton3 = new JButton ("boton 3");
	
	Spring resorte = Spring.constant(0, 0, 12);
	Spring resorte_rigido = Spring.constant(10);
	
	public Lamina_Disposicion_Spring() {
		
	setLayout(miDisposicion);
	
		miDisposicion.putConstraint(SpringLayout.WEST, boton1, resorte, SpringLayout.WEST, this);
		add (boton1);
		miDisposicion.putConstraint(SpringLayout.WEST, boton2, resorte, SpringLayout.EAST, boton1);
		add (boton2);
		miDisposicion.putConstraint(SpringLayout.WEST, boton3, resorte_rigido, SpringLayout.EAST, boton2);
		add (boton3);
		miDisposicion.putConstraint(SpringLayout.EAST, this, resorte, SpringLayout.EAST, boton3);
		
		
	}
}


