package dominio;

import java.util.Date;

public class EntradaDeporte extends Entrada {

	private String tipoDeporte;
	private boolean nacional;
	private final int PRECIO_ENTRADA_FUTBOL = 300;
	private final int PRECIO_ENTRADA_RUGBY  = 450;
	private final int PRECIO_ENTRADA_HOCKEY = 380;
	private final double TASA_DE_AUMENTO_EVENTO_INTERNACIONAL = 1.30;
	private final String OPCION_FUTBOL = "Futbol";
	private final String OPCION_RUGBY  = "Rugby";
	private final String OPCION_HOCKEY = "Hockey";
	private final static String TIPOEVENTO = "DEPORTE";
	
	
	public EntradaDeporte(Date fechaEv, int tiempoDuracionEv, String nombreEventoEv, String tipoDeporteEv, boolean nacionalEv) {
		
		super(fechaEv, tiempoDuracionEv, nombreEventoEv);
		
		this.setNacional(nacionalEv);
		switch (tipoDeporteEv) {
		
			case OPCION_FUTBOL :
				this.setTipoDeporte(OPCION_FUTBOL);
				this.setPrecio(getPrecioDeEventoInternacional(nacionalEv, PRECIO_ENTRADA_FUTBOL));
			break;
			
			case OPCION_RUGBY:
				this.setTipoDeporte(OPCION_RUGBY);
				this.setPrecio(getPrecioDeEventoInternacional(nacionalEv, PRECIO_ENTRADA_RUGBY));
			break;
			
			case OPCION_HOCKEY:
				this.setTipoDeporte(OPCION_HOCKEY);
				this.setPrecio(getPrecioDeEventoInternacional(nacionalEv, PRECIO_ENTRADA_HOCKEY));
			break;
			
			default:
				System.out.println("Tipo de Deporte Incorrecto");
			break;	
		
		}
		
	}
	
	private double getPrecioDeEventoInternacional(boolean nacionalEv, double precio) {
		double precioFinal;
		if(nacionalEv) {
			precioFinal = precio;  
		} else {
			precioFinal = precio * TASA_DE_AUMENTO_EVENTO_INTERNACIONAL;  
		}
		
		return precioFinal;
	}
	
	
	public String getTipoDeporte() {
		return tipoDeporte;
	}
	public void setTipoDeporte(String tipoDeporte) {
		this.tipoDeporte = tipoDeporte;
	}
	public boolean isNacional() {
		return nacional;
	}
	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}
	
	
	public String toString() {
		String isNacional = "";
		
		if(this.isNacional()) {
			isNacional = "Si"; 
		} else {
			isNacional = "No";
		}
		
		return "Id de entrada: " + this.getId() + " \n" 
				+ "Tipo de deporte: " + this.getTipoDeporte() + " \n"
				+ "Tipo de evento: " + TIPOEVENTO  + " \n"
				+ "Nombre del Evento: " + this.getNombreEvento() + " \n"
				+ "Tipo de deporte: " + this.getTipoDeporte() + " \n"
				+ "Fecha Evento: " + this.getFecha() + " \n"
 				+ "Precio: $" + this.getPrecio() + " \n"
				+ "Duracion: " + this.getTiempoDuracion() + " minutos \n"
				+ "Nacional: " + isNacional + "\n -------------------------- \n";
	}
	
	
}
