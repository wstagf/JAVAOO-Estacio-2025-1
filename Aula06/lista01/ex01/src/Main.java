import model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.nome = "Thiago";
        p.idade = 39;

        p.apresentar();
    }
}