public class PrincipalAluno{
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Brandamente Brasil", "1585248", 5, 9);
        Aluno aluno2 = new Aluno("Radigunda Cercená", "2254879", 8, 2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo", "0085994", 7, 1);
        
        //b) Imprima as informações de cada um dos 3 alunos
        System.out.println("Informações do aluno 1:");
        aluno1.imprimeInfo();
        System.out.println("\nInformações do aluno 2:");
        aluno2.imprimeInfo();
        System.out.println("\nInformações do aluno 3:");
        aluno3.imprimeInfo();
        
        //c) Altere a nota do Grau A de Radigunda para 9
        aluno2.setNotaGA(9);
        
        //d) Imprima apenas a média final de Radigunda
        System.out.println("\nMédia final após alteração da nota do GA: "+aluno2.calculaMediaFinal());
        
        //e) Imprima somente a matrícula de Vitimado
        System.out.println("Matrícula de Vitimado: "+aluno3.getMatricula());
        
        //f) Altere a matrícula de Brandamente para 1585228
        aluno1.setMatricula("1585228");
        
        //g) Altere a nota do GB do aluno2 por um valor lido pelo Teclado
        aluno2.setNotaGB(Teclado.leDouble("Informe a nova nota do GB: "));
    }
}