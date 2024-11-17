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
import co.edu.konradlorenz.view.*;

public class vntMenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelHorarios;
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
		contentPane.setLayout(new BorderLayout());

		
		JPanel head = new JPanel();
		head.setBackground(new Color(255, 0, 0));
		head.setBounds(0, 0, 1264, 82);
		contentPane.add(head);
		head.setLayout(null);
		
		JLabel lblTitulo = new JLabel("DarKaZo");
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 52));
		lblTitulo.setBounds(40, 11, 183, 60);
		head.add(lblTitulo);
		
		//Boton IniciarSesion
		JButton btnIniciarSesion = new JButton("Sign up");
		btnIniciarSesion.setForeground(new Color(255, 0, 0));
		btnIniciarSesion.setFont(new Font("Arial", Font.BOLD, 17));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnInicioSesion IniciarSesion = new vtnInicioSesion();
				IniciarSesion.setVisible(true);
				vntMenuPrincipal.this.setVisible(false);
			}
		});
		btnIniciarSesion.setBackground(new Color(255, 255, 255));
		btnIniciarSesion.setBounds(931, 25, 123, 32);
		head.add(btnIniciarSesion);
		
		//Boton registrarse
		JButton btnRegistrar = new JButton("Log in");
		btnRegistrar.setFont(new Font("Arial", Font.BOLD, 17));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnRegistrar registrar = new vtnRegistrar();
				registrar.setVisible(true);
				vntMenuPrincipal.this.setVisible(false);
			}
		});
		btnRegistrar.setBackground(new Color(255, 255, 255));
		btnRegistrar.setBounds(1088, 25, 123, 32);
		head.add(btnRegistrar);
		
		JPanel bodyPeliculas = new JPanel();
		bodyPeliculas.setBackground(new Color(255, 255, 255));
		bodyPeliculas.setBounds(0, 82, 1264, 679);
		contentPane.add(bodyPeliculas);
		bodyPeliculas.setLayout(null);
		
		JLabel lblVenomPoster = new JLabel("");
		lblVenomPoster.setBounds(44, 238, 200, 300);
		bodyPeliculas.add(lblVenomPoster);
		lblVenomPoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterVenom3.jpg")));
		
		JLabel lblEnCartelera = new JLabel("En Cartelera\r\n");
		lblEnCartelera.setForeground(new Color(185, 18, 0));
		lblEnCartelera.setFont(new Font("Impact", Font.PLAIN, 40));
		lblEnCartelera.setBackground(new Color(185, 18, 0));
		lblEnCartelera.setBounds(44, 159, 282, 68);
		bodyPeliculas.add(lblEnCartelera);
		
		JLabel lblRobotPoster = new JLabel("\r\n");
		lblRobotPoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterRobotSalvaje.jpg")));
		lblRobotPoster.setBounds(285, 238, 220, 300);
		bodyPeliculas.add(lblRobotPoster);
		
		JLabel lblElTIempoQuePoster = new JLabel("\r\n");
		lblElTIempoQuePoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/elTiempoQueTenemosPoster.jpg")));
		lblElTIempoQuePoster.setBounds(539, 238, 220, 300);
		bodyPeliculas.add(lblElTIempoQuePoster);
		
		JLabel lblLaSustanciaPoster = new JLabel("");
		lblLaSustanciaPoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterLaSustancia.png")));
		lblLaSustanciaPoster.setBounds(785, 238, 200, 300);
		bodyPeliculas.add(lblLaSustanciaPoster);
		
		JLabel lblCodigoTrajePoster = new JLabel("New label");
		lblCodigoTrajePoster.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterCodigoTrajeRojo.png")));
		lblCodigoTrajePoster.setBounds(1015, 238, 200, 300);
		bodyPeliculas.add(lblCodigoTrajePoster);
		
		JLabel lblTextoVenom = new JLabel("Venom 3 El ultimo Baile");
		lblTextoVenom.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoVenom.setBounds(57, 549, 187, 32);
		bodyPeliculas.add(lblTextoVenom);
		
		JLabel lblTextoRobot = new JLabel("Robot Salvaje");
		lblTextoRobot.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoRobot.setBounds(338, 554, 117, 22);
		bodyPeliculas.add(lblTextoRobot);
		
		JLabel lblTextoElTiempo = new JLabel("El Tiempo Que Tenemos");
		lblTextoElTiempo.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoElTiempo.setBounds(541, 554, 194, 22);
		bodyPeliculas.add(lblTextoElTiempo);
		
		JLabel lblTextoLaSustancia = new JLabel("La Sustancia");
		lblTextoLaSustancia.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoLaSustancia.setBounds(833, 554, 117, 22);
		bodyPeliculas.add(lblTextoLaSustancia);
		
		JLabel lblTextoTrajeRojo = new JLabel("Código Traje Rojo");
		lblTextoTrajeRojo.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTextoTrajeRojo.setBounds(1042, 554, 150, 22);
		bodyPeliculas.add(lblTextoTrajeRojo);
		
		JButton btnHorariosVenom = new JButton("VER HORARIOS");
		btnHorariosVenom.setForeground(new Color(64, 0, 64));
		btnHorariosVenom.setFont(new Font("Gill Sans MT", Font.BOLD, 11));
		btnHorariosVenom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HorariosVenom3 hVenom3 = new HorariosVenom3();

		        contentPane.removeAll(); // Elimina todos los componentes actuales
		        contentPane.add(hVenom3, BorderLayout.CENTER); // Agrega el nuevo panel
		        contentPane.revalidate(); // Valida el nuevo layout
		        contentPane.repaint(); // Redibuja el JFrame
			}
		});
		btnHorariosVenom.setBackground(new Color(255, 0, 0));
		btnHorariosVenom.setBounds(83, 592, 123, 32);
		bodyPeliculas.add(btnHorariosVenom);
		
		JButton btnHorariosRobot = new JButton("VER HORARIOS");
		btnHorariosRobot.setFont(new Font("Gill Sans MT", Font.BOLD, 11));
		btnHorariosRobot.setBackground(new Color(255, 0, 0));
		btnHorariosRobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHorariosRobot.setBounds(327, 592, 123, 32);
		bodyPeliculas.add(btnHorariosRobot);
		
		JButton btnHorarioElTiempo = new JButton("VER HORARIOS");
		btnHorarioElTiempo.setFont(new Font("Gill Sans MT", Font.BOLD, 11));
		btnHorarioElTiempo.setBackground(new Color(255, 0, 0));
		btnHorarioElTiempo.setBounds(575, 592, 123, 32);
		bodyPeliculas.add(btnHorarioElTiempo);
		
		JButton btnHorariosLaSustancia = new JButton("VER HORARIOS");
		btnHorariosLaSustancia.setFont(new Font("Gill Sans MT", Font.BOLD, 11));
		btnHorariosLaSustancia.setBackground(new Color(255, 0, 0));
		btnHorariosLaSustancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHorariosLaSustancia.setBounds(827, 592, 123, 32);
		bodyPeliculas.add(btnHorariosLaSustancia);
		
		JButton btnHorariosTrajeRojo = new JButton("VER HORARIOS");
		btnHorariosTrajeRojo.setFont(new Font("Gill Sans MT", Font.BOLD, 11));
		btnHorariosTrajeRojo.setBackground(new Color(255, 0, 0));
		btnHorariosTrajeRojo.setBounds(1056, 592, 123, 32);
		bodyPeliculas.add(btnHorariosTrajeRojo);
		
		JLabel lblTextoBienvenida = new JLabel("Bienvenid@ a DarKaZoFilms!");
		lblTextoBienvenida.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		lblTextoBienvenida.setBounds(442, 52, 376, 32);
		bodyPeliculas.add(lblTextoBienvenida);
		
		
        
	}
	
	 // Método para mostrar horarios en el panel dinámico
    private void mostrarHorarios(String pelicula) {
        // Cambiar contenido del panel según la película seleccionada
        JLabel lblTituloPelicula = new JLabel("Horarios de " + pelicula);
        lblTituloPelicula.setFont(new Font("Impact", Font.PLAIN, 25));
        lblTituloPelicula.setBounds(50, 10, 400, 30);

        panelHorarios.removeAll(); // Limpiar contenido previo
        panelHorarios.add(lblTituloPelicula);

        // Añadir horarios (ejemplo estático)
        JLabel lblHorario1 = new JLabel("14:00 - Sala 1");
        lblHorario1.setFont(new Font("Arial", Font.PLAIN, 18));
        lblHorario1.setBounds(50, 60, 200, 30);
        panelHorarios.add(lblHorario1);

        JLabel lblHorario2 = new JLabel("16:30 - Sala 2");
        lblHorario2.setFont(new Font("Arial", Font.PLAIN, 18));
        lblHorario2.setBounds(50, 100, 200, 30);
        panelHorarios.add(lblHorario2);

        // Mostrar el panel
        panelHorarios.revalidate();
        panelHorarios.repaint();
        panelHorarios.setVisible(true);
    }
}
