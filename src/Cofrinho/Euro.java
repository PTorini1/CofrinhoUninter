package Cofrinho;

class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    // Retorna quantidade de moedas de euro
    @Override
    public void info() {
        System.out.println("Euro: " + valor);
    }

    // Conversão para a cotação do euro
    @Override
    public double converter() {
        return valor * 6.36; 
    }
}

