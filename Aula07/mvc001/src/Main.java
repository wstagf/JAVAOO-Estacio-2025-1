import controler.SecretariaController;
import model.Aluno;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    static SecretariaController controller = new SecretariaController();

    static void matricular() {
        System.out.println("Nome do aluno:");
        String nomeDoAlunoRecemInserido = scanner.next();
        System.out.println("Matricula do aluno:");
        int matriculaDoAlunoRecemInserido = scanner.nextInt();
        Aluno aluno = new Aluno(nomeDoAlunoRecemInserido, matriculaDoAlunoRecemInserido);
        controller.matricular(aluno);
    }
    public static void main(String[] args) {
        int opcao = -1;

        System.out.println("  - - - -- - - - -- - - -- - - - -");
        System.out.println("  - - - -- - -  inicio do sistema - ");
        System.out.println("  - - - -- - - - -- - - -- - - - -");

        while (opcao != 9) {
            System.out.println("Menu");
            System.out.println("O que voce deseja fazer");
            System.out.println("1 - Matricular");
            System.out.println("2 - Lista Alunos");
            System.out.println("9 - Sair");

            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("" +
                            "Oba, vamos matricular");
                    matricular();
                    break;
                case 2:
                    System.out.println("Oba vamos listar");
                    controller.imprimirListaAlunos();
                    break;
                case 9:
                    System.out.println("vai sair");
                    break;
                default:
                    System.out.println("Menu invalido");
                    break;


            }
        }

        System.out.println("  - - - -- - - - -- - - -- - - - -");

        System.out.println("  - - - -- -  fim do codigo  - - -");
        System.out.println("  - - - -- - - - -- - - -- - - - -");

        System.out.println();
        System.out.println();
        System.out.println();

    }
}