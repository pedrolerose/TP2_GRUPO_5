package dominio;

public class BandaSoporte{
	
	//properties
	private String descripcion;

	public BandaSoporte(String descripcion) {
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
		return this.descripcion;
	}
	
}
