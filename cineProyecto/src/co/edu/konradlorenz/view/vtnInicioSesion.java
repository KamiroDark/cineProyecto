package co.edu.konradlorenz.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class vtnInicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCorreoElectrnico;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public vtnInicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnMenu = new JPanel();
		jpnMenu.setBackground(new Color(255, 0, 0));
		jpnMenu.setForeground(new Color(255, 0, 0));
		jpnMenu.setBounds(0, 0, 1264, 82);
		contentPane.add(jpnMenu);
		jpnMenu.setLayout(null);
		
		JLabel lblTitulo = new JLabel("DarKaZo");
		lblTitulo.setBounds(10, 11, 176, 64);
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 52));
		jpnMenu.add(lblTitulo);
		
		JPanel jpnIniciarSesion = new JPanel();
		jpnIniciarSesion.setBackground(new Color(255, 255, 255));
		jpnIniciarSesion.setBounds(0, 83, 1264, 678);
		contentPane.add(jpnIniciarSesion);
		jpnIniciarSesion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesión");
		lblNewLabel.setFont(new Font("Minion Pro", Font.BOLD, 35));
		lblNewLabel.setBounds(542, 211, 227, 71);
		jpnIniciarSesion.add(lblNewLabel);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.setForeground(new Color(192, 192, 192));
		txtCorreoElectrnico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCorreoElectrnico.setBounds(542, 327, 227, 30);
		jpnIniciarSesion.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setForeground(new Color(192, 192, 192));
		passwordField.setToolTipText("Contraseña");
		passwordField.setBounds(542, 385, 227, 30);
		jpnIniciarSesion.add(passwordField);
		
		btnNewButton = new JButton("Ingresar");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Minion Pro", Font.BOLD, 22));
		btnNewButton.setBounds(584, 434, 152, 44);
		jpnIniciarSesion.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electrónico:");
		lblNewLabel_1.setFont(new Font("Minion Pro", Font.BOLD, 19));
		lblNewLabel_1.setBounds(297, 324, 196, 30);
		jpnIniciarSesion.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setFont(new Font("Minion Pro", Font.BOLD, 19));
		lblNewLabel_1_1.setBounds(363, 385, 130, 30);
		jpnIniciarSesion.add(lblNewLabel_1_1);
	}
}
