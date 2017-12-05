package com.project.maven.GUI03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frmConverser;
	private JTextField tfDegrees = new JTextField();
	private JTextField tfRadians = new JTextField();
	private JButton btnToradians = new JButton("toRadians");
	private JButton btnTodegrees = new JButton("toDegrees");
	private JLabel lblEnterTheValue = new JLabel("Enter the value in degrees:");
	private JLabel lblNewLabel = new JLabel("Enter the value in radians:");
	private JLabel lblresult = new JLabel("Result: ");
	ConversonDegreesRadians cdr = new ConversonDegreesRadians(); //Glöm inte att lägga in den här också

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmConverser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConverser = new JFrame();
		frmConverser.setTitle("Converser");
		frmConverser.setBounds(100, 100, 450, 300);
		frmConverser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConverser.getContentPane().setLayout(null);
		
		
		lblEnterTheValue.setBounds(70, 16, 176, 16);
		frmConverser.getContentPane().add(lblEnterTheValue);
		
		tfDegrees.setBounds(97, 38, 130, 26);
		frmConverser.getContentPane().add(tfDegrees);
		tfDegrees.setColumns(10);
		
		
		lblNewLabel.setBounds(70, 89, 166, 16);
		frmConverser.getContentPane().add(lblNewLabel);
		
		tfRadians.setBounds(97, 107, 130, 26);
		frmConverser.getContentPane().add(tfRadians);
		tfRadians.setColumns(10);
		
		
		btnTodegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(tfRadians.getText().toString());
				double valueInDegrees = Double.parseDouble(tfRadians.getText().toString());
				double result = cdr.convertRadiansToDegrees(valueInDegrees);
				lblresult.setText("Result: " +result);
				tfRadians.setText("");
				
			}
		});
		btnTodegrees.setBounds(37, 167, 117, 29);
		frmConverser.getContentPane().add(btnTodegrees);
		
		
		btnToradians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(tfDegrees.getText().toString());
				double valueInRadians = Double.parseDouble(tfDegrees.getText().toString());
				double result = cdr.convertDegreesToRadians(valueInRadians);
				lblresult.setText("Result: " +result);
				tfDegrees.setText("");
			}
		});
		btnToradians.setBounds(166, 167, 117, 29);
		frmConverser.getContentPane().add(btnToradians);
		
		lblresult.setBounds(20, 233, 326, 16);
		frmConverser.getContentPane().add(lblresult);
	}

}
