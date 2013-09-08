public class Busqueda<T> {
	
	// Busqueda De Precio
	public static void QuicksortPrecio(Producto [] arr, int n, int m){
		if( n < m ){
			int z = PartirPrecio(arr, n, m);
			QuicksortPrecio(arr, n,z-1);
			QuicksortPrecio(arr,z+1,n);
		}
	}

	private static int PartirPrecio(Producto[] arr, int n, int m) {
		int z  = arr[m].getPrecio(); 
		int i = n-1;
		Producto t; 
		for(int j=n;j<m;j++){
			if(arr[j].getPrecio()<=z){
				i++;
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}	
		}
		t = arr[i+1];
		arr[i+1] = arr[m];
		arr[m]= t;
		return i+1;
	}	
	public static void QuicksortNombre(Producto [] arr, int n, int m){
		if(n< m ){
			int z = PartirNombre(arr,n,m);
			QuicksortNombre(arr,n,z-1);
			QuicksortNombre(arr, z+1,n);
		}
	}
	
   private static int PartirNombre(Producto[] arr, int n, int m) {
		String z = arr[m].getNombre();
		int i = n-1;
		Producto t;
		for(int j = n;j<m;j++){
			if(arr[j].getNombre().compareTo(z)<0){
				i++;
				t =arr[i]; 
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		t = arr[i+1];
		arr[i+1] = arr[m];
		arr[m] = t;
		arr[m] = t;
		return i+1;
	}
   public static  int BuscarBinario(Producto [] arr, int inicio, int fn,String llaveTipo, String llaveNombre){
	   if(inicio < fn){
		   int mitad = inicio+(fn-inicio)/2; // Solo es para saber la mitad
		   if(arr[mitad].getNombre().compareToIgnoreCase(llaveNombre)==0){
			    if(arr[mitad].getTipo().compareToIgnoreCase(llaveTipo)==0){
			    	return mitad; 
			    }else{
			    	return -1;
			    }
		   }else{
			   if(arr[mitad].getNombre().compareToIgnoreCase(llaveNombre)<0){
				   if(arr[mitad].getTipo().compareToIgnoreCase(llaveTipo)<0){
					   return BuscarBinario(arr,0,mitad,llaveTipo,llaveNombre);
				   }else{
					   return -1;
				   }
			   }
			   return BuscarBinario(arr,mitad,fn,llaveTipo,llaveNombre);
		   }
		   
	   }
	   return -1;
   	}
}
