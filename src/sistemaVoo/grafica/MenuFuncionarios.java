package sistemaVoo.grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class MenuFuncionarios extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFuncionarios frame = new MenuFuncionarios();
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
	public MenuFuncionarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginDeFuncionrios = new JLabel("Login de Funcion\u00E1rios");
		lblLoginDeFuncionrios.setBounds(5, 5, 424, 14);
		contentPane.add(lblLoginDeFuncionrios);
		
		JLabel lblDigiteASua = new JLabel("Digite a sua senha:");
		lblDigiteASua.setBounds(10, 44, 159, 14);
		contentPane.add(lblDigiteASua);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(20, 69, 209, 28);
		contentPane.add(passwordField);
		
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(166, 119, 89, 23);
		contentPane.add(btnLogar);
		
	}
}
