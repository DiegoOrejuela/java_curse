import javax.swing.JOptionPane;

public class Equals {

	public static void main(String[] args) {
		
		String clave = "Diego";
		
		String pass = "";
		
		while (clave.equals(pass)== false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contrase�a");
		
			
				System.out.println("Contrase�a incorrecta");
		
		}
		System.out.println("Contrase�a correcta. Acceso permitido");
	}
}


