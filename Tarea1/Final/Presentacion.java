
public class Presentacion extends Cultural {
	private boolean GalaOrepre;
	public Presentacion(  double dura, boolean GoR){
		super(dura);
		this.GalaOrepre=GoR;
	}
	public int cobrable(){ //Ya no es necesario poner argumentos por dos razones
	// 1 ) La interfaz no especificaba que necesitarás argumentos en tu metodo
	// 2 ) GalaOrepre es una variable dentro de nuestra clase 
		if (Galaorepre==true){
		return 50;
		}
		else{
			return 30;
		}
	}
}
