package Cofrinho;

class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }
    
    // Retorna quantidade de moedas de real
    @Override
    public void info() {
        System.out.println("Real: " + valor);
    }

    @Override
    public double converter() {
        return valor; // Como o valor já está em real, não há a necessidade de converter para outro valor
    }
}

