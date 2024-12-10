package Cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
        	// Menu a ser exibido
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Total em Real");
            System.out.println("5. Sair");
            
            // Variavel para verificar a opção escolhida
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	// Perguntas para saber qual tipo de moeda e qual valor o usuário deseja adicionar
                    System.out.println("Escolha o tipo da moeda (1. Dólar, 2. Euro, 3. Real):");
                    int tipo = scanner.nextInt();
                    System.out.println("Informe o valor da moeda:");
                    double valor = scanner.nextDouble();
                    
                    // Switch case para adicionar moeda de acordo com o que usuário selecionou
                    switch (tipo) {
                        case 1:
                            cofrinho.adicionar(new Dolar(valor));
                            break;
                        case 2:
                            cofrinho.adicionar(new Euro(valor));
                            break;
                        case 3:
                            cofrinho.adicionar(new Real(valor));
                            break;
                    }
                    break;
                    
                case 2: 
                	// Perguntas para saber qual tipo e quantidade de moedas o usuário deseja remover
                	System.out.println("Escolha o tipo da moeda a remover (1. Dólar, 2. Euro, 3. Real):");
                	int tipoRemover = scanner.nextInt();
                	System.out.println("Escolha a quantia que deseja remover:");
                	int quantidadeRemover = scanner.nextInt();

                	Moeda moedaRemover = null;
                	// Switch case para remover a quantidade certa de moedas do tipo certo de moeda
                	switch (tipoRemover) {
                	    case 1:
                	        moedaRemover = new Dolar(quantidadeRemover);
                	        break;
                	    case 2:
                	        moedaRemover = new Euro(quantidadeRemover);
                	        break;
                	    case 3:
                	        moedaRemover = new Real(quantidadeRemover);
                	        break;
                	    // Validação para caso o usuário digite uma opção inválida
                	    default:
                	        System.out.println("Tipo de moeda inválido.");
                	        break;
                	}
                	
                	// Se de fato houver alguma moeda para remover chama o método remover
                	if (moedaRemover != null) {
                	    cofrinho.remover(moedaRemover);
                	}
                	break;
                
                // Lista todas as moedas cadastradas
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                
                // Retorna total já com os valores convertidos
                case 4:
                    System.out.println("Total em Real: " + cofrinho.totalConvertido());
                    break;
                
                // Mensagem de agradecimento e encerramento do sistema
                case 5:
                	System.out.println("Obrigado por utilizar o sistema!");
                    return;
                    
                // Validação para caso o usuário digite algo inválido  
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
