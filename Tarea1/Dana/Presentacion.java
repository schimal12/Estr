
public class Presentacion extends Cultural {
	private boolean GalaOrepre;
	public Presentacion(  double dura, boolean GoR){
		super(dura);
		this.GalaOrepre=GoR;
	}
	public int cobrable(boolean GoR){
		if (GoR==true){
		return 50;
		}
		else{
			return 30;
		}
		}
}
