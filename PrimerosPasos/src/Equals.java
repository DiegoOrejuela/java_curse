import javax.swing.JOptionPane;

public class Equals {

	public static void main(String[] args) {
		
		String clave = "Diego";
		
		String pass = "";
		
		while (clave.equals(pass)== false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseņa");
		
			
				System.out.println("Contraseņa incorrecta");
		
		}
		System.out.println("Contraseņa correcta. Acceso permitido");
	}
}


