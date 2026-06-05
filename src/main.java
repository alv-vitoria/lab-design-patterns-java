public class Main {
    public static void main(String[] args) {

        Banco banco1 = Banco.getInstancia();
        Banco banco2 = Banco.getInstancia();

        System.out.println("=== Padrão Singleton - Banco Digital ===\n");

        banco1.exibirInfo();

        banco1.depositar(500);
        System.out.println("Após depósito de R$500:");
        banco1.exibirInfo();

        banco2.sacar(200);
        System.out.println("Após saque de R$200 via banco2:");
        banco2.exibirInfo();

        System.out.println("\nbank1 e banco2 são a mesma instância? " + (banco1 == banco2));
    }
}
