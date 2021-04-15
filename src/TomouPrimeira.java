import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TomouPrimeira extends EstadoVacina {

    private LocalDate dataPrimeira = LocalDate.now();

    @Override
    public void verificaVacina(Pessoa pessoa) {
        LocalDate dataAtual = LocalDate.now();
        long diasDaPrimeiraDose = ChronoUnit.DAYS.between(dataPrimeira, dataAtual);
        if (diasDaPrimeiraDose < 20){
            System.out.println("Você tomou a vacina há " + diasDaPrimeiraDose + " Dias, menos de 20 dias. Você ainda não esta habilitado(a) para tomar a segunda dose");
        }
        else{
            System.out.println("Você tomou a vacina há mais de 20 dias, e está habilitado(a) para tomar a segunda dose");
            pessoa.setVacina(new HabilitadaSegunda());
            pessoa.atualizaEstadoVacina(pessoa);
        }
    }

    public LocalDate getData() {
        return dataPrimeira;
    }

    public void setData(LocalDate dataPrimeira) {
        this.dataPrimeira = dataPrimeira;
    }
}
