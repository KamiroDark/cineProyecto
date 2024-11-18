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
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vtnInicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCorreoElectrnico;
	private JPasswordField pswContrasena;
	private JButton btnIngresarInicioSesion;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public vtnInicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1281, 801);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnMenu = new JPanel();
		jpnMenu.setBackground(new Color(255, 0, 0));
		jpnMenu.setForeground(new Color(255, 0, 0));
		jpnMenu.setBounds(0, 0, 1264, 90);
		contentPane.add(jpnMenu);
		jpnMenu.setLayout(null);
		
		JLabel lblTitulo = new JLabel("DarKaZo");
		lblTitulo.setBounds(10, 11, 176, 64);
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 52));
		jpnMenu.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(280, 35, 61, 22);
		jpnMenu.add(lblNewLabel);
		
		JLabel lblCartelera = new JLabel("Cartelera");
		lblCartelera.setForeground(Color.WHITE);
		lblCartelera.setFont(new Font("Arial", Font.BOLD, 18));
		lblCartelera.setBounds(460, 35, 85, 22);
		jpnMenu.add(lblCartelera);
		
		JLabel lblTeatro = new JLabel("Teatro");
		lblTeatro.setForeground(Color.WHITE);
		lblTeatro.setFont(new Font("Arial", Font.BOLD, 18));
		lblTeatro.setBounds(659, 35, 61, 22);
		jpnMenu.add(lblTeatro);
		
		JPanel jpnIniciarSesion = new JPanel();
		jpnIniciarSesion.setBackground(new Color(255, 255, 255));
		jpnIniciarSesion.setBounds(0, 90, 1264, 672);
		contentPane.add(jpnIniciarSesion);
		jpnIniciarSesion.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(263, 89, 725, 493);
		jpnIniciarSesion.add(panel);
		panel.setLayout(null);
		
		btnIngresarInicioSesion = new JButton("Ingresar");
		btnIngresarInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIngresarInicioSesion.setBounds(281, 359, 152, 44);
		panel.add(btnIngresarInicioSesion);
		btnIngresarInicioSesion.setForeground(Color.BLACK);
		btnIngresarInicioSesion.setBackground(Color.RED);
		btnIngresarInicioSesion.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		
		JLabel lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setBounds(207, 245, 127, 30);
		panel.add(lblContrasena);
		lblContrasena.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		
		pswContrasena = new JPasswordField();
		pswContrasena.setBounds(383, 248, 227, 30);
		panel.add(pswContrasena);
		pswContrasena.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pswContrasena.setForeground(new Color(192, 192, 192));
		pswContrasena.setToolTipText("Contraseña");
		
		JLabel lblCorreoElectronico = new JLabel("Correo electrónico:");
		lblCorreoElectronico.setBounds(125, 164, 209, 30);
		panel.add(lblCorreoElectronico);
		lblCorreoElectronico.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.setBounds(383, 167, 227, 30);
		panel.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setForeground(new Color(192, 192, 192));
		txtCorreoElectrnico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCorreoElectrnico.setColumns(10);
		
		JLabel lblIniciarSesion = new JLabel("Iniciar Sesión");
		lblIniciarSesion.setBounds(232, 50, 249, 71);
		panel.add(lblIniciarSesion);
		lblIniciarSesion.setFont(new Font("Gill Sans MT", Font.BOLD, 40));
	}
}
