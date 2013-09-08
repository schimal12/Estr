
public class Recursive {
static String recursivo;	
	public boolean pali(String pali){
		if (pali.length()==0 || pali.length()==1){
			return true;
		}
		if (pali.charAt(0)==pali.charAt(pali.length()-1)){
			return pali(pali.substring(1,pali.length()-1));
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
	public double mult(double n){
		if (n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		else{
			return (2*mult(n-1)+n)-(mult(n-1)+n*mult(n-1)+n*mult(n-1)+n);
		}
	}

	public int minimo(int[] arr, int n, int min){
		if(n<0 || min>arr.length){
			try{
			throw new NumerosException("No se puede");
			}catch(NumerosException e){
				e.printStackTrace();
			}
		}
		if(n == arr.length) {
			return min;
		}
		if(arr[n]<min){ 
			min=arr[n];
		}
		
		return minimo(arr,n+1,min);
	}
}
