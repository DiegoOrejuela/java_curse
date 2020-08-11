package secuencias_flujosDeDatos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _152_Streams_I_Accediendo_a_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leer_Fichero mi_fichero  = new Leer_Fichero();
		
		mi_fichero.leer();
	}

}

class Leer_Fichero {
	
	FileReader entrada;
	
	public void leer () {
		
		
	
		try {
			entrada = new FileReader ("C:/Users/Usuario/Desktop/Curso de Java/PrimerosPasos/bin/secuencias_flujosDeDatos/texto_prueba.txt");
			
			int c = 0;
			
			while (c != -1) {
				
				c = entrada.read();
				
				//System.out.print (c+ " "); // para imprimir códigos
				
				if (c != -1) {
					char letra = (char) c;
					System.out.print(letra);
				}
			}
			
			entrada.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No hay archivo disponible");
		} 
		
		
	}
}
