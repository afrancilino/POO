import java.util.Random;

public class Personagem {
    String nome, habilidade;
    Integer nivel, forca;

    void mostrarStatus() {
        System.out.format("\n\nPersonagem %s (lvl %d) com %d de força\n\n", nome, nivel, forca);
    }

    int calcularDano() {
        Random gerador = new Random();
        int dado20faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20faces;
        return dano;
    }

    void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano();
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano.\n\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s atacou %s usando %s causando %d de dano.\n\n", nome, alvo, habilidade, danoCausado);
        }
    }

}
