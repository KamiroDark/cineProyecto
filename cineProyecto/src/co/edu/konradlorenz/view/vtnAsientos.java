package co.edu.konradlorenz.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class vtnAsientos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vtnAsientos frame = new vtnAsientos();
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
	public vtnAsientos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 896);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnMenu = new JPanel();
		jpnMenu.setBounds(0, 0, 1193, 87);
		contentPane.add(jpnMenu);
		jpnMenu.setLayout(null);
		jpnMenu.setForeground(Color.RED);
		jpnMenu.setBackground(Color.RED);
		
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
		
		JPanel jpnPantalla = new JPanel();
		jpnPantalla.setBounds(87, 115, 1006, 41);
		jpnPantalla.setToolTipText("PANTALLA");
		jpnPantalla.setBackground(new Color(0, 0, 0));
		contentPane.add(jpnPantalla);
		
		JLabel lblPantalla = new JLabel("PANTALLA");
		lblPantalla.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPantalla.setForeground(new Color(255, 255, 255));
		jpnPantalla.add(lblPantalla);
		
		JPanel jpnAsientos = new JPanel();
		jpnAsientos.setBorder(new LineBorder(new Color(0, 0, 0)));
		jpnAsientos.setBounds(87, 155, 1006, 534);
		contentPane.add(jpnAsientos);
		jpnAsientos.setLayout(null);
		
		JLabel lblFilaA = new JLabel("A");
		lblFilaA.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaA.setBounds(31, 48, 19, 14);
		jpnAsientos.add(lblFilaA);
		
		JButton btnGneralA1 = new JButton("A1");
		btnGneralA1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGneralA1.setBounds(74, 30, 57, 57);
		jpnAsientos.add(btnGneralA1);
		
		JButton btnGeneralA2 = new JButton("A2");
		btnGeneralA2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA2.setBounds(141, 30, 57, 57);
		jpnAsientos.add(btnGeneralA2);
		
		JButton btnGeneralA3 = new JButton("A3");
		btnGeneralA3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA3.setBounds(208, 30, 57, 57);
		jpnAsientos.add(btnGeneralA3);
		
		JButton btnGeneralA4 = new JButton("A4");
		btnGeneralA4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA4.setBounds(277, 30, 57, 57);
		jpnAsientos.add(btnGeneralA4);
		
		JButton btnGeneralA5 = new JButton("A5");
		btnGeneralA5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA5.setBounds(344, 30, 57, 57);
		jpnAsientos.add(btnGeneralA5);
		
		JButton btnGeneralA6 = new JButton("A6");
		btnGeneralA6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA6.setBounds(411, 30, 57, 57);
		jpnAsientos.add(btnGeneralA6);
		
		JButton btnGeneralA7 = new JButton("A7");
		btnGeneralA7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA7.setBounds(534, 30, 57, 57);
		jpnAsientos.add(btnGeneralA7);
		
		JButton btnGeneralA8 = new JButton("A8");
		btnGeneralA8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA8.setBounds(601, 30, 57, 57);
		jpnAsientos.add(btnGeneralA8);
		
		JButton btnGeneralA9 = new JButton("A9");
		btnGeneralA9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA9.setBounds(668, 30, 57, 57);
		jpnAsientos.add(btnGeneralA9);
		
		JButton btnGeneralA10 = new JButton("A10");
		btnGeneralA10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA10.setBounds(735, 30, 57, 57);
		jpnAsientos.add(btnGeneralA10);
		
		JButton btnGeneralA11 = new JButton("A11");
		btnGeneralA11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA11.setBounds(802, 30, 57, 57);
		jpnAsientos.add(btnGeneralA11);
		
		JButton btnGeneralA12 = new JButton("A12");
		btnGeneralA12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralA12.setBounds(869, 30, 57, 57);
		jpnAsientos.add(btnGeneralA12);
		
		JLabel lblFilaA_1 = new JLabel("A");
		lblFilaA_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaA_1.setBounds(957, 48, 19, 14);
		jpnAsientos.add(lblFilaA_1);
		
		JButton btnGeneralB1 = new JButton("B1");
		btnGeneralB1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB1.setBounds(74, 98, 57, 57);
		jpnAsientos.add(btnGeneralB1);
		
		JLabel lblFilaB = new JLabel("B");
		lblFilaB.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaB.setBounds(31, 120, 19, 14);
		jpnAsientos.add(lblFilaB);
		
		JButton btnGeneralB2 = new JButton("B2");
		btnGeneralB2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB2.setBounds(141, 98, 57, 57);
		jpnAsientos.add(btnGeneralB2);
		
		JButton btnGeneralB3 = new JButton("B3");
		btnGeneralB3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB3.setBounds(208, 98, 57, 57);
		jpnAsientos.add(btnGeneralB3);
		
		JButton btnGeneralB4 = new JButton("B4");
		btnGeneralB4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB4.setBounds(277, 98, 57, 57);
		jpnAsientos.add(btnGeneralB4);
		
		JButton btnGeneralB5 = new JButton("B5");
		btnGeneralB5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB5.setBounds(344, 98, 57, 57);
		jpnAsientos.add(btnGeneralB5);
		
		JButton btnGeneralB6 = new JButton("B6");
		btnGeneralB6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB6.setBounds(411, 98, 57, 57);
		jpnAsientos.add(btnGeneralB6);
		
		JButton btnGeneralB7 = new JButton("B7");
		btnGeneralB7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB7.setBounds(534, 98, 57, 57);
		jpnAsientos.add(btnGeneralB7);
		
		JButton btnGeneralB8 = new JButton("B8");
		btnGeneralB8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB8.setBounds(601, 98, 57, 57);
		jpnAsientos.add(btnGeneralB8);
		
		JButton btnGeneralB9 = new JButton("B9");
		btnGeneralB9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB9.setBounds(668, 98, 57, 57);
		jpnAsientos.add(btnGeneralB9);
		
		JButton btnGeneralB10 = new JButton("B10");
		btnGeneralB10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB10.setBounds(735, 98, 57, 57);
		jpnAsientos.add(btnGeneralB10);
		
		JButton btnGeneralB11 = new JButton("B11");
		btnGeneralB11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB11.setBounds(802, 98, 57, 57);
		jpnAsientos.add(btnGeneralB11);
		
		JButton btnGeneralB12 = new JButton("B12");
		btnGeneralB12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralB12.setBounds(869, 98, 57, 57);
		jpnAsientos.add(btnGeneralB12);
		
		JLabel lblFilaB_1 = new JLabel("B");
		lblFilaB_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaB_1.setBounds(957, 120, 19, 14);
		jpnAsientos.add(lblFilaB_1);
		
		JLabel lblFilaC = new JLabel("C");
		lblFilaC.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaC.setBounds(31, 188, 19, 14);
		jpnAsientos.add(lblFilaC);
		
		JButton btnGeneralC1 = new JButton("C1");
		btnGeneralC1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC1.setBounds(74, 166, 57, 57);
		jpnAsientos.add(btnGeneralC1);
		
		JButton btnGeneralC2 = new JButton("C2");
		btnGeneralC2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC2.setBounds(141, 166, 57, 57);
		jpnAsientos.add(btnGeneralC2);
		
		JButton btnGeneralC3 = new JButton("C3");
		btnGeneralC3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC3.setBounds(208, 166, 57, 57);
		jpnAsientos.add(btnGeneralC3);
		
		JButton btnGeneralC4 = new JButton("C4");
		btnGeneralC4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC4.setBounds(277, 166, 57, 57);
		jpnAsientos.add(btnGeneralC4);
		
		JButton btnGeneralC5 = new JButton("C5");
		btnGeneralC5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC5.setBounds(344, 166, 57, 57);
		jpnAsientos.add(btnGeneralC5);
		
		JButton btnGeneralC6 = new JButton("C6");
		btnGeneralC6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC6.setBounds(411, 166, 57, 57);
		jpnAsientos.add(btnGeneralC6);
		
		JButton btnGeneralC7 = new JButton("C7");
		btnGeneralC7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC7.setBounds(534, 166, 57, 57);
		jpnAsientos.add(btnGeneralC7);
		
		JButton btnGeneralC8 = new JButton("C8");
		btnGeneralC8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC8.setBounds(601, 166, 57, 57);
		jpnAsientos.add(btnGeneralC8);
		
		JButton btnGeneralC9 = new JButton("C9");
		btnGeneralC9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC9.setBounds(668, 166, 57, 57);
		jpnAsientos.add(btnGeneralC9);
		
		JButton btnGeneralC10 = new JButton("C10");
		btnGeneralC10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC10.setBounds(735, 166, 57, 57);
		jpnAsientos.add(btnGeneralC10);
		
		JButton btnGeneralC11 = new JButton("C11");
		btnGeneralC11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC11.setBounds(802, 166, 57, 57);
		jpnAsientos.add(btnGeneralC11);
		
		JButton btnGeneralC12 = new JButton("C12");
		btnGeneralC12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralC12.setBounds(869, 166, 57, 57);
		jpnAsientos.add(btnGeneralC12);
		
		JLabel lblFilaC_1 = new JLabel("C");
		lblFilaC_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaC_1.setBounds(957, 188, 19, 14);
		jpnAsientos.add(lblFilaC_1);
		
		JLabel lblFilaD = new JLabel("D\r\n");
		lblFilaD.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaD.setBounds(31, 256, 19, 14);
		jpnAsientos.add(lblFilaD);
		
		JButton btnGeneralD1 = new JButton("D1");
		btnGeneralD1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD1.setBounds(74, 234, 57, 57);
		jpnAsientos.add(btnGeneralD1);
		
		JButton btnGeneralD2 = new JButton("D2");
		btnGeneralD2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD2.setBounds(141, 234, 57, 57);
		jpnAsientos.add(btnGeneralD2);
		
		JButton btnGeneralD3 = new JButton("D3");
		btnGeneralD3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD3.setBounds(208, 234, 57, 57);
		jpnAsientos.add(btnGeneralD3);
		
		JButton btnGeneralD4 = new JButton("D4");
		btnGeneralD4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD4.setBounds(277, 234, 57, 57);
		jpnAsientos.add(btnGeneralD4);
		
		JButton btnGeneralD5 = new JButton("D5");
		btnGeneralD5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD5.setBounds(344, 234, 57, 57);
		jpnAsientos.add(btnGeneralD5);
		
		JButton btnGeneralD6 = new JButton("D6");
		btnGeneralD6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD6.setBounds(411, 234, 57, 57);
		jpnAsientos.add(btnGeneralD6);
		
		JButton btnGeneralD7 = new JButton("D7");
		btnGeneralD7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD7.setBounds(534, 234, 57, 57);
		jpnAsientos.add(btnGeneralD7);
		
		JButton btnGeneralD8 = new JButton("D8");
		btnGeneralD8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD8.setBounds(601, 234, 57, 57);
		jpnAsientos.add(btnGeneralD8);
		
		JButton btnGeneralD9 = new JButton("D9");
		btnGeneralD9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD9.setBounds(668, 234, 57, 57);
		jpnAsientos.add(btnGeneralD9);
		
		JButton btnGeneralD10 = new JButton("D10");
		btnGeneralD10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD10.setBounds(735, 234, 57, 57);
		jpnAsientos.add(btnGeneralD10);
		
		JButton btnGeneralD11 = new JButton("D11");
		btnGeneralD11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD11.setBounds(802, 234, 57, 57);
		jpnAsientos.add(btnGeneralD11);
		
		JButton btnGeneralD12 = new JButton("D12");
		btnGeneralD12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralD12.setBounds(869, 234, 57, 57);
		jpnAsientos.add(btnGeneralD12);
		
		JLabel lblFilaD_1 = new JLabel("D");
		lblFilaD_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaD_1.setBounds(957, 256, 19, 14);
		jpnAsientos.add(lblFilaD_1);
		
		JLabel lblFilaE = new JLabel("E");
		lblFilaE.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaE.setBounds(31, 324, 19, 14);
		jpnAsientos.add(lblFilaE);
		
		JButton btnGeneralE1 = new JButton("E1");
		btnGeneralE1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE1.setBounds(74, 302, 57, 57);
		jpnAsientos.add(btnGeneralE1);
		
		JButton btnGeneralE2 = new JButton("E2");
		btnGeneralE2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE2.setBounds(141, 302, 57, 57);
		jpnAsientos.add(btnGeneralE2);
		
		JButton btnGeneralE3 = new JButton("E3");
		btnGeneralE3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE3.setBounds(208, 302, 57, 57);
		jpnAsientos.add(btnGeneralE3);
		
		JButton btnGeneralE4 = new JButton("E4");
		btnGeneralE4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE4.setBounds(277, 302, 57, 57);
		jpnAsientos.add(btnGeneralE4);
		
		JButton btnGeneralE5 = new JButton("E5");
		btnGeneralE5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE5.setBounds(344, 302, 57, 57);
		jpnAsientos.add(btnGeneralE5);
		
		JButton btnGeneralE6 = new JButton("E6");
		btnGeneralE6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE6.setBounds(411, 302, 57, 57);
		jpnAsientos.add(btnGeneralE6);
		
		JButton btnGeneralE7 = new JButton("E7");
		btnGeneralE7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE7.setBounds(534, 302, 57, 57);
		jpnAsientos.add(btnGeneralE7);
		
		JButton btnGeneralE8 = new JButton("E8");
		btnGeneralE8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE8.setBounds(601, 302, 57, 57);
		jpnAsientos.add(btnGeneralE8);
		
		JButton btnGeneralE9 = new JButton("E9");
		btnGeneralE9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE9.setBounds(668, 302, 57, 57);
		jpnAsientos.add(btnGeneralE9);
		
		JButton btnGeneralE10 = new JButton("E10");
		btnGeneralE10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE10.setBounds(735, 302, 57, 57);
		jpnAsientos.add(btnGeneralE10);
		
		JButton btnGeneralE11 = new JButton("E11");
		btnGeneralE11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE11.setBounds(802, 302, 57, 57);
		jpnAsientos.add(btnGeneralE11);
		
		JButton btnGeneralE12 = new JButton("E12");
		btnGeneralE12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralE12.setBounds(869, 302, 57, 57);
		jpnAsientos.add(btnGeneralE12);
		
		JLabel lblFilaE_1 = new JLabel("E");
		lblFilaE_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaE_1.setBounds(957, 324, 19, 14);
		jpnAsientos.add(lblFilaE_1);
		
		JLabel lblFilaF = new JLabel("F");
		lblFilaF.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaF.setBounds(31, 420, 19, 14);
		jpnAsientos.add(lblFilaF);
		
		JButton btnPremiumF1 = new JButton("F1");
		btnPremiumF1.setBackground(Color.ORANGE);
		btnPremiumF1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF1.setBounds(74, 398, 57, 57);
		jpnAsientos.add(btnPremiumF1);
		
		JButton btnPremiumF2 = new JButton("F2");
		btnPremiumF2.setBackground(Color.ORANGE);
		btnPremiumF2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF2.setBounds(141, 398, 57, 57);
		jpnAsientos.add(btnPremiumF2);
		
		JButton btnPremiumF3 = new JButton("F3");
		btnPremiumF3.setBackground(Color.ORANGE);
		btnPremiumF3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF3.setBounds(208, 398, 57, 57);
		jpnAsientos.add(btnPremiumF3);
		
		JButton btnPremiumF4 = new JButton("F4");
		btnPremiumF4.setBackground(Color.ORANGE);
		btnPremiumF4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF4.setBounds(277, 398, 57, 57);
		jpnAsientos.add(btnPremiumF4);
		
		JButton btnPremiumF5 = new JButton("F5");
		btnPremiumF5.setBackground(Color.ORANGE);
		btnPremiumF5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF5.setBounds(344, 398, 57, 57);
		jpnAsientos.add(btnPremiumF5);
		
		JButton btnPremiumF6 = new JButton("F6");
		btnPremiumF6.setBackground(Color.ORANGE);
		btnPremiumF6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF6.setBounds(411, 398, 57, 57);
		jpnAsientos.add(btnPremiumF6);
		
		JButton btnPremiumF7 = new JButton("F7");
		btnPremiumF7.setBackground(Color.ORANGE);
		btnPremiumF7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF7.setBounds(534, 398, 57, 57);
		jpnAsientos.add(btnPremiumF7);
		
		JButton btnPremiumF8 = new JButton("F8");
		btnPremiumF8.setBackground(Color.ORANGE);
		btnPremiumF8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF8.setBounds(601, 398, 57, 57);
		jpnAsientos.add(btnPremiumF8);
		
		JButton btnPremiumF9 = new JButton("F9");
		btnPremiumF9.setBackground(Color.ORANGE);
		btnPremiumF9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF9.setBounds(668, 398, 57, 57);
		jpnAsientos.add(btnPremiumF9);
		
		JButton btnPremiumF10 = new JButton("F10");
		btnPremiumF10.setBackground(Color.ORANGE);
		btnPremiumF10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF10.setBounds(735, 398, 57, 57);
		jpnAsientos.add(btnPremiumF10);
		
		JButton btnPremiumF11 = new JButton("F11");
		btnPremiumF11.setBackground(Color.ORANGE);
		btnPremiumF11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF11.setBounds(802, 398, 57, 57);
		jpnAsientos.add(btnPremiumF11);
		
		JButton btnPremiumF12 = new JButton("F12");
		btnPremiumF12.setBackground(Color.ORANGE);
		btnPremiumF12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumF12.setBounds(869, 398, 57, 57);
		jpnAsientos.add(btnPremiumF12);
		
		JLabel lblFilaF_1 = new JLabel("F");
		lblFilaF_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaF_1.setBounds(957, 420, 19, 14);
		jpnAsientos.add(lblFilaF_1);
		
		JLabel lblFilaG = new JLabel("G");
		lblFilaG.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaG.setBounds(31, 474, 19, 35);
		jpnAsientos.add(lblFilaG);
		
		JButton btnPremiumG1 = new JButton("G1");
		btnPremiumG1.setBackground(Color.ORANGE);
		btnPremiumG1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG1.setBounds(74, 466, 57, 57);
		jpnAsientos.add(btnPremiumG1);
		
		JButton btnPremiumG2 = new JButton("G2");
		btnPremiumG2.setBackground(Color.ORANGE);
		btnPremiumG2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG2.setBounds(141, 466, 57, 57);
		jpnAsientos.add(btnPremiumG2);
		
		JButton btnPremiumG3 = new JButton("G3");
		btnPremiumG3.setBackground(Color.ORANGE);
		btnPremiumG3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG3.setBounds(208, 466, 57, 57);
		jpnAsientos.add(btnPremiumG3);
		
		JButton btnPremiumG4 = new JButton("G4");
		btnPremiumG4.setBackground(Color.ORANGE);
		btnPremiumG4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG4.setBounds(277, 466, 57, 57);
		jpnAsientos.add(btnPremiumG4);
		
		JButton btnPremiumG5 = new JButton("G5");
		btnPremiumG5.setBackground(Color.ORANGE);
		btnPremiumG5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG5.setBounds(344, 466, 57, 57);
		jpnAsientos.add(btnPremiumG5);
		
		JButton btnPremiumG6 = new JButton("G6");
		btnPremiumG6.setBackground(Color.ORANGE);
		btnPremiumG6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG6.setBounds(411, 466, 57, 57);
		jpnAsientos.add(btnPremiumG6);
		
		JButton btnPremiumG7 = new JButton("G7");
		btnPremiumG7.setBackground(Color.ORANGE);
		btnPremiumG7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG7.setBounds(534, 466, 57, 57);
		jpnAsientos.add(btnPremiumG7);
		
		JButton btnPremiumG8 = new JButton("G8");
		btnPremiumG8.setBackground(Color.ORANGE);
		btnPremiumG8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG8.setBounds(601, 466, 57, 57);
		jpnAsientos.add(btnPremiumG8);
		
		JButton btnPremiumG9 = new JButton("G9");
		btnPremiumG9.setBackground(Color.ORANGE);
		btnPremiumG9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG9.setBounds(668, 466, 57, 57);
		jpnAsientos.add(btnPremiumG9);
		
		JButton btnPremiumG10 = new JButton("G10");
		btnPremiumG10.setBackground(Color.ORANGE);
		btnPremiumG10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG10.setBounds(735, 466, 57, 57);
		jpnAsientos.add(btnPremiumG10);
		
		JButton btnPremiumG11 = new JButton("G11");
		btnPremiumG11.setBackground(Color.ORANGE);
		btnPremiumG11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG11.setBounds(802, 466, 57, 57);
		jpnAsientos.add(btnPremiumG11);
		
		JButton btnPremiumG12 = new JButton("G12");
		btnPremiumG12.setBackground(Color.ORANGE);
		btnPremiumG12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPremiumG12.setBounds(869, 466, 57, 57);
		jpnAsientos.add(btnPremiumG12);
		
		JLabel lblFilaG_1 = new JLabel("G");
		lblFilaG_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaG_1.setBounds(957, 481, 19, 21);
		jpnAsientos.add(lblFilaG_1);
		
		JButton btnContinuar = new JButton("Continuar\r\n");
		btnContinuar.setBackground(new Color(255, 0, 0));
		btnContinuar.setForeground(new Color(0, 0, 0));
		btnContinuar.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnVentaMop VentaMop = new vtnVentaMop();
				VentaMop.setVisible(true);
				vtnAsientos.this.setVisible(false);
			}
		});
		btnContinuar.setBounds(930, 700, 163, 31);
		contentPane.add(btnContinuar);
		
		JLabel lblPremier = new JLabel("*La fila F y G son asientos premier");
		lblPremier.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPremier.setBounds(87, 700, 344, 30);
		contentPane.add(lblPremier);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vntMenuPrincipal Menu = new vntMenuPrincipal();
				Menu.setVisible(true);
				vtnAsientos.this.setVisible(false);
			}
		});
		btnRegresar.setForeground(Color.BLACK);
		btnRegresar.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		btnRegresar.setBackground(Color.RED);
		btnRegresar.setBounds(10, 815, 163, 31);
		contentPane.add(btnRegresar);
	}
}
