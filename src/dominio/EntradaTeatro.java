package dominio;

import java.util.Date;

public class EntradaTeatro extends Entrada implements IGenero {

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


}
