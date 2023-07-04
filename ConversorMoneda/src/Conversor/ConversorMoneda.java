package Conversor;

import java.awt.Component;

import javax.swing.JOptionPane;

public class ConversorMoneda {

	// conversor moneda o temperatura
	public static void main(String[] args) {

		Opcion opcion = seleccionarOpcion();
		if (opcion == Opcion.MONEDA) {
			convertirMoneda();
		} else if (opcion == Opcion.TEMPERATURA) {
			convertirTemperatura();
		}
	}

	public static Opcion seleccionarOpcion() {
		Opcion[] opciones = Opcion.values();
		Opcion opcion = (Opcion) JOptionPane.showInputDialog(null, "Escoge una opción", "Conversor",
				JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
		return opcion;
	}

	public static void convertirMoneda() {
		Moneda[] monedas = Moneda.values();
		Moneda moneda = (Moneda) JOptionPane.showInputDialog(null, "Escoge una opción", "Conversor",
				JOptionPane.INFORMATION_MESSAGE, null, monedas, monedas[0]);

		// cuadro de error try-catch
		try {
			String cantidadStr = JOptionPane.showInputDialog("Cantidad a convertir");
			double cantidad = Double.parseDouble(cantidadStr);

			double resultado = cantidad * moneda.getTasa();

			// Mostrar resultado
			JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + resultado);
			Continuar();

		} catch (NumberFormatException e) {
			// regresar a ingrear valor válido
			JOptionPane.showMessageDialog(null, "Error: Ingresa un valor numérico válido");
			convertirMoneda();
		}
	}

	public static void convertirTemperatura() {
		Temperatura[] temperaturas = Temperatura.values();
		Temperatura temperatura = (Temperatura) JOptionPane.showInputDialog(null, "Escoge una opción", "Conversor",
				JOptionPane.INFORMATION_MESSAGE, null, temperaturas, temperaturas[0]);

		// cuadro de error try-catch
		try {
			String cantidadStr = JOptionPane.showInputDialog("Cantidad a convertir");
			double cantidad = Double.parseDouble(cantidadStr);

			double resultado = cantidad * temperatura.getFactor();

			// Mostrar resultado
			JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + resultado);
			Continuar();
		} catch (NumberFormatException e) {
			// regresar a ingrear valor válido
			JOptionPane.showMessageDialog(null, "Error: Ingresa un valor numérico válido");
			convertirTemperatura();
		}
	}

	// Cuadro de dialogo final: cerrar o volver al inicio
	public static void Continuar() {
		int opcionContinuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar",
				JOptionPane.YES_NO_OPTION);
		if (opcionContinuar == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
			System.exit(0);
		} else if (opcionContinuar == JOptionPane.YES_OPTION) {
			while (opcionContinuar == JOptionPane.YES_OPTION) {
				Opcion opcion = seleccionarOpcion();
				if (opcion == Opcion.MONEDA) {
					convertirMoneda();
				} else if (opcion == Opcion.TEMPERATURA) {
					convertirTemperatura();
				}
				opcionContinuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar",
						JOptionPane.YES_NO_OPTION);
			}
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
	}

}
