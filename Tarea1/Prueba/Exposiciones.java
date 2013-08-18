
public class Exposiciones extends Cultural{
	private String taller;
	public Exposiciones(String nom, String lug, String desc, double dura, String tall){
		super(nom, lug, desc,dura);
		this.taller=tall;
		
	}
	public int cobrable(){
	return 0;
	}
}
