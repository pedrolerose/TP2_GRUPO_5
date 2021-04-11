package dominio;

import java.util.Date;

public class EntidadBase {

	private static int cont = 0;
	private int id;
	private Date fecha;
	
	@Override
	public String toString() {
		return "Entrada [Numero de Entrada=" + id + ", Fecha Evento=" + fecha + "]";
	}

	//Constructores 
	public EntidadBase() 
	{ 
		cont++;
		this.id = cont;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntidadBase other = (EntidadBase) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	public EntidadBase(Date fechaEv) 
	{ 
		cont++;
		this.id = cont;
		this.fecha = fechaEv;
	}
	
	// Getters y Setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

}
