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
