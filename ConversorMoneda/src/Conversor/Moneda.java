package Conversor;

//Constantes
	
	    public enum Moneda {
	        PESOS_MX_A_DOLARES("Pesos Mx a Dólares", 1 / 17.12494),
	        PESOS_MX_A_EUROS("Pesos Mx a Euros", 1 / 18.70567),
	        PESOS_MX_A_LIBRAS("Pesos Mx a Libras", 1 / 21.65078),
	        PESOS_MX_A_YENES("Pesos Mx a Yenes", 1 / 0.11867),
	        PESOS_MX_A_WONS("Pesos Mx a Wons", 1 / 0.013),
	        DOLARES_A_PESOS_MX("Dólares a Pesos Mx", 17.12494),
	        EUROS_A_PESOS_MX("Euros a Pesos Mx", 18.70567),
	        LIBRAS_A_PESOS_MX("Libras a Pesos Mx", 21.65078),
	        YENES_A_PESOS_MX("Yenes a Pesos Mx", 0.11867),
	        WONS_A_PESOS_MX("Wons a Pesos Mx",  0.013);

	        private final String descripcion;
	        private final double tasa;

	        Moneda(String descripcion, double tasa) {
	            this.descripcion = descripcion;
	            this.tasa = tasa;
	        }

	        public String getDescripcion() {
	            return descripcion;
	        }

	        public double getTasa() {
	            return tasa;
	        }
	    }