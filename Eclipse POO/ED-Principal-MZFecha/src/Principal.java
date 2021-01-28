import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int opc = 0, d, m, a;
MZFecha f1 = new MZFecha();
MZFecha f2 = new MZFecha();

do{
	
	System.out.println("Indique la opcion que desee\n1. Establecer fecha\n2. Imprimir fecha\n3. Diferencia entre dos fechas");
	
	while(!sc.hasNextInt()) {
		System.out.println("Mucho texto");
		sc.next();
	}
	opc = sc.nextInt();
	
	switch(opc){
	case 1 -> {
		System.out.println("Introduzca un dia");
		d = sc.nextInt();
		System.out.println("Introduzca un mes");
		m = sc.nextInt();
		System.out.println("Introduzca un anyo");
		a = sc.nextInt();
		System.out.println("Que fecha quiere cambiar? 1 o 2");
		opc = sc.nextInt();
		if(opc == 1) {
			f1.setFecha(d, m, a);
		}else if(opc == 2) {
			f2.setFecha(d, m, a);
		}
		break;
	}
	case 2->{
		System.out.println("Que fecha quiere mostrar? 1 o 2");
		opc = sc.nextInt();
		if(opc == 1) {
			f1.imprime();
		}else if(opc == 2) {
			f2.imprime();
		}
	}
	case 3->{
		System.out.println(f1.diferenciaDias(f2));
	}
	}
	
}while(opc!=0);
		
		sc.close();
	}

}
