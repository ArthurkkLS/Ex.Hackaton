public class Estudante extends Pessoa {
    private String nome;
    private Universidade universidade;

    public Estudante(String nome, Universidade universidade){
        this.nome = nome;
        this.universidade = universidade;
    }
}
