
public class Presentacion extends Cultural {
	private boolean GalaOrepre;
	public Presentacion(String nom, String lug, String descr,  double dura, boolean GoR){
		super(nom, lug, descr,dura);
		this.GalaOrepre=GoR;
	}
	public int cobrable(){ 
		if(lug.equalsIgnoreCas("cancha"){
			if (Galaorepre==true){
			return 80;
			}
			else{
			return 30;
			}
		}else{
			if(Galaorepre==true){
				return 50;
			}
			else{
				return 0;
			}
		}
	}
}
