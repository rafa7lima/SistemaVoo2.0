package sistemaVoo.grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JButton;

import sistemaVoo.util.Data;
import sistemaVoo.util.Pesquisa;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtDigiteACidade;
	private JTextField txtDigiteACidade_1;
	private JTextField txtDd;
	private JTextField txtMs;
	private JTextField txtAno;
	private JLabel lblIda;
	private JLabel lblVolta;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private boolean idaEVolta=true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCliente frame = new MenuCliente();
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
	
	private void groupButton(JRadioButton jr1, JRadioButton jr2){
		
		ButtonGroup bg1 = new ButtonGroup();
		
		bg1.add(jr1);
		bg1.add(jr2);
		
	}
	
	public MenuCliente() {
		setTitle("Menu do Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnIdaEVolta = new JRadioButton("Ida e Volta");
		rdbtnIdaEVolta.setBounds(22, 17, 141, 23);
		rdbtnIdaEVolta.setSelected(true);
		contentPane.add(rdbtnIdaEVolta);
		// Acao de selecionar "Ida e volta"
		
		rdbtnIdaEVolta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblVolta.setVisible(true);
				textField.setVisible(true);
				textField_1.setVisible(true);
				textField_2.setVisible(true);
				idaEVolta=true;
			}
		});
		
		JRadioButton rdbtnSIda = new JRadioButton("S\u00F3 ida");
		rdbtnSIda.setBounds(149, 17, 141, 23);
		contentPane.add(rdbtnSIda);
		// Acao de selecionar "So ida"
		rdbtnSIda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblVolta.setVisible(false);
				textField.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				idaEVolta=false;
			}
		});
		
		//Agrupar RadioButtons 
		groupButton(rdbtnIdaEVolta,rdbtnSIda);
		
		JLabel lblOrigem = new JLabel("Origem");
		lblOrigem.setBounds(22, 52, 61, 16);
		contentPane.add(lblOrigem);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(22, 80, 61, 16);
		contentPane.add(lblDestino);
		
		txtDigiteACidade = new JTextField();
		txtDigiteACidade.setText("Bras’lia");
		txtDigiteACidade.setToolTipText("");
		txtDigiteACidade.setBounds(93, 46, 329, 28);
		contentPane.add(txtDigiteACidade);
		txtDigiteACidade.setColumns(10);
		
		txtDigiteACidade_1 = new JTextField();
		txtDigiteACidade_1.setColumns(10);
		txtDigiteACidade_1.setBounds(95, 74, 329, 28);
		contentPane.add(txtDigiteACidade_1);
		
		//Determina dia atual
		Data data = Data.obterAtual();
		
		txtDd = new JTextField();
		txtDd.setText(String.valueOf(data.getDia()));
		txtDd.setBounds(20, 132, 40, 28);
		contentPane.add(txtDd);
		txtDd.setColumns(10);
		
		txtMs = new JTextField();
		txtMs.setText(String.valueOf(data.getMes()));
		txtMs.setColumns(10);
		txtMs.setBounds(62, 132, 40, 28);
		contentPane.add(txtMs);
		
		txtAno = new JTextField();
		txtAno.setText(String.valueOf(data.getAno()));
		txtAno.setColumns(10);
		txtAno.setBounds(104, 132, 55, 28);
		contentPane.add(txtAno);
		
		lblIda = new JLabel("Ida:");
		lblIda.setBounds(22, 108, 61, 16);
		contentPane.add(lblIda);
		
		lblVolta = new JLabel("Volta:");
		lblVolta.setBounds(192, 108, 61, 16);
		contentPane.add(lblVolta);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(190, 132, 40, 28);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(232, 132, 40, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(274, 132, 55, 28);
		contentPane.add(textField_2);
		
		JLabel lblAdultos = new JLabel("Adultos");
		lblAdultos.setBounds(22, 183, 61, 16);
		contentPane.add(lblAdultos);
		
		textField_3 = new JTextField();
		textField_3.setText("1");
		textField_3.setBounds(20, 196, 55, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCrianas = new JLabel("Crian\u00E7as");
		lblCrianas.setBounds(102, 183, 61, 16);
		contentPane.add(lblCrianas);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(100, 196, 55, 28);
		contentPane.add(textField_4);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Data dataida = new Data(Integer.parseInt(txtDd.getText()), Integer.parseInt(txtMs.getText()), Integer.parseInt(txtAno.getText()));
				Data datavolta;
				if(idaEVolta){
					datavolta = new Data(Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()), Integer.parseInt(textField_2.getText()));			
				}else{
					datavolta = new Data(0,0,0);
				}
				Pesquisa pesquisa = new Pesquisa(txtDigiteACidade.getText(), txtDigiteACidade_1.getText(), dataida, datavolta, Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_4.getText()));
				String[] resultado = pesquisa.pesquisar();
				MenuPesquisa menuPesquisa = new MenuPesquisa();
				menuPesquisa.dispose();
				MenuPesquisa.main(resultado);
				
			}
		});
		btnPesquisar.setBounds(277, 197, 117, 29);
		contentPane.add(btnPesquisar);
	}
}
