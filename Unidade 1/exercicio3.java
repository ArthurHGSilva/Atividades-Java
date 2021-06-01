import java.util.Scanner;
public class exercicio3{
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);
		int d, w;
		
		System.out.println("Dê um valor para N: ");
		int n = entrada.nextInt();
		
		for(d = 2; d < n; d++){
			int x = 0;
	        	for(w=2;w < n; w++){
				if ((d % w) == 0) {
					x++;
				}
			}
			if (x == 1) {
				System.out.printf("%d ", d);
			}
		}
	}
}
