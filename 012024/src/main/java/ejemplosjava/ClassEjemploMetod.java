package ejemplosjava;

public class ClassEjemploMetod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// manda llamar metodos
		
		int resultado= suma (30,40);
		int resultado2= suma (300,10);
		System.out.println(" resultado de la suma  "+resultado);	
		System.out.println(" resultado de la suma  "+resultado2);
		System.out.println("carro "+carro(2));
		int resultado3= suma (30,40,30);
		System.out.println(" resultado de la suma  "+resultado3);
	}
	
	// metodos
	public static int suma(int a, int b) {
		
		int c= a+b ;
		
		return(c);
	}
	
	public static String carro(int a) {
		 String[] cars = {"volvo","BMS","Ford"};
		 return(cars[a]);
	}
	
	
	public static int suma(int a, int b, int c) {
		
		int d= a+b+c ;
		
		return(d);
	}

}
