package by.bntu.fitr.povt.javaLabs.lab10.controller;
import by.bntu.fitr.povt.javaLabs.lab10.model.entity.Sweetness;
import by.bntu.fitr.povt.javaLabs.lab10.view.Printer;
import by.bntu.fitr.povt.javaLabs.lab10.model.entity.Magaz;
import by.bntu.fitr.povt.javaLabs.lab10.model.entity.PriceManager;

public class Main {
	public static void main(String[] args) {
		Sweetness sweetness1=new Sweetness(2,"Alenka","chokolate");
		Sweetness sweetness2=new Sweetness(1,"Tvix","batonchik");
		Sweetness sweetness3=new Sweetness(5,"Milka(Caramel)","chokolate");
		Sweetness sweetness4=new Sweetness(4.4,"Milka(Nuts)","chokolate");
		Sweetness sweetness5=new Sweetness(2.9,"Dove","chokolate");
		Sweetness sweetness6=new Sweetness(3,"Rafoallo","sweets");
		
		Magaz magaz=new Magaz("Riga_Sweet",sweetness1,sweetness2,sweetness3,sweetness4,sweetness5);
		
		Printer.print(magaz.getName());
		
		Printer.print(magaz);
		
		  magaz.add(sweetness6);
		  Printer.print(magaz);

	      magaz.remove(sweetness3);
	      Printer.print(magaz);
	      Printer.print("Общая сумма:\n"+PriceManager.price(magaz));
	      
	}

}
