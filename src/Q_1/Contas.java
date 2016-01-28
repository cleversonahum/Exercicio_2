package Q_1;

//Classe Pai - Conta Bancária
class ContaBancaria {
	String cliente;
	int num_conta;
	float saldo = 0;
	
	void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	void setNumConta(int num_conta) {
		this.num_conta = num_conta;
	}
	
	
	
	void sacar(double saq) {
		if(this.saldo>saq && saq>0){
			this.saldo-=saq;
		}
		else {
			System.out.println("O saldo da sua conta é insuficiente");
		}
	}
	
	void depositar(double dep) {
		if(dep>0)
			this.saldo+= dep;
	}
	
	void mostraDados() {
		System.out.println("Cliente : "+this.cliente+"\nNumero da Conta : "+this.num_conta+"\nSaldo : "+this.saldo+"\n");
	}
}

//Classe Filha ContaBancaria>ContaPoupanca
class ContaPoupanca extends ContaBancaria {
	private int diaHoje = 10;
	private int diaDeRendimento = 10;
	private double tax = 5;
	
	void calcularNovoSaldo() {
		if(this.diaHoje==this.diaDeRendimento)
			this.saldo*=(1+this.tax/100);
	}
	
	@Override
	void mostraDados() {
		System.out.println("Cliente : "+this.cliente+"\nNumero da Conta : "+this.num_conta+"\nSaldo : "+this.saldo+"\nTaxa de Rendimento/mês : "+this.tax+"%\n");
	}
}

//Classe Filha ContaBancaria>ContaCorrente
class ContaCorrente extends ContaBancaria {
	private float limite = 1000;
	@Override
	void sacar(double saq) {
		if((this.saldo-saq)>(-this.limite) && saq>0) {
			this.saldo -= saq;
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
		minhaConta.depositar(1000);
		minhaConta.sacar(1200);
		minhaConta.mostraDados();
		
		//Conta Poupança
		minhaContaPoupanca.setCliente("Cleverson Conta poupança");
		minhaContaPoupanca.setNumConta(7654321);
		minhaContaPoupanca.depositar(1000);
		minhaContaPoupanca.calcularNovoSaldo();
		minhaContaPoupanca.sacar(500);
		minhaContaPoupanca.mostraDados();
		
		//Conta Corrente
		minhaContaCorrente.setCliente("Cleverson Conta Corrente");
		minhaContaCorrente.setNumConta(1243567);
		minhaContaCorrente.depositar(1000);
		minhaContaCorrente.sacar(2500);
		minhaContaCorrente.mostraDados();
		
	}

}
