public class idadePessoa {
    private int idade;
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void verificaIdade() {
        if (idade >= 18) {
            System.out.println(nome + "e maior de idade" );
        } else {
            System.out.println(nome + " nao e maior de idade");
        }
    }
}
