public class Profissional extends Pessoa {
    private String nome;
    private Instituicao instituicao;

    //construtor
    public Profissional(String nome, Instituicao instituicao){
        this.nome = nome;
        this.instituicao = instituicao;
    }
}
