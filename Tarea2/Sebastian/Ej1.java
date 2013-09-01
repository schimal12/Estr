import javax.swing.JOptionPane;
public class Ej1 {
    public static void main(String[] args){
    	    Recursive r1=new Recursive();
        int deseo= Integer.parseInt(JOptionPane.showInputDialog("Deseas 1)Palindromo 2)binario 3)multiplicacion 4)menor"));
        switch(deseo){
        case 1:
            String pali= JOptionPane.showInputDialog("Escribe una palabra");
            System.out.println (r1.pali(pali));
            break;
        case 2:
            int binario=Integer.parseInt(JOptionPane.showInputDialog("Dame tu numero "));
            System.out.println (r1.binario(binario));
            break;
        case 3:
            double mult= Integer.parseInt(JOptionPane.showInputDialog("Dame el numero "));
             System.out.println (r1.mult(mult));
            break;
        case 4:
            int tamano=Integer.parseInt(JOptionPane.showInputDialog("cuantos numeros me vas a dar "));
            int n=Integer.parseInt(JOptionPane.showInputDialog("en donde inicia tu busqueda "));
            int m=Integer.parseInt(JOptionPane.showInputDialog("en donde termina tu busqueda "));
            int arr []=new int[tamano];
            for(int a=0; a<tamano; a++){
                arr[a]=Integer.parseInt(JOptionPane.showInputDialog("Dame el numero " +(a+1)));
            }
            System.out.println(r1.minimo(arr, n, m));
            break;
        }
    }
}
