package co.edu.konradlorenz.view;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import co.edu.konradlorenz.model.Cine;
import co.edu.konradlorenz.model.Funcion;
import co.edu.konradlorenz.model.Pelicula;
import co.edu.konradlorenz.model.SalaCine;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuBar;

public class HorarioRobotSalvaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private ButtonGroup grupoFunciones = new ButtonGroup();
	private Cine cine;
	private Funcion funcionSeleccionada;

	/**
	 * Create the panel.
	 */
	public HorarioRobotSalvaje() {
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		setPreferredSize(new Dimension(1265, 681)); 

		crearCineYFunciones();

		JPanel head = new JPanel();
		head.setBackground(new Color(255, 0, 0));
		head.setBounds(0, 0, 1264, 82);
		add(head);
		head.setLayout(null);

		JLabel lblTitulo = new JLabel("DarKaZo");
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 52));
		lblTitulo.setBounds(40, 11, 183, 60);
		head.add(lblTitulo);

		JButton btnIniciarSesion = new JButton("Log in");
		btnIniciarSesion.setFont(new Font("Arial", Font.BOLD, 17));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnInicioSesion IniciarSesion = new vtnInicioSesion();
				IniciarSesion.setVisible(true);
				
				Window win = SwingUtilities.windowForComponent(HorarioRobotSalvaje.this);
				if (win != null) {
					win.setVisible(false);
					win.dispose(); 
				}
			}
		});
		btnIniciarSesion.setBackground(new Color(255, 255, 255));
		btnIniciarSesion.setBounds(931, 25, 123, 32);
		head.add(btnIniciarSesion);

	
		JButton btnRegistrar = new JButton("Sign up");
		btnRegistrar.setForeground(new Color(255, 0, 0));
		btnRegistrar.setFont(new Font("Arial", Font.BOLD, 17));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnRegistrar registrar = new vtnRegistrar();
				registrar.setVisible(true);

				Window win = SwingUtilities.windowForComponent(HorarioRobotSalvaje.this);
				if (win != null) {
					win.setVisible(false);
					win.dispose();
				}
			}
		});
		btnRegistrar.setBackground(new Color(255, 255, 255));
		btnRegistrar.setBounds(1088, 25, 123, 32);
		head.add(btnRegistrar);

	
		JLabel lblRobotPoster = new JLabel("");
		lblRobotPoster.setIcon(
				new ImageIcon(HorarioRobotSalvaje.class.getResource("/co/edu/konradlorenz/view/images/posterRobotSalvaje.jpg")));
		lblRobotPoster.setBounds(100, 114, 200, 300);
		add(lblRobotPoster);

		JLabel lblTextoRobot = new JLabel("Robot Salvaje");
		lblTextoRobot.setFont(new Font("Impact", Font.PLAIN, 50));
		lblTextoRobot.setBounds(337, 114, 516, 50);
		add(lblTextoRobot);

		JLabel lblTeatro = new JLabel("Teatro: Niza");
		lblTeatro.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
		lblTeatro.setBounds(100, 425, 200, 24);
		add(lblTeatro);

		JLabel lblGenero = new JLabel("Genero: Ciencia ficción, Aventura");
		lblGenero.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
		lblGenero.setBounds(100, 448, 273, 24);
		add(lblGenero);

		JLabel lblDuracion = new JLabel("Duracion: 101 min\r\n");
		lblDuracion.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
		lblDuracion.setBounds(100, 471, 200, 24);
		add(lblDuracion);

		JLabel lblClasificacion = new JLabel("Clasificacion: 7-A");
		lblClasificacion.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
		lblClasificacion.setBounds(100, 495, 200, 24);
		add(lblClasificacion);

		JLabel lblDescripcion = new JLabel(
				"<html>Dirigida por Chris Sanders y basada en el libro homónimo de Peter Brown, cuenta la historia de Roz, una robot de la unidad ROZZUM 7134, que naufraga en una isla deshabitada. Roz debe adaptarse a este entorno salvaje, aprendiendo a relacionarse con los animales locales. Con el tiempo, se convierte en la madre adoptiva de un ganso huérfano, lo que desencadena una conmovedora exploración del vínculo entre la tecnología y la naturaleza.</html>");
		lblDescripcion.setFont(new Font("Arial", Font.BOLD, 15));
		lblDescripcion.setBounds(337, 197, 581, 103);
		add(lblDescripcion);

		Pelicula peliculaRobot = new Pelicula("Robot Salvaje", "7-A", "Ciencia ficción, Aventura", 110);

		List<Funcion> funciones = new ArrayList<>();

		SalaCine sala1 = new SalaCine("Sala 1", 10, 15); 
		SalaCine sala2 = new SalaCine("Sala 2", 8, 12); 

		funciones.add(new Funcion(sala1, "12:00 PM", peliculaRobot));
		funciones.add(new Funcion(sala1, "3:00 PM", peliculaRobot));
		funciones.add(new Funcion(sala2, "6:00 PM", peliculaRobot));

		int yPosition = 300; 
		for (Funcion funcion : funciones) {
			JRadioButton radioButton = new JRadioButton(
					funcion.getHorario() + " - " + funcion.getSala().getNombreSala());
			radioButton.setBounds(400, yPosition, 250, 30);
			radioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					funcionSeleccionada = funcion;
				}
			});
			grupoFunciones.add(radioButton);
			add(radioButton);
			yPosition += 40; 
		}
		revalidate(); 
		repaint();

	
		JButton btnConfirmar = new JButton("Confirmar selección");
		btnConfirmar.setForeground(new Color(255, 255, 255));
		btnConfirmar.setBackground(new Color(255, 0, 0));
		btnConfirmar.setFont(new Font("Arial", Font.BOLD, 17));
		btnConfirmar.setBounds(506, 566, 200, 30);
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (funcionSeleccionada != null) {
					
					JOptionPane.showMessageDialog(null,
							"Has seleccionado la función: " + funcionSeleccionada.getHorario());
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, selecciona una función.");
				}
			}
		});
		add(btnConfirmar);
		
		JButton btnAtras = new JButton("Regresar");
		btnAtras.setForeground(new Color(64, 0, 64));
		btnAtras.setFont(new Font("Arial", Font.BOLD, 17));
		btnAtras.setBackground(Color.RED);
		btnAtras.setBounds(10, 640, 150, 30);
		add(btnAtras);

	}

	private void crearCineYFunciones() {
	
		Pelicula peliculaRobot = new Pelicula("Robot Salvaje", "7-A", "Ciencia ficción, Aventura", 110);

	
		List<Funcion> funciones = new ArrayList<>();

		SalaCine sala1 = new SalaCine("Sala 1", 10, 15);
		SalaCine sala2 = new SalaCine("Sala 2", 8, 12); 

		funciones.add(new Funcion(sala1, "12:00 PM", peliculaRobot));
		funciones.add(new Funcion(sala1, "3:00 PM", peliculaRobot));
		funciones.add(new Funcion(sala2, "6:00 PM", peliculaRobot));

		cine = new Cine("Teatro Niza", "Calle Ficticia 123", funciones);

		
	}
}