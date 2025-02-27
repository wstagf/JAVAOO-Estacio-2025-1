public class Televisao {
    double poelagadas;
    String resolucao;
    double preco;
    boolean status;
    double canal;

    void ligar(){
        status = true;
    }
    void desligar(){
        status = false;

    }
    void display(){
        if (status) {
            System.out.println("A televisao esta ligada");
            System.out.println("A televisao esta no canal: " + canal );
        }
        else {
            System.out.println("A televisao esta desligada");
        }
    }

}
