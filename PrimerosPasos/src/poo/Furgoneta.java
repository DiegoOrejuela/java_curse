package poo;

public class Furgoneta extends Coche {

	private int capacidad_carga;	
	private int plazas_extra;
	
	public Furgoneta (int plazas_extra, int capacidad_carga ) {

	super (); //llamada al constructor padre 
	
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	
	}
	
	public String dimeDatosFurgoneta () {
		return "La furgoneta tiene " + plazas_extra + " asientos extras, y su ca"
				+ "pacidad de carga es de " + capacidad_carga + "kg. Por último,"
						+ " su color es "+ super.color_muestra(); 
				
	}
}
 