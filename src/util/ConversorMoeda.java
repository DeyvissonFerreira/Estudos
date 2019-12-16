package util;

public class ConversorMoeda {
	
	public static double VALOR_DOLAR;
	
	
	public static double valorPagar(double qntsDolares) {
		return VALOR_DOLAR * qntsDolares * 0.6;
	}
}
