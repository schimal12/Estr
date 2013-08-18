
public class paquete {
	private evento []eventos;
	private int cont_;
	public paquete(int numEventos){
		eventos=new evento[numEventos];
		cont_=0;
	}
	public void agregarEvento(String nombre, String descripcion, String lugar){
		evento e1 = new evento(nombre, descripcion, lugar);
		eventos[cont_]=e1;
		cont_++;
	}
	
}
