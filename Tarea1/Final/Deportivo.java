import java.io.Serializable;
public class Deportivo extends Evento implements Serializable{
	private String tipoD;
	private boolean torneo;
	public Deportivo(String nom, String lug, String desc, String tD, boolean torn){
		super(nom, lug, desc);
		this.tipoD=tD;
		this.torneo=torn; 
	}
	public int cobrable(){
		if(torneo == true){
			return 30;
		}else{
			return 0;
		}	
	}
}
