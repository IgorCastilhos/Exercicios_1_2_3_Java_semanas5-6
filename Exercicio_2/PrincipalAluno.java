public class PrincipalAluno {
  public static void main(String[] args) {
    // Crie 3 alunos com base na classe Aluno
    Aluno aluno1 = new Aluno("Brandamente Brasil", "1585258", 5, 9);
    Aluno aluno2 = new Aluno("Radigunda Cercená", "2254879", 8, 2);
    Aluno aluno3 = new Aluno("Vitimado José Araújo", "0085994", 7, 1);


  // Imprime os dados de cada um dos 3 alunos criados

    System.out.println("Informações do aluno 1: ");
    aluno1.imprimeInfo();
    System.out.println("\nInformações do aluno 2: ");
    aluno2.imprimeInfo();
    System.out.println("\nInformações do aluno 3: ");
    aluno3.imprimeInfo();

    aluno2.setNotaDoGrauA(9);

    System.out.println("\nMédia final após alteração da nota do GA: "+aluno2.calculaMediaFinal());

    System.out.println("Matrícula de Vitimado: "+aluno3.getMatricula());

    aluno1.setMatricula("1585228");
    
    aluno2.setNotaDoGrauB(Teclado.leDouble("Insira a nova nota do grau B:"));
}
}