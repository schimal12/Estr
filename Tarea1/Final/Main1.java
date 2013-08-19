import javax.swing.JOptionPane;
public class Main1{
	public static void main(String args []){
		Serializador serializar=new Serializador();
		System.out.println("Haz un paquete con los diferentos eventos que tenemos");
		int numEventos =Integer.parseInt( JOptionPane.showInputDialog("Cuantos eventos quieres en tu paquete"));
		int numEventosDisponibles=numEventos;
		Evento [ ] evento = new Evento[numEventos];
		for(int i=0;i<numEventos;i++){
			String nombre;
			String lugar;
			String descripcion;
			System.out.println("Te quedan "+numEventosDisponibles+" eventos por elegir");
			numEventosDisponibles--; 
			int opcion=Integer.parseInt(JOptionPane.showInputDialog("Para el evento "+i+" que evento escoges \n 1) Cultural \n 2) Deportivo"));
			switch(opcion){
			case 1: 
				nombre = JOptionPane.showInputDialog("Dame el nombre del evento");
				lugar = JOptionPane.showInputDialog("Dame el lugar del evento");
				descripcion = JOptionPane.showInputDialog("Dame una descripcion corta del evento");
				double duracion=Double.parseDouble(JOptionPane.showInputDialog("Dame la duracion del evento cultural"));
				int opcionCultural=Integer.parseInt(JOptionPane.showInputDialog("1 ) Exposicion \n 2 ) Presentacion "));
				switch(opcionCultural){
					case 1: 
					String nombreTaller = JOptionPane.showInputDialog("Dame el nombre del taller");
					evento[i] = new Exposiciones(nombre, lugar, descripcion,duracion, nombreTaller);
           				serializar.escribirArchivo(evento[i]);				
					System.out.println("Evento cultural creado");
					break;
					case 2:
					boolean GoR;
					String opcionGoR=JOptionPane.showInputDialog("Escribe gala si pertenece a una gala \n escribe repre si pertence a un representativo");
					if(opcionGoR.equalsIgnoreCase("gala")){
					GoR = true;
					}else{GoR = false; }
			        	evento[i]=new Presentacion(nombre, lugar, descripcion,duracion, GoR);
					serializar.escribirArchivo(evento[i]);
					System.out.println("Evento Cultural creado");
					break;
				}
			break;
			case 2: 
				nombre = JOptionPane.showInputDialog("Dame el nombre del evento"); 
				lugar = JOptionPane.showInputDialog("Dame el lugar del evento"); 
				descripcion = JOptionPane.showInputDialog("Dame una corta descripcion del evento");
				boolean torneo = Boolean.parseBoolean(JOptionPane.showInputDialog("Escribe true si es de un torneo y false si no lo es"));
				String tipoDeporte = JOptionPane.showInputDialog("Dime el tipo de deporte");
				evento[i]=new Deportivo(nombre, lugar, descripcion,tipoDeporte, torneo);
				serializar.escribirArchivo(evento[i]);
				System.out.println("Evento deportivo creado");	
				break;		

			}
		}
	Paquete p1 = new Paquete(evento);
	System.out.println("Imprimiendo Eventos");
	serializar.leerArchivo("Eventos.ser");
	}	
	
}
