import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        String opcao = "";
        Scanner sc = new Scanner(System.in);
        Set<Pessoa> listaPessoas = new HashSet<>();
        menu();
        opcao = sc.nextLine();
        while (!opcao.equals("Sair")) {
            switch (opcao) {
            case "Entrar":
                System.out.println("Digite seu cpf para verificação da situação da vacina");
                String cpf = sc.nextLine();
                boolean encontrado = false;
                for (Pessoa pessoaLista : listaPessoas) {
                    if (!listaPessoas.isEmpty()) {
                        if (pessoaLista.getCpf().equals(cpf)) {
                            pessoaLista.atualizaEstadoVacina(pessoaLista);
                            encontrado = true;
                        }
                    }
                }
                if (!encontrado)
                    System.out.println("Cadastro não encontrado!");
                menu();
                opcao = sc.nextLine();
                break;

            case "Cadastrar":
                System.out.println("Digite seu nome");
                String nome = sc.nextLine();
                System.out.println("Digite seu cpf");
                String cpfC = sc.nextLine();
                System.out.println("Digite seu endereço");
                String endereco = sc.nextLine();
                System.out.println("Digite o numero do seu cartão do SUS");
                String cartaoSUS = sc.nextLine();
                System.out.println("Digite seu e-mail");
                String email = sc.nextLine();
                System.out.println("Digite seu telefone");
                String telefone = sc.nextLine();
                System.out.println("Digite sua profissão");
                String profissao = sc.nextLine();
                System.out.println("Digite sua comorbidade");
                String comorbidades = sc.nextLine();
                System.out.println("Digite seu ano de Nascimento");
                int ano = Integer.parseInt(sc.nextLine());
                System.out.println("Digite seu mês de Nascimento");
                int mes = Integer.parseInt(sc.nextLine());
                System.out.println("Digite seu dia de Nascimento");
                int dia = Integer.parseInt(sc.nextLine());

                Pessoa pessoa = new Pessoa(nome, cpfC, endereco, cartaoSUS, email, telefone, profissao, comorbidades,
                        ano, mes, dia);
                System.out.println("Cadastro concluido, verificando situação da vacinação...");
                pessoa.atualizaEstadoVacina(pessoa);
                listaPessoas.add(pessoa);
                menu();
                opcao = sc.nextLine();
                break;

            case "Atualizar":
                System.out.println("Digite seu cpf");
                String cpfA = sc.nextLine();
                boolean encontradoA = false;
                for (Pessoa pessoaLista : listaPessoas) {
                    if (!listaPessoas.isEmpty()) {
                        if (pessoaLista.getCpf().equals(cpfA)) {
                            encontradoA = true;
                            System.out.println("Digite seu nome");
                            String nomeA = sc.nextLine();
                            System.out.println("Digite seu endereço");
                            String enderecoA = sc.nextLine();
                            System.out.println("Digite o numero do seu cartão do SUS");
                            String cartaoSUSA = sc.nextLine();
                            System.out.println("Digite seu e-mail");
                            String emailA = sc.nextLine();
                            System.out.println("Digite seu telefone");
                            String telefoneA = sc.nextLine();
                            System.out.println("Digite sua profissão");
                            String profissaoA = sc.nextLine();
                            System.out.println("Digite sua comorbidade");
                            String comorbidadesA = sc.nextLine();
                            System.out.println("Digite seu ano de Nascimento");
                            int anoA = Integer.parseInt(sc.nextLine());
                            System.out.println("Digite seu mês de Nascimento");
                            int mesA = Integer.parseInt(sc.nextLine());
                            System.out.println("Digite seu dia de Nascimento");
                            int diaA = Integer.parseInt(sc.nextLine());
                            pessoaLista.atualizaCadastro(nomeA, cpfA, enderecoA, cartaoSUSA, emailA, telefoneA,
                                    profissaoA, comorbidadesA, anoA, mesA, diaA);
                            System.out.println("Atualização concluida, verificando situação da vacinação\n");
                            pessoaLista.atualizaEstadoVacina(pessoaLista);
                            menu();
                        }
                    }
                }
                if (!encontradoA)
                    System.out.println("Cadastro não encontrado!");
                    menu();
                opcao = sc.nextLine();
                break;

            case "Sair":
                System.out.println("Encerrando aplicativo.");
                break;
            default:
            System.out.println("Opção indisponível.");
            menu();
            opcao = sc.nextLine();
            }
        }
    }

    private static void menu() {
        System.out.println("\nVoltando para o Menu...\n\n----------------Sistema de vacinação para a COVID-19--------------\n"
                + "Caso já tenha cadastro, Digite 'Entrar' \n" + "Para se cadastrar, digite 'Cadastrar'.\n"
                + "Para Atualizar um cadastro Digite 'Atualizar'\n" + "Para sair digite 'Sair'");
    }
}
