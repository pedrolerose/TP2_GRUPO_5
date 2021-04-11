package dominio;

import java.util.Arrays;
import java.util.Date;

public class EntradaRecital extends Entrada implements IGenero, Comparable<Entrada>{
	
	//properties
	
	private boolean esVip;
	private Banda banda;
	private BandaSoporte[] bandaSoporte;
	private final int PRECIO_ENTRADA_VIP = 1500;
	private final int PRECIO_ENTRADA_GRAL = 800;
	private Genero Genero= new Genero() ;
	
	        private static final String G_Rock = "Rock";
			private static final String G_Heavy_Metal = "Heavy_Metal";
			private static final String G_Reggateon = "Reggateon";
			private static final String G_Trap = "Trap";
			private static final String G_Latinos = "Latinos";
			private static final String G_Pop = "Pop";
			private final static String TIPOEVENTO = "RECITAL";
	
	
	//constructors

	public EntradaRecital (Date fechaEv, int tiempoDuracionEv,String nombreEventoEv, boolean esVip,String Codigo_genero, Banda bandaPpal, BandaSoporte[]bandasSoporte) {
		
		super(fechaEv, tiempoDuracionEv, nombreEventoEv);
		
		
		
		this.Genero.setDescripcion(this.Obtener_Genero(Codigo_genero));
		
		if(esVip) {
			this.setEsVip(esVip);
			this.setPrecio(PRECIO_ENTRADA_VIP);	
		} else {
			this.setEsVip(esVip);
			this.setPrecio(PRECIO_ENTRADA_GRAL);
		}
		this.setBanda(bandaPpal);
		this.setBandaSoporte(bandasSoporte);
		
	}
	

	//getters and setters
	
	public boolean isVip() {
		return esVip;
	}

	public void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}


	public Banda getBanda() {
		return banda;
	}


	public void setBanda(Banda banda) {
		this.banda = banda;
	}


	public BandaSoporte[] getBandaSoporte() {
		return bandaSoporte;
	}


	public void setBandaSoporte(BandaSoporte[] bandaSoporte) {
		this.bandaSoporte = bandaSoporte;
	}
	
	
	
	
	@Override
	public String Obtener_Genero(String Codigo_Genero) {
		
		String Tipo_Genero;
		
		switch (Codigo_Genero) {
		
		case "G_Rock" :
			Tipo_Genero= G_Rock;
			
		break;
		
		case "G_Heavy_Metal":
			Tipo_Genero= G_Heavy_Metal;
		break;
		
		case "G_Reggateon":
			Tipo_Genero= G_Reggateon;
		break;
		
		case "G_Trap":
			Tipo_Genero= G_Trap;
		break;
		
		case "G_Latinos":
			Tipo_Genero=G_Latinos;
		break;
		
		case "G_Pop":
			Tipo_Genero=G_Pop;
		break;
		
		default:
			Tipo_Genero= "Genero Incorrecto";
		break;	
	
	}
		return Tipo_Genero;
		
		
		
	}
	

	//METODO TO STRING	
	
	

	public String toString() {
		String tipoDeEntrada= "";
		String bandasSoporte ="";
		for(int i = 0;i<this.getBandaSoporte().length;i++) {
			bandasSoporte += this.getBandaSoporte()[i].toString() + ". ";
		}
		
		if(this.isVip()) {
			tipoDeEntrada = "VIP"; 
		} else {
			tipoDeEntrada = "General";
		}
		
		return "Id de entrada: " + this.getId() + " \n" 
				+ "Tipo de Evento: " + TIPOEVENTO + " \n"
				+ "Nombre del Evento: " + this.getNombreEvento() + " \n"
				+ "Banda: "+ this.getBanda().toString() + " \n"
				+ "Bandas Soporte: "+ bandasSoporte + " \n"
				+ "Genero: " + this.Genero.getDescripcion()+ " \n"
 				+ "Precio: $" + this.getPrecio() + " \n"
 		 		+ "Fecha: " + this.getFecha() + " \n"
				+ "Duracion: " + this.getTiempoDuracion() + " minutos \n"
				+ "Tipo: " + tipoDeEntrada + "\n -------------------------- \n";
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
		result = prime * result + PRECIO_ENTRADA_GRAL;
		result = prime * result + PRECIO_ENTRADA_VIP;
		result = prime * result + ((banda == null) ? 0 : banda.hashCode());
		result = prime * result + Arrays.hashCode(bandaSoporte);
		result = prime * result + (esVip ? 1231 : 1237);
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
		EntradaRecital other = (EntradaRecital) obj;
		if (Genero == null) {
			if (other.Genero != null)
				return false;
		} else if (!Genero.equals(other.Genero))
			return false;
		if (PRECIO_ENTRADA_GRAL != other.PRECIO_ENTRADA_GRAL)
			return false;
		if (PRECIO_ENTRADA_VIP != other.PRECIO_ENTRADA_VIP)
			return false;
		if (banda == null) {
			if (other.banda != null)
				return false;
		} else if (!banda.equals(other.banda))
			return false;
		if (!Arrays.equals(bandaSoporte, other.bandaSoporte))
			return false;
		if (esVip != other.esVip)
			return false;
		return true;
	}


	




	
}
