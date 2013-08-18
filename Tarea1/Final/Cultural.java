
public abstract class Cultural extends Evento{
	protected double duracion;
	public Cultural(double dura){
		super(nom, lug, desc);
		this.duracion=dura;
	}
	public int cobrable();
}
