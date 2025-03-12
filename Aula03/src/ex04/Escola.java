package ex04;

import java.util.Arrays;

public class Escola {

    public static void main(String[] args) {
        double[] notasAluno1 = {8.5, 9.0, 7.5, 10.0};
        Aluno aluno1 = new Aluno("João", notasAluno1);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Notas: " + Arrays.toString(aluno1.getNotas()));
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Maior nota: " + aluno1.getMaiorNota());
        System.out.println("Menor nota: " + aluno1.getMenorNota());
    }

}
