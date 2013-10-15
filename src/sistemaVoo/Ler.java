package sistemaVoo;

import java.util.Scanner;

public class Ler {

	public Ler() { }
	
	public static String lerDoTeclado(){
		return new Scanner(System.in).nextLine();
	}

	public static int lerNumero(){
		boolean erro = false;
		int i = 0;
		do{
			try{
				i = Integer.parseInt(lerDoTeclado());
				erro = false;
			}catch(NumberFormatException e){
				System.out.println("Insira um nœmero v‡lido.");
				erro = true;
			}
		}while(erro);
		return i;
	}
}
