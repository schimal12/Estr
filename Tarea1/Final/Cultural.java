import java.io.Serializable;
public abstract class Cultural extends Evento implements Serializable{
	protected double duracion;
	public Cultural(String nom, String lug, String desc,double dura){
		super(nom, lug, desc);
		this.duracion=dura;
	}
}
