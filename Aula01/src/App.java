public class App {
    public static void main(String[] args) throws Exception {
        
        Celular celularA = new Celular();
        Celular celularB = new Celular();
        Celular celularC = new Celular();

        //IPHONE 12, 6.1", 256gb
        celularA.nome = "IPhone 12"; 
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        //GALAXY NOTE 20 ULTRA, 6.9", 256gb
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.espacoArmazenamento = 256;
        celularB.tamanhoTela = 6.9f;
        celularB.sistemaOperacional = "Android";
        
        //XIAOMI MI 11 PRO, 6.81", 128gb
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.espacoArmazenamento = 128;
        celularC.tamanhoTela = 6.81f;
        celularC.sistemaOperacional = "MIUI";

        System.out.format("\n\n\t Celular %s com tela de %.2f, com  %dGB e SO %s",celularA.nome,celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("\n\n\t Celular %s com tela de %.2f, com  %dGB e SO %s",celularB.nome,celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("\n\n\t Celular %s com tela de %.2f, com  %dGB e SO %s\n\n\n",celularC.nome,celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);
    }
}
