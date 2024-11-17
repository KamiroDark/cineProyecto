package co.edu.konradlorenz.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class vtnRegistrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vtnRegistrar frame = new vtnRegistrar();
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
	public vtnRegistrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnMenu = new JPanel();
		jpnMenu.setForeground(Color.RED);
		jpnMenu.setBackground(Color.RED);
		jpnMenu.setBounds(0, 0, 720, 66);
		contentPane.add(jpnMenu);
		
		JPanel jpnIniciarSesion = new JPanel();
		jpnIniciarSesion.setLayout(null);
		jpnIniciarSesion.setBackground(Color.WHITE);
		jpnIniciarSesion.setBounds(0, 64, 720, 414);
		contentPane.add(jpnIniciarSesion);
		
		JLabel lblRegistrate = new JLabel("Registrate");
		lblRegistrate.setFont(new Font("Minion Pro", Font.BOLD, 35));
		lblRegistrate.setBounds(278, 11, 152, 71);
		jpnIniciarSesion.add(lblRegistrate);
		
		textField = new JTextField();
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(384, 116, 256, 30);
		jpnIniciarSesion.add(textField);
		
		JButton btnRegistrate = new JButton("Registrarme");
		btnRegistrate.setForeground(Color.BLACK);
		btnRegistrate.setFont(new Font("Minion Pro", Font.BOLD, 22));
		btnRegistrate.setBackground(Color.RED);
		btnRegistrate.setBounds(291, 339, 152, 44);
		jpnIniciarSesion.add(btnRegistrate);
		
		JLabel lblNewLabel_1 = new JLabel("Celular:");
		lblNewLabel_1.setFont(new Font("Minion Pro", Font.BOLD, 18));
		lblNewLabel_1.setBounds(384, 93, 152, 30);
		jpnIniciarSesion.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombre de usuario:");
		lblNewLabel_1_2.setFont(new Font("Minion Pro", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(90, 93, 185, 30);
		jpnIniciarSesion.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Correo electrónico:");
		lblNewLabel_1_2_1.setFont(new Font("Minion Pro", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(90, 168, 185, 30);
		jpnIniciarSesion.add(lblNewLabel_1_2_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("Contraseña");
		passwordField_1.setForeground(Color.LIGHT_GRAY);
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField_1.setBounds(384, 191, 256, 30);
		jpnIniciarSesion.add(passwordField_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Contraseña:");
		lblNewLabel_1_3.setFont(new Font("Minion Pro", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(384, 168, 152, 30);
		jpnIniciarSesion.add(lblNewLabel_1_3);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(90, 191, 256, 30);
		jpnIniciarSesion.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(90, 116, 256, 30);
		jpnIniciarSesion.add(textField_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Regular");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("Minion Pro", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(115, 291, 104, 23);
		jpnIniciarSesion.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnGold = new JRadioButton("Gold");
		rdbtnGold.setFont(new Font("Minion Pro", Font.PLAIN, 18));
		rdbtnGold.setBackground(Color.WHITE);
		rdbtnGold.setBounds(332, 291, 68, 23);
		jpnIniciarSesion.add(rdbtnGold);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Pro");
		rdbtnNewRadioButton_1_1.setFont(new Font("Minion Pro", Font.PLAIN, 18));
		rdbtnNewRadioButton_1_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1_1.setBounds(517, 290, 57, 23);
		jpnIniciarSesion.add(rdbtnNewRadioButton_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Selecciona tu tipo de membresia:");
		lblNewLabel_1_2_1_1.setFont(new Font("Minion Pro", Font.BOLD, 18));
		lblNewLabel_1_2_1_1.setBounds(241, 242, 258, 30);
		jpnIniciarSesion.add(lblNewLabel_1_2_1_1);
	}
}
