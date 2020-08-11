import javax.swing.JOptionPane;

public class Equals {

	public static void main(String[] args) {
		
		String clave = "Diego";
		
		String pass = "";
		
		while (clave.equals(pass)== false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña");
		
			
				System.out.println("Contraseña incorrecta");
		
		}
		System.out.println("Contraseña correcta. Acceso permitido");
	}
}


