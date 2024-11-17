package co.edu.konradlorenz.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class vntMenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public vntMenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(UIManager.getBorder("ToolTip.border"));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 1264, 82);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("DarKaZo");
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 52));
		lblTitulo.setBounds(40, 11, 183, 60);
		panel.add(lblTitulo);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesión");
		btnIniciarSesion.setBackground(new Color(255, 255, 255));
		btnIniciarSesion.setBounds(931, 25, 123, 32);
		panel.add(btnIniciarSesion);
		
		JButton btnRegistrar = new JButton("Registrarse");
		btnRegistrar.setBackground(new Color(255, 255, 255));
		btnRegistrar.setBounds(1088, 25, 123, 32);
		panel.add(btnRegistrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 82, 1264, 679);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblVenomPoster = new JLabel("");
		lblVenomPoster.setBounds(45, 161, 200, 300);
		panel_1.add(lblVenomPoster);
		lblVenomPoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterVenom3.jpg")));
		
		JLabel lblEnCartelera = new JLabel("En Cartelera\r\n");
		lblEnCartelera.setForeground(new Color(185, 18, 0));
		lblEnCartelera.setFont(new Font("Impact", Font.PLAIN, 40));
		lblEnCartelera.setBackground(new Color(185, 18, 0));
		lblEnCartelera.setBounds(45, 82, 282, 68);
		panel_1.add(lblEnCartelera);
		
		JLabel lblRobotPoster = new JLabel("\r\n");
		lblRobotPoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterRobotSalvaje.jpg")));
		lblRobotPoster.setBounds(280, 161, 220, 300);
		panel_1.add(lblRobotPoster);
		
		JLabel lblElTIempoQuePoster = new JLabel("\r\n");
		lblElTIempoQuePoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/elTiempoQueTenemosPoster.jpg")));
		lblElTIempoQuePoster.setBounds(531, 161, 220, 300);
		panel_1.add(lblElTIempoQuePoster);
		
		JLabel lblLaSustanciaPoster = new JLabel("");
		lblLaSustanciaPoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterLaSustancia.png")));
		lblLaSustanciaPoster.setBounds(783, 161, 200, 300);
		panel_1.add(lblLaSustanciaPoster);
		
		JLabel lblCodigoTrajePoster = new JLabel("New label");
		lblCodigoTrajePoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterCodigoTrajeRojo.png")));
		lblCodigoTrajePoster.setBounds(1016, 161, 200, 300);
		panel_1.add(lblCodigoTrajePoster);
		
		JLabel lblTextoVenom = new JLabel("Venom 3 El ultimo Baile");
		lblTextoVenom.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoVenom.setBounds(55, 462, 187, 32);
		panel_1.add(lblTextoVenom);
		
		JLabel lblTextoRobot = new JLabel("Robot Salvaje");
		lblTextoRobot.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoRobot.setBounds(333, 467, 117, 22);
		panel_1.add(lblTextoRobot);
		
		JLabel lblTextoElTiempo = new JLabel("El Tiempo Que Tenemos");
		lblTextoElTiempo.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoElTiempo.setBounds(541, 467, 194, 22);
		panel_1.add(lblTextoElTiempo);
		
		JLabel lblTextoLaSustancia = new JLabel("La Sustancia");
		lblTextoLaSustancia.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoLaSustancia.setBounds(833, 467, 117, 22);
		panel_1.add(lblTextoLaSustancia);
		
		JLabel lblTextoTrajeRojo = new JLabel("Código Traje Rojo");
		lblTextoTrajeRojo.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoTrajeRojo.setBounds(1045, 467, 150, 22);
		panel_1.add(lblTextoTrajeRojo);
		
		JButton btnHorariosVenom = new JButton("VER HORARIOS");
		btnHorariosVenom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHorariosVenom.setBackground(new Color(255, 0, 0));
		btnHorariosVenom.setBounds(83, 505, 123, 32);
		panel_1.add(btnHorariosVenom);
		
		JButton btnHorariosRobot = new JButton("VER HORARIOS");
		btnHorariosRobot.setBackground(new Color(255, 0, 0));
		btnHorariosRobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHorariosRobot.setBounds(327, 505, 123, 32);
		panel_1.add(btnHorariosRobot);
		
		JButton btnHorarioElTiempo = new JButton("VER HORARIOS");
		btnHorarioElTiempo.setBackground(new Color(255, 0, 0));
		btnHorarioElTiempo.setBounds(575, 505, 123, 32);
		panel_1.add(btnHorarioElTiempo);
		
		JButton btnHorariosLaSustancia = new JButton("VER HORARIOS");
		btnHorariosLaSustancia.setBackground(new Color(255, 0, 0));
		btnHorariosLaSustancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHorariosLaSustancia.setBounds(821, 505, 123, 32);
		panel_1.add(btnHorariosLaSustancia);
		
		JButton btnHorariosTrajeRojo = new JButton("VER HORARIOS");
		btnHorariosTrajeRojo.setBackground(new Color(255, 0, 0));
		btnHorariosTrajeRojo.setBounds(1055, 505, 123, 32);
		panel_1.add(btnHorariosTrajeRojo);
		
		JLabel lblTextoBienvenida = new JLabel("Bienvenid@ a DarKaZoFilms!");
		lblTextoBienvenida.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		lblTextoBienvenida.setBounds(442, 52, 376, 32);
		panel_1.add(lblTextoBienvenida);
	}
}
