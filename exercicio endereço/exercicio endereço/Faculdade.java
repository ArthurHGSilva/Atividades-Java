public class Faculdade{
	private String nome;
	private Endereco endereco;
	
	public Faculdade(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return this.nome;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void mostrarResultados() {
		System.out.println("Nome: " + this.getNome() );
		endereco.mostrarResultados();
	}
}