package graficos;


import java.awt.event.*;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton miMarco = new MarcoRaton ();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame {
	
	public MarcoRaton (){
		
		setTitle ("Marco con botones");
		setBounds (300, 300, 500, 500);
		setVisible(true);
		addMouseListener (new EventoRaton ());
		addMouseMotionListener (new EventosRatonMov ());
		
	}
}

class EventoRaton extends MouseAdapter {
			// implements MouseListener

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("Se ha hecho " + e.getClickCount() + " click" +
				" en las " + "cordenadas X:" + e.getX() + ", Y:" + e.getY());
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Ha entrado");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Ha salido");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	
		String Boton = "";
		
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			Boton = "botón izquierdo";
		}
			
		else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			Boton = "boton de rueda";
			
		}
		else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			Boton = "botón derecho";	
		}
		
		System.out.println("Se ha presionado el " + Boton);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Se ha soltado");
		int cont_Clicks = 0;
		  cont_Clicks ++;
	        System.out.println("Click nº" + cont_Clicks + "  "
	        		+ "||  En la posición: X=" + e.getX() + "  Y=" + e.getY());
	}

}

class EventosRatonMov implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("El clik de arrastra");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("El clik se mueve");
	}
	
}








