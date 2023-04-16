/**
 * Aluno
 */
public class Aluno {
  private String nome, matricula;
  private double notaDoGrauA, notaDoGrauB;

  public Aluno(String nome, String matricula, double notaDoGrauA, double notaDoGrauB) {
    this.nome = nome;
    this.matricula = matricula;
    this.notaDoGrauA = notaDoGrauA;
    this.notaDoGrauB = notaDoGrauB;
  }
  // Getters
  public String getNome() {
    return nome;
  }
  public String getMatricula() {
    return matricula;
  }
  public double getNotaDoGrauA() {
    return notaDoGrauA;
  }
  public double getNotaDoGrauB() {
    return notaDoGrauB;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
  public void setNotaDoGrauA(double notaDoGrauA) {
    this.notaDoGrauA = notaDoGrauA;
  }
  public void setNotaDoGrauB(double notaDoGrauB) {
    this.notaDoGrauB = notaDoGrauB;
  }

  // Métodos
  public double calculaMediaFinal(){
    return (notaDoGrauA * 0.33) + (notaDoGrauB * 0.67);
  }

  public void imprimeInfo(){
    System.out.println("Nome: " + nome);
    System.out.println("Matrícula: " +matricula);
    System.out.println("Nota do Grau A: " +notaDoGrauA);
    System.out.println("Nota do Grau B: " +notaDoGrauB);
    System.out.println("Média Final: " + calculaMediaFinal());
  }
}