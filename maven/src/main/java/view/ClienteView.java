package view;

import java.util.List;
import java.util.Scanner;
import model.Cliente;

/**
 *
 * @author Sâmeck
 */
public class ClienteView {

    private Scanner scan;
    private List<Cliente> clientes;

    /**
     * Costrutor da Classe Cliente
     *
     * @param clientes
     */
    public ClienteView(List<Cliente> clientes) {
        this.clientes = clientes;
        this.scan = new Scanner(System.in);
    }

    /**
     * Listar os vendedores cadastrados
     */
    public void listarClientes() {
        System.out.println("---------------------------");
        System.out.println("Clientes:");
        System.out.println("---------------------------");

        clientes.forEach((v) -> System.out.println(v.toString() + "\n---------------------------"));
    }

    /**
     * Entrar com os dados do Cliente
     *
     * @param i - representa o id
     * @return Cliente
     */
    public Cliente inputData(int i) {

        this.scan = new Scanner(System.in);
        System.out.println("Informe o nome do Cliente " + i + ": ");
        String nome = scan.nextLine();

        System.out.println("Informe o cpf do Cliente " + i + ": ");
        String cpf = scan.nextLine();

        System.out.println("Informe o endereco do Cliente " + i + ": ");
        String endereco = scan.nextLine();

        System.out.println("Informe o email do Cliente " + i + ": ");
        String email = scan.nextLine();

        System.out.println("Informe a senha do Cliente " + i + ": ");
        String senha = scan.nextLine();

        return new Cliente(i, nome, cpf, endereco, email, senha);
    }

    /**
     * Exibir msg de confirmação de criação do Cliente
     */
    public void mostraMsgCriacao() {
        System.out.println("-------------------------------");
        System.out.println("Cliente criado com sucesso!");
        System.out.println("-------------------------------");
    }

    /**
     * Define o Cliente pelo id
     *
     * @return id
     */
    public int defineCliente() {
        System.out.println("Informe o id do Cliente: ");
        return scan.nextInt();
    }

    /**
     * Exibir msg de confirmação de deleção do Cliente
     */
    public void mostraMsgDelecao() {

        System.out.println("-------------------------------");
        System.out.println("Cliente deletado com sucesso!");
        System.out.println("-------------------------------");
    }

    public void mostraMsgClienteNaoEncontrado() {
        System.out.println("-------------------------------");
        System.out.println("Cliente não encontrado e/ou não existente");
        System.out.println("-------------------------------");
    }

    public Cliente inputDataForUpdate() {
        System.out.println("Informe o ID do Cliente que deseja atualizar:");
        int id = scan.nextInt();
        scan.nextLine(); // Limpar o buffer do scanner

        // Captura as informações visuais do cliente para atualização
        Cliente cliente = new Cliente();
        cliente.setId(id);

        System.out.println("Qual campo deseja atualizar?");
        System.out.println("1. Nome");
        System.out.println("2. Cpf");
        System.out.println("3. Endereço");
        System.out.println("4. Email");
        System.out.println("5. Senha");
        int opcao = scan.nextInt();
        scan.nextLine(); // Limpar o buffer do scanner

        switch (opcao) {
            case 1:
                System.out.println("Digite o novo nome:");
                String novoNome = scan.nextLine();
                cliente.setNome(novoNome);
                break;
            case 2:
                System.out.println("Digite o novo cpf:");
                String novoCpf = scan.nextLine();
                cliente.setCpf(novoCpf);
                break;
            case 3:
                System.out.println("Digite o novo endereço:");
                String novoEndereco = scan.nextLine();
                cliente.setEndereco(novoEndereco);
                break;
            case 4:
                System.out.println("Digite o novo email:");
                String novoEmail = scan.nextLine();
                cliente.setEmail(novoEmail);
                break;
            case 5:
                System.out.println("Digite a nova senha:");
                String novaSenha = scan.nextLine();
                cliente.setSenha(novaSenha);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        return cliente;
    }

}
