import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class NaoHabilitada extends EstadoVacina {

    private List<String> comorbidadesPrioritarias = Arrays.asList("Diabetes mellitus", "Pneumopatias crônicas graves", "Hipertensão", "Problemas de coração", "Doença cerebrovascular", "Doença renal crônica", "Anemia falciforme", "Obesidade mórbida", "Síndrome de down", "HIV", "Cirrose hepática");
    private List<String> profissoesPrioritarias = Arrays.asList("Médico", "Serviços Gerais: Hospital", "Professor", "Dentista", "Enfermeiro", "Militar", "Policial");
    
    @Override
    public void verificaVacina(Pessoa pessoa) {
        LocalDate dataAtual = LocalDate.now();
        long idade = ChronoUnit.YEARS.between(pessoa.getIdade(), dataAtual);
        if (idade >= 65 | comorbidadesPrioritarias.contains(pessoa.getComorbidades()) | profissoesPrioritarias.contains(pessoa.getProfissao())){
            System.out.println("Você está habilitado(a) para tomar a primeira dose!");
            pessoa.setVacina(new HabilitadaPrimeira());
            pessoa.atualizaEstadoVacina(pessoa);
        }
        else 
            System.out.println("Você não está habilitado(a) para tomar a primeira dose!");
        
    }
    
}
