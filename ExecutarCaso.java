import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExecutarCaso {
    public static void main(String[] args) throws IOException {
        ArrayList<Contato> contatos = new ArrayList<>();
        Contato cliente;
        String nomeArq = "c:\\cadastro.txt";
        File arq = new File(nomeArq);
        String mostra = "";
        String linha = "";
        FileReader reader;
        BufferedReader leitor;

        int opcao;
        do {

            System.out.println("1 - Cadastrar Clientes");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Gravar em arquivo texto");
            System.out.println("4 - Consultar arquivo texto");
            System.out.println("5 - Sair");

            Scanner entrada = new Scanner(System.in);

            System.out.println("Entre com a opcao desejada");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    String ag, conta, nome, email, telefone;
                    float saldo;
                    System.out.println("Entre com a Agência:");
                    ag = entrada.next();
                    System.out.println("Entre com a Conta:");
                    conta = entrada.next();
                    System.out.println("Entre com o Nome:");
                    nome = entrada.next();
                    System.out.println("Entre com o e-mail:");
                    email = entrada.next();
                    System.out.println("Entre com o Telefone:");
                    telefone = entrada.next();
                    System.out.println("Entre com o Saldo:");
                    saldo = entrada.nextFloat();

                    cliente = new Contato(ag, conta, nome, email, saldo);
                    cliente.setTelefone(telefone);
                    cliente.setSaldo(saldo);
                    contatos.add(cliente);
                    break;
                case 2:
                    for (Contato c : contatos) {
                        System.out.println("Ag: " + c.getAg() + " - Conta: " + c.getConta() + " - Cliente: "+ c.getNome() + " - e-mail: " + c.getEmail() + " - Telefone: " + c.getTelefone()+ " - Saldo: R$ " + c.getSaldo());
                    }
                    break;
                case 3:
                    FileWriter arquivo = new FileWriter("c:\\cadastro.txt");
                    PrintWriter gravarArquivo = new PrintWriter(arquivo);

                    gravarArquivo.println("Clientes" + "%n");

                    System.out.println("O total de registro é " + contatos.size());

                    for (int registros = 0; registros < contatos.size(); registros++) {
                        gravarArquivo.println(contatos.get(registros));
                    }
                    arquivo.close();
                    System.out.println("Arquivo gerado na unidade c:\\cadastro.txt");

                    if (arq.exists()) {
                        mostra = "Arquivo -" + nomeArq + " aberto com sucesso";
                        mostra += " Tamanho do arquivo " + Long.toString(arq.length()) + " bytes";
                        System.out.println(mostra);
                    }
                    break;
                case 4:
                    try {
                        reader = new FileReader(nomeArq);
                        leitor = new BufferedReader(reader);

                        while (true) {
                            linha = leitor.readLine();
                            System.out.println(linha);
                            if (linha == null) {
                                break;
                            }
                        }
                    } catch (Exception erro) {
                        System.out.println(mostra + "arquivo");
                    }
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opcao invalida");

                    entrada.close();
            }

        } while (opcao != 5);

    }

}