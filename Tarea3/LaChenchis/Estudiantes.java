public class Estudiantes {
	private String carrera;
	private String nombre;
	private Materias [] mat;
	private int cantidad;
	public Alumno(String carr, String nom, int cant){
		this.carrera=carr;
		this.nombre=nom;
		this.cantidad=cant;
		mat=new Materia[cant];
		
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carr) {
		this.carrera = carr;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	public String getCantidad(){
		return cantidad;
	}
	public void setCantidad(String cant){
		this.cantidad=cant;
	}

}
