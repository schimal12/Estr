public class Estudiantes {
	private String carrera;
	private String nombre;
	private String clavemateria;
	private Materias [] mat;
	Private int cantidad;
	public Alumno(String carr, String nom, String CM, int cant){
		this.carrera=carr;
		this.nombre=nom;
		this.clavemateria=CM;
		this.cantidad=cant;
		mat=new Materia[cant];
		
	}

}
