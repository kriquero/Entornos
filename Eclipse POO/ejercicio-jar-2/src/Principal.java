import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		
		Coche c = new Coche("Seat","Panda","Amarillo");
		int opc = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Imprimir datos del coche\n2. Pintar el coche\n3. Establecer Marca\n4. Establecer Modelo\n5. Establecer Color\n6. Acelerar\n7. Frenar\n8. Parar\n0. Salir");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				c.imprime();
				break;
			case 2:
				c.pinta();
				break;
			case 3:
				System.out.println("Escriba el nombre de la marca");
				c.setMarca(sc.next());
				break;
			case 4:
				System.out.println("Escriba el nombre del modelo");
				c.setModelo(sc.next());
				break;
			case 5:
				System.out.println("Escriba el nombre del nuevo color");
				c.setColor(sc.next());
				break;
			case 6:
				System.out.println("Escriba la velocidad a la que acelerar");
				c.acelera(sc.nextInt());
				break;
			case 7:
				System.out.println("Escriba la velocidad a la que frenar");
				c.frena(sc.nextInt());
				break;
			case 8:
				c.para();
				break;
			case 0:
				System.out.println("Gracias por usar mi programa");
				break;
			}
			
				
			
		}while(opc !=0);
		
		
		
	}

}
