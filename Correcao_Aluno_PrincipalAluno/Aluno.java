public class Aluno{
    private String nome, matricula;
    private double notaGA, notaGB;
    
    public Aluno(String nome, String matricula, double notaGA, double notaGB){
        this.nome = nome;
        this.matricula = matricula;
        this.notaGA = notaGA;
        this.notaGB = notaGB;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setNotaGA(double notaGA){
        this.notaGA = notaGA;
    }
    
    public void setNotaGB(double notaGB){
        this.notaGB = notaGB;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public double getNotaGA(){
        return notaGA;
    }
    
    public double getNotaGB(){
        return notaGB;
    }
    
    public double calculaMediaFinal(){
        return (notaGA * 0.33) + (notaGB * 0.67);
    }
    
    public void imprimeInfo(){
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Matrícula do aluno: "+matricula);
        System.out.println("Nota do GA: "+notaGA);
        System.out.println("Nota do GB: "+notaGB);
        /*double mediaFinal = calculaMediaFinal();
        System.out.println("Média final: "+mediaFinal);*/
        System.out.println("Média final: "+calculaMediaFinal());
    }
}



