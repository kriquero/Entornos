
public class Depuracion2 {
	
		// Los números aleatorios que se generan van desde 0 hasta kMAX-1
		static final int kMAX=100;
	
		public static void main(String[] args) {
		 
	        final int TAMANYO=10;
	        int lista[]=new int [TAMANYO];
	        int lista2[]=new int [TAMANYO];
	        
	        

	        System.out.println("----------------------------");
	        System.out.println("METODO 1:");
	        
	        // Relleno los arrays lista y lista2 IGUALES
	        rellenarArrays(lista,lista2);
	        
	        /* Trabajo con el array "lista" */
	        System.out.println("Array de números sin ordenar:");
	        
	        imprimirArray(lista);
	        
	        long time1=System.currentTimeMillis();	        
	        intercambio(lista);
	        long time2=System.currentTimeMillis();
	        	        
	        System.out.println("Array de números ordenado:");
	        imprimirArray(lista);
	        
	        System.out.println("Ha tardado : "+(time2-time1)+" milisegundos");
	        
	        System.out.println("----------------------------");
	        System.out.println("METODO 2:");
	        
	        /* Trabajo con el array "lista2" */
	        System.out.println("Array de números sin ordenar:");
	        imprimirArray(lista2);
	        
	        time1=System.currentTimeMillis();	        
	        countingSort(lista2,0,kMAX);
	        time2=System.currentTimeMillis();
	        
	        System.out.println("Array de números ordenado:");
	        imprimirArray(lista2);
	        
	        System.out.println("Ha tardado : "+(time2-time1)+" milisegundos");
	        	        
	    }
	 
	    public static void imprimirArray (int lista[]){
	        for(int i=0;i<lista.length;i++){
	            System.out.print(lista[i]+" ");
	        }
	        System.out.println();
	    }
	 

	    
	    public static void rellenarArrays (int lista[],int lista2[]){
	        int aleat;
	    	for(int i=0;i<lista.length;i++){
	            aleat=numeroAleatorio();
	    		lista[i]=aleat;
	            lista2[i]=aleat;
	        }
	    }
	 
	    private static int numeroAleatorio (){
	        return ((int)Math.floor(Math.random()*kMAX));
	    }
	 
	    public static void intercambio(int lista[]){
	 
	        //Usamos un bucle anidado
	        for(int i=0;i<(lista.length-1);i++){
	            for(int j=i+1;j<lista.length;j++){
	                if(lista[i]>lista[j]){
	                    //Intercambiamos valores
	                    int variableauxiliar=lista[i];
	                    lista[i]=lista[j];
	                    lista[j]=variableauxiliar;
	 
	                }
	            }
	        }
	    }
	    
	    public static void countingSort(int[] array,int min,int max){
	    	
	    	
	    	int[] count= new int[max - min + 1];
	    	
	    	for(int number : array){
	    		count[number - min]++;
	    	}
	    	
	    	int z= 0;
	    	for(int i= min;i <= max;i++){
	    		while(count[i - min] > 0){
	    			array[z]= i;
	    			z++;
	    			count[i - min]--;
	    		}
	    	}
	    }
	    
	   
	 
}
