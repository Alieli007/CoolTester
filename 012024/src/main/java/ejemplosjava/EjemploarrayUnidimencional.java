package ejemplosjava;

public class EjemploarrayUnidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int intarray[];
		int [] intarray2;
		double doublearray3[];
		
		
		// declara arreglo string
		String [] arr;
		// inicializar el arreglo.
		arr= new String[5];
		
		arr[0]=" cero " ;
		arr[1]=" uno " ;
		arr[2]=" dos " ;
		arr[3]=" tres " ;
		arr[4]=" cuatro " ;
		 System.out.println(" ejemplo "+arr[2]);	
		 System.out.println();	
		 
		 for(int i= 0; i < arr.length ;i++) {
			 System.out.println(" ciclo "+arr[i]);	
		 }
		 System.out.println();	
		 
		 int[] intentero = new int[] {1,2,3,4,5};
		 
		 for(int i= 0; i < arr.length ;i++) {
			 System.out.println(" ciclo entero "+intentero[i]);	
		 }
		 
	}

}
