
public abstract class Cultural extends Evento{
	protected double duracion;
	public Cultural(String nom, String lug, String desc,double dura){
		super(nom, lug, desc);
		this.duracion=dura;
	}
	public int cobrable();
}
