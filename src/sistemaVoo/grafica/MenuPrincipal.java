package sistemaVoo.grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class MenuPrincipal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 525);
		contentPane = new JPanel();
		contentPane.setVisible(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistemaDeVenda = new JLabel("Sistema De Venda de Passagens");
		lblSistemaDeVenda.setBounds(5, 5, 424, 14);
		lblSistemaDeVenda.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSistemaDeVenda);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Senha\r\n");
		passwordField.setBounds(40, 87, 259, 30);
		passwordField.setVisible(false);
		contentPane.add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Funcion\u00E1rio ");
		rdbtnNewRadioButton.setBounds(40, 57, 145, 23);
		contentPane.add(rdbtnNewRadioButton);
		 //Ver se o botão está selecionado e mostrar a opção de senha para o funcionario
		  boolean ver;
		  ver=rdbtnNewRadioButton.isSelected();
		   if(ver==true){
			   passwordField.setVisible(true);
		   }
		
		JRadioButton rdbtnCliente = new JRadioButton("Cliente");
		rdbtnCliente.setBounds(204, 57, 109, 23);
		contentPane.add(rdbtnCliente);
	}
}
