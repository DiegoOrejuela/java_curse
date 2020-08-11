package graficos;

import java.awt.BorderLayout;

import javax.swing.*;

public class _115_Diposiciones_en_caja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Disposicion_en_caja  miMarco = new Marco_Disposicion_en_caja ();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Disposicion_en_caja  extends JFrame {
	Box cajaV1 = Box.createVerticalBox();
		Box cajaH1 = Box.createHorizontalBox();
			JLabel etiqueta1 = new JLabel ("Nombre");
			JTextField Cuadro_texto1 = new JTextField (10);
			
		Box cajaH2 = Box.createHorizontalBox();
			JLabel etiqueta2 = new JLabel ("Contraseña");
			JTextField Cuadro_texto2 = new JTextField (10);
			
		Box cajaH3 = Box.createHorizontalBox();
			JButton boton1 = new JButton ("Aceptar");
			JButton boton2 = new JButton ("Cancelar");
			
	public Marco_Disposicion_en_caja() {
		
		setBounds(200,200,200,200);
		
				cajaH1.add(etiqueta1);
				cajaH1.add(Box.createHorizontalStrut(10));
				Cuadro_texto1.setMaximumSize(Cuadro_texto1.getPreferredSize());
				Cuadro_texto1.setMaximumSize(Cuadro_texto1.getPreferredSize());
				cajaH1.add(Cuadro_texto1);
				
				
				cajaH2.add(etiqueta2);
				cajaH2.add(Box.createHorizontalStrut(10));
				Cuadro_texto2.setMaximumSize(Cuadro_texto2.getPreferredSize());
				cajaH2.add(Cuadro_texto2);
				
				cajaH3.add(boton1);
				cajaH3.add(Box.createGlue());
				cajaH3.add(boton2);
				
			cajaV1.add(cajaH1);
			cajaV1.add(cajaH2);
			cajaV1.add(cajaH3);
			
		add (cajaV1, BorderLayout.CENTER);
		
		
		setVisible (true);
		
	}
	
	
}
