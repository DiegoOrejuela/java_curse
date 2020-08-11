package experimentacion;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class Experimentos {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Usuario name = new Usuario ();

	
		int I = 0;
		int opcion;
		int [] matriz = new int [1000000];
	do {
		 
		
		System.out.println("I Vale = " + I);
		System.out.println("Posición 0 = " + matriz [0]);
		
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Opción"));
		
		if (opcion == 1) {
			
		matriz [I] = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
		I++;
		}
		
		
		for (int j = 0; j < I; j++) {
			System.out.println("Posición " + (j) + " = " + matriz [j]);
		}
		
		
	}while ((opcion == 0) == false);;
		
	}
}
	
	




class Usuario  {
	
	private void Publicb() {

			System.out.println("Hola");
	}
		
		
		
	
	 
	
	
	
}


