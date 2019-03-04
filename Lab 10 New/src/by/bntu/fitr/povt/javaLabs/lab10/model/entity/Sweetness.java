package by.bntu.fitr.povt.javaLabs.lab10.model.entity;

import java.util.Objects;

import by.bntu.fitr.povt.javaLabs.lab10.view.Printer;

public class Sweetness {
			
	private double price=0;
	private String name="no name";
	private String type="no type";
		
	public Sweetness() {
		
	}

	public Sweetness(double price, String name, String type) {
		this.price = price;
		this.name = name;
		this.type = type;
	}
	
	public Sweetness(Sweetness sweetness) {
		price = sweetness.price;
		name = sweetness.name;
		type = sweetness.type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if(price>0) {
		this.price = price;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		 return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweetness sweetness = (Sweetness) o;
        return Double.compare(sweetness.price, price) == 0 &&
                Objects.equals(name, sweetness.name);
    }

	@Override
	public String toString() {
		return "Sweetness [price=" + price + ", name=" + name + ", type=" + type + "]";
	}
	
	
	
}

