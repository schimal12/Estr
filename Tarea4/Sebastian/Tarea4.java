import javax.swing.JOptionPane;

public class Tarea4 {
	public static void main(String [ ] args ){
		//Llenado de Datos 
		System.out.println("Cafeteria Dos Poblanos");
		int opcion1;
		opcion1=Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos quieres"));
		Producto []  productosTienda= new Producto [ opcion1];
		String nombre;
		int precio;
		int opcionSugerencias;
		String sugerencias[];
		for(int i=0; i< opcion1 ; i++){
			int opcion;
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Que opcion eliges \n 1) CafŽ \n 2) Comida \n 3 ) TŽ"));
			switch(opcion){
			case 1:
					nombre = JOptionPane.showInputDialog("Cu‡l es el nombre del cafŽ");
					precio = Integer.parseInt(JOptionPane.showInputDialog("Dame el precio del cafŽ"));
					opcionSugerencias = Integer.parseInt(JOptionPane.showInputDialog("Cuantas sugerencias tiene el producto"));
					sugerencias = new String [ opcionSugerencias];
					for( int j = 0; j<opcionSugerencias;j++){
						sugerencias[i]= JOptionPane.showInputDialog("Sugerencias numero "+(i+1));
					}
					productosTienda[i] = new Producto(nombre, precio, "cafe", sugerencias );
				break;
			case 2: 
				nombre = JOptionPane.showInputDialog("Cu‡l es el nombre de la comida");
				precio = Integer.parseInt(JOptionPane.showInputDialog("Dame el precio de la comida"));
				opcionSugerencias = Integer.parseInt(JOptionPane.showInputDialog("Cuantas sugerencias tiene el producto"));
				sugerencias = new String [ opcionSugerencias];
				for( int j = 0; j<opcionSugerencias;j++){
					sugerencias[i]= JOptionPane.showInputDialog("Sugerencias numero "+(i+1));
				}
				productosTienda[i] = new Producto(nombre, precio, "comida", sugerencias );
			break;
			case 3:
				nombre = JOptionPane.showInputDialog("Cu‡l es el nombre de tŽ");
				precio = Integer.parseInt(JOptionPane.showInputDialog("Dame el precio del tŽ"));
				opcionSugerencias = Integer.parseInt(JOptionPane.showInputDialog("Cuantas sugerencias tiene el producto"));
				sugerencias = new String [ opcionSugerencias];
				for( int j = 0; j<opcionSugerencias;j++){
					sugerencias[i]= JOptionPane.showInputDialog("Sugerencias numero "+(i+1));
				}
				productosTienda[i] = new Producto(nombre, precio, "tŽ", sugerencias );
			break;
			}
		}
		/*Para probar el programa sin llenar objetos*/
		/*String[] aux = new String[]{"a","b ","C"};
		Producto [] productosTienda = new Producto[]{new Producto("Chilaquiles",100,"te",aux),new Producto("Capuccino",100,"cafe",aux),new Producto("Manzanilla",80,"te",aux),new Producto("Nopales",30,"comida",aux),new Producto("Moka",56,"cafe",aux),new Producto("Hierbabuena",9,"te",aux),new Producto("Bisteck",300,"comida",aux)};*/
		//Busqueda de Datos 
		int opcionBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Que quieres hacer 1 ) Busqueda por precio \n 2 ) Busqueda por tipo \n 3) Busqueda Espec’fica"));
		switch(opcionBusqueda){
		case 1: 
			System.out.println("Estos son los precios que manejamos");
			for(int i = 0; i<productosTienda.length;i++){
				System.out.println("Precio "+(i+1)+" "+productosTienda[i].getPrecio()+"\n");
			}
			int precioBuscar = Integer.parseInt(JOptionPane.showInputDialog("Cual precio buscas"));
			for(int j=0;j<productosTienda.length;j++){
				if(productosTienda[j].getPrecio()==precioBuscar){
					System.out.println("Producto "+productosTienda[j].getNombre());
				}
			}
			break;
		case 2: 
			System.out.println("Hay cafŽ, comida y tŽ");
			String tipoBuscar = (JOptionPane.showInputDialog("Dame el tipo de producto que deseas buscar"));
			int contador = 0;
			for(Producto t: productosTienda){
				if(t.getTipo().equalsIgnoreCase(tipoBuscar)){
					contador++;
				}
			}
				Producto []productosAux =  new Producto[contador];
				contador=0;
				for(Producto t1:productosTienda){
					if(t1.getTipo().equalsIgnoreCase(tipoBuscar)){
						productosAux[contador]=t1;
						contador++;
					}
				}
				System.out.println("Ordenado por Nombre \n " );

			Busqueda.QuicksortNombre(productosAux, 0, productosAux.length-1);
			for(Producto t2 : productosAux){
				System.out.println("Nombre "+t2.getNombre()+" Precio "+t2.getPrecio()+" Tipo "+t2.getTipo());
			}
			System.out.println("Ordenado por Precio \n" );

			Busqueda.QuicksortPrecio(productosAux, 0, productosAux.length-1);
			for(Producto t2 : productosAux){
				System.out.println("Nombre "+t2.getNombre()+" Precio "+t2.getPrecio()+" Tipo "+t2.getTipo());
			}
			break;
		case 3: 
			System.out.println("Busqueda por Nombre y Tipo");
			String tipo = JOptionPane.showInputDialog("Que tipo buscas \n CafŽ \n TŽ \n Comida");
			String Nombre = JOptionPane.showInputDialog("Nombre de Comida en especial");
			Busqueda.QuicksortNombre(productosTienda, 0, productosTienda.length-1);
			System.out.println("El producto en existencia es: \n "+" Precio "+productosTienda[Busqueda.BuscarBinario(productosTienda, 0, productosTienda.length-1, tipo, Nombre)].getPrecio()+" Nombre "+Nombre+" Tipo "+tipo);
		}
		
		
	}	
}




