
public class Materias {
	private String clave;
	private double califFinal; 
	public Materias( String clave, double califFinal){
		this.setClave(clave) ; 
		this.setCalifFinal(califFinal); 
		
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public double getCalifFinal() {
		return califFinal;
	}
	public void setCalifFinal(double califFinal) {
		this.califFinal = califFinal;
	}
	
}
