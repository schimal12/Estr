
public abstract class Evento implements Cobrable {
	private String nombre;
	private String lugar;
	private String descripcion;
	public Evento(String nom, String lug, String desc){
		this.nombre=nom;
		this.lugar=lug;
		this.descripcion=desc;
		
	}

}
