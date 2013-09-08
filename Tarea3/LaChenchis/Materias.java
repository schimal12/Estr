public class Materia {
	private String clave;
	private String nombre;
	private int calificacion;
	public Materia(String cl, String no, int calif){
		this.clave=cl;
		this.nombre=no;
		this.calificacion=calif;
	}
	public int getClave(){
		return cl;
	}
	public int getNombre(){
		return no;
	}

	public int getCalificacion(){
		return calif;
	}

}
