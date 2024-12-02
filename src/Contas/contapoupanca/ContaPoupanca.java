package Contas.contapoupanca;
import Banco.Banco;
import Cliente.Cliente;
import Contas.Conta;
public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);

    }

    public void imprimirExtrato(){
        System.out.println("===Conta Poupança===");
        super.imprimirInfos();


    }
}
