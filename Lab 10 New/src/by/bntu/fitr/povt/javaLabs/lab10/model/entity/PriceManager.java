package by.bntu.fitr.povt.javaLabs.lab10.model.entity;
import by.bntu.fitr.povt.javaLabs.lab10.model.entity.Magaz;
import by.bntu.fitr.povt.javaLabs.lab10.model.entity.Sweetness;

public class PriceManager {
	public static double price(Magaz magaz) {
		
		double sum=0;
	
		Sweetness[] newArray = magaz.getmagaz();

        for (int i=0; i < newArray.length; i++) {
                sum+=newArray[i].getPrice();       
    }
        return sum;    
	}
}
