
public class Estudiantes implements Comparable<Estudiantes>{
	private String carrera; 
	private String nombre; 
	private int contador; 
	private Materias [ ] materias; 
	private int numeroMaterias; 
	public Estudiantes(String carrera, String nombre, int numeroMaterias){
		this.setCarrera(carrera); 
		this.setNombre(nombre); 
		this.contador = 0; 
		this.numeroMaterias = numeroMaterias;
		materias = new Materias[numeroMaterias];
	}
	public int compareTo(Estudiantes est2) {
		double promedioAux = 0;
		for(int i=0;i<est2.getMaterias().length;i++){
			promedioAux+=(est2.getMaterias()[i].getCalifFinal()/est2.getMaterias().length);
		}
		if(this.promedio()==promedioAux){
			return (int) (this.promedio()-promedioAux);
		}else{
			if(this.promedio()>promedioAux){
				return (int) (this.promedio()-promedioAux);
			}
			return (int) (this.promedio()-promedioAux);
		}
		
	}
	public void agregarMaterias(String clave, double califFinal){
		Materias m1 = new Materias(clave, califFinal);
		materias[contador]=m1;
		contador ++; 
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Materias[ ] getMaterias() {
		return materias;
	}
	public void setMaterias(Materias[ ] materias) {
		this.materias = materias;
	}
	public int getNumeroMaterias() {
		return numeroMaterias;
	}
	public void setNumeroMaterias(int numeroMaterias) {
		this.numeroMaterias = numeroMaterias;
	}
	public double promedio(){
		double promedio=0;
		for(int i=0;i<this.numeroMaterias;i++){
			promedio+=((this.getMaterias()[i].getCalifFinal()));
		}
		return promedio/this.numeroMaterias;
	}
}
