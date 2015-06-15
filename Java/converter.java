import java.util.Scanner;

public class converter{
	public static void main(String args[]){
		Scanner value = new Scanner(System.in);
			Double far, cel;
		System.out.println(" ");
		System.out.println("Enter a Fahrenheit Temperature :");
			far = value.nextDouble();
			cel = ((far-32) * 5.0)/9;
	    System.out.println(" ");
		System.out.println("Temperature in Celsius is "+(cel));
	}
}