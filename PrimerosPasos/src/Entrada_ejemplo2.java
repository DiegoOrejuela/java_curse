
import javax.swing.JOptionPane;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Con el m�todo JOptionPane

	String nombre_de_usuario = JOptionPane.showInputDialog(
			"Introduce tu nombre, por favor");

	String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");
	
	int edad_usuario = Integer.parseInt(edad); //M�todo para pasar String > Int
	//Para pasar a double, se usa el m�todo Double.parseDouble()
	edad_usuario++;
	
			
	System.out.println("Hola " + nombre_de_usuario + ". Tu tendr�s " 
	+ edad_usuario + " a�os el a�o que viene.");
		

	}
}
