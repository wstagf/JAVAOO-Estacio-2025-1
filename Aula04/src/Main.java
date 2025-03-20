import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main2(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int anoAtual = 2025;
        System.out.println("Digite o ano do seu nacimento");
        int anoDoNascimento = leitor.nextInt();
        int idadeEmAnos = anoAtual - anoDoNascimento;
        System.out.println("Voce tem " + idadeEmAnos + " anos de idade");
    }

    public static void main(String[] args) {





            Scanner leitor = new Scanner(System.in);
            LocalDate dataAtual = LocalDate.of(2025, 3, 19);

            System.out.println("Digite o seu ano de nascimento");
            int anoNascimento = leitor.nextInt();


            System.out.println("Digite o seu mes de nascimento");
            int mesNascimento = leitor.nextInt();


            System.out.println("Digite o seu dia de nascimento");
            int diaNascimento = leitor.nextInt();

            LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);

            Period calcular = Period.between(dataAtual, dataNascimento);

            System.out.println(calcular.getYears() + " anos");

            System.out.println(calcular.getMonths() + " meses");


            System.out.println(calcular.getDays() + " dias");






    }
}