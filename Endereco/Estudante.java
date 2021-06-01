public class Estudante {
	private int matricula;
	private String nome;
	private Endereco endereco;
	
	public Estudante(String nome, int matricula, Endereco endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;			
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	public int getMatricula() {
		return matricula;
	}
	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	
	
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;

	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void displayEstudante(){
		System.out.print("Nome: " + this.getNome());
		System.out.print("Matricula: " + this.getMatricula());
		System.out.print("Endereco: " + this.getEndereco());
		
	}
	
}
