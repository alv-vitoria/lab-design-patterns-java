public class Banco {
    
    private static Banco instancia;
    private String nome;
    private double saldo;
    
    private Banco() {
        this.nome = "Banco Digital";
        this.saldo = 1000.0;
    }
    
    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void exibirInfo() {
        System.out.println("Banco: " + nome + " | Saldo: R$" + saldo);
    }
}
