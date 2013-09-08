
public class Producto implements Comparable<Producto>{
	private String nombre;
	private int precio; 
	private String tipo;
	private String [ ]sugerencias; 
	public Producto(String nombre, int precio, String tipo, String [ ] sugerencias){
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setTipo(tipo);
	}
	
	public int compareTo(Producto prAux) {
		if(this.precio == prAux.getPrecio() ){
			return 0;
		}else{
			if(this.precio > prAux.getPrecio()){
				return this.precio-prAux.getPrecio();
			}
			return -this.precio+prAux.getPrecio();
		}	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
