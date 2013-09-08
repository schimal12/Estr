public class Materia{

	private String clave;
	private double calificacion;
	
	public Materia(String clave,double calificacion){
		this.clave=clave;
		this.calificacion=calificacion;
	}
	
	public double getCalificacion(){
		return calificacion;
	}

}