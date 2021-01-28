
public class Libro {

    private String titulo;
    private String autor;
    private String ISBN;


    public Libro(String t, String a, String i){
    	if(setISBN(i)){
    		this.titulo = t;
            this.autor = a;
            setISBN(i);
    	}
        


    }
    public void imprimir() {
    	if(this.ISBN==null) {
    		this.ISBN = "12-345-6789-X";
    		System.out.println();
    	}
        System.out.println("Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nISBN: " + this.ISBN + "\n");
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public boolean setISBN(String i) {
        boolean vale = false;
        if(i.length()==10 || (i.length()==13 && i.charAt(2)=='-' && i.charAt(6)=='-' && i.charAt(11)=='-')){
            if(compruebaISBN10(i)){
                if(!i.contains("-")){
                    this.ISBN = i.substring(0,2) + "-" +  i.substring(2,5) + "-" + i.substring(5,9) + "-" + i.charAt(9);
                    vale = true;
                }else{
                    this.ISBN = i;
                    vale = true;
                }
            }
            
        }
        if((i.length()==13&&!i.contains("-")) || (i.length()==17 && i.charAt(3)=='-' && i.charAt(6)=='-' && i.charAt(10)=='-' && i.charAt(15)=='-')){
            if(compruebaISBN13(i)){
                if(!i.contains("-")){
                    this.ISBN = i.substring(0,3) + "-" +  i.substring(3,5) + "-" + i.substring(5,7) + "-" + i.substring(7,11) + "-" + i.charAt(12);
                }else{
                    this.ISBN = i;
                }
                vale = true;
            }
        }
        
        if(!vale){
            System.err.println("ISBN no válido");
        }
        return vale;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }


    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }


    public boolean compruebaISBN10(String ISBN){
        char sec;
        int num = 0, fin = 0, i = 0, c = 0;
        boolean valido=false;
        if(ISBN.contains("-")){
            do{
                sec = ISBN.charAt(i);
                if(sec != '-'){
                    if(sec=='X' && ISBN.charAt(12)=='X'){
                        fin = fin +100;
                        c++;
                    }else {
                        num = Character.getNumericValue(sec);
                        c++;
                        fin = fin + num * c;
                    }
                }
                i++;
            }while(c != 10);
            if(fin%11 == 0){
                valido = true;
            }
        }else if(!ISBN.contains("-")){
            do{
                sec = ISBN.charAt(i);
                if(sec=='X' && ISBN.charAt(9)=='X'){
                    fin = fin +100;
                    i++;
                }else{
                    num = Character.getNumericValue(sec);
                    i++;
                    fin = fin + num * i;
                }
            }while(i != 10);
            if(fin%11 == 0){
                valido = true;
            }
        }
        return valido;
    }

    public boolean compruebaISBN13(String ISBN) {
        char sec;
        int num = 0, fin = 0, i = 0, c = 0;
        boolean valido=false;
        if(ISBN.contains("-")){
            do{
                sec = ISBN.charAt(i);
                if(sec != '-'){
                    num = Character.getNumericValue(sec);
                    c++;
                }else{num = 0;}
                i++;
                if(c!=13){
                    if(c%2==0){
                        fin = fin + num*3;
                    }else{fin = fin + num;}
                }
            }while(c != 13);
        }else if(!ISBN.contains("-")){
            do{
                sec = ISBN.charAt(i);
                num = Character.getNumericValue(sec);
                i++;
                if(i!=13){
                    if(i%2==0){
                        fin = fin + num*3;
                    }else{fin = fin + num;}
                }
            }while(i != 13);
        }
        if(10-(fin%10) == num){
            valido = true;}
        return valido;
    }
}
