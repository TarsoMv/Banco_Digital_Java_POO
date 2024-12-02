package Contas.contacorrente;
import Banco.Banco;
import Cliente.Cliente;
import Contas.Conta;
public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void imprimirExtrato(){
        System.out.println("===Conta Corrente===");
        super.imprimirInfos();
    }

}
