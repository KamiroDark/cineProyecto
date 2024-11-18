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

public class HorariosVenom3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private ButtonGroup grupoFunciones = new ButtonGroup();
	private Cine cine;
	private Funcion funcionSeleccionada;

	/**
	 * Create the panel.
	 */
	public HorariosVenom3() {
		// Eliminar contentPane, ya que no lo necesitas en este contexto
		setLayout(null);
		setBackground(new Color(255, 255, 255)); // Color de fondo para pruebas visuales
		setPreferredSize(new Dimension(1265, 680)); // Ajusta las dimensiones aquí

		crearCineYFunciones();

		// Crear y agregar el encabezado directamente al panel actual
		JPanel head = new JPanel();
		head.setBackground(new Color(255, 0, 0));
		head.setBounds(0, 0, 1264, 82);
		add(head); // Se agrega al propio JPanel de HorariosVenom3
		head.setLayout(null);

		JLabel lblTitulo = new JLabel("DarKaZo");
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 52));
		lblTitulo.setBounds(40, 11, 183, 60);
		head.add(lblTitulo);

		// Botón IniciarSesion
		JButton btnIniciarSesion = new JButton("Log in");
		btnIniciarSesion.setFont(new Font("Arial", Font.BOLD, 17));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Crear la ventana de inicio de sesión
				vtnInicioSesion IniciarSesion = new vtnInicioSesion();
				IniciarSesion.setVisible(true); // Hacer visible la ventana de inicio de sesión

				// Cerrar o esconder la ventana actual (HorariosVenom3)
				// Si el panel HorariosVenom3 es parte de un JFrame, ocultar este JFrame
				// Si HorariosVenom3 es el principal, entonces cierra la ventana de la siguiente
				// manera:
				Window win = SwingUtilities.windowForComponent(HorariosVenom3.this);
				if (win != null) {
					win.setVisible(false); // Hacer invisible la ventana
					win.dispose(); // Liberar recursos de la ventana
				}
			}
		});
		btnIniciarSesion.setBackground(new Color(255, 255, 255));
		btnIniciarSesion.setBounds(931, 25, 123, 32);
		head.add(btnIniciarSesion);

		// Botón Registrarse
		JButton btnRegistrar = new JButton("Sign up");
		btnRegistrar.setForeground(new Color(255, 0, 0));
		btnRegistrar.setFont(new Font("Arial", Font.BOLD, 17));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnRegistrar registrar = new vtnRegistrar();
				registrar.setVisible(true);

				Window win = SwingUtilities.windowForComponent(HorariosVenom3.this);
				if (win != null) {
					win.setVisible(false);
					win.dispose();
				}
			}
		});
		btnRegistrar.setBackground(new Color(255, 255, 255));
		btnRegistrar.setBounds(1088, 25, 123, 32);
		head.add(btnRegistrar);

		// Otros componentes de la clase HorariosVenom3
		JLabel lblVenomPoster = new JLabel("");
		lblVenomPoster.setIcon(
				new ImageIcon(HorariosVenom3.class.getResource("/co/edu/konradlorenz/view/images/posterVenom3.jpg")));
		lblVenomPoster.setBounds(100, 114, 200, 300);
		add(lblVenomPoster);

		JLabel lblTextoVenom = new JLabel("Venom 3 El ultimo Baile");
		lblTextoVenom.setFont(new Font("Impact", Font.PLAIN, 50));
		lblTextoVenom.setBounds(337, 114, 516, 50);
		add(lblTextoVenom);

		JLabel lblTeatro = new JLabel("Teatro: Niza");
		lblTeatro.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
		lblTeatro.setBounds(100, 425, 200, 24);
		add(lblTeatro);

		JLabel lblGenero = new JLabel("Genero: Acción");
		lblGenero.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
		lblGenero.setBounds(100, 448, 200, 24);
		add(lblGenero);

		JLabel lblDuracion = new JLabel("Duracion: 110 min\r\n");
		lblDuracion.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
		lblDuracion.setBounds(100, 471, 200, 24);
		add(lblDuracion);

		JLabel lblClasificacion = new JLabel("Clasificacion: 12-A");
		lblClasificacion.setFont(new Font("Gill Sans MT", Font.BOLD, 17));
		lblClasificacion.setBounds(100, 495, 200, 24);
		add(lblClasificacion);

		JLabel lblDescripcion = new JLabel(
				"<html>En Venom: El Último Baile, Tom Hardy regresa como Venom, uno de los personajes más grandes y complejos de Marvel, para la última película de la trilogía. Eddie y Venom están huyendo. Perseguidos por sus dos mundos, el dúo se ve obligado a tomar una decisión devastadora que bajará el telón en un último baile entre Venom y Eddie.</html>");
		lblDescripcion.setFont(new Font("Arial", Font.BOLD, 15));
		lblDescripcion.setBounds(337, 197, 516, 103);
		add(lblDescripcion);

		Pelicula peliculaVenom = new Pelicula("Venom 3: El Último Baile", "12-A", "Acción", 110);

		List<Funcion> funciones = new ArrayList<>();

		SalaCine sala1 = new SalaCine("Sala 1", 10, 15); // 10 filas, 15 columnas
		SalaCine sala2 = new SalaCine("Sala 2", 8, 12); // 8 filas, 12 columnas

		funciones.add(new Funcion(sala1, "12:00 PM", peliculaVenom));
		funciones.add(new Funcion(sala1, "3:00 PM", peliculaVenom));
		funciones.add(new Funcion(sala2, "6:00 PM", peliculaVenom));

		int yPosition = 300; // Comenzamos desde una posición vertical
		for (Funcion funcion : funciones) {
			JRadioButton radioButton = new JRadioButton(
					funcion.getHorario() + " - " + funcion.getSala().getNombreSala());
			radioButton.setBounds(400, yPosition, 250, 30); // Cambiar la posición vertical
			radioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					funcionSeleccionada = funcion; // Guardar la función seleccionada
				}
			});
			grupoFunciones.add(radioButton); // Agregar al ButtonGroup
			add(radioButton);
			yPosition += 40; // Incrementar la posición para los siguientes botones
		}
		revalidate(); // Asegurarse de que el panel se redibuje después de agregar los componentes
		repaint();

		// Botón Confirmar selección
		JButton btnConfirmar = new JButton("Confirmar selección");
		btnConfirmar.setForeground(new Color(255, 255, 255));
		btnConfirmar.setBackground(new Color(255, 0, 0));
		btnConfirmar.setFont(new Font("Arial", Font.BOLD, 17));
		btnConfirmar.setBounds(506, 566, 200, 30);
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnAsientos Asientos = new vtnAsientos();
				Asientos.setVisible(true);
				HorariosVenom3.this.setVisible(false);
				if (funcionSeleccionada != null) {
					// Aquí se muestra la función seleccionada
					JOptionPane.showMessageDialog(null,
							"Has seleccionado la función: " + funcionSeleccionada.getHorario());
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, selecciona una función.");
				}
			}
		});
		add(btnConfirmar);
		
		JButton btnAtras = new JButton("Regresar");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vntMenuPrincipal Menu = new vntMenuPrincipal();
				Menu.setVisible(true);
				HorariosVenom3.this.setVisible(false);
			}
		});
		btnAtras.setForeground(new Color(0, 0, 0));
		btnAtras.setBackground(new Color(255, 0, 0));
		btnAtras.setFont(new Font("Arial", Font.BOLD, 17));
		btnAtras.setBounds(10, 639, 150, 30);
		add(btnAtras);

	}

	private void crearCineYFunciones() {
		// Crear la película
		Pelicula peliculaVenom = new Pelicula("Venom 3: El Último Baile", "12-A", "Acción", 110);

		// Crear las funciones
		List<Funcion> funciones = new ArrayList<>();

		// Suponiendo que tienes una sala de cine (SalaCine) ya definida
		SalaCine sala1 = new SalaCine("Sala 1", 10, 15); // 10 filas, 15 columnas
		SalaCine sala2 = new SalaCine("Sala 2", 8, 12); // 8 filas, 12 columnas

		// Crear las funciones
		funciones.add(new Funcion(sala1, "12:00 PM", peliculaVenom));
		funciones.add(new Funcion(sala1, "3:00 PM", peliculaVenom));
		funciones.add(new Funcion(sala2, "6:00 PM", peliculaVenom));

		// Crear el cine con el teatro y las funciones
		cine = new Cine("Teatro Niza", "Calle Ficticia 123", funciones);

		// Ahora la información de cine está guardada en el objeto cine
		// Puedes acceder a las funciones, teatro, etc. a través de los métodos de cine
	}
}
