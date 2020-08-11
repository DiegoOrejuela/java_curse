package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado miMarco = new MarcoCentrado ();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}

class MarcoCentrado extends JFrame{
	
	
	
	public MarcoCentrado (){
		
		/*1. El m�todo getDefaultToolkit devuelve un objeto toolkit, por eso se debe crear
		 * su respectivo objeto.*/
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
	
		/*2. El m�todo getScreenSize obtiene el tama�o de la pantalla del 
		 * objeto toolkit. La condici�n es que se guarde en un objeto de tipo Dimensi�n, por
		 * eso se crea un objeto de esta clase. 
		 */
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		
		/*3. Ahora extraigo las dimensiones en tipos int con los campos de clase height y 
		 * width, de la clase Dimension. */
		 
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		
		/*4. Ahora si establezco el tama�o y la locacion de la ventana con los datos anteriores.*/
		
		setSize (anchoPantalla/2, alturaPantalla/2);
		setLocation (anchoPantalla/4, alturaPantalla/4);
		
		setTitle ("Marco centrado");
		
		//Cambiar el icono del marco
		
			//Para cambiar la ubicaci�n del archivo, se cuenta desde la carpeta raiz del proyecto de java. 
		Image miIcono = miPantalla.getImage("src/graficos/Felix.jpg.jpg");
		
		setIconImage(miIcono);
		
	}
}