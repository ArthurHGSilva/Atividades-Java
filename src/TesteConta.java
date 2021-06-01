public class TesteConta{
	public static void main (String[] args){
		
	
			////////////////////////////////// Poupança
			ContaPoupanca testePoupan = new ContaPoupanca("José", "001", "50", 100, "positivo");
			testePoupan.AtualizarConta((float)1.005);
			testePoupan.MostrarResultado();
			System.out.println();
			
			System.out.println("Depósito - Conta poupança");
			testePoupan.Deposito(50);
			testePoupan.AtualizarConta((float)1.005);
			testePoupan.MostrarResultado();
			  
			System.out.print("-------------");
			
			System.out.println();
			////////////////////////////////// Poupança
			
			
			////////////////////////////////// Transferência 
			ContaInvestimento testeInves= new ContaInvestimento("Alexandre", "002", "1", 250, "positivo");
			testeInves.MostrarResultado();
			System.out.println();
			
			System.out.println("Transferência poupança - investimento");
			testePoupan.TransferePara(testeInves, 150);
			testePoupan.AtualizarConta((float)1.005);
			testePoupan.MostrarResultado();
			
			System.out.println("/////");
			testeInves.AtualizarConta((float)1.01);
			testeInves.MostrarResultado();
			
			System.out.print("-------------");
			System.out.println();
			//////////////////////////////////Transferência 
			
			
			////////////////////////////////// Saque
			ContaCorrente testeCorren = new ContaCorrente("Victória", "005", "2", 500, "positivo");
			testeCorren.MostrarResultado();
			System.out.println();
			
			System.out.println("Saque - conta corrente");
			testeCorren.Saque(400);
			testeCorren.MostrarResultado();
			
			
			////////////////////////////////// Saque
			
			
		}
}
