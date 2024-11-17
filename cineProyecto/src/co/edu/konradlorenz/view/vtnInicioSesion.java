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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vtnInicioSesion frame = new vtnInicioSesion();
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
	public vtnInicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnMenu = new JPanel();
		jpnMenu.setBackground(new Color(255, 0, 0));
		jpnMenu.setForeground(new Color(255, 0, 0));
		jpnMenu.setBounds(0, 0, 639, 66);
		contentPane.add(jpnMenu);
		
		JPanel jpnIniciarSesion = new JPanel();
		jpnIniciarSesion.setBackground(new Color(255, 255, 255));
		jpnIniciarSesion.setBounds(0, 65, 639, 313);
		contentPane.add(jpnIniciarSesion);
		jpnIniciarSesion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesión");
		lblNewLabel.setFont(new Font("Minion Pro", Font.BOLD, 35));
		lblNewLabel.setBounds(220, 11, 211, 71);
		jpnIniciarSesion.add(lblNewLabel);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.setForeground(new Color(192, 192, 192));
		txtCorreoElectrnico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCorreoElectrnico.setBounds(310, 93, 227, 30);
		jpnIniciarSesion.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setForeground(new Color(192, 192, 192));
		passwordField.setToolTipText("Contraseña");
		passwordField.setBounds(310, 163, 227, 30);
		jpnIniciarSesion.add(passwordField);
		
		btnNewButton = new JButton("Ingresar");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Minion Pro", Font.BOLD, 22));
		btnNewButton.setBounds(245, 230, 152, 44);
		jpnIniciarSesion.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Correo electrónico:");
		lblNewLabel_1.setFont(new Font("Minion Pro", Font.BOLD, 19));
		lblNewLabel_1.setBounds(136, 93, 164, 30);
		jpnIniciarSesion.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setFont(new Font("Minion Pro", Font.BOLD, 19));
		lblNewLabel_1_1.setBounds(194, 163, 106, 30);
		jpnIniciarSesion.add(lblNewLabel_1_1);
	}
}
