package secuencias_flujosDeDatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _154_Streams_III_Usando_buffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leer_FicheroBuffer mi_fichero  = new Leer_FicheroBuffer();
		mi_fichero.leer();
		
		Escribir_FicheroBuffer mi_fichero_lectura = new Escribir_FicheroBuffer();
		mi_fichero_lectura.escribir();
	}

}

class Escribir_FicheroBuffer {
	
	
	FileWriter entrada_nueva;
	BufferedWriter miBuffer_escritura;
	String mensaje = "Me vale un kilo y meido de erga";
	
	public void escribir() {
		
		try {
			
			entrada_nueva = new FileWriter("C:\\Users\\Usuario\\Desktop\\Curso de Java\\PrimerosPasos\\bin\\"
					+ "secuencias_flujosDeDatos\\texto_escritura_Buffer.txt");
			
			
			miBuffer_escritura = new BufferedWriter(entrada_nueva);
			
			miBuffer_escritura.write(mensaje);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No hay archivo disponible");
			e.printStackTrace();
			
		} finally {
			
			try {
				miBuffer_escritura.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Leer_FicheroBuffer {
	
	FileReader entrada;
	BufferedReader miBuffer;
	
	public void leer () {
		
		
	
		try {
			entrada = new FileReader ("C:\\Users\\Usuario\\Desktop\\Curso de Java\\PrimerosPasos\\bin\\"
					+ "secuencias_flujosDeDatos\\texto_lectura_Buffer.txt");
			
			miBuffer = new BufferedReader (entrada);
			
			String linea = miBuffer.readLine();
			
			while (linea != null) {
				
				System.out.println(linea);
				
				linea = miBuffer.readLine();
				
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No hay archivo disponible");
		} finally {
			
			try {
				miBuffer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				entrada.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
