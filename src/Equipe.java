import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Estudante> membros = new ArrayList<>();
    private String nome;

    public Equipe(List<Estudante> estudantes, String nome){
        this.membros = estudantes;
        this.nome = nome;
    }

    public String getNomeEquipe(){
        return nome;
    }
}
