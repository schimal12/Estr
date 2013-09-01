//Falta ponerle la interfaz comparable 
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
	//Calculamos el promedio
	public double promedio(){
		double promedioAux=0;
		for(int i=0; i<numeroMaterias;i++){
			promedioAux += this.getMaterias()[i].getCalificacion();
		}
		return promedioAux/numeroMaterias;
	}
	//Agregamos por composición materias 
	public void agregarMaterias(String clave, String nombre, int calificacion){
		Materia m1= new Materia(clave, nombre, calificacion);
		mat[contador]=m1;
		contador++;
	}
	//Falta el método compareTo

}
