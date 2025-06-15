import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        //Equipes, estudantes e Universidades
        Universidade universidade1 = new Universidade("Kanto");
        Universidade universidade2 = new Universidade("Kalos");

        List<Estudante> estudantes1 = new ArrayList<>();
        estudantes1.add(new Estudante("Misty", universidade1));
        estudantes1.add(new Estudante("Brock", universidade1));
        estudantes1.add(new Estudante("Erika", universidade1));
        estudantes1.add(new Estudante("Koga", universidade1));
        estudantes1.add(new Estudante("Giovanni", universidade1));
        List<Estudante> estudantes2 = new ArrayList<>();
        estudantes2.add(new Estudante("Ramos", universidade2));
        estudantes2.add(new Estudante("Viola", universidade2));
        estudantes2.add(new Estudante("Valerie", universidade2));
        estudantes2.add(new Estudante("Clemont", universidade2));
        estudantes2.add(new Estudante("Grant", universidade2));

        Equipe equipe1 = new Equipe(estudantes1, "Rocket");
        Equipe equipe2 = new Equipe(estudantes2, "Flare");
        


        //Projetos e orientadores
        Profissional orientador1 = new Profissional("Professor Carvalho", universidade1);
        Profissional orientador2 = new Profissional("Professor Sycamore", universidade2);

        Projeto projeto1 = new Projeto(equipe1, orientador1);
        Projeto projeto2 = new Projeto(equipe2, orientador2);

        Projetos.getInstance().adicionar(projeto1);
        Projetos.getInstance().adicionar(projeto2);



        //Bancas avaliadoras e jurados
        Empresa empresa1 = new Empresa("Lavander");
        Empresa empresa2 = new Empresa("Santalune");

        List<Jurado> jurados1 = new ArrayList<>();
        jurados1.add(new Jurado("Lorelei", empresa1));
        jurados1.add(new Jurado("Bruno", empresa1));
        jurados1.add(new Jurado("Agatha", empresa1));
        jurados1.add(new Jurado("Lance", empresa1));
        List<Jurado> jurados2 = new ArrayList<>();
        jurados2.add(new Jurado("Malva", empresa2));
        jurados2.add(new Jurado("Wikstrom", empresa2));
        jurados2.add(new Jurado("Drasna", empresa2));
        jurados2.add(new Jurado("Siebold", empresa2));

        Map<Jurado, Integer> juradosMap1 = new HashMap();
        for(Jurado jurado : jurados1){
            juradosMap1.put(jurado, 0);
        }
        Map<Jurado, Integer> juradosMap2 = new HashMap();
        for(Jurado jurado : jurados2){
            juradosMap2.put(jurado, 0);
        }

        Banca banca1 = new Banca(projeto1, juradosMap1);
        Banca banca2 = new Banca(projeto2, juradosMap2);  
        
        //Randomizar notas entre 6 e 10
        Random random = new Random();
        for(Jurado jurado : jurados1){
            int nota = 6 + random.nextInt(5);
            banca1.adicionarNota(jurado, nota);
        }
        for(Jurado jurado : jurados2){
            int nota = 6 + random.nextInt(5);
            banca2.adicionarNota(jurado, nota);
        }


        //Apresentações e salas
        Sala sala1 = new Sala("Pokemon Tower");
        Sala sala2 = new Sala("PR Video Studio");

        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, sala1, LocalDateTime.of(2025, 6, 14, 15, 0, 0));
        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, sala2, LocalDateTime.of(2025, 6, 14, 15, 30, 0));

        Apresentacoes.getInstance().adicionar(apresentacao1);
        Apresentacoes.getInstance().adicionar(apresentacao2);

        //Jurados avaliam
        apresentacao1.avaliar();
        apresentacao2.avaliar();

        //Exibir projetos com nota >=7
        System.out.println("Projetos com nota >= 7");
        Projetos.getInstance().getProjetos().stream()
            .filter(p -> p.getNotaFinal() >= 7)
            .forEach(p -> System.out.println("Projeto da equipe " + p.getEquipe().getNomeEquipe() + "    - nota: " + p.getNotaFinal()));

    }
}
