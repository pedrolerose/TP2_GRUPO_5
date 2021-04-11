package dominio;

import java.util.Date;

public class Entrada extends EntidadBase implements Comparable<Entrada> {

	//properties
	
	private double precio;
	private int tiempoDuracion;
	private String nombreEvento;
	private IGenero genero;
	
	public IGenero getGenero() {
		return genero;
	}

	public void setGenero(IGenero genero) {
		this.genero = genero;
	}

	public Entrada(Date fechaEv, int tiempoDuracionEv, String nombreEventoEv) {
		
		super(fechaEv);
		
		tiempoDuracion = tiempoDuracionEv;
		nombreEvento = nombreEventoEv;
	}
	
	//getters and setters
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nombreEvento == null) ? 0 : nombreEvento.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tiempoDuracion;
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
		Entrada other = (Entrada) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nombreEvento == null) {
			if (other.nombreEvento != null)
				return false;
		} else if (!nombreEvento.equals(other.nombreEvento))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (tiempoDuracion != other.tiempoDuracion)
			return false;
		return true;
	}

	public int getTiempoDuracion() {
		return tiempoDuracion;
	}
	public void setTiempoDuracion(int tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	
	public String getEntradaInfo() {
		return "Nombre evento: " +  nombreEvento + "\n" +
		"Duracion: " + tiempoDuracion + " min. \n" + 
		"Precio: $" + precio + "\n" +
		"--------------------------- \n" ;
		
	}

	@Override
	public int compareTo(Entrada o) {
		if (o.tiempoDuracion == this.tiempoDuracion)
			return 0;
		if (o.tiempoDuracion < this.tiempoDuracion) {
			return 0;
		}
			
		return 1;
	}
	
	
}
