package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEstado miMarco = new MarcoEstado ();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEstado extends JFrame {
	
	public MarcoEstado () {
		
		setVisible (true);
		setBounds (300,300, 500, 350);
		addWindowStateListener (new CambiaEstado ());
	}
	
}

class CambiaEstado implements WindowStateListener {
	
	public void windowStateChanged (WindowEvent e) {
		//System.out.println("La ventana ha cambiado de estado");
		//System.out.println(e.getNewState());
		
		if (e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana ha sido maximizada");
		}
		
		else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana ha sido minimizada");
		}
		
		else if (e.getNewState() == Frame.NORMAL) {
			System.out.println("La ventana está en estado normal");
		}
		
		 //System.out.println(e.getNewState());  //CHIVATO
		
		
		
		switch (e.getNewState()){

			case 1:
					System.out.println("La ventana está en estado normal");
		      break;

			
			case 0:
				
					System.out.println("La ventana está minimizada");
		       break;

					
			case 6:		
					
					System.out.println("La ventana está maximizada");
			       	break;

		//NUEVO ESTADO      	
			case 7:
				
				System.out.println("La ventana está minimizada");
			       break;
				}
	}
}