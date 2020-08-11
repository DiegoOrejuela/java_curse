package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class IdentificandoFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().
				getAvailableFontFamilyNames();
		
		String queFuente = JOptionPane.showInputDialog("Escriba la fuente");
		
		boolean siEstalaFuente = false;
		
		for (String nombredefuentes : nombreDeFuentes) {
			if (nombredefuentes.equals(queFuente)) {
				
				siEstalaFuente = true;
			}
		}
		
		if (siEstalaFuente) {
			
			System.out.println("La fuente se encuentra instalada");
		} else {
			System.out.println("La fuente no se encuentra instalada");
		}
		
		
		
		//Impresión de las fuentes
		
		/*for (String nombredefuentes : nombreDeFuentes) {
			
			System.out.println(nombredefuentes);
		}
		*/
		
	}

}
