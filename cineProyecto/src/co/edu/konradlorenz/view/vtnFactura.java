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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vtnFactura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vtnFactura frame = new vtnFactura();
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
	public vtnFactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1273, 810);
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
		jpnFactura.setBounds(268, 143, 725, 569);
		contentPane.add(jpnFactura);
		
		JButton btnIngresarInicioSesion = new JButton("Volver al Inicio");
		btnIngresarInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vntMenuPrincipal Menu = new vntMenuPrincipal();
				Menu.setVisible(true);
				vtnFactura.this.setVisible(false);
			}
		});
		btnIngresarInicioSesion.setForeground(Color.BLACK);
		btnIngresarInicioSesion.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		btnIngresarInicioSesion.setBackground(Color.RED);
		btnIngresarInicioSesion.setBounds(268, 499, 209, 44);
		jpnFactura.add(btnIngresarInicioSesion);
		
		JLabel lblFecha = new JLabel("Fecha:\r\n");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFecha.setBounds(126, 148, 209, 30);
		jpnFactura.add(lblFecha);
		
		JLabel lblFactura = new JLabel("Factura\r\n");
		lblFactura.setFont(new Font("Gill Sans MT", Font.BOLD, 40));
		lblFactura.setBounds(298, 11, 152, 71);
		jpnFactura.add(lblFactura);
		
		JLabel lblNombre = new JLabel("Nombre:\r\n");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNombre.setBounds(126, 189, 209, 30);
		jpnFactura.add(lblNombre);
		
		JLabel lblPelicula = new JLabel("Pelicula:\r\n");
		lblPelicula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPelicula.setBounds(126, 230, 209, 30);
		jpnFactura.add(lblPelicula);
		
		JLabel lblTeatro_1 = new JLabel("Teatro:");
		lblTeatro_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTeatro_1.setBounds(126, 271, 209, 30);
		jpnFactura.add(lblTeatro_1);
		
		JLabel lblFuncion = new JLabel("Función:");
		lblFuncion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFuncion.setBounds(126, 312, 209, 30);
		jpnFactura.add(lblFuncion);
		
		JLabel lblAsientos = new JLabel("Asientos:");
		lblAsientos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAsientos.setBounds(126, 353, 209, 30);
		jpnFactura.add(lblAsientos);
		
		JLabel lblMetodoPago = new JLabel("Método de Pago:");
		lblMetodoPago.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMetodoPago.setBounds(126, 394, 209, 30);
		jpnFactura.add(lblMetodoPago);
		
		JLabel lblTransaccionAprobada = new JLabel("Transacción Aprobada");
		lblTransaccionAprobada.setFont(new Font("Gill Sans MT", Font.BOLD, 25));
		lblTransaccionAprobada.setBounds(237, 69, 273, 71);
		jpnFactura.add(lblTransaccionAprobada);
		
		JLabel lblTotal = new JLabel("Total:\r\n");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotal.setBounds(126, 435, 209, 30);
		jpnFactura.add(lblTotal);
	}
}
