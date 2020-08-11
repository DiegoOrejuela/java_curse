package graficos;

import java.awt.*;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;


public class _123_131_Ejercicio_practico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Ejercicio_practico miMarco = new Marco_Ejercicio_practico();
		
		miMarco.setVisible(true);
		
	}
	
}

class Marco_Ejercicio_practico extends JFrame {
	
	 JPanel Lamina_central = new JPanel();
	 	Box [] caja = new Box [6];
	 	 String [] Titulos_cajas = {"Tipo", "Tipo de mensaje", "Mensaje", "Confirmar", "Opcion", "Entrada"};
	 		ButtonGroup [] grupo_boton = new ButtonGroup  [6];
		 		JRadioButton [] boton_tipo = new JRadioButton [4];
		 		 String [] texto_boton_tipo = {"Mensaje", "Confirmar", "Opción", "Entrada"};
		 		JRadioButton [] boton_tipoMensaje = new JRadioButton [5];
		 		 String [] texto_tipoMensaje = {"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"};
		 		JRadioButton [] boton_mensaje = new JRadioButton [5];
		 		 String [] texto_boton_mensaje = {"Cadena", "Ícono", "Componentes", "Otros", "Object []"};
		 		JRadioButton [] boton_confirmar = new JRadioButton [4];
		 		 String [] texto_boton_confirmar = {"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"};
		 		JRadioButton [] boton_opcion = new JRadioButton [3];
		 		 String [] texto_boton_opcion = {"String []", " Icon []", "Object []"};	
		 		JRadioButton [] boton_entrada = new JRadioButton [2];
		 		 String [] texto_boton_entrada = {"Campo de texto", "Combo"};
	 	
	 JPanel Lamina_sur = new JPanel();
	 	JButton botonMostrar = new JButton ("Mostrar");
	
	public Marco_Ejercicio_practico() {
	
	//Características del marco
		setBounds (500, 300, 600, 600);
		setTitle ("Prueba de diálogos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	//Lamina Central	
	Configuracion_grupos_Botones(grupo_boton);
		Configuracion_cajas(caja);
			Configuracion_radioBotones(boton_tipo, texto_boton_tipo, grupo_boton [0], caja [0]);
			Configuracion_radioBotones(boton_tipoMensaje, texto_tipoMensaje, grupo_boton [1], caja [1]);
			Configuracion_radioBotones(boton_mensaje, texto_boton_mensaje, grupo_boton [2], caja [2]);
			Configuracion_radioBotones(boton_confirmar, texto_boton_confirmar, grupo_boton [3], caja [3]);
			Configuracion_radioBotones(boton_opcion, texto_boton_opcion, grupo_boton [4], caja [4]);
			Configuracion_radioBotones(boton_entrada, texto_boton_entrada, grupo_boton [5], caja [5]);
	
		Lamina_central.setLayout(new GridLayout (2, 3));
		add (Lamina_central, BorderLayout.CENTER);
		
		
	//Lamina Sur
		botonMostrar.addActionListener(new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
				String opcion = getBoton(grupo_boton[0]);
				
				if (opcion == "Mensaje"){
					
					JOptionPane.showMessageDialog(Marco_Ejercicio_practico.this, get_tipo (grupo_boton[2]), "Prueba diálogo", (int)get_tipo (grupo_boton[1]));
					
				} else if ( opcion == "Confirmar") {
					
					JOptionPane.showConfirmDialog(Marco_Ejercicio_practico.this, get_tipo (grupo_boton[2]), "Prueba diálogo", (int)get_tipo (grupo_boton[3]),
							(int)get_tipo (grupo_boton[1]));
					
				} else if (opcion == "Opción"){
					
					JOptionPane.showOptionDialog(Marco_Ejercicio_practico.this, get_tipo (grupo_boton[2]), "Prueba diálogo", (int)get_tipo (grupo_boton[3]),
							(int)get_tipo (grupo_boton[1]), null, (Object[]) get_tipo (grupo_boton[4]), null);
					
				} else if (opcion == "Entrada") {
					
					if (getBoton(grupo_boton[5]) == "Campo de texto") {
						
						JOptionPane.showInputDialog(Marco_Ejercicio_practico.this, get_tipo (grupo_boton[2]), "Prueba diálogo", (int)get_tipo (grupo_boton[1]));
					} if (getBoton(grupo_boton[5]) == "Combo") {
						
						JOptionPane.showInputDialog(Marco_Ejercicio_practico.this, get_tipo (grupo_boton[2]), "Prueba diálogo", (int)get_tipo (grupo_boton[1]),
								null, new String [] {"Amarillo", "Azul", "Rojo"}, "Azul");
					}
					
					
					
				}
				
			}
			
		});
		Lamina_sur.add(botonMostrar);
		add (Lamina_sur, BorderLayout.SOUTH);
		
	
	
		
	}
	
	

	
	public void Configuracion_radioBotones (JRadioButton [] botones, String [] texto,  ButtonGroup grupoBoton, Box caja) {
		
		
		boolean seleccion = false;
		
		
		for (int i = 0; i < botones.length; i++) {
			if (i == 0) {
				seleccion = true;
			}
			
			botones [i] = new JRadioButton (texto [i], seleccion);
			grupoBoton.add(botones [i]);
			botones [i].setActionCommand(texto [i]);
			caja.add(botones [i]);
			
		}
		
	}
	
	
	
	
	public String getBoton (ButtonGroup grupoboton) {
	
		return grupoboton.getSelection().getActionCommand();
	}
	

	public Object get_tipo (ButtonGroup grupoboton) {
		
		String tipo = grupoboton.getSelection().getActionCommand();
		
		JPanel componente = new JPanel ();
		componente.setBackground(Color.blue);
		
		if (grupoboton == grupo_boton [1] || grupoboton == grupo_boton [3]) {
			
			if (tipo ==	"ERROR_MESSAGE" || tipo == "YES_NO_OPTION") {
				return 0;
						
			} else if (tipo ==	"INFORMATION_MESSAGE" || tipo == "YES_NO_CANCEL_OPTION") {
				return 1;
						
			} else if (tipo ==	"WARNING_MESSAGE" || tipo == "OK_CANCEL_OPTION") {
				return 0;
						
			} else if (tipo ==	"QUESTION_MESSAGE") {
				return 3;
						
			} else if (tipo ==	"PLAIN_MESSAGE" || tipo == "DEFAULT_OPTION") {
				return -1;
						
			} else {
				return 0;
				
			}
			
		} else if (grupoboton == grupo_boton [2]) {
			
			
			
			if (tipo == "Cadena") {
				return "ke vrgas!!";
				
			} else if (tipo == "Ícono"){
				return new ImageIcon ("bin/graficos/Bola_Amarilla.png");
				
			} else if (tipo == "Componentes"){
				
				return componente;
				
			} else if (tipo == "Otros") {
				return new Date ();
				
			} else if (tipo == "Object []") {
				return new Object [] {"Cadena", new ImageIcon ("bin/graficos/Bola_Amarilla.png"),
								componente, new Date ()};
				
			} else {
				return 0;
			}
			
		
		} else if (grupoboton == grupo_boton [4]) {
			
			if (tipo == "String []") {
				return new String [] {"Amarilla", "Azul", "Rojo"};
				
			} else if (tipo == " Icon []") {
				return new ImageIcon [] {new ImageIcon ("bin/graficos/Bola_Amarilla.png"),
										new ImageIcon ("bin/graficos/Bola_Azul.png"),
										new ImageIcon ("bin/graficos/Bola_Roja.png")};
	
				
			} else if ( tipo == "Object []") {
				return new Object [] {"Cadena", new ImageIcon ("bin/graficos/Bola_Amarilla.png"),
						componente, new Date ()};
				
			} else {
				return 0;
			}
		} else {
			return 0;
		}
			
		} 
		
			
			
			
			
		
	
	
	public void Configuracion_grupos_Botones (ButtonGroup [] grupo) {
		
		for (int i = 0; i < grupo.length; i++) {
			
			grupo [i] = new ButtonGroup ();
		}
	}
	
	
	

	public void Configuracion_cajas (Box [] array) {
		
		for (int i = 0; i < array.length; i++) {
			array [i] = new Box(BoxLayout.Y_AXIS);
			array [i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), Titulos_cajas [i]));
			Lamina_central.add(array [i]);
			
		}
		
	}
		
		
	
	
	
	
}


