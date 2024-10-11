public class Principal {
    public static void main(String[] args) {
        idadePessoa pessoa1 = new idadePessoa();
        pessoa1.setNome("John");
        pessoa1.setIdade(19);

        idadePessoa pessoa2 = new idadePessoa();
        pessoa2.setNome("isabelle");
        pessoa2.setIdade(16);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificaIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificaIdade();
    }
}
