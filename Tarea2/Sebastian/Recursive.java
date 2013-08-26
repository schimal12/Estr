
public class Recursive {
static String recursivo;
	public static boolean Palindromis(String s){
		//Caso Base 
		if(s.length()==0 || s.length()==1){
			return true; // 	
		}else{
			if(s.charAt(0) == s.charAt(s.length()-1)){
				return Palindromis(s.substring(1, s.length()-1));
			}
		}
		return false;
	}
	public static String binario(int a){
	
		if(a == 0 || a == 1){
			recursivo=""+a;
			return recursivo;
		}else{
			recursivo+=""+(a%2);
			return binario(a/2)+(a%2);
		}
	}
	public static  int multiplicatoria(int n){
		if(n==1){
			return 1;
		}else{
			return 2*multiplicatoria(n-1)-(multiplicatoria(n-1)*(multiplicatoria(n-1)*multiplicatoria(n-1)));
		}
	}
	public static int minimo(int []arr, int n, int m){
		if(n==arr.length){
			return n;
		}
			if(arr[n]>m){
				m=arr[n];
			}
			return minimo(arr, n+1,m);
	}
}
