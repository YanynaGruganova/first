package by.bntu.fitr.povt.javaLabs.lab10.util;

import java.util.Scanner;

public class UserInput  {
	public static double input(Object a) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(a);
		double value = scanner.nextDouble();
		return value;
		}
		}
