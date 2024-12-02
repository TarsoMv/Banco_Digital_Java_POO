package Contas;
import Banco.Banco;
import Cliente.Cliente;
public class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;
    private Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    protected void imprimirInfos(){
        System.out.println("Banco: " + banco.getNome());
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Sua Agencia: " + agencia);
        System.out.println("Seu numero: " + numero);
        System.out.println("Seu extrato: " + saldo);
    }

    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato() {
    }
}
