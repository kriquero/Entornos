
public class Principal {

	public static void main(String[] args) {
		MZFecha f1 = new MZFecha(1,2,1990);
		MZFecha f2 = new MZFecha(2,11,1998);
		MZFecha f3 = new MZFecha(14,8,1975);
		
		f1.imprime();
		f2.imprime();
		f3.imprime();
		
		System.out.println(f1.diferenciaDias(f2));
		
		
	}

}
