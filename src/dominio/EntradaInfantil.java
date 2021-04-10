package dominio;

import java.util.Date;

public class EntradaInfantil extends Entrada {
	
private int edad;
private boolean souvenir;

private final int EDAD_MAXIMA_MENORES = 8;
private final int PRECIO_PARA_MENORES = 250;
private final int PRECIO_PARA_MAYORES = 500;
private final static String TIPOEVENTO = "INFANTIL";


public EntradaInfantil(Date fechaEv, int tiempoDuracionEv,String nombreEventoEv,int edadN, boolean souvenirEv) {
	
	super(fechaEv, tiempoDuracionEv, nombreEventoEv);
	
	if(edadN > EDAD_MAXIMA_MENORES) {
		this.setPrecio(PRECIO_PARA_MAYORES);
	}else {
		this.setPrecio(PRECIO_PARA_MENORES);
	}
	
	this.setSouvenir(souvenirEv);
	
}

public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public boolean isSouvenir() {
	return souvenir;
}
public void setSouvenir(boolean souvenir) {
	this.souvenir = souvenir;
}

public String toString() {
	
	String tieneSouvenir = "";
	
	if(this.isSouvenir()) {
		tieneSouvenir = "Si"; 
	} else {
		tieneSouvenir = "No";
	}
	
	return "Id de entrada: " + this.getId() + " \n" 
			+ "Precio: $" + this.getPrecio() + " \n"
			+ "Tipo Evento: " + TIPOEVENTO + " \n"
			+ "Nombre del Evento: " + this.getNombreEvento() + " \n"
			+ "Precio: $" + this.getPrecio() + " \n"
			+ "Fecha: " + this.getFecha() + " \n"
			+ "Duracion: " + this.getTiempoDuracion() + " minutos \n"
			+ "Tiene souvenir: " + tieneSouvenir + "\n -------------------------- \n";
}


}
