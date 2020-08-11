package experimentacion;

import java.awt.*;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;


public class _123_131_Ejercicio_practico {

	public static void main(String[] args) {
		
		Marco_Ejercicio_practico miMarco = new Marco_Ejercicio_practico();
		miMarco.setVisible(true);

	}
}

class Marco_Ejercicio_practico extends JFrame {
	
	 JPanel Lamina_central = new JPanel();
		 Box [] caja = new Box [6];
			ButtonGroup [] grupo_boton = new ButtonGroup  [6];
				 String [] [] componentes  = {
						 
						 {"Tipo",      "Tipo de mensaje",     "Mensaje",     "Confirmar",            "Opcion",    "Entrada"},
						 {"Mensaje",   "ERROR_MESSAGE",       "Cadena",      "DEFAULT_OPTION",       "String []", "Campo de texto"},
						 {"Confirmar", "INFORMATION_MESSAGE", "Ícono",       "YES_NO_OPTION",        "Icon []",   "Combo"},
						 {"Opción",    "WARNING_MESSAGE",     "Componentes", "YES_NO_CANCEL_OPTION", "Object []"}, 
						 {"Entrada",   "QUESTION_MESSAGE",    "Otros",       "OK_CANCEL_OPTION"},
						 { null    ,   "PLAIN_MESSAGE",       "Object []"}
						 
				 };
	 
	 JPanel Lamina_sur = new JPanel();
	 	JButton botonMostrar = new JButton ("Mostrar");
	
	public Marco_Ejercicio_practico() {
	
	//Características del marco
		setBounds (500, 300, 600, 600);
		setTitle ("Prueba de diálogos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Lamina Central	
		Configuracion_menus (componentes, 2, 3);
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
	
	public void Configuracion_menus (String [] [] array, int filas, int columnas) {
		
		Lamina_central.setLayout(new GridLayout (filas, columnas));
		
		for (int i = 0; i < array.length; i++) {
			caja [i]= new Box(BoxLayout.Y_AXIS);
			caja [i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), array [0] [i]));
			Lamina_central.add(caja [i]);
			grupo_boton [i] = new ButtonGroup ();
			
			
			
			for (int j = 1; j < array[i].length; j++) {
				
				if (array [j][i] != null) {
					
					boolean seleccion = false;
					
					if (j == 1) {
						seleccion = true;
					}
					
					JRadioButton botones = new JRadioButton (array [j][i], seleccion);
					
					grupo_boton[i].add(botones);
					botones.setActionCommand(array [j][i]);
					caja [i].add(botones);
				}
				
			}
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
		
	
	
}


