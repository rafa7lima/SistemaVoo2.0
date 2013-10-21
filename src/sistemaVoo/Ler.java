package sistemaVoo;

import java.util.Scanner;

public class Ler {
	
	public static String leitor;

	public Ler() { }
	
	public static String lerString(){
		leitor = new Scanner(System.in).nextLine();
		return leitor;
	}

	public static int lerInteiro(){
		boolean erro = false;
		int i = 0;
		do{
			try{
				i = Integer.parseInt(lerString());
				erro = false;
			}catch(NumberFormatException e){
				System.out.println("Insira um nœmero v‡lido.");
				erro = true;
			}
		}while(erro);
		return i;
	}
}
