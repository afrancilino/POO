public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        pessoa.setAltura(1.82);
        pessoa.setIdade(39);
        pessoa.setNome("Alexandre Francilino");

        System.out.format("\n\n\t Olá, o meu nome é %s. \n\t Eu tenho %d anos de idade e %.2f de altura.\n\n",
        pessoa.getNome(),pessoa.getIdade(),pessoa.getAltura());
    }
}
