package model;

public class Aluno {
    private String nome;

    private int matricula;

    public Aluno(String nomeAluno, int matriculaAluno) {
        this.nome = nomeAluno;
        this.matricula = matriculaAluno;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return  this.matricula;
    }
}
