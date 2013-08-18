import java.io.Serializable;
public class Presentacion extends Cultural implements Serializable {
	private boolean GalaOrepre;
	public Presentacion(String nom, String lug, String descr,  double dura, boolean GoR){
		super(nom, lug, descr,dura);
		this.GalaOrepre=GoR;
	}
	public int cobrable(){ 
		if(lugar.equalsIgnoreCase("cancha")){
			if (GalaOrepre==true){
			return 80;
			}
			else{
			return 30;
			}
		}else{
			if(GalaOrepre==true){
				return 50;
			}
			else{
				return 0;
			}
		}
	}
}
