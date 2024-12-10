package Cofrinho;

import java.util.ArrayList;

class Cofrinho {
	private ArrayList<Moeda> listaDeMoedas;

    public Cofrinho() {
        this.listaDeMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) {
    	for (Moeda m : listaDeMoedas) {
    		// Verifica se já existe alguma moeda daquele tipo cadastrada
    	    if (m.getClass().equals(moeda.getClass())) {
    	    	// Soma valor com o que já existe
    	        m.valor += moeda.valor;
    	        System.out.println("Moeda " + moeda.getClass().getSimpleName() + " adicionada com sucesso.");
    	        // Retorna para que o resto da função não seja executado
    	        return;
    	    }
    	}
    	
    	// Caso não exista o tipo de moeda cadastrado, adiciona na lista 
    	listaDeMoedas.add(moeda);
    	System.out.println("Moeda " + moeda.getClass().getSimpleName() + " adicionada com sucesso.");
    }
 
    // Remoção de moedas do cofrinho
    public void remover(Moeda moeda) {
    	for (Moeda m : listaDeMoedas) {
    		// Verifica se já existe alguma moeda daquele tipo cadastrada
            if (m.getClass().equals(moeda.getClass())) {
            	// Verifica o valor a ser retirado para não retirar mais do que a pessoa possui
            	if(moeda.valor > m.valor) {
            		System.out.println("Quantia maior do que a quantidade de moedas.");
            	}
            	// Remove valor da moeda listada
            	else {
                    m.valor -= moeda.valor;
                    System.out.println("Quantia " + moeda.valor + " removida com sucesso.");
                    break;
            	}
            }
    	}
    }

    // Foreach que pega todas as moedas listadas e traz as informações
    public void listagemMoedas() {
        for (Moeda moeda : listaDeMoedas) {
            moeda.info();
        }
    }

    //Foreach que vai acrescentando a uma variavel total o valor convertido da quantidade de moedas
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaDeMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}

