import javax.swing.JOptionPane; 
import java.util.Arrays;

public class Tarea3 {
	public static void main (String args []){
		System.out.println("Organizacion de la Ceremonia de Excelencia");
		int numeroEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes ingresaras?"));
		Estudiantes []estudiantes = new Estudiantes[numeroEstudiantes];
		for(int i=0;i<estudiantes.length;i++){
			String carrera = JOptionPane.showInputDialog("Que carrera estudia");
			String nombre = JOptionPane.showInputDialog("Cual es el nombre del estudiante"); 
			int numeroMaterias = Integer.parseInt(JOptionPane.showInputDialog("Cuantas materias tiene el  estudiante"));
			estudiantes[i]=new Estudiantes(carrera, nombre, numeroMaterias);
			for(int j=0;j<numeroMaterias;j++){
				String clave = JOptionPane.showInputDialog("Dame la clave de la "+(j+1)+" materia");
				int calif = Integer.parseInt(JOptionPane.showInputDialog("Cual fue sus calificacion"));
				estudiantes[i].agregarMaterias(clave, calif);
			}
		}
		System.out.println("Alumnos posibles que aparecern en la ceremonia de Excelencia"); 
		for(Estudiantes t:estudiantes){
			System.out.println(" El numero y nombre del estudiantes es "+t.getNombre()+" y su promedio es "+t.promedio());
		}
		System.out.println("Alumno seguros que apareceran en la ceremonia de excelencia");
		int contador=0;
		for(Estudiantes t:estudiantes){
			if(t.promedio()>95){
				contador++;
			}
		}
		Estudiantes []estudiantesAux=new Estudiantes[contador];
		contador=0;
		for(Estudiantes t: estudiantes){
			if(t.promedio()>95){
				estudiantesAux[contador]=t;
				contador++;
			}
		}
		System.out.println("Estudiantes antes del sort ");
		for(Estudiantes t:estudiantesAux){
			System.out.println("Estudiante :"+t.getNombre());
		}
		Arrays.sort(estudiantesAux);
		System.out.println("Estudiantes despues del sort ");
		for(Estudiantes t:estudiantesAux){
			System.out.println("Estudiante :"+t.getNombre());
		}
		System.out.println("El estudiante con el mayor promedio es :"+estudiantesAux[estudiantesAux.length-1].getNombre());
	}
}
