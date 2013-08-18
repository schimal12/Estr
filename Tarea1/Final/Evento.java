
public abstract class Evento implements Cobrable {
	protected String nombre;
	protected String lugar;
	protected String descripcion;
	public Evento(String nom, String lug, String desc){
		this.nombre=nom;
		this.lugar=lug;
		this.descripcion=desc;		
	}
}
