package entities;

public class Estudante {
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String aprovado() {
		
		if (notaFinal() > 60.0) {
			return "PASSED";
		} else {
			return "MISSING: " + (60.00 - notaFinal()) + " POINTS.";
		}
	}

}
