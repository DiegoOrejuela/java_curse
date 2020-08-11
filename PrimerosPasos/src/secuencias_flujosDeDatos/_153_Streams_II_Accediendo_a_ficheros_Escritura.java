package secuencias_flujosDeDatos;

import java.io.*;

public class _153_Streams_II_Accediendo_a_ficheros_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		escribir_fichero objeto_escritura = new escribir_fichero();
		objeto_escritura.escribir();
	}

}

class escribir_fichero {

	FileWriter archivo_nuevo;
		String mensaje_1 = "Este es un archivo nuevo";
	FileWriter archivo_sobreescribir;
		String mensaje_2 = " | Estoy sobreescribiendo sobre un archivo viejo";
	
	public void escribir () {
		
		try {
			archivo_nuevo = new FileWriter ("bin\\secuencias_flujosDeDatos\\nuevo_escritura.txt");
			archivo_sobreescribir = new FileWriter ("bin\\secuencias_flujosDeDatos\\texto_prueba.txt", true);
			archivo_sobreescribir.write(mensaje_2);
			archivo_nuevo.write(mensaje_1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				archivo_nuevo.close();
				archivo_sobreescribir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}