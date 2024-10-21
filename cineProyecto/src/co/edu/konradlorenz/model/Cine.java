package co.edu.konradlorenz.model;

public class Cine {
	private String teatro;
	private String estado;
	
	
	
	public Cine(String teatro, String estado) {
		this.teatro = teatro;
		this.estado = estado;
	}

	
	public Cine() {
	}


	public String getTeatro() {
		return teatro;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setTeatro(String teatro) {
		this.teatro = teatro;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cine [teatro=" + teatro + ", estado=" + estado + "]";
	}
	
	
}
