public class Stailen {
    String cor;
    boolean estaAberto;
    String conteudo;


    void recarregarComAgua(String trem) {
        conteudo = trem;
    }


    void mostrar() {
        System.out.println("Existe " +conteudo+  " na garrafa");
    };
}
