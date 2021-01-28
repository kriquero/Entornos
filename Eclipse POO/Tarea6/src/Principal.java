import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Libro[] biblioteca;
		biblioteca = new Libro[10];
		Libro base = new Libro("pepe", "Manin", "123456789X");
		
		int opc, introduccion = 0, posicion = 0;
		String t,a,i;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Elija la opción o 0 para salir"
            		+ "\n-----------------------------------------------"
            		+ "\n1. Anyadir libro a la bibblioteca(si se puede)"
            		+ "\n2. Visualizar biblioteca"
            		+ "\n3. Cambiar titulo del libro de una posicion"
            		+ "\n4. Cambiar autor del libro de una posicion"
            		+ "\n5. Cambiar ISBN del libro de una posicion");
            
            opc = sc.nextInt();
            sc.nextLine();


            switch (opc) {
                case 1 -> {
                	if(introduccion<10) {
                		System.out.println("introduzca el titulo");
                		t = sc.nextLine();
                		System.out.println("introduzca el autor");
                		a = sc.nextLine();
                		System.out.println("introduzca el ISBN");
                		i = sc.nextLine();
                		if(base.setISBN(i)) {
                		biblioteca[introduccion] = new Libro(t,a,i);
                		
                		introduccion++;}
                	}else {System.out.println("no caben mas libros en la biblioteca");}
                }
                case 2 -> {
                	for(int ite = 0; ite<introduccion; ite++) {
                		System.out.println("-----------------------------------------------");
                		biblioteca[ite].imprimir();
                	}
                	
                }
                case 3 -> {
                	System.out.println("Escriba el nuevo Titulo");
                	t = sc.nextLine();
                	biblioteca[pidonum()].setTitulo(t);
                	
                }
                case 4 -> {
                	System.out.println("Escriba el nuevo Autor");
                	a = sc.nextLine();
                	biblioteca[pidonum()].setTitulo(a);
                }
                case 5 -> {
                	System.out.println("Escriba el nuevo ISBN");
                	i = sc.nextLine();
                	biblioteca[pidonum()].setTitulo(i);
                }
                case 0->
                System.out.println("Gracias por usar esta biblioteca");
                
            }

        } while (opc != 0);
        sc.close();

	}
	public static int  pidonum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija la posicion que quiere cambiar posicion");
		while (!sc.hasNextInt()) {

        System.out.println("Mucho texto");
        sc.next();

		}

		return sc.nextInt();
	}

}
