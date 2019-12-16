package entities;

public class Empregado {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
		
	}
	
	public double aumentaSalario(double perc) {
		return (this.salarioBruto += salarioBruto * perc / 100);
	}
	
	@Override
	public String toString() {
		return "Empregado: " + name + "$: " + salarioLiquido();
	}

}
