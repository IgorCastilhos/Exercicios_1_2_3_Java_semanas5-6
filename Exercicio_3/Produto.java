public class Produto {
  private String nome, descricao;
  private double valor;
  private int qtdEmEstoque;

  // Crie o construtor da classe Produto
  public Produto(String nome, String descricao, double valor, int qtdEmEstoque) {
    this.nome = nome;
    this.descricao = descricao;
    this.valor = valor;
    this.qtdEmEstoque = qtdEmEstoque;
  }

  // Crie os métodos de acesso de todos os atributos da classe Produto
  
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQtdEmEstoque() {
		return qtdEmEstoque;
	}
	public void setQuantEstoque(int qtdEmEstoque) {
		this.qtdEmEstoque = qtdEmEstoque;
	}
	
  
}
