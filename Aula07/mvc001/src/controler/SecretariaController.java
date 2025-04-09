package controler; import model.Aluno; import java.util.ArrayList;

public class SecretariaController {
    private ArrayList<Aluno> listaAlunos = new ArrayList();
    public void matricular(Aluno aluno) {
        listaAlunos.add(aluno);
    }
    public void imprimirListaAlunos() {
        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno a = listaAlunos.get(i);
            String msg =
                        "Matricula: " + a.getMatricula()
                                + ", Aluno:  " + a.getNome();
            System.out.println(msg);
        }
    }
}
