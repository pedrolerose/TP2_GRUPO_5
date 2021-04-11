package dominio;

import java.util.Date;

public class EntradaInfantil extends Entrada implements Comparable<Entrada> {
	
private int edad;
private boolean souvenir;

private final int EDAD_MAXIMA_MENORES = 8;
private final int PRECIO_PARA_MENORES = 250;
private final int PRECIO_PARA_MAYORES = 500;
private final static String TIPOEVENTO = "INFANTIL";


@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + EDAD_MAXIMA_MENORES;
	result = prime * result + PRECIO_PARA_MAYORES;
	result = prime * result + PRECIO_PARA_MENORES;
	result = prime * result + edad;
	result = prime * result + (souvenir ? 1231 : 1237);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	EntradaInfantil other = (EntradaInfantil) obj;
	if (EDAD_MAXIMA_MENORES != other.EDAD_MAXIMA_MENORES)
		return false;
	if (PRECIO_PARA_MAYORES != other.PRECIO_PARA_MAYORES)
		return false;
	if (PRECIO_PARA_MENORES != other.PRECIO_PARA_MENORES)
		return false;
	if (edad != other.edad)
		return false;
	if (souvenir != other.souvenir)
		return false;
	return true;
}

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

@Override
public int compareTo(Entrada o) {
	// TODO Auto-generated method stub
	return 0;
}


}
