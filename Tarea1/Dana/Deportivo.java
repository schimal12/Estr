
public class Deportivo extends Evento{
	private String tipoD;
	private boolean torneo;
	public Deportivo(String nom, String lug, String desc, String tD, boolean torn){
		super(nom, lug, desc);
		this.tipoD=tD;
	}
	public int cobrable(){
		return 0;
	}
}
