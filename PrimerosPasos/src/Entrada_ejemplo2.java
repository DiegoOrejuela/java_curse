
import javax.swing.JOptionPane;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Con el método JOptionPane

	String nombre_de_usuario = JOptionPane.showInputDialog(
			"Introduce tu nombre, por favor");

	String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");
	
	int edad_usuario = Integer.parseInt(edad); //Método para pasar String > Int
	//Para pasar a double, se usa el método Double.parseDouble()
	edad_usuario++;
	
			
	System.out.println("Hola " + nombre_de_usuario + ". Tu tendrás " 
	+ edad_usuario + " años el año que viene.");
		

	}
}
