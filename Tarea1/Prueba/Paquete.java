
public class Paquete implements Cobrable{
	private Evento []ev1; 
	private int costoTotal; 
	public Paquete(Evento [] a ){ 	
		this.ev1=a;
		costoTotal=0;
	}
	public int cobrable(){
		for(int i=0; i<ev1.length;i++){
			costoTotal=ev1[i].cobrable()+costoTotal;
		}
		return costoTotal;
	}

}
