package sistemaVoo.util;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Data {

	    //Atributos

		private int dia;
		private int mes;
		private int ano;

	    //Construtor sem parametros
		public Data(int d, int m, int a) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
		
		Date hoje =new Date();   //Criando novo objeto da classe date, importado de java.util.Date
		Calendar calendario=Calendar.getInstance(); //Não se pode criar um objeto da classe calendar, mas podemos receber uma instancia
		
		/*/
		//Metodo para o agendamento de viagens
		private void agendamento(int dia,int mes,int ano){
			calendario.add(dia, dia);  //Adiciona ao dia atual (primeiro parametro), o dia passado pelo usuário)
			calendario.add(mes,mes);
			calendario.add(ano,ano);
		É preciso fazer alguns ajustes ainda, por isso está em comentário
		}
		/*/
		
        //Metodo para mostrar a data atual
		public void dataAtual(){
			SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");;   //Instanciando um formato de apresentação da data, oriunda da classe SimpleDateFormat que vem de java.text.Dateformat
			System.out.println(formato.format(hoje));
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
		

}
