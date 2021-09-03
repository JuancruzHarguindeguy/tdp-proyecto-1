package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;


import entities.Student;

import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Color;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField txtAsd;
	
	
	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(610, 240));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}

	private void init() {
		contentPane.setLayout(null);
		
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 430, 165);
		tabInformation = new JPanel();
		tabInformation.setBorder(new LineBorder(SystemColor.textHighlight));
		FlowLayout flowLayout = (FlowLayout) tabInformation.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		tabInformation.setPreferredSize(new Dimension(425, 200));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabbedPane.setForegroundAt(0, Color.BLACK);
		tabbedPane.setBackgroundAt(0, Color.RED);

		
		lblNewLabel = new JLabel("LU                    ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		tabInformation.add(textField);
		textField.setColumns(35);
		
		lblNewLabel_1 = new JLabel("Apellido           ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		tabInformation.add(textField_1);
		textField_1.setColumns(35);
		
		lblNewLabel_2 = new JLabel("Nombre           ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		tabInformation.add(textField_2);
		textField_2.setColumns(35);
		
		lblNewLabel_3 = new JLabel("E-mail              ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		tabInformation.add(textField_3);
		textField_3.setColumns(35);
		
		lblNewLabel_4 = new JLabel("GitHub URL     ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblNewLabel_4);
		
		txtAsd = new JTextField();
		txtAsd.setEditable(false);
		tabInformation.add(txtAsd);
		txtAsd.setColumns(35);
		contentPane.add(tabbedPane);
		
		
		
		DateTimeFormatter fTime = DateTimeFormatter.ofPattern("h':'mm':'s");
		DateTimeFormatter fDate = DateTimeFormatter.ofPattern("d'/'MM'/'YY");
		JLabel lblNewLabel_6 = new JLabel("Esta ventana fue generada el "+String.valueOf(LocalDate.now().format(fDate))+" a las: "+String.valueOf(LocalTime.now().format(fTime)));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 187, 430, 14);
		contentPane.add(lblNewLabel_6);
		
		
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(448, 26, 128, 128);
		lblNewLabel_5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(studentData.getPathPhoto())).getImage().getScaledInstance(155, 140, Image.SCALE_SMOOTH)));
		contentPane.add(lblNewLabel_5);

		
		
		
		
		
		
		
		
		
		
		
	}
}
