public class Banco {

    // Guarda a única instância da classe
    private static Banco instancia;
    private String nome;
    private double saldo;

     // Construtor privado para impedir criação direta de objetos
    private Banco() {
        this.nome = "Banco Digital";
        this.saldo = 1000.0;
    }

  // Retorna a única instância do banco
    // Caso ainda não exista, ela é criada
    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

     // Adiciona valor ao saldo
    public void depositar(double valor) {
        this.saldo += valor;
    }

        // Realiza saque apenas se houver saldo suficiente
    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    // Exibe as informações do banco
    public void exibirInfo() {
        System.out.println("Banco: " + nome + " | Saldo: R$" + saldo);
    }
}
