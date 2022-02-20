package desafiocapgemini;

import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		int menu = -1;
		String opcao = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("SEJA BEM VINDO AO PROGRAMA");
		
		while (menu != 0) {
			
			System.out.println("\nEscolha uma opção do menu: \n");
			System.out.println("1- ALGORITIMO DA ESCADA DE CARACTERE");
			System.out.println("2- ALGORITIMO QUE VERIFICA SE A SENHA É FORTE");
			System.out.println("3- ALGORITIMO QUE VERIFICA QUANTAS SUBSTRINGS SÃO ANAGRAMAS");
			System.out.println("Qualquer outro número para sair do sistema");
			menu = scanner.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Digite a quantidade de degraus da escada de caractere:");
				Escada.ImprimirEscada(scanner.nextInt());
			    menu = ContinuarMenu();
				break;
			case 2:
				System.out.println("Digite uma senha:");
				System.out.println(SenhaForte.ValidaSenha(scanner.next()));
				menu = ContinuarMenu(); 
				break;
			case 3:
				System.out.println("Digite uma palavra:");
				System.out.println("A palavra contém "+ Anagrama.VerificaAnagrama(scanner.next()) + " anagramas");
				menu = ContinuarMenu(); 				
				break;
			default:
				menu = 0;
			}	
		}
		
		System.out.println("\n ATÈ BREVE!");
		scanner.close();
      	
	}
	
	static int ContinuarMenu() {
		Scanner scan = new Scanner(System.in);
		String opcao;
		
		System.out.println("\nDeseja voltar ao menu? S para SIM, qualquer outra letra para NAO");
		opcao = scan.next();
		
		if ((opcao.equals("S")) || (opcao.equals("s"))){
			return 1;
		} else {
			return 0;
		}
	}
}
