package by.bntu.fitr.povt.javaLabs.lab10.view;

public class Printer {
	public static void print(Object o){
        if (o == null){
            return;
        }

        System.out.println(o);
    }
}