package poo;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador3ClasesLocalesInternas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj miReloj = new PruebaTemporizador3ClasesLocalesInternas (). new Reloj ();
		miReloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Click para detener");
		System.exit(0);
		
	}
	
	class Reloj {
		
		
		public void enMarcha (int Intervalo, final boolean sonido) {
			
			class dameLaHora3 implements ActionListener {//Clase interna!
				
				public void actionPerformed (ActionEvent Event) {
					
					Date ahora = new Date ();
					System.out.println("Te pongo la hora cada 3 sg = " + ahora);
					if (sonido) {
						
						Toolkit.getDefaultToolkit().beep();
					}			
					
				}
			}
			
			ActionListener oyente = new dameLaHora3 ();
			
			Timer miTemporizador = new Timer (Intervalo, oyente);
			
			miTemporizador.start();
		}
		
		
	}

}
