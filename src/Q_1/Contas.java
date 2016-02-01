package Q_1;

//Importando Biblioteca calendário
import java.util.Calendar;

//Classe Pai - Conta Bancária
class ContaBancaria {
	private String cliente;
	private int num_conta;
	private float saldo = 0;
	
	String getCliente() {
		return this.cliente;
	}
	
	void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	int getNumConta() {
		return this.num_conta;
	}
	
	void setNumConta(int num_conta) {
		this.num_conta = num_conta;
	}
	
	float getSaldo() {
		return this.saldo;
	}
	
	void alterarSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	void sacar(float saq) {
		if(this.saldo>saq && saq>0){
			this.saldo-=saq;
		}
		else {
			System.out.println("O saldo da sua conta é insuficiente");
		}
	}
	
	void depositar(float dep) {
		if(dep>0)
			this.saldo+= dep;
	}
	
	void mostraDados() {
		System.out.println("Cliente : "+this.cliente+"\nNumero da Conta : "+this.num_conta+"\nSaldo : "+this.saldo+"\n");
	}
}

//Classe Filha ContaBancaria>ContaPoupanca
class ContaPoupanca extends ContaBancaria {
	private Calendar diaHoje = Calendar.getInstance();
	private final int diaDeRendimento = 10;
	private final float tax = 5;
	
	//teste
	int teste() {
		return this.diaHoje.get(Calendar.DAY_OF_MONTH);
	}
	
	void calcularNovoSaldo() {
		if(this.diaHoje.get(Calendar.DAY_OF_MONTH)==this.diaDeRendimento)
			super.alterarSaldo(super.getSaldo()*(1+this.tax/100));
	}
	
	@Override
	void mostraDados() {
		System.out.println("Cliente : "+super.getCliente()+"\nNumero da Conta : "+super.getNumConta()+"\nSaldo : "+super.getSaldo()+"\nTaxa de Rendimento/mês : "+this.tax+"%\n");
	}
}

//Classe Filha ContaBancaria>ContaCorrente
class ContaCorrente extends ContaBancaria {
	private final float limite = 1000;
	@Override
	void sacar(float saq) {
		if((super.getSaldo()-saq)>(-this.limite) && saq>0) {
			super.alterarSaldo(super.getSaldo()-saq);
		}
		else {
			System.out.println("Seu saque excedeu o limite permitido");
		}
	}
	
}


public class Contas {

	public static void main(String[] args) {
		ContaBancaria minhaConta = new ContaBancaria();
		ContaPoupanca minhaContaPoupanca = new ContaPoupanca();
		ContaCorrente minhaContaCorrente = new ContaCorrente();
		
		//Conta Bancária
		minhaConta.setCliente("Cleverson Conta Bancaria");
		minhaConta.setNumConta(1234567);
		minhaConta.depositar(1000f);
		minhaConta.sacar(1200f);
		minhaConta.mostraDados();
		
		//Conta Poupança
		minhaContaPoupanca.setCliente("Cleverson Conta poupança");
		minhaContaPoupanca.setNumConta(7654321);
		minhaContaPoupanca.depositar(1000f);
		minhaContaPoupanca.calcularNovoSaldo();
		minhaContaPoupanca.sacar(500f);
		minhaContaPoupanca.mostraDados();
		System.out.println("Dia de Hoje : "+minhaContaPoupanca.teste());
		
		//Conta Corrente
		minhaContaCorrente.setCliente("Cleverson Conta Corrente");
		minhaContaCorrente.setNumConta(1243567);
		minhaContaCorrente.depositar(1000f);
		minhaContaCorrente.sacar(1999f);
		minhaContaCorrente.mostraDados();
		
	}

}
