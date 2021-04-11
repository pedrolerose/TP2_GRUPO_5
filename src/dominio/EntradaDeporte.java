package dominio;

import java.util.Date;

public class EntradaDeporte extends Entrada implements Comparable<Entrada> {

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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((OPCION_FUTBOL == null) ? 0 : OPCION_FUTBOL.hashCode());
		result = prime * result + ((OPCION_HOCKEY == null) ? 0 : OPCION_HOCKEY.hashCode());
		result = prime * result + ((OPCION_RUGBY == null) ? 0 : OPCION_RUGBY.hashCode());
		result = prime * result + PRECIO_ENTRADA_FUTBOL;
		result = prime * result + PRECIO_ENTRADA_HOCKEY;
		result = prime * result + PRECIO_ENTRADA_RUGBY;
		long temp;
		temp = Double.doubleToLongBits(TASA_DE_AUMENTO_EVENTO_INTERNACIONAL);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (nacional ? 1231 : 1237);
		result = prime * result + ((tipoDeporte == null) ? 0 : tipoDeporte.hashCode());
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
		EntradaDeporte other = (EntradaDeporte) obj;
		if (OPCION_FUTBOL == null) {
			if (other.OPCION_FUTBOL != null)
				return false;
		} else if (!OPCION_FUTBOL.equals(other.OPCION_FUTBOL))
			return false;
		if (OPCION_HOCKEY == null) {
			if (other.OPCION_HOCKEY != null)
				return false;
		} else if (!OPCION_HOCKEY.equals(other.OPCION_HOCKEY))
			return false;
		if (OPCION_RUGBY == null) {
			if (other.OPCION_RUGBY != null)
				return false;
		} else if (!OPCION_RUGBY.equals(other.OPCION_RUGBY))
			return false;
		if (PRECIO_ENTRADA_FUTBOL != other.PRECIO_ENTRADA_FUTBOL)
			return false;
		if (PRECIO_ENTRADA_HOCKEY != other.PRECIO_ENTRADA_HOCKEY)
			return false;
		if (PRECIO_ENTRADA_RUGBY != other.PRECIO_ENTRADA_RUGBY)
			return false;
		if (Double.doubleToLongBits(TASA_DE_AUMENTO_EVENTO_INTERNACIONAL) != Double
				.doubleToLongBits(other.TASA_DE_AUMENTO_EVENTO_INTERNACIONAL))
			return false;
		if (nacional != other.nacional)
			return false;
		if (tipoDeporte == null) {
			if (other.tipoDeporte != null)
				return false;
		} else if (!tipoDeporte.equals(other.tipoDeporte))
			return false;
		return true;
	}

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

	@Override
	public int compareTo(Entrada o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
