package Cofrinho;

abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }
    
    // Métodos da classe abstrata
    public abstract void info();
    public abstract double converter();
}

