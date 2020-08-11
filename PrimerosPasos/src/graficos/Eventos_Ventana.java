package graficos;
import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoVentana miVentana1 = new MarcoVentana ();
		miVentana1.setBounds (400, 300, 400, 400);
		miVentana1.setTitle("Ventana 1");
		miVentana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana miVentana2 = new MarcoVentana ();
		miVentana2.setBounds (900, 300, 400, 400);
		miVentana2.setTitle("Ventana 2");
		miVentana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
	}

}

class MarcoVentana extends JFrame {
	
	public MarcoVentana () {
		
		setVisible (true);
		
		//M_Ventana Ventana = new M_Ventana ();
		addWindowListener (new M_Ventana ());
	}
	
}

class M_Ventana extends WindowAdapter{
	    	//  implement WindowListener | Tambien se puede implementar esta interfaz
	
	public void windowActivated(WindowEvent e) {
		System.out.println("Activado");
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("Cerrada");
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando");
	}
	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Desactivada");
	}
	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Restaurada");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Minimizada");
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Abierta");
	}
	
	
}

