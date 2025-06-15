public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private int notaFinal;

    //construtor
    public Projeto(Equipe equipe, Profissional orientador){
        this.equipe = equipe;
        this.orientador = orientador;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Equipe getEquipe(){
        return equipe;
    }
}
