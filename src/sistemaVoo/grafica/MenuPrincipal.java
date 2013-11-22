package sistemaVoo.grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import sistemaVoo.testes.ValidarUser;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	//Função Main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}//Fim da run
		});
		ValidarUser valida=new ValidarUser();
		
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistemaDeVenda = new JLabel("Sistema de Venda de Passagens");
		lblSistemaDeVenda.setBounds(20, 11, 404, 14);
		contentPane.add(lblSistemaDeVenda);
		
		JLabel lblDigiteASua = new JLabel("Digite a sua Senha:");
		lblDigiteASua.setBounds(20, 47, 117, 14);
		contentPane.add(lblDigiteASua);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(20, 72, 180, 31);
		contentPane.add(passwordField);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(111, 114, 89, 23);
		contentPane.add(btnOk);
		passwordField.validate();
		
	}
}
