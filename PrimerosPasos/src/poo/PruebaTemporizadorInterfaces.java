package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizadorInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dameLaHora oyente = new dameLaHora();
		
		Timer miTemporizador = new Timer (5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "   Pulsa para finalizar");
		
		System.exit(0);
	}


}

class dameLaHora implements ActionListener {
	
	public void actionPerformed (ActionEvent e) {
		
		Date ahora = new Date ();
		
		System.out.println("La hora cada 5 seg: " + ahora );
		
		/*Para acceder al sonido por defecto del sistema, y hacerlo sonar cada vez
		que se haga la llamada*/
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}