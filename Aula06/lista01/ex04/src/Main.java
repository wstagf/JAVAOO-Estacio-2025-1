import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Funcionario f = new Funcionario();
        f.nome = "Antonio";
        f.salario = 500.00;

        f.seAmostrar();

        f.aumentarSalario(0.50);
        f.seAmostrar();




        Funcionario f2 = new Funcionario();
        f2.nome = "Thiago";
        f2.salario = 200.00;

        f2.seAmostrar();

        f2.aumentarSalario(0.1);
        f2.seAmostrar();


    }
}