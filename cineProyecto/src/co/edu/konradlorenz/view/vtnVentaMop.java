package co.edu.konradlorenz.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vtnVentaMop extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vtnVentaMop frame = new vtnVentaMop();
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
	public vtnVentaMop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1273, 772);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnMenu = new JPanel();
		jpnMenu.setLayout(null);
		jpnMenu.setForeground(Color.RED);
		jpnMenu.setBackground(Color.RED);
		jpnMenu.setBounds(0, 0, 1264, 90);
		contentPane.add(jpnMenu);
		
		JLabel lblTitulo = new JLabel("DarKaZo");
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 52));
		lblTitulo.setBounds(10, 11, 176, 64);
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
		
		JPanel jpnFactura = new JPanel();
		jpnFactura.setLayout(null);
		jpnFactura.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		jpnFactura.setBackground(Color.WHITE);
		jpnFactura.setBounds(266, 129, 725, 569);
		contentPane.add(jpnFactura);
		
		JButton btnIngresarInicioSesion = new JButton("Continuar\r\n");
		btnIngresarInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnFactura Factura = new vtnFactura();
				Factura.setVisible(true);
				vtnVentaMop.this.setVisible(false);
			}
		});
		btnIngresarInicioSesion.setForeground(Color.BLACK);
		btnIngresarInicioSesion.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		btnIngresarInicioSesion.setBackground(Color.RED);
		btnIngresarInicioSesion.setBounds(291, 470, 161, 44);
		jpnFactura.add(btnIngresarInicioSesion);
		
		JLabel lblFecha = new JLabel("Fecha:\r\n");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFecha.setBounds(124, 103, 209, 30);
		jpnFactura.add(lblFecha);
		
		JLabel lblFactura = new JLabel("Carrito De Compras");
		lblFactura.setFont(new Font("Gill Sans MT", Font.BOLD, 40));
		lblFactura.setBounds(172, 11, 393, 71);
		jpnFactura.add(lblFactura);
		
		JLabel lblPelicula = new JLabel("Pelicula:\r\n");
		lblPelicula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPelicula.setBounds(124, 144, 209, 30);
		jpnFactura.add(lblPelicula);
		
		JLabel lblTeatro_1 = new JLabel("Teatro:");
		lblTeatro_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTeatro_1.setBounds(124, 185, 209, 30);
		jpnFactura.add(lblTeatro_1);
		
		JLabel lblFuncion = new JLabel("Función:");
		lblFuncion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFuncion.setBounds(124, 226, 209, 30);
		jpnFactura.add(lblFuncion);
		
		JLabel lblAsientos = new JLabel("Asientos:");
		lblAsientos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAsientos.setBounds(124, 267, 209, 30);
		jpnFactura.add(lblAsientos);
		
		JLabel lblTotalAPagar = new JLabel("Total\r\n A Pagar:");
		lblTotalAPagar.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalAPagar.setBounds(124, 308, 384, 52);
		jpnFactura.add(lblTotalAPagar);
		
		JLabel lblElijaUnMetodo = new JLabel("Elija un Metodo de Pago:");
		lblElijaUnMetodo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblElijaUnMetodo.setBounds(124, 371, 259, 52);
		jpnFactura.add(lblElijaUnMetodo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tarjeta de Credito", "Tarjeta de Debito", "PSE"}));
		comboBox.setBounds(393, 390, 143, 22);
		jpnFactura.add(comboBox);
		
		JButton btnNoDeseoContinuar = new JButton("No deseo Continuar");
		btnNoDeseoContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnAsientos Asientos = new vtnAsientos();
				Asientos.setVisible(true);
				vtnVentaMop.this.setVisible(false);
			}
		});
		btnNoDeseoContinuar.setForeground(Color.BLACK);
		btnNoDeseoContinuar.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
		btnNoDeseoContinuar.setBackground(Color.RED);
		btnNoDeseoContinuar.setBounds(291, 525, 161, 22);
		jpnFactura.add(btnNoDeseoContinuar);
	}
}
