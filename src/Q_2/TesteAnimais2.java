package Q_2;
import java.util.Scanner;

public class TesteAnimais2 {

	public static void main(String[] args) {
		int quant_animais,cod_classe,ind_mamifero=0,ind_peixe=0,ind_animal=0;
		String nome,cor,ambiente,caracteristica,alimento;
		float velocidade;
		int patas,comprimento;
		
		
		//Vari�vel de entrada teclado
		Scanner entrada = new Scanner(System.in);
		
		//Declarando os Arrays de refer�ncia
		Animal animais[] = new Animal[10];
		Mamifero mamiferos[] = new Mamifero[10];
		Peixe peixes[] = new Peixe[10];
		
		System.out.println("Zoo - Cadastro de Animais\n\nDigite a quantidade de animais(m�ximo 30 animais, 10 de cada esp�cie): ");
		quant_animais = entrada.nextInt();
		
		if(quant_animais<=30 && quant_animais>0){
		for(int x=0;x<quant_animais;x++) {
			System.out.println("\n\nC�digos classes:\n1 - Mamifero\n2 - Peixe\n3 (ou Qualquer outro c�digo) - Outro\n\nDigite o c�digo referente a classe que o animal pertence: ");
			cod_classe = entrada.nextInt();

			System.out.println("Digite a Esp�cie : ");
			nome = entrada.next();
			
			System.out.println("Digite o comprimento do animal (cm) : ");
			comprimento = entrada.nextInt();
			
			System.out.println("Digite a quantidade de patas : ");
			patas = entrada.nextInt();
			
			System.out.println("Digite a cor : ");
			cor = entrada.next();
			
			System.out.println("Digite o Ambiente : ");
			ambiente = entrada.next();
			
			System.out.println("Digite a velocidade : ");
			velocidade = entrada.nextFloat();
			
			switch(cod_classe) {
				//Mamifero
				case 1:
					System.out.println("Digite o Alimento : ");
					alimento = entrada.next();
					mamiferos[ind_mamifero] = new Mamifero(nome,cor,ambiente,alimento,velocidade,patas,comprimento);
					ind_mamifero++;
					break;
				
				//Peixe
				case 2:
					System.out.println("Digite a caracteristica : ");
					caracteristica = entrada.next();
					peixes[ind_peixe] = new Peixe(nome,cor,ambiente,caracteristica,velocidade,patas,comprimento);
					ind_peixe++;
					break;
					
				//Outros Animais
				default:
					animais[ind_animal] = new Animal(nome,cor,ambiente,velocidade,patas,comprimento);
					ind_animal++;
					break;
					
			}
		}//fim for
		}//fim if
		else{
			System.out.println("Voc� digitou uma quantidade maior que a suportada ou igual o menor a zero");
		}
		
		
		//Mostrando os resultados
		System.out.println("\nLista de Animais Cadastrados\n\n");
		
		//Mamiferos
		System.out.println("Mamiferos :\n");
		if(ind_mamifero==0){
			System.out.println("N�o h� Mamiferos cadastrados.\n");
		}
		else{
			for(int x=0;x<ind_mamifero;x++) {
				mamiferos[x].dados();
				System.out.println("________________________________________________\n");
			}
		}
		
		//Peixes
		System.out.println("Peixes :\n");
		if(ind_peixe==0){
			System.out.println("N�o h� Peixes cadastrados.\n");
		}
		else{
			for(int x=0;x<ind_peixe;x++) {
				peixes[x].dados();
				System.out.println("________________________________________________\n");
			}
		}
		
		
		//Animais - Outros
		System.out.println("Outros Animais :\n");
		if(ind_animal==0){
			System.out.println("N�o h� outros animais cadastrados.\n");
		}
		else {
			for(int x=0;x<ind_animal;x++) {
				animais[x].dados();
				System.out.println("________________________________________________\n");
			
			}
		}		
	entrada.close(); //Fechando a entrada do teclado

	}

}
