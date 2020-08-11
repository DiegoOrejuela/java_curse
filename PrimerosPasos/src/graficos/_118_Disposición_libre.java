package graficos;

import javax.swing.*;


public class _118_Disposición_libre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Disposicion_libre miMarco = new Marco_Disposicion_libre();
	}

}

class Marco_Disposicion_libre extends JFrame {
	
	public Marco_Disposicion_libre() {
		
		setBounds (300,300,600,600);
		add (new Lamina_Disposicion_libre ());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		
	}
}

class Lamina_Disposicion_libre extends JPanel {
	
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		
	public Lamina_Disposicion_libre() {
		
		setLayout (null);
		
		boton1.setBounds(20, 80, boton1.getPreferredSize().width, boton1.getPreferredSize().height);
		boton2.setBounds(400, 50, 100, 100);
		
		add (boton1);
		add (boton2);
		
		
		
	}

}




