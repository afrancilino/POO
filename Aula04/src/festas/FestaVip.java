package festas;
public class FestaVip {

    private int quantidadeCafe = 30;
    private int quantidadeSalgado = 50;

    public void entrar(){
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    private void beberCafe() {
        quantidadeCafe--;
        System.out.println("Bebeu " + quantidadeCafe + " xícara de café");
    }

    private void comerSalgado() {
        quantidadeSalgado--;
        System.out.println("Comeu " + quantidadeSalgado + " salgados");
    }
}
