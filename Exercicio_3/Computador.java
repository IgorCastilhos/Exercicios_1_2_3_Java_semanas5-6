public class Computador {
  private String marca;
  private double velocidade;
  private int anoDeFabricacao;
  private boolean computadorNovo;

  // Crie o construtor da classe
  public Computador(String marca, double velocidade, int anoDeFabricacao, boolean computadorNovo) {
    this.marca = marca;
    this.velocidade = velocidade;
    this.anoDeFabricacao = anoDeFabricacao;
    this.computadorNovo = computadorNovo;
  }

  // Crie os métodos de acesso de todos os atributos
  public String getMarca() {
    return marca;
  }
  public double getVelocidade() {
    return velocidade;
  }
  public int getAnoDeFabricacao() {
    return anoDeFabricacao;
  }
  public boolean isComputadorNovo() {
    return computadorNovo;
  }
  
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public void setVelocidade(double velocidade) {
    this.velocidade = velocidade;
  }
  public void setAnoDeFabricacao(int anoDeFabricacao) {
    this.anoDeFabricacao = anoDeFabricacao;
  }
  public void setComputadorNovo(boolean computadorNovo) {
    this.computadorNovo = computadorNovo;
  }

}
