public class Estudiantes {
	private String carrera;
	private String nombre;
	private int numeroMaterias;
	private Materias [ ] mat;
	private int contador;
	public Alumno(String carrera, String nombre, String numeroMaterias){
		this.carrera=carrera;
		this.nombre=nombre;
		this.numeroMaterias=numeroMaterias;
		mat=new Materia[cant];
		this.contador=0;
		
	}
	public int getnumeroMaterias(){
		return numeroMaterias;
	}
	public int getMaterias(){
		return mat;
	}
	public String getNombre(){
		return nombre
	}
	public String getCarrera(){
		return carrera;
	}

}
