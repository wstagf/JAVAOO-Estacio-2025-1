import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salario: ");
        double salarioAutal = leitor.nextDouble();

        System.out.println("Digite o valor do sado percentual: EX. 25% digiete 0.25: ");
        double fator = leitor.nextDouble() / 100;
        double aumento = salarioAutal * fator;
        double novoSalario =salarioAutal + aumento;

        System.out.println("O novo salario sera: " + novoSalario);
    }
}