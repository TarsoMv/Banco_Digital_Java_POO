import Banco.Banco;
import Cliente.Cliente;
import Contas.Conta;
import Contas.contacorrente.ContaCorrente;
import Contas.contapoupanca.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Grande");
        Cliente cliente1 = new Cliente("Cliente1");
        Conta cc = new ContaCorrente(cliente1, banco);
        cc.depositar(250);
        Conta poupanca = new ContaPoupanca(cliente1, banco);
        cc.transferir(poupanca, 50);
        poupanca.imprimirExtrato();
        cc.imprimirExtrato();
    }
}