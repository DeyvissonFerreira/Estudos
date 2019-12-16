package entities;

public class Product {
	
	public String name;
	public double price;
	public int Qntde;
	
	public double qtdeInStock() {
		return Qntde*price;
	}
	
	public void addProd(int qt) {
		Qntde = Qntde + qt;
	}
	
	public void removeProd(int qt) {
		Qntde = Qntde - qt;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQntde() {
		return Qntde;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQntde(int qntde) {
		Qntde = qntde;
	}
	
	@Override
	public String toString() {
		return "Produto: "+this.name+", Valor: " + String.format("%.2f", this.price)+ ", Quantidade: " + this.Qntde + " e Total: " + String.format("%.2f", qtdeInStock());
	}

}
