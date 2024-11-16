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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 82, 1264, 679);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(45, 161, 200, 300);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterVenom3.jpg")));
		
		JLabel lblNewLabel_1 = new JLabel("En Cartelera\r\n");
		lblNewLabel_1.setForeground(new Color(185, 18, 0));
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 40));
		lblNewLabel_1.setBackground(new Color(185, 18, 0));
		lblNewLabel_1.setBounds(45, 82, 282, 68);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterRobotSalvaje.jpg")));
		lblNewLabel_2.setBounds(280, 161, 220, 300);
		panel_1.add(lblNewLabel_2);
		
		JLabel label = new JLabel("\r\n");
		label.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/elTiempoQueTenemosPoster.jpg")));
		label.setBounds(531, 161, 220, 300);
		panel_1.add(label);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterLaSustancia.png")));
		lblNewLabel_3.setBounds(783, 161, 200, 300);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(vntMenuPrincipal.class.getResource("/co/edu/konradlorenz/view/images/posterCodigoTrajeRojo.png")));
		lblNewLabel_4.setBounds(1016, 161, 200, 300);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Venom 3 El ultimo Baile");
		lblNewLabel_5.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(55, 462, 187, 32);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Robot Salvaje");
		lblNewLabel_6.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(333, 467, 117, 22);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("El Tiempo Que Tenemos");
		lblNewLabel_7.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(541, 467, 194, 22);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("La Sustancia");
		lblNewLabel_8.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(833, 467, 117, 22);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Código Traje Rojo");
		lblNewLabel_9.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(1045, 467, 150, 22);
		panel_1.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("VER HORARIOS");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(79, 505, 123, 32);
		panel_1.add(btnNewButton);
	}
}
