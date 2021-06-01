import java.util.Scanner;
public class TesteEndereco {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String operador;
		for(int i=0; i<3;i++) {
			System.out.println("Qual opção você quer preencher o endereço: estudante, professor ou faculdade?");
			operador = entrada.next();
			switch(operador){
			case "estudante":
				Endereco endereco1 = new Endereco(15, "Ararangua", "SC", "Brasil");
				Estudante estudante = new Estudante(182, "Carlos", endereco1);
				estudante.displayEstudante();
				System.out.println(" ");
				break;
			case "professor":
				Endereco endereco2 = new Endereco(17, "Sombrio", "SC", "Brasil");
				Professor professor = new Professor(9090, "Vagner", endereco2);
				professor.mostrarResultados();
				System.out.println(" ");
				break;
			case "faculdade":
				Endereco endereco3 = new Endereco(1, "São Paulo", "São Paulo", "Brasil");
				Faculdade faculdade = new Faculdade("UFSC", endereco3);
				faculdade.mostrarResultados();
				System.out.println(" ");
				break;
			default:
				break;
			}
		}
	}
}