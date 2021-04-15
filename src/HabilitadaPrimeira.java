import java.util.Scanner;

public class HabilitadaPrimeira extends EstadoVacina {

    @Override
    public void verificaVacina(Pessoa pessoa) {
        String opcao = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja tomar a primeira dose? Digite 'Sim' ou 'Não'");
        opcao = sc.nextLine();
        if (opcao.equals("Sim")){
            System.out.println("Dirija-se para o posto de saúde para aplicar a Primeira dose!");
            pessoa.setVacina(new TomouPrimeira());
            pessoa.atualizaEstadoVacina(pessoa);
        }
        else{
            System.out.println("Estaremos aguardando para aplicar a primeira dose quando desejar!");
        }
    }
    
    
}
