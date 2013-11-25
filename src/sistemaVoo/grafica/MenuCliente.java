package sistemaVoo.grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;

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
		
		JRadioButton rdbtnSIda = new JRadioButton("S\u00F3 ida");
		rdbtnSIda.setBounds(149, 17, 141, 23);
		contentPane.add(rdbtnSIda);
		
		JLabel lblOrigem = new JLabel("Origem");
		lblOrigem.setBounds(22, 52, 61, 16);
		contentPane.add(lblOrigem);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setVisible(false);
		lblDestino.setBounds(22, 80, 61, 16);
		contentPane.add(lblDestino);
		
		txtDigiteACidade = new JTextField();
		txtDigiteACidade.setText("Digite a cidade de origem");
		txtDigiteACidade.setToolTipText("");
		txtDigiteACidade.setForeground(Color.LIGHT_GRAY);
		txtDigiteACidade.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		txtDigiteACidade.setBounds(93, 46, 329, 28);
		contentPane.add(txtDigiteACidade);
		txtDigiteACidade.setColumns(10);
		
		txtDigiteACidade_1 = new JTextField();
		txtDigiteACidade_1.setVisible(false);
		txtDigiteACidade_1.setText("Digite a cidade de destino");
		txtDigiteACidade_1.setForeground(Color.LIGHT_GRAY);
		txtDigiteACidade_1.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		txtDigiteACidade_1.setColumns(10);
		txtDigiteACidade_1.setBounds(95, 74, 329, 28);
		contentPane.add(txtDigiteACidade_1);
		
		txtDd = new JTextField();
		txtDd.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		txtDd.setForeground(Color.LIGHT_GRAY);
		txtDd.setText("dia");
		txtDd.setBounds(20, 132, 40, 28);
		contentPane.add(txtDd);
		txtDd.setColumns(10);
		
		txtMs = new JTextField();
		txtMs.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		txtMs.setForeground(Color.LIGHT_GRAY);
		txtMs.setText("m\u00EAs");
		txtMs.setColumns(10);
		txtMs.setBounds(62, 132, 40, 28);
		contentPane.add(txtMs);
		
		txtAno = new JTextField();
		txtAno.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		txtAno.setForeground(Color.LIGHT_GRAY);
		txtAno.setText("ano");
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
		textField.setText("dia");
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		textField.setColumns(10);
		textField.setBounds(190, 132, 40, 28);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("m\u00EAs");
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(232, 132, 40, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("ano");
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(274, 132, 55, 28);
		contentPane.add(textField_2);
		
		JLabel lblAdultos = new JLabel("Adultos");
		lblAdultos.setBounds(22, 183, 61, 16);
		contentPane.add(lblAdultos);
		
		textField_3 = new JTextField();
		textField_3.setBounds(20, 196, 55, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCrianas = new JLabel("Crian\u00E7as");
		lblCrianas.setBounds(102, 183, 61, 16);
		contentPane.add(lblCrianas);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100, 196, 55, 28);
		contentPane.add(textField_4);
	}
}
