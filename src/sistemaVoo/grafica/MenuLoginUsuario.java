package sistemaVoo.grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.im.InputContext;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class MenuLoginUsuario extends JFrame {

        /**
	 * 
	 */
	private static final long serialVersionUID = -3806305179115740925L;
		/**
         * 
         */
        private static final long MenuLoginUsuario = 1L;
        private JPanel contentPane;
        private JPasswordField passwordField;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                	MenuLoginUsuario frame = new MenuLoginUsuario();
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
        public MenuLoginUsuario() {
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
                
                JButton btnCancelar = new JButton("Cancelar");
                btnCancelar.setBounds(67, 119, 89, 23);
                contentPane.add(btnCancelar);
                
                JLabel lblNovoUsurioDeseja = new JLabel("Novo Usuário? Deseja se Cadastrar?");
                lblNovoUsurioDeseja.setBounds(20, 165, 252, 14);
                contentPane.add(lblNovoUsurioDeseja);
                
                JButton btnNewButton = new JButton("Cadastrar");
                btnNewButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		
                	}
                });
                btnNewButton.setBounds(10, 190, 99, 23);
                contentPane.add(btnNewButton);
                
                //A‹o para cada bot‹o 
                btnLogar.addActionListener(new java.awt.event.ActionListener() {  
            //A‹o realizada
                        public void actionPerformed(java.awt.event.ActionEvent evt) {  
                //Aqui ser‹o inseridas as a›es para o bot‹o
                                String senha=passwordField.getText();   //Aqui iremos iniciar a valida‹o da senha
                                 //Agora vamos para a condi‹o para validar
                                if(Valida(senha)==1){
                                        JOptionPane.showMessageDialog(null, "Senha Correta!\nLogado como cliente!");
                                }else 
                                        if(Valida(senha)==2){
                                                JOptionPane.showMessageDialog(null, "Senha Correta!\nLogado como funcion‡rio!");
                                        }
                                        else
                                                if(Valida(senha)==3){
                                                        JOptionPane.showMessageDialog(null, "Senha Correta!\nLogado como administrador!");
                                                }
                                                else
                                                        if(Valida(senha)==0){
                                                                JOptionPane.showMessageDialog(null, "Senha Incorreta!\nUsu‡rio n‹o Logado!");
                                                        }
            }

                        //Metodo para validar
                          private int Valida(String senha){
                                  int senhaInt=0;
                                  int resultado;
                                  try {
                                          //Passar string para inteiro
                                          senhaInt= Integer.parseInt(senha);
                                        } catch (Exception e) {
                                                e.getMessage();
                                        }
                                  if(senhaInt%7==0){
                                                resultado=1;
                                        }
                                        else
                                                if(senhaInt%11==0){
                                                        resultado=2;
                                                }
                                                else
                                                        if(senhaInt%4==0){
                                                                resultado=3;
                                                        }
                                                        else{
                                                                resultado=0;
                                                        }
                                   return (resultado);
                          }//Fim do metodo para validar
        });  //Fim das aoes do bot‹o

                //Senhas padr‹o
                /*/
                  458927  //Mod 7
              294580 //Mod 11
              527896  //Mod 4
                 */
            }
}
	