package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 326);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(145, 8, 95, 52);
		lblLogin.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 30));
		contentPane.add(lblLogin);
		
		textEmail = new JTextField();
		textEmail.setBounds(44, 83, 300, 30);
		textEmail.setToolTipText("Email");
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setToolTipText("Senha");
		textSenha.setColumns(10);
		textSenha.setBounds(44, 138, 300, 30);
		contentPane.add(textSenha);
		
		JButton btnCad = new JButton("Cadastrar-se");
		btnCad.setBackground(Color.BLACK);
		btnCad.setForeground(Color.LIGHT_GRAY);
		btnCad.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 15));
		btnCad.setBounds(44, 200, 145, 30);
		contentPane.add(btnCad);
		
		JButton btnEnter = new JButton("Entrar");
		btnEnter.setBackground(Color.BLACK);
		btnEnter.setForeground(Color.LIGHT_GRAY);
		btnEnter.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 15));
		btnEnter.setBounds(219, 200, 125, 30);
		contentPane.add(btnEnter);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBackground(Color.BLACK);
		btnFechar.setForeground(Color.LIGHT_GRAY);
		btnFechar.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 15));
		btnFechar.setBounds(137, 238, 125, 30);
		contentPane.add(btnFechar);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 15));
		lblSenha.setBounds(54, 121, 56, 19);
		contentPane.add(lblSenha);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 15));
		lblEmail.setBounds(54, 62, 56, 19);
		contentPane.add(lblEmail);
	}
}
