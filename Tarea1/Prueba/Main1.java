import javax.swing.JOptionPane;
public class Tarea1{
	public static void main(String args []){
	
		System.out.println("Haz un paquete con los diferentos eventos que tenemos");
		int numEventos = JOptionPane.showInputDialag("Cuantos eventos quieres en tu paquete");
		Paquete p1 = new Paquete(numEventos);
		int numEventosDisponibles=numEventos;
		Evento [ ] evento = new evento[numEventos];
		for(int i=0;i<numEventos;i++){
			System.out.println("Te quedan "+numEventosDisponibles+" eventos por elegir");
			numEventosDisponibles--; 
			int opcion=JOptionPane.showInputDialog("Para el evento "+i+" que evento escoges \n 1) Cultural \n 2) Deportivo");
			switch(opcion){
			case 1: 
				String nombre = JOptionPane.showInputDialog("Dame el nombre del evento");
				String lugar = JOptionPane.showInputDialo("Dame el lugar del evento");
				String descripcion = JOptionPane.showInputDialog("Dame una descripcion corta del evento");
				double duracion=Double.parseDouble(JOptionPane.showInputDialog("Dame la duracion del evento cultural"));
				int opcionCultural=JOptionPane.showInputDialog("1 ) Exposicion \n 2 ) Presentacion ");
				switch(opcionCultural){
				case 1: 
				String nombreTaller = JOptionPane.showInputDialog("Dame el nombre del taller");
				evento[i] = new Exposiciones(nombre, lugar, descripcion, nombreTaller);
				System.out.println("Evento cultural creado");
				break;
				case 2:
				boolean GoR;
				String opcionGoR=JOptionPane.showInputDialog("Escribe "gala" si pertenece a una gala \n escribe "repre" si pertence a un representativo");
				if(opcionGoR.equalsIgnoreCase("gala")){
				GoR = true;
				}else{GoR = false; }
			        evento[i]=new Presentacion(nombre, lugar, descripcion, GoR);
				System.out.println("Evento Cultural creado");
				break;
			break;
			case 2: 
				String nombre = JOptionPane.showInputDialog("Dame el nombre del evento"); 
				String lugar = JOptionPane.showInputDialog("Dame el lugar del evento"); 
				String descripcion = JOptionPane.showInputDialog("Dame una corta descripcion del evento");
				boolean torneo = Boolean.parseBoolean(JOptionPane.showInputDialog("Escribe "true" si es de un torneo y "false" si no lo es"));
				evento[i]=new Deportivo(nombre, lugar, descripcion, torneo);
				System.out.println("Evento deportivo creado");	
				break;		
				}

			}
		}

	}	
}
