public class DVD extends Biblioteca{
	public String diretor;
	
	public DVD(String data, String titulo, float preco, String diretor){
		super(data, titulo, preco);
		this.diretor = diretor;
	}
	
	public double Multa(){
		multa = (preco * 0.06) + 5;
		return multa; 
	}
	
	public void mostraResultados(){
		System.out.println("-----DVD-----");
		System.out.println("Diretor: " + diretor);
		super.mostraResultados();
	}
}
