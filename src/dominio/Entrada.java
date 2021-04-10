package dominio;

import java.util.Date;

public class Entrada extends EntidadBase {

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
	
	
}
