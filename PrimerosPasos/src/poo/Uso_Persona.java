package poo;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Persona [] lasPersonas = new Persona [3];
	
	lasPersonas [0] = new empleado2 ("Paco Pérez: ", 700000, 2000, 4, 12);
	
	lasPersonas [1] = new Alumno ("Elver Gómez : ", 100000,  "Comunicación social");
	
	lasPersonas [2] = new Alumno (JOptionPane.showInputDialog("introduce tu "
			+ "nomnbre"),100000,  "Comunicación social");
	
	
		for (Persona e : lasPersonas) {
			System.out.println(e.getNombre() + e.getDescripcion());
			
		}
		
	}

}

abstract class Persona {
	
	private String nombre;
	
	protected int valor;
	
	public Persona (String nom) {
		
		nombre = nom;
		
		valor = 0;
		
	}
	
		public String getNombre () {
			return nombre;
		}
		
		public abstract String getDescripcion (); 
		
		public int getValor () {
			return valor;
		}
		
		public abstract void setValor (); 
		
		
}

class empleado2 extends Persona{
	
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int Id;
	
	private static int IdSiguiente = 1;
	
	

	
	public empleado2 (String nom, double sue, int año, int mes, int dia){
		
		super (nom);
		
	
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar (año, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		Id= IdSiguiente;
		
		IdSiguiente++;
		
		valor += sueldo; 
		
		
	}
	
		//Metodos getters
	
			
			public String getDescripcion () {
				return "Este empleado tiene el ID = " + Id + ", y su sueldo "
						+ "es " + sueldo + ". " + valor;
			}
			                                
			
			public double getSueldo () {
				
				return sueldo;
			}
			
			public Date getAltaContrato () {
				return altaContrato;
			}
			
			public int getId () {
				return Id;
			}
			
		//Métodos setters
			
			public void subirSueldo (double porcentaje) {
				double aumento = sueldo*porcentaje/100;
				
				sueldo+=aumento;			
			}
			
			public void setValor () {
				valor += 180;
			}
}

class Alumno extends Persona {
	
	private String carrera;
	
	private int pension;
	
	public Alumno (String nom, int pen, String carrera) {
		super (nom);
		
		this.carrera = carrera;
		
		pension= pen;
		
		valor += pension; 
	}
	
	public String getDescripcion () {
		return " Este alumno está estudiando la carrera de " + carrera + "Y su pension"
				+ "es de" + pension + ". " + valor;
	}
	
	public void setValor () {
		valor += 200;
	}
}
