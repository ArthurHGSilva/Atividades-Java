public class Conta {
	protected String nomeTitular;
	protected String numeroConta;
	protected String numeroAgencia;
	protected float saldo;
	protected String estadoConta;
	
	
	public Conta(String nomeTitular, String numeroConta, String numeroAgencia, float saldo, String estadoConta){
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
		this.estadoConta = estadoConta;
		
	}
	
	public void Saque(float saque){
		this.saldo = saldo - saque;
		alteraEstadoConta();
	}
	public void alteraEstadoConta(){
		if(this.saldo>0){
			this.estadoConta = "positivo";
		}else {
			this.estadoConta = "negativo";
		}
		
	}
	public void Deposito(float deposito){
		this.saldo = saldo + deposito; 
	}
	
	public void AtualizarConta(float percen){
		this.saldo = saldo * percen;
	}
	public void TransferePara(Conta destino, float valor){
		Saque(valor);
		destino.Deposito(valor);
		
	}
	public void MostrarResultado(){
		System.out.println("Nome do titular: " + nomeTitular);
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("Número da Agência: " + numeroAgencia);
		System.out.println("Estado da conta: " + estadoConta);
		System.out.println("Saldo da conta: " + saldo);
	}
	
	
	
}
