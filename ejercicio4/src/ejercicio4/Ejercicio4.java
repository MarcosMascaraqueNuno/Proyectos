package ejercicio4;

public class Ejercicio4 {
	public class SmartDevice {
		// atributos
		String marca;
		String modelo;
		
		// contructores
		
		public SmartDevice() {
			
		}
		
		public SmartDevice(String marca, String modelo) {
			this.marca = marca;
			this.modelo = modelo;
		}

		@Override
		public String toString() {
			return "SmartDevice [marca=" + marca + ", modelo=" + modelo + "]";
		}
		
		
		
	}
		
		public class SmartPhone extends SmartDevice{
			// atributos
			String ram;
			String almacenamiento;
			
			
			// contructores
			public SmartPhone() {
				
			}
			// contructores
			public SmartPhone(String marca, String modelo, String ram, String almacenamiento) {
				super(marca, modelo);
				this.ram = ram;
				this.almacenamiento = almacenamiento;
			}
			@Override
			public String toString() {
				return "SmartPhone [ram=" + ram + ", almacenamiento=" + almacenamiento + ", marca=" + marca
						+ ", modelo=" + modelo + "]";
			}
		
			
		
		}
		
		
		
		public class SmartWatch extends SmartDevice{
			// atributos
			String pantalla;
			String tamaño;
			
			
			
			// contructores
			public SmartWatch () {
			}
			

			public SmartWatch(String marca, String modelo, String pantalla, String tamaño) {
				super(marca, modelo);
				this.pantalla = pantalla;
				this.tamaño = tamaño;
			}


			@Override
			public String toString() {
				return "SmartWatch [pantalla=" + pantalla + ", tamaño=" + tamaño + "]";
			}


		
		
	}
		
		public class Main {
		    public static void main(String[] args) {
		        SmartPhone smartPhone = new SmartPhone("Samsung", "Galaxy S20", "8 GB", "128 GB");
		        System.out.println(miSmartPhone);

		        SmartWatch smartWatch = new SmartWatch("Apple", "Watch Series 6", "OLED", "44 mm");
		        System.out.println(miSmartWatch);
		    }
		}

}

