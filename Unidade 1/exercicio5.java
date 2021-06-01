import java.util.Scanner;
public class exercicio5{
	public static void main(String[] args){ 
		Scanner entrada = new Scanner(System.in);
		
		double c;	
		double f;
		
		System.out.println("Coloque uma temperatura: ");
		double temp = entrada.nextDouble();
		System.out.println("Essa temperatura é em Celsius ou Fahrenheit? c para Celsius e f para Fahrenheit ");
		String rtemp = entrada.next();		
		
		switch(rtemp){
			case "c":tempc(temp);
			break;
			case "f":tempf(temp);
			break;
			default:System.out.println("Comando inválido");
		}
	}
	public static double tempc(double temp){
	double celsius;
	Scanner entrada = new Scanner(System.in);
	celsius = temp*1.8 + 32;
	System.out.println("A temperatura de celsius para fahrenheit é: " + celsius);
	return celsius;
	}
	public static double tempf(double temp){
	double fahrenheit;
	Scanner entrada = new Scanner(System.in);
	fahrenheit = (temp - 32) / 1.8;
	System.out.println("A temperatura de fahrenheit para celsius é: " + fahrenheit);
	return fahrenheit;
	}

}