package sistemaVoo.util;

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
