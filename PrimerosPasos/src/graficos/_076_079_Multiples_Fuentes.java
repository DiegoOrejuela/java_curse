package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;



public class _076_079_Multiples_Fuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEMultiples miMarco = new MarcoEMultiples ();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEMultiples extends JFrame {
	
	public MarcoEMultiples () {
		
		setTitle ("Cambiar color | 2 forma");
		setBounds (300, 200, 400, 400);
		add(new LaminaEMultiples());
		setVisible(true);
	}
}

class LaminaEMultiples extends JPanel{
	
//	Botones
	ColorEMultiple Boton_Azul = new ColorEMultiple ("Azul", new ImageIcon ("src/graficos/Bola_Azul.png"), Color.blue);
	ColorEMultiple Boton_Rojo = new ColorEMultiple ("Rojo", new ImageIcon ("src/graficos/Bola_Roja.png"), Color.RED);
	ColorEMultiple Boton_Amarillo = new ColorEMultiple ("Amarillo", new ImageIcon ("src/graficos/Bola_Amarilla.png"), Color.yellow);
	
//	Teclado
	InputMap mapaEntrada = getInputMap (JComponent.WHEN_IN_FOCUSED_WINDOW); //1. Establezco el mapa de entrada, y con la constante estabezco  que los que tienen 
																			// el foco son los elementos que están al interior de la ventana. 
	
	ActionMap mapaAccion = getActionMap (); //4. Establezco el mapa de acción. Se utiliza para capturar combinaciones de teclas

	
		public LaminaEMultiples () {
			
			add(new JButton (Boton_Amarillo));
			add(new JButton (Boton_Azul));
			add(new JButton (Boton_Rojo));
			
			mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "Fondo_amarillo"); //2 y 3. Creo la combinación de teclas, y le asigno una clave. 
			mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "Fondo_azul");
			mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo_rojo");
			
			mapaAccion.put("Fondo_amarillo", Boton_Amarillo);// 4. Asigno el objeto de teclado a la acción. 
			mapaAccion.put("Fondo_azul", Boton_Azul);
			mapaAccion.put("Fondo_rojo", Boton_Rojo);
			
		}
	
	class ColorEMultiple extends AbstractAction {
		
		public ColorEMultiple(String nombre, Icon icono, Color color_boton) {
			
			putValue(NAME, nombre);
			putValue(SMALL_ICON, icono);
			putValue(SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			putValue("Color_fondo", color_boton);
		}

		public void actionPerformed(ActionEvent e) {
			
			Color c = (Color) getValue("Color_fondo");
			setBackground(c);
			
			System.out.println("Botón: " + getValue(Action.NAME));// prueba de cómo rescata la información. 
		}
				
	}
}
	

