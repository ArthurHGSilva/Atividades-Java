public class TesteConta{
	public static void main (String[] args){
		
	
			////////////////////////////////// Poupan�a
			ContaPoupanca testePoupan = new ContaPoupanca("Jos�", "001", "50", 100, "positivo");
			testePoupan.AtualizarConta((float)1.005);
			testePoupan.MostrarResultado();
			System.out.println();
			
			System.out.println("Dep�sito - Conta poupan�a");
			testePoupan.Deposito(50);
			testePoupan.AtualizarConta((float)1.005);
			testePoupan.MostrarResultado();
			  
			System.out.print("-------------");
			
			System.out.println();
			////////////////////////////////// Poupan�a
			
			
			////////////////////////////////// Transfer�ncia 
			ContaInvestimento testeInves= new ContaInvestimento("Alexandre", "002", "1", 250, "positivo");
			testeInves.MostrarResultado();
			System.out.println();
			
			System.out.println("Transfer�ncia poupan�a - investimento");
			testePoupan.TransferePara(testeInves, 150);
			testePoupan.AtualizarConta((float)1.005);
			testePoupan.MostrarResultado();
			
			System.out.println("/////");
			testeInves.AtualizarConta((float)1.01);
			testeInves.MostrarResultado();
			
			System.out.print("-------------");
			System.out.println();
			//////////////////////////////////Transfer�ncia 
			
			
			////////////////////////////////// Saque
			ContaCorrente testeCorren = new ContaCorrente("Vict�ria", "005", "2", 500, "positivo");
			testeCorren.MostrarResultado();
			System.out.println();
			
			System.out.println("Saque - conta corrente");
			testeCorren.Saque(400);
			testeCorren.MostrarResultado();
			
			
			////////////////////////////////// Saque
			
			
		}
}
