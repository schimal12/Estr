import java.lang.reflect.Array;
import java.util.Arrays;

public class ListaArreglo<T extends Comparable<T>>{

    private T[] contenido;

    private int cuantos;

    @SuppressWarnings("unchecked")
    public ListaArreglo(Class<T> c,int n){
        contenido = (T[])Array.newInstance(c,n);
        cuantos=0;
    }

    @SuppressWarnings("unchecked")
    public ListaArreglo(/*Class<T> c,*/T[] datos){

        contenido = Arrays.copyOf(datos,datos.length);
        cuantos=0;


        /*contenido = (T[])Array.newInstance(c,datos.length);

        for(int i=0;i<datos.length;i++){
            contenido[i] = datos[i];
        }*/

    }

    public T getPrimero(){
        if(contenido!=null && contenido.length>0){
            return contenido[0];
        }
        else{
            return null;
        }
    }

    public void add(T ele){
    	if(!repetido(ele)){
	        if(cuantos<=contenido.length ){
	            contenido = Arrays.copyOf(contenido,contenido.length+1);
	            cuantos++;
	        }
	        contenido[contenido.length-1]=ele;
    	}else{
    		System.out.println("No se puede insertar el elemento "+ele.toString()+" Debido a que está repetido");
    	}
    }

    public int size(){
        return cuantos;
    }

    public boolean isEmpty(){
        return cuantos==0;
    }

    public int contains(T ele){

        for(int i=0;i<contenido.length;i++){
            if(contenido[i]!=null){
                if(contenido[i].compareTo(ele)==0){
                    return i;
                }
            }
        }

        return -1;

    }

    public T remove(T ele){

        int aux = contains(ele);

        if(aux!=-1){
            T cosa = contenido[aux];
            contenido[aux]=null;
            cuantos--;
            contenido[aux] = contenido[cuantos];
            contenido[cuantos] = null;
            return cosa;
        }
        else{
            return null;
        }

    }
    public boolean repetido(T ele){
    	for(int i=0;i<contenido.length;i++){
            if(contenido[i]!=null){
                if(contenido[i].compareTo(ele)==0){
                    return true;
                }
            }
        }
		return false;

    }
    public T[] getContenido(){
    	return contenido;
    }
}
