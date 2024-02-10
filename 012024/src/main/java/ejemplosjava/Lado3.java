package ejemplosjava;

public class Lado3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Triangulo t1= new Triangulo();
		Triangulo t2= new Triangulo();
		
		t1.base=4.0;
		t1.altura= 4.0;
		t1.estilo= "Clase Triangulo: estilo 1";
		System.out.println("lado3 info para ti  ");
		t1.mostrarEstilo();
		t1.mostrarDimencion();
		
		System.out.println("su area  "+t1.area());
		
		
		System.out.println();
		
		
		t2.base=8.0;
		t2.altura= 12.0;
		t2.estilo= "Clase Triangulo: estilo 2";
		
		
		System.out.println("lado3 info para  t2  ");
		t2.mostrarEstilo();
		t2.mostrarDimencion();
		
		System.out.println("su area  "+t2.area());
		
			
	}

}
