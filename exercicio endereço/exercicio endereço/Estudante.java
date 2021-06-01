public class Estudante {
	private int matricula;
	private String nome;
	private Endereco endereco;
	
	public Estudante(int matricula, String nome, Endereco endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getMatricula() {
		return this.matricula;
	}
	public String getNome() {
		return this.nome;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void mostrarResultados() {
		System.out.println("Nome: " + this.getNome() );
		System.out.println("Matricula: " + this.getMatricula());
		endereco.mostrarResultados();
	}
}