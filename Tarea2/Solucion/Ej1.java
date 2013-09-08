import java.util.*;

public class Ej{

    public static boolean palindromo(String s){

        if(s==null){
            return false;
        }
        else{
            if(s.length()==0 || s.length()==1){
                return true;
            }
            else{
                return s.charAt(0)==s.charAt(s.length()-1) && palindromo(s.substring(1,s.length()-1));
            }
        }

    }

    public static String decToBin(long num){

        if(num<2){
            return String.valueOf(num);
        }
        else{
            return decToBin(num/2) + String.valueOf(num%2);
        }

    }

    public static long multiplicatoria(int n){
        if(n==1){
            return 1;
        }
        else{
            return (2*n-n*n*n)*multiplicatoria(n-1);
        }
    }

    public static int minimo(int[] arr, int n, int m) throws Exception{

        if(arr==null || arr.length==0 || n<0 || m>=arr.length || n>m){
            throw new Exception("No se puede");
        }
        else{
            if(n==m){
                return arr[n];
            }
            else{
                int min = minimo(arr,n+1,m);

                if(arr[n]<min){
                    return arr[n];
                }
                else{
                    return min;
                }
            }
        }

    }

    public static int minimo(int[] arr) throws Exception{

        if(arr==null || arr.length==0){
            throw new Exception("No se puede");
        }
        else{
            if(arr.length==1){
                return arr[0];
            }
            else{

                int[] aux = Arrays.copyOfRange(arr,1,arr.length);

                int min = minimo(aux);

                if(arr[0]<min){
                    return arr[0];
                }
                else{
                    return min;
                }
            }
        }

    }

}
