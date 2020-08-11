package excepciones;

import java.io.IOException;

import javax.swing.JOptionPane;

public class _146_Clausula_throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String correo = JOptionPane.showInputDialog("Introduce tu email");
		
		try {
			verificandoMail (correo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("El correo es muy corto wey");
		}
		
	}

	
	
	public static void verificandoMail (String mail) throws IOException{
		
		int arroba = 0;
		Boolean punto = false;
		
		if (mail.length() <= 3) {
			
			throw new IOException ();
			
			
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

