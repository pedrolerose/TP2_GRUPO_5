package dominio;

public class Banda{
	
	//properties
	private String descripcion;
	
	

	public Banda(String descripcion) {
		this.descripcion = descripcion;
	}

	//getters and setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return descripcion;
	}
	
	
	
}
