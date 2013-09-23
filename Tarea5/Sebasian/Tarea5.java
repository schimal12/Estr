
public class Tarea5 {
	 public static void main(String[] args){

	        //ListaArreglo<Integer> Lista1 = new ListaArreglo<Integer>(Integer.class,10);
	        Integer[] aux = {1,2,3,4,5};
	        ListaArreglo<Integer> miSegundaLista = new ListaArreglo<Integer>(aux);
	        //Elemento Repetido
	        miSegundaLista.add(2);
	        //Elemento no repetido
	        miSegundaLista.add(10);
	        for(int i=0;i<miSegundaLista.getContenido().length;i++){
	        	System.out.println(miSegundaLista.getContenido()[i]);
	        }
	       miSegundaLista.remove(2);
	       System.out.println("Numero Borrado");
	       for(int i=0;i<miSegundaLista.getContenido().length;i++){
	        	System.out.println(miSegundaLista.getContenido()[i]);
	        }
	       if(miSegundaLista.contains(10)!=-1){
	    	   System.out.println("Si existe el elemento");
	       }else{
	    	   System.out.println("No existe");
	       }
	       
	    }

}

