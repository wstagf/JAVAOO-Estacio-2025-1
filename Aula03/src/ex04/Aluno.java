package ex04;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0.0; // Retorna 0 se não houver notas
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public double getMaiorNota() {
        if (notas == null || notas.length == 0) {
            return 0.0; // Retorna 0 se não houver notas
        }
        double maior = notas[0];
        for (double nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        return maior;
    }

    public double getMenorNota() {
        if (notas == null || notas.length == 0) {
            return 0.0; // Retorna 0 se não houver notas
        }
        double menor = notas[0];
        for (double nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }
}