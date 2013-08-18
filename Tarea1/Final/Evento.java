
public abstract class Evento implements Cobrable {
	protected String nombre;
	protected String lugar;
	protected String descripcion;
	//Revisa el comentario acerca del porque del cambio
	public Evento(String nom, String lug, String desc){
		this.nombre=nom;
		this.lugar=lug;
		this.descripcion=desc;		
	}
}
/*Super bien esta clase */ 
/* Pero recuerda, la clase Evento es una clase padre y las variables de una 
