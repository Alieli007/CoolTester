package ejemplosjava;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		minivan.pasajeros=9;
		minivan.capacidad=15;
		minivan.kmh=20;
		
		
		rango= minivan.capacidad * minivan.kmh;
		
		System.out.println(" la minivan puede llevar"+minivan.pasajeros+" pasajeros con rango de"+rango);
		
		 
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros=4;
		System.out.println(" numero pasajeros carro "+carro.pasajeros);

	}

}
