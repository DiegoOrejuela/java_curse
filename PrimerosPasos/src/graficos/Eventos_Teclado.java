package graficos;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Eventos_Teclado {

	public static void main(String[] args) {
		

		MarcoConTeclas miMarco = new MarcoConTeclas ();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConTeclas extends JFrame {
	
	public MarcoConTeclas (){
		
		setTitle ("Marco con botones");
		setBounds (300, 300, 500, 500);
		setVisible(true);
		addKeyListener (new EventoTeclado ());
		
	}
}

class EventoTeclado implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println(e.getKeyChar());
		
	}
	
}
