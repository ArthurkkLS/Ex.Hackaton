import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private IAvaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, IAvaliavel banca, Sala local, LocalDateTime dataHora){
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    public void avaliar(){
        banca.calcularNotaFinal();
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
