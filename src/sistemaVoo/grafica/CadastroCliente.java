package sistemaVoo.grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import sistemaVoo.entidades.Cliente;
import sistemaVoo.testes.TesteCpf;
public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeNovo = new JLabel("Cadastro de novo Cliente");
		lblCadastroDeNovo.setBounds(132, 11, 159, 14);
		contentPane.add(lblCadastroDeNovo);
		
		JLabel lblDigiteOSeu = new JLabel("Digite o seu Cpf (Somente n\u00FAmeros)");
		lblDigiteOSeu.setBounds(10, 46, 244, 14);
		contentPane.add(lblDigiteOSeu);
		
		textField = new JTextField();
		textField.setBounds(10, 71, 159, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		//Açoes do botão validar
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Labels e TextFields para completar o cadastro
				JLabel lblDigiteSeuNome = new JLabel("Digite seu Nome:");
				lblDigiteSeuNome.setVisible(false);
				lblDigiteSeuNome.setBounds(10, 150, 139, 14);
				contentPane.add(lblDigiteSeuNome);
				
				textField_1 = new JTextField();
				textField_1.setVisible(false);
				textField_1.setBounds(10, 175, 343, 23);
				contentPane.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblDigiteSeuEndereo = new JLabel("Digite seu Endere\u00E7o:");
				lblDigiteSeuEndereo.setVisible(false);
				lblDigiteSeuEndereo.setBounds(10, 225, 129, 14);
				contentPane.add(lblDigiteSeuEndereo);
				
				textField_2 = new JTextField();
				textField_2.setVisible(false);
				textField_2.setBounds(10, 250, 388, 20);
				contentPane.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblDigiteSeuTelefone = new JLabel("Digite seu telefone:");
				lblDigiteSeuTelefone.setVisible(false);
				lblDigiteSeuTelefone.setBounds(10, 295, 129, 14);
				contentPane.add(lblDigiteSeuTelefone);
				
				textField_3 = new JTextField();
				textField_3.setVisible(false);
				textField_3.setBounds(13, 320, 193, 20);
				contentPane.add(textField_3);
				textField_3.setColumns(10);
				//Agora instanciando objetos de classes como cliente e testeCpf
				Cliente novoCliente=new Cliente(); //Novo objeto instanciado da classe cliente 
				TesteCpf testeCpf = new TesteCpf();
				boolean valida=testeCpf.ValidarCpf(textField.getText());
				  if(valida==true){
					  JOptionPane.showMessageDialog(null, "CPF validado!"); 
					  novoCliente.setCpf(textField.getText());
					  //Deixando o resto dos labels e textFields visíveis
					  lblDigiteSeuNome.setVisible(true);
					  textField_1.setVisible(true);
					  lblDigiteSeuEndereo.setVisible(true);
					  textField_2.setVisible(true);
					  lblDigiteSeuTelefone.setVisible(true);
					  textField_3.setVisible(true);
					  //Usando os os textFields para adicionar os dados ao cliente.
					  novoCliente.setNome(textField_1.getText());
					  novoCliente.setEndereco(textField_2.getText());
					  novoCliente.setTelefone(textField_3.getText());
					  
					  
					  
				  }
				  else
					  JOptionPane.showMessageDialog(null, "CPF não validado!!");
			}
		});
		btnValidar.setBounds(10, 104, 89, 23);
		contentPane.add(btnValidar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCliente.this.dispose(); //Usa o dispose para fechar a janela
			}
		});
		btnCancelar.setBounds(132, 104, 89, 23);
		contentPane.add(btnCancelar);
		
	}
}
