package dominio;

import java.util.Arrays;
import java.util.Date;

public class EntradaTeatro extends Entrada implements IGenero, Comparable<Entrada> {

	private String [] actorPrincipal;
	private final double PRECIO_FIJO_ENTRADA = 1350.50;
	private final static String TIPOEVENTO = "TEATRO";
	
	private Genero Genero= new Genero() ;
	
	private static final String G_Drama = "Drama";
	private static final String G_Teatro = "Teatro";
	private static final String G_Comedia = "Comedia";
	

	public EntradaTeatro(Date fechaEv, int tiempoDuracionEv, String nombreEventoEv, String [] actorPrincipalEv, String Codigo_genero) {
		super(fechaEv, tiempoDuracionEv, nombreEventoEv);
		
		this.Genero.setDescripcion(this.Obtener_Genero(Codigo_genero));

		this.setPrecio(PRECIO_FIJO_ENTRADA);
		this.actorPrincipal = actorPrincipalEv;
	}
	
	public String[] getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String[] actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}
	

	
	@Override
	public String Obtener_Genero(String Codigo_Genero) {
String Tipo_Genero;
		
		switch (Codigo_Genero) {
		
		case "G_Drama" :
			Tipo_Genero= G_Drama;
			
		break;
		
		case "G_Teatro":
			Tipo_Genero= G_Teatro;
		break;
		
		case "G_Comedia":
			Tipo_Genero= G_Comedia;
		break;		
		
		
		default:
			Tipo_Genero= "Genero Incorrecto";
		break;	
	
	}
		return Tipo_Genero;
	}
	
	@Override
	public String toString() {
		String actores ="";
		for(int i = 0;i<this.getActorPrincipal().length;i++) {
			actores += this.getActorPrincipal()[i] + ". ";
		}
		
		return "Id de entrada: " + this.getId() + " \n" 
	+ "Genero: " + this.Genero.getDescripcion()+ " \n"
 				+ "Precio: $" + this.getPrecio() + " \n"
				+ "Tipo de Evento: " + TIPOEVENTO + " \n"
				+ "Nombre del Evento: " + this.getNombreEvento() + " \n"
				+ "Genero: " + this.Genero.getDescripcion()+ " \n"
 				+ "Precio: $" + this.getPrecio() + " \n"
 		 		+ "Fecha: " + this.getFecha() + " \n"
				+ "Duracion: " + this.getTiempoDuracion() + " minutos \n"
				+ "Actores principales: "+ actores; 
				
	}

	@Override
	public int compareTo(Entrada o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Genero == null) ? 0 : Genero.hashCode());
		long temp;
		temp = Double.doubleToLongBits(PRECIO_FIJO_ENTRADA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(actorPrincipal);
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
		EntradaTeatro other = (EntradaTeatro) obj;
		if (Genero == null) {
			if (other.Genero != null)
				return false;
		} else if (!Genero.equals(other.Genero))
			return false;
		if (Double.doubleToLongBits(PRECIO_FIJO_ENTRADA) != Double.doubleToLongBits(other.PRECIO_FIJO_ENTRADA))
			return false;
		if (!Arrays.equals(actorPrincipal, other.actorPrincipal))
			return false;
		return true;
	}


}
