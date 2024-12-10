package Cofrinho;

class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    // Retorna quantidade de moedas de dolar
    @Override
    public void info() {
        System.out.println("Dólar: " + valor);
    }

    // Conversão para a cotação do dolar
    @Override
    public double converter() {
        return valor * 6.09; // Exemplo de conversão para Real
    }
}
