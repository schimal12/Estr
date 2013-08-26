import java.io.*;

public class Serializador{
	private ObjectOutputStream escritorArchivo;
	private ObjectInputStream lectorArchivo;
	public Serializador(){
		escritorArchivo = null;
		lectorArchivo = null;
	}
	
	public void escribirArchivo(Object objeto){
		try{
			if(escritorArchivo == null)
				escritorArchivo = new ObjectOutputStream(new FileOutputStream("Eventos.ser"));				escritorArchivo.writeObject(objeto);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public Object leerArchivo(String archivo){
		Object a = null;
		try{
			if(lectorArchivo == null)
				lectorArchivo  = new ObjectInputStream(new FileInputStream(archivo));
			while(true){
				a =lectorArchivo.readObject();
				System.out.println("Evento "+((Evento)a).getNombre());
			}
		}catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return a;
	}	
}
