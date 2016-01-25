package Q_2;

class Animal {
	String nome,cor,ambiente;
	double velocidade;
	int patas,comprimento;
	
	void alteraNome(String nome) {
		this.nome = nome;
	}
	
	void alteraComprimento(int comp) {
		this.comprimento = comp;
	}
	
	void alteraPatas(int patas) {
		this.patas = patas;
	}
	
	void alteraCor(String cor) {
		this.cor = cor;
	}
	
	void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	void alteraVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	void dados() {
		System.out.print("Nome : "+this.nome+"\nComprimento : "+this.comprimento+" cm\nPatas : "+this.patas+"\nCor : "+this.cor+"\nAmbiente : "+this.ambiente+"\nVelocidade : "+this.velocidade+" m/s\n");
	}
}


class Peixe extends Animal {
	String caracteristica;
	
	void alteraCaracteristica(String carac) {
		this.caracteristica = carac;
	}
	
	String caracteristica() {
		return this.caracteristica;
	}
	
	@Override
	void dados() {
		System.out.print("Nome : "+this.nome+"\nComprimento : "+this.comprimento+" cm\nPatas : "+this.patas+"\nCor : "+this.cor+"\nAmbiente : "+this.ambiente+"\nVelocidade : "+this.velocidade+" m/s\nCaracterística : "+this.caracteristica()+"\n");
	}
}


class Mamifero extends Animal {
	String alimento;
	
	void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	String alimento() {
		return this.alimento;
	}
	
	@Override
	void dados() {
		System.out.print("Nome : "+this.nome+"\nComprimento : "+this.comprimento+" cm\nPatas : "+this.patas+"\nCor : "+this.cor+"\nAmbiente : "+this.ambiente+"\nVelocidade : "+this.velocidade+" m/s\nAlimento : "+this.alimento()+"\n");
	}
}


public class TesteAnimais {

	public static void main(String[] args) {
		Animal camelo = new Animal();
		Peixe tubarao = new Peixe();
		Mamifero urso_do_canada = new Mamifero();
		
		//Camelo
		camelo.alteraNome("Camelo");
		camelo.alteraComprimento(150);
		camelo.alteraPatas(4);
		camelo.alteraCor("Amarelo");
		camelo.alteraAmbiente("Terra");
		camelo.alteraVelocidade(2);
		
		
		//Tubarão
		tubarao.alteraNome("Tubarão");
		tubarao.alteraComprimento(300);
		tubarao.alteraPatas(0);
		tubarao.alteraCor("Cinza");
		tubarao.alteraAmbiente("Mar");
		tubarao.alteraVelocidade(1.5);
		tubarao.alteraCaracteristica("Barbatanas e cauda");
		
		
		//Urso do Canadá
		urso_do_canada.alteraNome("Urso do Canadá");
		urso_do_canada.alteraComprimento(180);
		urso_do_canada.alteraPatas(4);
		urso_do_canada.alteraCor("Vermelho");
		urso_do_canada.alteraAmbiente("Terra");
		urso_do_canada.alteraVelocidade(0.5);
		urso_do_canada.alteraAlimento("Mel");
		
		//Resultado
		System.out.println("Zoo: \n---------------------------------");
		camelo.dados();
		System.out.println("\n---------------------------------");
		tubarao.dados();
		System.out.println("\n---------------------------------");
		urso_do_canada.dados();
	}

}
