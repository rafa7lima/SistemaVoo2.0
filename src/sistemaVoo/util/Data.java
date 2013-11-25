package sistemaVoo.util;

import java.util.Calendar;


public class Data {

	    //Atributos

		private int dia;
		private int mes;
		private int ano;
		
		public Data(){
			
		}

	    //Construtor com parametros
		public Data(int d, int m, int a) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
			
		public int getDia() {
			return dia;
		}

		public void setDia(int dia) {
			this.dia = dia;
		}

		public int getMes() {
			return mes;
		}

		public void setMes(int mes) {
			this.mes = mes;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
		public static Data obterAtual(){
			//Utilizando a classe calendario
			Calendar calendario=Calendar.getInstance();  //Pegando a instancia de Calendar, ela é abstrata e não pode ser instanciada com new
			
			Data dataatual = new Data();
			dataatual.setDia(calendario.get(Calendar.DAY_OF_MONTH));
			dataatual.setMes(calendario.get(Calendar.MONTH));
			dataatual.setAno(calendario.get(Calendar.YEAR));

			return dataatual;

		} 
		

}
