package dominio;

public class Cliente {

	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private String genero;
	private String localidad;
	private String provincia;
	
	public Cliente(String _nombre, String _apellido, String _dni, String _direccion, String _localidad, String _provincia, String _genero) {
		
		nombre = _nombre;
		apellido = _apellido;
		dni = _dni;
		direccion = _direccion;
		localidad = _localidad;
		provincia = _provincia;
		genero = _genero;
		
	}

	
	@Override
	public String toString() {
		return 
		"Cliente \n"
		+ "Nombre:" + nombre + " " + apellido + "\n" + 
		"DNI:" + dni + "\n"+
		"Dirección=" + direccion + ", " + localidad + ", " + provincia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
