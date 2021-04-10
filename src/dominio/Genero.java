package dominio;

public class Genero {
	
	    //properties
	
	  		
		private String descripcion;

		//getters and setters
		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		@Override
		public String toString() {
			return "Genero: " + descripcion ;
		}

		
	
}
