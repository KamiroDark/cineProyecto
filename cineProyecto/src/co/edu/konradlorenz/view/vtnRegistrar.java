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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class vtnRegistrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCelular;
	private JPasswordField pswContrasena;
	private JTextField txtCorreoElectronico;
	private JTextField txtNombreUsuario;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public vtnRegistrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1281, 801);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnMenu = new JPanel();
		jpnMenu.setForeground(Color.RED);
		jpnMenu.setBackground(Color.RED);
		jpnMenu.setBounds(0, 0, 1265, 89);
		contentPane.add(jpnMenu);
		jpnMenu.setLayout(null);
		
		JLabel lblTitulo = new JLabel("DarKaZo");
		lblTitulo.setBounds(31, 11, 176, 64);
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 52));
		jpnMenu.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(292, 33, 61, 22);
		jpnMenu.add(lblNewLabel);
		
		JLabel lblCartelera = new JLabel("Cartelera");
		lblCartelera.setForeground(Color.WHITE);
		lblCartelera.setFont(new Font("Arial", Font.BOLD, 18));
		lblCartelera.setBounds(472, 33, 85, 22);
		jpnMenu.add(lblCartelera);
		
		JLabel lblTeatro = new JLabel("Teatro");
		lblTeatro.setForeground(Color.WHITE);
		lblTeatro.setFont(new Font("Arial", Font.BOLD, 18));
		lblTeatro.setBounds(671, 33, 61, 22);
		jpnMenu.add(lblTeatro);
		
		JPanel jpnRegistro = new JPanel();
		jpnRegistro.setLayout(null);
		jpnRegistro.setBackground(Color.WHITE);
		jpnRegistro.setBounds(0, 87, 1265, 675);
		contentPane.add(jpnRegistro);
		
		JLabel lblRegistrate = new JLabel("Registrate");
		lblRegistrate.setFont(new Font("Gill Sans MT", Font.BOLD, 40));
		lblRegistrate.setBounds(538, 77, 200, 71);
		jpnRegistro.add(lblRegistrate);
		
		txtCelular = new JTextField();
		txtCelular.setForeground(Color.LIGHT_GRAY);
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCelular.setColumns(10);
		txtCelular.setBounds(746, 208, 256, 30);
		jpnRegistro.add(txtCelular);
		
		JButton btnRegistrate = new JButton("Registrarme");
		btnRegistrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrate.setForeground(Color.BLACK);
		btnRegistrate.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		btnRegistrate.setBackground(Color.RED);
		btnRegistrate.setBounds(538, 567, 181, 44);
		jpnRegistro.add(btnRegistrate);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		lblCelular.setBounds(746, 173, 152, 30);
		jpnRegistro.add(lblCelular);
		
		JLabel lblNombreUsuario = new JLabel("Nombre de usuario:");
		lblNombreUsuario.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		lblNombreUsuario.setBounds(265, 173, 213, 30);
		jpnRegistro.add(lblNombreUsuario);
		
		JLabel lblCorreoElectronico = new JLabel("Correo electrónico:");
		lblCorreoElectronico.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		lblCorreoElectronico.setBounds(265, 318, 228, 30);
		jpnRegistro.add(lblCorreoElectronico);
		
		pswContrasena = new JPasswordField();
		pswContrasena.setToolTipText("Contraseña");
		pswContrasena.setForeground(Color.LIGHT_GRAY);
		pswContrasena.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pswContrasena.setBounds(746, 352, 256, 30);
		jpnRegistro.add(pswContrasena);
		
		JLabel lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		lblContrasena.setBounds(746, 318, 152, 30);
		jpnRegistro.add(lblContrasena);
		
		txtCorreoElectronico = new JTextField();
		txtCorreoElectronico.setForeground(Color.LIGHT_GRAY);
		txtCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCorreoElectronico.setColumns(10);
		txtCorreoElectronico.setBounds(265, 352, 256, 30);
		jpnRegistro.add(txtCorreoElectronico);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setForeground(Color.LIGHT_GRAY);
		txtNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNombreUsuario.setColumns(10);
		txtNombreUsuario.setBounds(265, 208, 256, 30);
		jpnRegistro.add(txtNombreUsuario);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.setBackground(Color.WHITE);
		rdbtnRegular.setFont(new Font("Gill Sans MT", Font.BOLD, 21));
		rdbtnRegular.setBounds(371, 482, 104, 33);
		jpnRegistro.add(rdbtnRegular);
		
		JRadioButton rdbtnGold = new JRadioButton("Gold");
		rdbtnGold.setFont(new Font("Gill Sans MT", Font.BOLD, 21));
		rdbtnGold.setBackground(Color.WHITE);
		rdbtnGold.setBounds(594, 482, 73, 33);
		jpnRegistro.add(rdbtnGold);
		
		JRadioButton rdbtnPro = new JRadioButton("Pro");
		rdbtnPro.setFont(new Font("Gill Sans MT", Font.BOLD, 21));
		rdbtnPro.setBackground(Color.WHITE);
		rdbtnPro.setBounds(779, 481, 67, 34);
		jpnRegistro.add(rdbtnPro);
		
		JLabel lblMembresia = new JLabel("Selecciona tu tipo de membresia:");
		lblMembresia.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		lblMembresia.setBounds(459, 429, 357, 30);
		jpnRegistro.add(lblMembresia);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(230, 42, 810, 601);
		jpnRegistro.add(panel);
	}
}
