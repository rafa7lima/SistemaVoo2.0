package sistemaVoo.grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

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
	}
}
