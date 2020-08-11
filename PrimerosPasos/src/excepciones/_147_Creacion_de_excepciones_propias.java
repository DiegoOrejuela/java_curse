package excepciones;

import java.io.IOException;

import javax.swing.JOptionPane;

public class _147_Creacion_de_excepciones_propias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String correo = JOptionPane.showInputDialog("Introduce tu email");
		
		try {
			verificandoMail (correo);
		} catch (longitud_mail_error e) {
			// TODO Auto-generated catch block
			System.out.println("El correo es muy corto wey");
			e.printStackTrace();
		}
		
	}

	
	
	public static void verificandoMail (String mail) throws longitud_mail_error{
		
		int arroba = 0;
		Boolean punto = false;
		
		if (mail.length() <= 3) {
			
			//throw new longitud_mail_error();
			throw new longitud_mail_error("El correo no puede tener menos que 3 caracteres");
			
			
		} else {
			
			for (int i = 0; i < mail.length(); i++) {
				
				if (mail.charAt(i)== '@') {
					
					arroba++;
				}
				
				if (mail.charAt(i)== '.') {
					
					punto = true;
				}
			}
			
			if (arroba == 1 & punto == true) {
				
				System.out.println("El mail es correcto");
			} else {
				System.out.println("El mail no es correcto");
			}
		
		}
		
	}

}

class longitud_mail_error extends Exception {
	
	public longitud_mail_error() {
		// TODO Auto-generated constructor stub
	}
	public longitud_mail_error(String msj) {
		
		super (msj);
	}
	
	
}

