
public class Paquete {
	private Evento []ev1; //Acuerdate, siempre es bueno poner las variables de las clases en Private
	private int contador; //Aqui vamos a manejar los espacios de nuestro arreglo de Eventos
	public Paquete(int numeroEventos){ // Cambie esto ya que Paquete debe recibir
	//como argumentos el numero de eventos que necesita que haya para formar un arreglo con el numero especificado de eventos
		ev1=new Evento[numeroEventos];
		contador=0; //Inciamos nuestro contador en 0
	}
	public agregarEvento(String nombre, String descripcion, String lugar){ // Cambie esto 
	//Ya que este es un metodo que va a recibir los parametros de la clase Evento y así formar
	//dentro de esta clase los objetos Evento
		Evento evento=new Evento(nombre, descripcion, lugar); //Formamos nuestro objeto 
		//evento
		ev1[contador]=evento; //Al índice contador de nuestro arreglo de Eventos le asignamos el evento que acabamos de crear
		contador++; //Cada vez que llamemos a este método el contador se aumentará en 1 e iremos llenando nuestro arreglo
		// Esto ya lo sabes Dana ; ) solo es cosa de recordarlo		
	}

}
