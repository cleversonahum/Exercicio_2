package Q_2;

//Classe Animal
class Animal {
	private String nome,cor,ambiente;
	private float velocidade;
	private int patas,comprimento;
	
	Animal(String nome, String cor, String ambiente, float velocidade, int patas, int comprimento) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
		this.patas = patas;
		this.comprimento = comprimento;
	}
	
	String getNome() {
		return this.nome;
	}
	
	void alteraNome(String nome) {
		this.nome = nome;
	}
	
	int getComprimento() {
		return this.comprimento;
	}
	
	void alteraComprimento(int comp) {
		this.comprimento = comp;
	}
	
	int getPatas() {
		return this.patas;
	}
	
	void alteraPatas(int patas) {
		this.patas = patas;
	}
	
	
	String getCor() {
		return this.cor;
	}
	
	void alteraCor(String cor) {
		this.cor = cor;
	}
	
	String getAmbiente() {
		return this.ambiente;
	}
	
	void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	float getVelocidade() {
		return this.velocidade;
	}
	
	void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	void dados() {
		System.out.print("Nome : "+this.nome+"\nComprimento : "+this.comprimento+" cm\nPatas : "+this.patas+"\nCor : "+this.cor+"\nAmbiente : "+this.ambiente+"\nVelocidade : "+this.velocidade+" m/s\n");
	}
}


class Peixe extends Animal {
	private String caracteristica;
	
	Peixe(String nome, String cor, String ambiente, String caracteristica, float velocidade, int patas, int comprimento) {
		super(nome, cor, ambiente, velocidade, patas, comprimento);
		this.caracteristica = caracteristica;
	}
	
	
	
	void alteraCaracteristica(String carac) {
		this.caracteristica = carac;
	}
	
	String caracteristica() {
		return this.caracteristica;
	}
	
	@Override
	void dados() {
		System.out.print("Nome : "+super.getNome()+"\nComprimento : "+super.getComprimento()+" cm\nPatas : "+super.getPatas()+"\nCor : "+super.getCor()+"\nAmbiente : "+super.getAmbiente()+"\nVelocidade : "+super.getVelocidade()+" m/s\nCaracterística : "+this.caracteristica()+"\n");
	}
}


class Mamifero extends Animal {
	private String alimento;
	
	Mamifero(String nome, String cor, String ambiente, String alimento, float velocidade, int patas, int comprimento) {
		super(nome, cor, ambiente, velocidade, patas, comprimento);
		this.alimento = alimento;
	}
	
	void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	String alimento() {
		return this.alimento;
	}
	
	@Override
	void dados() {
		System.out.print("Nome : "+super.getNome()+"\nComprimento : "+super.getComprimento()+" cm\nPatas : "+super.getPatas()+"\nCor : "+super.getCor()+"\nAmbiente : "+super.getAmbiente()+"\nVelocidade : "+super.getVelocidade()+" m/s\nAlimento : "+this.alimento()+"\n");
	}
}


public class TesteAnimais {

	public static void main(String[] args) {
		Mamifero camelo = new Mamifero("Camelo","Amarelo","Terra","Água",2,4,150);
		Peixe tubarao = new Peixe("Tubarão","Cinza","Mar","Barbatanas e cauda",1.5f,0,300);
		Mamifero urso_do_canada = new Mamifero("Urso do Canadá","Vermelho","Terra","Mel",0.5f,4,180);
		
		
		//Resultado
		System.out.println("Zoo: \n---------------------------------");
		camelo.dados();
		System.out.println("\n---------------------------------");
		tubarao.dados();
		System.out.println("\n---------------------------------");
		urso_do_canada.dados();
	}

}
