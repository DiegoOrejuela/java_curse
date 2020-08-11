package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class Eventos_FocoVentana extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eventos_FocoVentana ventanas = new Eventos_FocoVentana ();
		ventanas.Inicio();
		

	}
	
	public void Inicio () {
		
		marco1= new JFrame();
		marco1.setVisible(true);
		marco1.setBounds(200, 200, 500, 300);
		marco1.addWindowFocusListener(this);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		marco2= new JFrame();
		marco2.setVisible(true);
		marco2.setBounds(800, 200, 500, 300);
		marco2.addWindowFocusListener(this);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == marco1) {
			marco1.setTitle("Ha ganado el foco");
		} else {
			marco2.setTitle("Ha ganado el foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == marco1) {
			marco1.setTitle("");
		} else {
			marco2.setTitle("");
		}
		
		num [0] = 8;
		
	}
	
	int [] num = new int [8];
	
	JFrame marco1;
	JFrame marco2;

}
