package sistemaVoo.grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JScrollPane;

import com.sun.xml.internal.ws.util.StringUtils;

public class MenuPesquisa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPesquisa frame = new MenuPesquisa(args);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPesquisa(String[] args) {
		setTitle("Resultado da Pesquisa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDadosDaPesquisa = new JLabel("Dados da pesquisa");
		lblDadosDaPesquisa.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblDadosDaPesquisa.setBounds(162, 6, 131, 16);
		contentPane.add(lblDadosDaPesquisa);
		
		JLabel lblOrigem = new JLabel("Origem: " + args[0]);
		lblOrigem.setBounds(6, 34, 146, 16);
		contentPane.add(lblOrigem);
		
		JLabel lblDestino = new JLabel("Destino: " + args[1]);
		lblDestino.setBounds(6, 56, 131, 16);
		contentPane.add(lblDestino);
		
		JLabel lblDataDaIda = new JLabel("Data da ida: " + args[2]);
		lblDataDaIda.setBounds(149, 34, 188, 16);
		contentPane.add(lblDataDaIda);
		
		JLabel lblDataDaVolta = new JLabel("Data da volta: " + args[3]);
		lblDataDaVolta.setBounds(149, 56, 188, 16);
		contentPane.add(lblDataDaVolta);
		
		JLabel lblAdultos = new JLabel("Adultos: " + args[4]);
		lblAdultos.setBounds(349, 34, 95, 16);
		contentPane.add(lblAdultos);
		
		JLabel lblCrianas = new JLabel("Crian\u00E7as: " + args[5]);
		lblCrianas.setBounds(349, 56, 95, 16);
		contentPane.add(lblCrianas);
		
		JLabel lblResultadoDaPesquisa = new JLabel("Resultados da pesquisa");
		lblResultadoDaPesquisa.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblResultadoDaPesquisa.setBounds(139, 102, 167, 16);
		contentPane.add(lblResultadoDaPesquisa);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(16, 78, 414, 12);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 126, 414, 134);
		contentPane.add(scrollPane);
		
		String[] resultado = gerarListaResultados(args);
		JList list = new JList(resultado);
		scrollPane.setViewportView(list);
		
		
	}
	
	private String[] gerarListaResultados(String[] args){
		try{
			int tamanho = (args.length - 6)/4; 
			String[] lista = new String[tamanho];
			String espaco = new String(new char[21]).replace("\0","&nbsp");
			for(int i=0;i<tamanho;i++){
				lista[i] = "<html>Voo no. " + args[6 + i*4] + ":   Partida: " + args[7 + i*4] + 
						"<br/>" + espaco + " Chegada: " + args[8 + i*4] +
						"<br/>" + espaco + " Preço: " + args[9 + i*4]+"</html>";
			}
			return lista;
		}catch(NumberFormatException e){
			System.out.println("Insira um valor inteiro.");
			e.getMessage();
			return null;
		}
		
	}
}
