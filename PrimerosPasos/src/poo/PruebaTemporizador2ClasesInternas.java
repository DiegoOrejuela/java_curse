package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2ClasesInternas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj miReloj = new PruebaTemporizador2ClasesInternas (). new Reloj (3000, true);
		miReloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Click para detener");
		System.exit(0);
		
	}
	
	class Reloj {
		
		private int intervalo;
		private boolean sonido;
		
		public Reloj (int intervalo, boolean sonido) {
			
			this.intervalo = intervalo;
			this.sonido = sonido;
		}
		
		public void enMarcha () {
			
			ActionListener oyente = new dameLaHora2 ();
			
			Timer miTemporizador = new Timer (intervalo, oyente);
			
			miTemporizador.start();
		}
		
		private class dameLaHora2 implements ActionListener {
			
			public void actionPerformed (ActionEvent Event) {
				
				Date ahora = new Date ();
				System.out.println("Te pongo la hora cada 3 sg = " + ahora);
				if (sonido) {
					
					Toolkit.getDefaultToolkit().beep();
				}			
				
			}
		}
	}

}
