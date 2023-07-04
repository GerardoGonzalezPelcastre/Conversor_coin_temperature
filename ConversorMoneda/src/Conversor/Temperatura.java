package Conversor;

//Constantes
	    public enum Temperatura {
	        CELSIUS_A_FAHRENHEIT("Celcius a Fahrenheit", 33.8),
	        CELSIUS_A_KELVIN("Celcius a Kelvin", 274.15),
	        FAHRENHEIT_A_CELSIUS("Fahrenheit a Celcius", -17.22),
	        FAHRENHEIT_A_KELVIN("Fahrenheit a Kelvin", 255.93),
	        KELVIN_A_CELSIUS("Kelvin a Celcius", -272.15),
	        KELVIN_A_FAHRENHEIT("Kelvin a Fahrenheit", -457.87);

	        private final String descripcion;
	        private final double factor;

	        Temperatura(String descripcion, double factor) {
	            this.descripcion = descripcion;
	            this.factor = factor;
	        }

	        public String getDescripcion() {
	            return descripcion;
	        }

	        public double getFactor() {
	            return factor;
	        }
	    }
	
	

