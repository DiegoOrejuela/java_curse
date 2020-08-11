package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _080_Multiples_Oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Oyentes miMarco = new Marco_Oyentes();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	

}

class Marco_Oyentes extends JFrame {
	
	public Marco_Oyentes () {
		
		setTitle("Marco Principal");
		setBounds (1240, 40, 400, 150);
		
		add(new Panel_Oyentes());
		
		setVisible(true);
	}
}

class Panel_Oyentes extends JPanel {
	
	JButton NuevoOyente = new JButton("Nuevo oyente");
	JButton CerrarTodo;
	
	public Panel_Oyentes () {
		
		add(NuevoOyente);
		
		NuevoOyente.addActionListener(new Nuevas_ventanas_oyentes());
		
		CerrarTodo = new JButton("Cerrar todo");
		
		add(CerrarTodo);
			
		
			
	}
	
	private class Nuevas_ventanas_oyentes implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			Ventanas_Oyentes misOyentes = new Ventanas_Oyentes(CerrarTodo);
		}
		
		
	}
}

class Ventanas_Oyentes extends JFrame {
	
	private static int contador = 0;
	
	public Ventanas_Oyentes (JButton botonCerrar) {
		
		contador++;
		setTitle("Ventana" + contador);
		setBounds (40*contador, 40*contador, 400, 150);
		setVisible(true);
		
		botonCerrar.addActionListener(new Cerrar_Todo());
	}
	
	private class Cerrar_Todo implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			dispose();
			contador = 0;
		}
		
	}
}






