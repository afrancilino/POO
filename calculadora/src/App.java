import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int sair=0,selecao=0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\t Seja bem vindo às nossas calculadoras!");
            System.out.println("\n\t Selecione a calculadora desejada");
            System.out.println("\n\t\t 1. Padrão"+
                               "\n\t\t 2. Trigonométrica" +
                               "\n\t\t 3. Bháskara" +
                               "\n\t\t 4. Sair");
            
            selecao=scan.nextInt();
            scan.close();
            
            switch (selecao) {
                case 1:
                    System.out.println("Padrão");
                    break;

                case 2:
                    System.out.println("Trigonométrica");
                    break;

                case 3:
                    System.out.println("Bháskara");
                    break;

                case 4:
                    sair = 1;
                    break;
            
                default:
                    System.out.println("Escolha uma das opções apresentadas");
                    break;
            }

        } while (sair == 1);

        System.out.println("Muito obrigado por ter usado nossa Calculadora");
        System.out.println("Até +!!!!");
    }
}
